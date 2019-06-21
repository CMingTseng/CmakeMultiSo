package com.mushuichuan.cmakemutiso;

public class Layer3Loader {
    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("layer3");
    }

    public native static String requestStringFromJNI();

    public native static String responseStringFromJNI();

    public native static void init();
}
