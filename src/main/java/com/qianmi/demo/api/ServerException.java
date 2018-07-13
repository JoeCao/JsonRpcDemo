package com.qianmi.demo.api;

/**
 * Created by caozupeng on 16/2/25.
 */
public class ServerException extends Exception {
    private int errorNo;
    private String errorMsg;

    public ServerException(int errorNo, String errorMsg) {
        this.errorNo = errorNo;
        this.errorMsg = errorMsg;
    }
}
