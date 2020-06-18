package com.zx.back.model;

import java.util.Date;
import java.util.List;

public class Orders {

    private List<Flight> flights;

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    private Integer oid;

    private Date otime;

    private String uno;

    private String fno;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Date getOtime() {
        return otime;
    }

    public void setOtime(Date otime) {
        this.otime = otime;
    }

    public String getUno() {
        return uno;
    }

    public void setUno(String uno) {
        this.uno = uno == null ? null : uno.trim();
    }

    public String getFno() {
        return fno;
    }

    public void setFno(String fno) {
        this.fno = fno == null ? null : fno.trim();
    }

    @Override
    public String toString() {
        return "Orders{" +
                "otime=" + otime +
                ", fno='" + fno + '\'' +
                '}';
    }

}