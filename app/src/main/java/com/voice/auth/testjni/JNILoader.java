package com.voice.auth.testjni;

public class JNILoader {
    static {
        System.loadLibrary("JNILoader");
    }
    public native String getNativeString();
}
