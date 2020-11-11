package com.ctid.pojo;

import java.util.Date;
import java.util.Objects;

/**
 * ClassName: TClientVersion
 * Description: 客户端版本实体类
 *
 * @author wch
 * @date 2020/4/27 11:03
 * @email wangchanghao_xy@189.com
 */
public class ClientVersion {
    //主键
    private String versionId;
    //客户端版本号
    private String versionNumber;
    //客户端下载地址
    private String downloadUrl;
    //客户端升级内容
    private String upgradeContent;
    //发布时间
    private Date releaseTime = new Date();
    //备用
    private String standby;

    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public String getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public String getUpgradeContent() {
        return upgradeContent;
    }

    public void setUpgradeContent(String upgradeContent) {
        this.upgradeContent = upgradeContent;
    }

    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    public String getStandby() {
        return standby;
    }

    public void setStandby(String standby) {
        this.standby = standby;
    }

    @Override
    public String toString() {
        return "ClientVersion{" +
                "versionId='" + versionId + '\'' +
                ", versionNumber='" + versionNumber + '\'' +
                ", downloadUrl='" + downloadUrl + '\'' +
                ", releaseTime=" + releaseTime +
                ", standby='" + standby + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientVersion that = (ClientVersion) o;
        return Objects.equals(versionId, that.versionId) &&
                Objects.equals(versionNumber, that.versionNumber) &&
                Objects.equals(downloadUrl, that.downloadUrl) &&
                Objects.equals(releaseTime, that.releaseTime) &&
                Objects.equals(standby, that.standby);
    }

    @Override
    public int hashCode() {
        return Objects.hash(versionId, versionNumber, downloadUrl, releaseTime, standby);
    }
}
