package com.xtu.character;

import java.awt.*;

/**
 * 被告类
 * @author P1nk64
 */
public class Defendant {
    private String Did;
    private String Dname;
    private Boolean Dstatus = false;

    public Defendant(String did, String dname) {
        Did = did;
        Dname = dname;
    }
    public void Debate(){
        System.out.print("被告人：");
        System.out.println("我没偷钱");
    }

    /**
     * setter and getter 方法
     */
    public String getDid() {
        return Did;
    }
    public void setDid(String did) {
        Did = did;
    }
    public String getDname() {
        return Dname;
    }
    public void setDname(String dname) {
        Dname = dname;
    }
    public Boolean getDstatus() {
        return Dstatus;
    }
    public void setDstatus(Boolean dstatus) {
        Dstatus = dstatus;
    }
}
