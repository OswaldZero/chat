package com.codeman22.chat.entity;

import java.util.Date;

public class ChatMsg {
    private String id;

    private String sendUserId;

    private String acceptUserId;

    private String msg;

    private Boolean isRead;

    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSendUserId() {
        return sendUserId;
    }

    public void setSendUserId(String sendUserId) {
        this.sendUserId = sendUserId == null ? null : sendUserId.trim();
    }

    public String getAcceptUserId() {
        return acceptUserId;
    }

    public void setAcceptUserId(String acceptUserId) {
        this.acceptUserId = acceptUserId == null ? null : acceptUserId.trim();
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg == null ? null : msg.trim();
    }

    public Boolean getIsRead() {
        return isRead;
    }

    public void setIsRead(Boolean isRead) {
        this.isRead = isRead;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "ChatMsg{" +
                "id='" + id + '\'' +
                ", sendUserId='" + sendUserId + '\'' +
                ", acceptUserId='" + acceptUserId + '\'' +
                ", msg='" + msg + '\'' +
                ", isRead=" + isRead +
                ", createTime=" + createTime +
                '}';
    }
}