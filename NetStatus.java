package com.ctid.pojo;

import java.io.Serializable;

/**
 * ClassName: TUser
 * Description: .net状态表
 *
 * @author wch
 * @date 2020/4/14 12:02
 * @email wangchanghao_xy@189.com
 */
public class NetStatus implements Serializable {
    private String mobile;
    private String status;

    public NetStatus() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NetStatus)) return false;

        NetStatus netStatus = (NetStatus) o;

        if (mobile != null ? !mobile.equals(netStatus.mobile) : netStatus.mobile != null) return false;
        return status != null ? status.equals(netStatus.status) : netStatus.status == null;
    }

    @Override
    public int hashCode() {
        int result = mobile != null ? mobile.hashCode() : 0;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "NetStatus{" +
                "mobile='" + mobile + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public NetStatus(String mobile, String status) {
        this.mobile = mobile;
        this.status = status;
    }
}
