package com.xtu.mainfunction;

import com.xtu.character.*;
import com.xtu.loginfunction.JDBCConn;

import java.util.Scanner;

public class ProcessFuction {

    public ProcessFuction() throws InterruptedException {
        /**
         * 登录
         */
        System.out.println("***************************************");
        System.out.println("***********  欢迎使用模拟法庭   **********");
        System.out.println("***********      版本1.0      **********");
        System.out.println("*********** 基于JAVA基础+JDBC  **********");
        System.out.println("***********                   *********");
        System.out.println("*********** 请选择您想使用的功能 **********");
        Thread.sleep(1000);
        int loginflag = 0;
        while(loginflag == 0){
            System.out.println("1:注册");
            System.out.println("2:登录");
            System.out.println("3:删除");
            System.out.println("4:更新");
            System.out.println("5:退出");
            System.out.println("登录后才可进行下一步操作...");
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
                case 3:
                    JDBCConn.DeleteUser();
                    break;
                case 4:
                    JDBCConn.UpdateUser();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("请在1-4中选择");
                    break;
            }


        }
        System.out.println("**************************************");
        System.out.println("*********      登陆成功     ***********");
        System.out.println("*********   模拟法庭现在开始    *********");
        System.out.println("**************************************");
        Thread.sleep(1000);
        Clerk clerk = new Clerk("01","书记员01");

        Defendant defendant = new Defendant("01","被告人01");

        Judge judge = new Judge("01","法官01");

        Plaintiff plaintiff = new Plaintiff("01","原告人01");

        //宣读开庭程序
        clerk.Announce(judge.getJname(), defendant.getDname(), plaintiff.getPname(), clerk.getCname());
        Thread.sleep(1000);
        //当事人陈述

        //告知证人的权利义务，证人作证，宣读未到庭的证人证言

        //出示书证、物证、视听资料和电子数据

        //宣读鉴定意见

        //宣读勘验笔录。其间，当事人经法庭许可，可以向证人、鉴定人、勘验人发问

        //原告及其诉讼代理人发言
        plaintiff.Debate();
        Thread.sleep(1000);
        //被告及其诉讼代理人答辩
        defendant.Debate();
        Thread.sleep(1000);
        //互相辩论。法庭辩论终结后，由审判长按照原告、被告、第三人的先后顺序征询各方最后意见


        //评议和宣判
        judge.Trial();
    }






}
