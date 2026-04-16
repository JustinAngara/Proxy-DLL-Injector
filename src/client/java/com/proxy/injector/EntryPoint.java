package com.proxy.injector;

/**
 * perform any sort of working cog into the minecraft mod
 * process execution
 * jni bridge
 * */
public class EntryPoint {
    private String pe;
    private JNIBridge jb;

    public EntryPoint(String process){
        jb = new JNIBridge();
        pe = process;
    }
    public void run(){
        jb.processInjectEntry(pe);
    }

}