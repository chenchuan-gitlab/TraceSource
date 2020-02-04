package com.tracesource.monitor;

public class GetMessage {
    public static String getMessage() {
        StringBuilder msg = new StringBuilder();
        ContinueRead cRead = Init.cRead;
        int i = Init.i;
        if (i == 1) {
            msg = cRead.msg;
            if("no data".equals(msg.toString())){
                return null;
            }
        }else{
            return null;
        }
        return msg.toString();
    }
}
