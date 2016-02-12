# Floating-Color-Background

![Floating-Color-Background](https://github.com/abhilash007/Floating-Color-Background/blob/master/ScreenShot/FloatingBackgroundColorView.gif)
[Youtube](https://www.youtube.com/watch?v=5p4X8r-sU0Q)
# Usage

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
        
  3.  Change colors in xml
  
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
  4.  Change colors by code (You Should pass 8 arguments, Otherwise it will not work)
        
        FloatingColorBackgroundView floatingColorBackgroundView = (FloatingColorBackgroundView)findViewById(R.id.floatingcolorbackground_view);
        floatingColorBackgroundView.setBgColors(new int[]{0xffa60ca6, 0xff00dddd,0xff000000, 0xffff0000,0xff000000, 0xff000000, 0xff000000, 0xff000000});
  
#Compatibility
  
  * Android GINGERBREAD 2.3+
  
# Changelog

### Current Version: 1.0.1    

# Developed By

 * Abhilash k v - <ranjuabhi007@gmail.com>


# License

    Copyright 2016 Abhilash k v

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

   
