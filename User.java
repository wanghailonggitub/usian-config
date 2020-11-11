package com.ctid.pojo;

import java.util.Date;
import java.util.Objects;

/**
 * ClassName: TUser
 * Description: 用户表实体类
 *
 * @author wch
 * @date 2020/4/14 12:02
 * @email wangchanghao_xy@189.com
 */
public class User {
    //主键
    private String userId;
    //手机号
    private String userPhone;
    //最后操作时间
    private Date lastOperateTime;
    //创建时间
    private Date createTime = new Date();
    //更新时间
    private Date updateTime = new Date();

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public Date getLastOperateTime() {
        return lastOperateTime;
    }

    public void setLastOperateTime(Date lastOperateTime) {
        this.lastOperateTime = lastOperateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userId, user.userId) &&
                Objects.equals(userPhone, user.userPhone) &&
                Objects.equals(lastOperateTime, user.lastOperateTime) &&
                Objects.equals(createTime, user.createTime) &&
                Objects.equals(updateTime, user.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userPhone, lastOperateTime, createTime, updateTime);
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", lastOperateTime=" + lastOperateTime +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
