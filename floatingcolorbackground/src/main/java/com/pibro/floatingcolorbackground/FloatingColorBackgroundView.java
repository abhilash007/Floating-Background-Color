package com.pibro.floatingcolorbackground;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Canvas.VertexMode;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;


public class FloatingColorBackgroundView extends View {

    private static final long mElapsedRealtime;
    private final int[] mColors;
    private final short[] mIndices;
    private final float[] mVertices;
    private final int[] mLocation;
    private final Matrix mMatrix;
    private final Paint mPaint;
    private Bitmap mBitmap;
    static {
        mElapsedRealtime = SystemClock.elapsedRealtime();
    }

    public FloatingColorBackgroundView(Context context) {
        this(context, null);
    }

    public FloatingColorBackgroundView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public FloatingColorBackgroundView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        int color1=0xffa60ca6,color2=0xff00dddd,color3=0xffa60ca7,color4=0xffff0000,color5=0xff900C3F,color6=0xff1EE867,color7=0xff00E9FC,color8=0xffA10CF6;

        /** get custom attrs for tabs and container  **/

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.FloatingColorBackgroundView);
        color1 = a.getColor(R.styleable.FloatingColorBackgroundView_pibroBgColor1,color1);
        color2 = a.getColor(R.styleable.FloatingColorBackgroundView_pibroBgColor2,color2);
        color3 = a.getColor(R.styleable.FloatingColorBackgroundView_pibroBgColor3,color3);
        color4 = a.getColor(R.styleable.FloatingColorBackgroundView_pibroBgColor4,color4);
        color5 = a.getColor(R.styleable.FloatingColorBackgroundView_pibroBgColor5,color5);
        color6 = a.getColor(R.styleable.FloatingColorBackgroundView_pibroBgColor6,color6);
        color7 = a.getColor(R.styleable.FloatingColorBackgroundView_pibroBgColor7,color7);
        color8 = a.getColor(R.styleable.FloatingColorBackgroundView_pibroBgColor8,color8);

        this.mColors = new int[]{color1, color2,color3, color4,color5, color6, color7, color8};
        this.mIndices = new short[]{(short) 0, (short) 1, (short) 2, (short) 0, (short) 2, (short) 3};
        this.mVertices = new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f};
        this.mLocation = new int[2];
        this.mMatrix = new Matrix();
        this.mPaint = new Paint(2);
        this.mBitmap = CreateCanvas();
    }
    public Bitmap CreateCanvas() {
        Bitmap createBitmap = Bitmap.createBitmap(128, 128, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale((float) canvas.getWidth(), (float) canvas.getHeight());
        canvas.drawVertices(VertexMode.TRIANGLES, this.mVertices.length, this.mVertices, 0, null, 0, this.mColors, 0, this.mIndices, 0, 6, this.mPaint);
        return createBitmap;
    }

    public void onDraw(Canvas canvas) {
        getLocationInWindow(this.mLocation);
            int i = getHeight();
        if (i > 0) {
            int width = getWidth() / 2;
            i = (i / 2) * 3;
            float sqrt = (float) Math.sqrt((double) ((i * i) + (width * width)));
            float width2 = (2.0f * sqrt) / ((float) this.mBitmap.getWidth());
            float f = ((float) width) - sqrt;
            float f2 = ((float) i) - sqrt;
            sqrt = ((((float) (SystemClock.elapsedRealtime() - mElapsedRealtime)) % 37000.0f) * 360.0f) / 37000.0f;
            float width3 = (float) (this.mBitmap.getWidth() / 2);
            this.mMatrix.reset();
            this.mMatrix.preRotate(sqrt, width3, width3);
            this.mMatrix.postScale(width2, width2);
            this.mMatrix.postTranslate(f, f2);
            canvas.drawBitmap(this.mBitmap, this.mMatrix, this.mPaint);
            invalidate();
        }
    }
}
