# Floating-Color-Background


# Usage

*For a working implementation of this project see the `sample/` folder.*

  1. Include the library as local library project or add the dependency in your build.gradle.
        
        dependencies {
            compile 'com.pibro.floatingcolorbackground:floatingcolorbackground:1.0.0'
        }

  2. Include the FloatingColorBackgroundView widget in your layout. This should usually be placed
     below  the root view it represents.

        <?xml version="1.0" encoding="utf-8"?>
        <RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
            android:layout_width="match_parent"
            android:layout_height="match_parent">
            
        <com.pibro.floatingcolorbackground.FloatingColorBackgroundView
            android:layout_width="match_parent"
            android:layout_height="match_parent" />
            
        </RelativeLayout>
        
  3.
  
        <com.pibro.floatingcolorbackground.FloatingColorBackgroundView
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            app:pibroBgColor1="#ffa60ca6"
            app:pibroBgColor2="#ff00dddd"
            app:pibroBgColor3="#ff00E9FC"
            app:pibroBgColor4="#ffff0000"
            app:pibroBgColor5="#ff900C3F"
            app:pibroBgColor6="#ff1EE867"
            app:pibroBgColor7="#ff00E9FC"
            app:pibroBgColor8="#ffA10CF6"
        />
  
      
   
