package com.xtu.mainfunction;

import com.xtu.character.*;
import com.xtu.loginfunction.JDBCConn;

import java.util.Scanner;

public class ProcessFuction {

    public ProcessFuction() {
        /**
         * 登录
         */

        int loginflag = 0;
        while(loginflag == 0){
            System.out.println("1:注册");
            System.out.println("2:登录");
            Scanner sc = new Scanner(System.in);
            String Slc = sc.nextLine();
            int loginchoose = Integer.parseInt(Slc);

            switch (loginchoose){
                case 1:
                    JDBCConn.SignUp();
                    break;
                case 2:
                    loginflag = JDBCConn.SignIn();
                    break;
                default:
                    System.out.println("你打jb呢");
                    break;
            }


        }

        Clerk clerk = new Clerk("01","书记员01");

        Defendant defendant = new Defendant("01","被告人01");

        Judge judge = new Judge("01","法官01");

        Plaintiff plaintiff = new Plaintiff("01","原告人01");

        //宣读开庭程序
        clerk.Announce(judge.getJname(), defendant.getDname(), plaintiff.getPname(), clerk.getCname());

        //当事人陈述

        //告知证人的权利义务，证人作证，宣读未到庭的证人证言

        //出示书证、物证、视听资料和电子数据

        //宣读鉴定意见

        //宣读勘验笔录。其间，当事人经法庭许可，可以向证人、鉴定人、勘验人发问

        //原告及其诉讼代理人发言
        plaintiff.Debate();
        //被告及其诉讼代理人答辩
        defendant.Debate();
        //互相辩论。法庭辩论终结后，由审判长按照原告、被告、第三人的先后顺序征询各方最后意见


        //评议和宣判
        judge.Trial();
    }






}
