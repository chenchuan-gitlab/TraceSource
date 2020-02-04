package com.tracesource.monitor;

public class Init {
    public static int i = 0;
    public static ContinueRead cRead = null;
    public static void start(){
         cRead = new ContinueRead();
        i = cRead.startComPort();
    }
}
