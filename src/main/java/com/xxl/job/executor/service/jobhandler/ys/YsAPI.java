package com.xxl.job.executor.service.jobhandler.ys;

/**
 * @Author liliya
 * @DateTime 2022/5/27 15:38
 * @Description api接口
 */
public class YsAPI {
    public static final String COOKIE_URL = "https://webapi.account.mihoyo.com/Api/cookie_accountinfo_by_loginticket?login_ticket={}";
    public static final String COOKIE_URL2 = "https://api-takumi.mihoyo.com/auth/api/getMultiTokenByLoginTicket?login_ticket={}&token_types=3&uid={}";

    /**#post**/
    public static final String SIGN_URL = "https://bbs-api.mihoyo.com/apihub/sapi/signIn?gids={}";
    public static final String LIST_URL = "https://bbs-api.mihoyo.com/post/api/getForumPostList?forum_id={}&is_good=false&is_hot=false&page_size=20&sort_type=1";
    public static final String DETAIL_URL = "https://bbs-api.mihoyo.com/post/api/getPostFull?post_id={}";
    public static final String SHARE_URL = "https://bbs-api.mihoyo.com/apihub/api/getShareConf?entity_id={}&entity_type=1";
    /**post json**/
    public static final String VOTE_URL = "https://bbs-api.mihoyo.com/apihub/sapi/upvotePost";
}
