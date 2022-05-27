package com.xxl.job.executor.service.jobhandler.ys;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author liliya
 * @DateTime 2022/5/27 16:47
 * @Description TODO
 */
public class MihoyoBBS {
    private Map<String,String> headers;
    private String cookie;

    public MihoyoBBS() {
        headers = new HashMap<>();
        headers.put("DS", GlobalTool.getDS());
        headers.put("x-rpc-client_type", GlobalTool.CLIENT_TYPE);
        headers.put("x-rpc-app_version", GlobalTool.MYS_Version);
        headers.put("x-rpc-sys_version", GlobalTool.SYS_Version);
        headers.put("x-rpc-channel", GlobalTool.CHANNEL);
        headers.put("x-rpc-device_id", GlobalTool.getRandomString(32));
        headers.put("x-rpc-device_name", "Mi 10");
        headers.put("x-rpc-device_model", "Mi 10");
        headers.put("Referer", "https://app.mihoyo.com");
        headers.put("Host", "bbs-api.mihoyo.com");
        headers.put("User-Agent", "okhttp/4.8.0");
    }
}
