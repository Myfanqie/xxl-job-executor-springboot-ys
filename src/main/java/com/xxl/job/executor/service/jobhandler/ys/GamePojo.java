package com.xxl.job.executor.service.jobhandler.ys;

import java.io.Serializable;

/**
 * @Author liliya
 * @DateTime 2022/5/27 15:32
 * @Description 游戏pojo
 */
public class GamePojo implements Serializable {
    private String id;
    private String forumId;
    private String name;
    private String url;

    public GamePojo(String id, String forumId, String name, String url) {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getForumId() {
        return forumId;
    }

    public void setForumId(String forumId) {
        this.forumId = forumId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
