package com.selion.framework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class Context {

    private Context(){

    }

    private static String getThreadName(){
        return Thread.currentThread().getName() + "-" + Thread.currentThread().getPriority();
    }










}
