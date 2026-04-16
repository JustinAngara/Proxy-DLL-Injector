package com.proxy.injector;

public class JNIBridge {

    static {
        System.loadLibrary("nativebridge");
    }

    public native void processInjectEntry(String processExe);

}