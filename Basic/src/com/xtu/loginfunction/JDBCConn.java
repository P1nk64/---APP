package com.xtu.loginfunction;

import com.xtu.utils.DBUtil;

import java.sql.*;
import java.util.ResourceBundle;
import java.util.Scanner;

public class JDBCConn {
    public static void SignUp(){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        //1、注册驱动
        //Class.forName(driver);

        //2、获取连接
        // conn = DriverManager.getConnection(url,user,password);
        try {
            conn = DBUtil.getConnection();
            String sql = "insert into user(user_id,user_name,user_pwd) values(?,?,?)";
            Scanner input = new Scanner(System.in);
            System.out.println("输入证件号");
            String Suserid = input.nextLine();
            int userid = Integer.parseInt(Suserid);
            System.out.println("输入姓名");
            String username = input.nextLine();
            System.out.println("输入密码");
            String userpwd = input.nextLine();
            ps = conn.prepareStatement(sql);
            ps.setInt(1,userid);
            ps.setString(2,username);
            ps.setString(3,userpwd);
            //4、执行SQL
            int count = ps.executeUpdate();
            System.out.println(count);
        } catch (Exception e) {
            System.out.println("输入有误");
            e.printStackTrace();
        }finally {
            DBUtil.close(conn,ps,rs);
        }
    }

    public static void SignIn(){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        //1、注册驱动
        //Class.forName(driver);

        //2、获取连接
        // conn = DriverManager.getConnection(url,user,password);
        try {
            conn = DBUtil.getConnection();
            String sql = "select *  from user Where (user_id = ? AND user_pwd = ?)";
            Scanner input = new Scanner(System.in);
            System.out.println("输入证件号");
            String Suserid = input.nextLine();
            int userid = Integer.parseInt(Suserid);

            System.out.println("输入密码");
            String userpwd = input.nextLine();
            ps = conn.prepareStatement(sql);
            ps.setInt(1,userid);

            ps.setString(2,userpwd);
            //4、执行SQL
            rs = ps.executeQuery();

            if(rs.next()){
                System.out.println("登录成功");
            }
            else {
                System.out.println("登陆失败");
            }
            //System.out.println(rs);
        } catch (Exception e) {
            System.out.println("输入有误");
            e.printStackTrace();
        }finally {
            DBUtil.close(conn,ps,rs);
        }
    }

}
