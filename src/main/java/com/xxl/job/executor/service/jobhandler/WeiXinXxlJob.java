package com.xxl.job.executor.service.jobhandler;

import cn.hutool.http.HttpUtil;
import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


/**
 * @Author liliya
 * @DateTime 2022/5/24 20:08
 * @Description 微信小程序上面的
 */

@Component
public class WeiXinXxlJob {
    private static Logger logger = LoggerFactory.getLogger(WeiXinXxlJob.class);
    private String txjUrlSign = "https://txj.51xcx.com.cn/hswx/home/checkIn?userId=98363";
    private String txjUrlShare = "https://txj.51xcx.com.cn/hswx/share/shareActive?userId=98363&type=3";


    @XxlJob("txjJobHandler")
    public void txjJobHandler() throws Exception {
        XxlJobHelper.log("XXL-JOB,Begin Tianxianjin JobHandler.");
        String sign = HttpUtil.get(txjUrlSign);
        String share = HttpUtil.get(txjUrlShare);

        XxlJobHelper.log("XXL-JOB,end: {}", sign);
        XxlJobHelper.log("XXL-JOB,end: {}", share);
        // default success
    }
}
