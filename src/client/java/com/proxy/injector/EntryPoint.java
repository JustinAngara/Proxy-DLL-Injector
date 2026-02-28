package com.proxy.injector;

public class EntryPoint {
    private EntryPoint(){}
    static {
        System.loadLibrary("nativebridge");
    }
    public static void setup(){
        // get the jni to add to gradle

        // call the c++ entry

        // bang proxy injection occured
        call();
    }
    private static void call(){


    }

}
