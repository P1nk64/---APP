package com.xtu.character;

/**
 * 法官类
 * @author P1nk64
 */
public class Judge {
    private String Jid;//法官编号
    private String Jname;//法官姓名
    private  Boolean Jstatus = false;//法官状态 0代表空闲

    public Judge(String jid, String jname) {
        Jid = jid;
        Jname = jname;
    }

    /**
     * setter and getter 方法
     */
    public String getJid() {
        return Jid;
    }
    public void setJid(String jid) {
        Jid = jid;
    }
    public String getJname() {
        return Jname;
    }
    public void setJname(String jname) {
        Jname = jname;
    }
    public Boolean getJstatus() {
        return Jstatus;
    }
    public void setJstatus(Boolean jstatus) {
        Jstatus = jstatus;
    }
}
