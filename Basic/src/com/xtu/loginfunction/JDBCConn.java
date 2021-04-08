package com.xtu.loginfunction;

import com.xtu.dao.DeptDao;
import com.xtu.utils.DBUtil;

import java.sql.*;
import java.util.ResourceBundle;
import java.util.Scanner;

public class JDBCConn {
    public static void SignUp(){
        Scanner input = new Scanner(System.in);
        DeptDao dao = new DeptDao();
        //int user_id = (Integer) input.next();
        System.out.println("输入证件号");
        int user_id = Integer.parseInt(input.next());
        System.out.println("输入姓名");
        String user_name = input.next();
        System.out.println("输入密码");
        String user_pwd = input.next();
        dao.add(user_id,user_name,user_pwd);
        /*Connection conn = null;
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
        }*/
    }

    public static int SignIn(){
        Scanner input = new Scanner(System.in);
        DeptDao dao = new DeptDao();
        //int user_id = (Integer) input.next();
        System.out.println("输入证件号");
        int user_id = Integer.parseInt(input.next());
        System.out.println("输入密码");
        String user_pwd = input.next();
        int result = dao.search(user_id,user_pwd);
        if (result == 1){
            System.out.println("登录成功");
        }
        else {
            System.out.println("登录失败,请查看账号密码是否有误");
        }
        return result;

        /*Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        //1、注册驱动
        //Class.forName(driver);

        //2、获取连接
        // conn = DriverManager.getConnection(url,user,password);
        int flag = 0;
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
                flag = 1;
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
            return flag;
        }*/

    }

    public static void DeleteUser(){
        Scanner input = new Scanner(System.in);
        DeptDao dao = new DeptDao();
        //int user_id = (Integer) input.next();
        System.out.println("输入证件号");
        int user_id = Integer.parseInt(input.next());
        System.out.println("输入密码");
        String user_pwd = input.next();
        dao.delete(user_id,user_pwd);
    }

    public static void UpdateUser(){
        Scanner input = new Scanner(System.in);
        DeptDao dao = new DeptDao();
        //int user_id = (Integer) input.next();
        System.out.println("输入证件号");
        int user_id = Integer.parseInt(input.next());
        System.out.println("输入旧密码");
        String user_pwd = input.next();
        System.out.println("输入新密码");
        String new_pwd = input.next();
        dao.update(user_id,user_pwd,new_pwd);
    }



}
