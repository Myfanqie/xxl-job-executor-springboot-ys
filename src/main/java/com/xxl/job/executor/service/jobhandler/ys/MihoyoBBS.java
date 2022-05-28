package com.xxl.job.executor.service.jobhandler.ys;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author liliya
 * @DateTime 2022/5/27 16:47
 * @Description TODO
 */
@Component
public class MihoyoBBS {
    private Map<String,String> headers;
    private String cookie;
    private List<String> articleList;

    public MihoyoBBS() {
        articleList = new ArrayList<>();
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

        cookie = GlobalTool.loadCookie();
        articleList = GlobalTool.loadArticleList(headers);

    }


    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    public List<String> getArticleList() {
        return articleList;
    }

    public void setArticleList(List<String> articleList) {
        this.articleList = articleList;
    }
}
