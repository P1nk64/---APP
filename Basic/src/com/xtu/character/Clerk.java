package com.xtu.character;
/**
 * 书记员类
 * @author P1nk64
 */
public class Clerk {
    private String Cid;
    private String Cname;
    private Boolean Cstatus = false;

    public Clerk(String cid, String cname) {
        Cid = cid;
        Cname = cname;
    }

    /**
     * setter and getter 方法
     */
    public String getCid() {
        return Cid;
    }
    public void setCid(String cid) {
        Cid = cid;
    }
    public String getCname() {
        return Cname;
    }
    public void setCname(String cname) {
        Cname = cname;
    }
    public Boolean getCstatus() {
        return Cstatus;
    }
    public void setCstatus(Boolean cstatus) {
        Cstatus = cstatus;
    }
}
