package com.xxl.job.executor.service.jobhandler.ys;

import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;

import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import static cn.hutool.crypto.SecureUtil.md5;


/**
 * @Author liliya
 * @DateTime 2022/5/27 15:26
 * @Description TODO
 */
public class GlobalTool {

    public static final String salt = "fd3ykrh7o1j54g581upo1tvpam0dsgtf";
    public static final String CLIENT_TYPE = "2";
    public static final String MYS_Version = "2.7.0";
    public static final String SYS_Version = "6.0.1";
    public static final String CHANNEL = "miyousheluodi";

    public static List<GamePojo> gameList;
    static {
        gameList = new ArrayList<>();
        gameList.add(new GamePojo("1", "1", "崩坏3","https://bbs.mihoyo.com/bh3/"));
        gameList.add(new GamePojo("2", "26", "原神","https://bbs.mihoyo.com/ys/"));
        gameList.add(new GamePojo("3", "30", "崩坏2","https://bbs.mihoyo.com/bh2/"));
        gameList.add(new GamePojo("4", "37", "未定事件簿","https://bbs.mihoyo.com/wd/"));
        gameList.add(new GamePojo("5", "34", "大别野","https://bbs.mihoyo.com/dby/"));
    }


    //生成指定位数随机字符串
    public static String getRandomString(int length){
        String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<length;i++){
            int number=getRandomNumber(str.length());
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }
    //生成指定范围内的随机数
    private static int getRandomNumber(int max){
        return (int)(Math.random()*max);
    }

    //生成DS
    public static String getDS(){
        String n = salt;
        String i = System.currentTimeMillis()+"";
        String r = getRandomString(6);
        String c = md5("salt=" + n + "&t=" + i + "&r=" + r);
        return StrUtil.format("{},{},{}" , i, r, c);
    }

    //获取cookie直接和jar包放一起就可以了
    public static String loadCookie(){
        JSONObject json = (JSONObject) JSONUtil.readJSON(new File("./cookie.json"), Charset.forName("UTF-8"));
        return json.getStr("Cookie");
    }

    public static List<String> loadArticleList(){
        //TODO
        return new ArrayList<>();
    }

    public static void main(String[] args) {

//        GlobalTool globalTool = new GlobalTool();
//        System.out.println(globalTool.getDS());
//        HttpRequest.of("https://bbs.mihoyo.com/api/v1/user/login").cookie().headerMap()

    }
}
