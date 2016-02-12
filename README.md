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
      
   
