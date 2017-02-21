package in.ashish.customfontsetdemo;

import android.app.Application;

/**
 * Created by Ashish on 21/02/2017.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        TypefaceUtil.overrideFont(getApplicationContext(), "SERIF", "fonts/Eutemia.ttf");
//        TypefaceUtil.overrideFont(getApplicationContext(), "SERIF", "fonts/calibri.ttf");
//        TypefaceUtil.overrideFont(getApplicationContext(), "SERIF", "fonts/Satisfy-Regular.ttf");
//        TypefaceUtil.overrideFont(getApplicationContext(), "SERIF", "fonts/Calibri_Italic.ttf");
    }
}
