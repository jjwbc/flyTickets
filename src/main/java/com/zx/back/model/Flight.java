package com.zx.back.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Flight {

    private String fid;

    private String fbegin;

    private String fend;

    private Date stime;

    private Date etime;

    private Double price;

    private Integer seatsum;

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid == null ? null : fid.trim();
    }

    public String getFbegin() {
        return fbegin;
    }

    public void setFbegin(String fbegin) {
        this.fbegin = fbegin == null ? null : fbegin.trim();
    }

    public String getFend() {
        return fend;
    }

    public void setFend(String fend) {
        this.fend = fend == null ? null : fend.trim();
    }

    public Date getStime() {
        return stime;
    }

    public void setStime(Date stime) {
        this.stime = stime;
    }

    public Date getEtime() {
        return etime;
    }

    public void setEtime(Date etime) {
        this.etime = etime;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getseatsum() {
        return seatsum;
    }

    public void setseatsum(Integer seatsum) {
        this.seatsum = seatsum;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "fid='" + fid + '\'' +
                ", fbegin='" + fbegin + '\'' +
                ", fend='" + fend + '\'' +
                ", stime=" + stime +
                ", etime=" + etime +
                ", price=" + price +
                ", seatsum=" + seatsum +
                '}';
    }

}