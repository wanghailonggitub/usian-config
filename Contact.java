package com.ctid.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * ClassName: TContact
 * Description: 通讯录表实体类
 *
 * @author wch
 * @date 2020/4/14 12:02
 * @email wangchanghao_xy@189.com
 */
public class Contact implements Serializable {

    private static final long serialVersionUID = -4209979425499733910L;

    //主键
    private String contactId;
    //用户id
    private String userId;
    //通讯录数据（加密json串）
    private String contactList;
    //用户联系人数量
    private String contactAmount;
    //数据版本号
    private Integer versionNumber;
    //创建时间
    private Date createTime = new Date();
    //更新时间
    private Date updateTime = new Date();

    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getContactList() {
        return contactList;
    }

    public void setContactList(String contactList) {
        this.contactList = contactList;
    }

    public String getContactAmount() {
        return contactAmount;
    }

    public void setContactAmount(String contactAmount) {
        this.contactAmount = contactAmount;
    }

    public Integer getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(Integer versionNumber) {
        this.versionNumber = versionNumber;
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
        Contact contact = (Contact) o;
        return Objects.equals(contactId, contact.contactId) &&
                Objects.equals(userId, contact.userId) &&
                Objects.equals(contactList, contact.contactList) &&
                Objects.equals(contactAmount, contact.contactAmount) &&
                Objects.equals(versionNumber, contact.versionNumber) &&
                Objects.equals(createTime, contact.createTime) &&
                Objects.equals(updateTime, contact.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contactId, userId, contactList, contactAmount, versionNumber, createTime, updateTime);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "contactId='" + contactId + '\'' +
                ", userId='" + userId + '\'' +
                ", contactList='" + contactList + '\'' +
                ", contactAmount='" + contactAmount + '\'' +
                ", versionNumber='" + versionNumber + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
