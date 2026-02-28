package com.proxy.injector;

public class JNIBridge {
    // define other methods
    static {
        try {
            // build the dll file
            System.load("systemlib.dll");
        } catch (UnsatisfiedLinkError e) {
            throw e;
        }
    }

    public native void processInjectEntry(String processExe);
    public void test(){
        JNIBridge jb = new JNIBridge();
        jb.processInjectEntry("cs2.exe");
    }

}
