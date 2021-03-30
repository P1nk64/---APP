package com.xtu.character;
/**
 * 原告类
 * @author P1nk64
 */
public class Plaintiff {
    private String Pid;
    private String Pname;
    private Boolean Pstatus = false;

    public Plaintiff(String pid, String pname) {
        Pid = pid;
        Pname = pname;
    }
    /**
     * setter and getter 方法
     */
    public String getPid() {
        return Pid;
    }
    public void setPid(String pid) {
        Pid = pid;
    }
    public String getPname() {
        return Pname;
    }
    public void setPname(String pname) {
        Pname = pname;
    }
    public Boolean getPstatus() {
        return Pstatus;
    }
    public void setPstatus(Boolean pstatus) {
        Pstatus = pstatus;
    }
}
