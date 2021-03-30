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
     * @Title：Announce
     * @Description: 用于庭审开始的宣读程序
     * @Param: 法官名，被告人名，原告名，书记员名
     * @author P1nk64
     */
    public void Announce(String judge,String defendant,String plaintiff,String clerk){
        System.out.println("书记员：现在开庭");
        System.out.println("书记员：法官是"+judge);
        System.out.println("书记员：被告人是"+defendant);
        System.out.println("书记员：原告是"+plaintiff);
        System.out.println("书记员：书记员是"+clerk);
        System.out.println("书记员：公布法庭纪律如下");
        System.out.println("书记员：xxxxxx");
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
