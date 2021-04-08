package com.xtu.dao;

import com.xtu.loginfunction.JDBCConn;
import com.xtu.utils.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DeptDao {
    public int add(int user_id ,String user_name,String user_pwd) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int count = 0;
        try {
            String sql = "insert into user(user_id,user_name,user_pwd) values(?,?,?)";
            //DBUtil util = new DBUtil();
            conn = DBUtil.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1,user_id);
            ps.setString(2,user_name);
            ps.setString(3,user_pwd);
            count = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(conn,ps,rs);
        }
        return count;
    }

    public int delete(int user_id , String user_pwd){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int count = 0;
        try {
            String sql = "delete from user where user_id = ? and user_pwd = ?";
            conn = DBUtil.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1,user_id);
            ps.setString(2,user_pwd);
            count = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(conn,ps,rs);
        }
        return count;

    }

    public int update(int user_id,String user_pwd,String new_pwd){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int count = 0;
        try {
            String sql = "update user set user_pwd = ? where user_id = ? and user_pwd = ? ";
            conn = DBUtil.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(2,user_id);
            //ps.setString(1,user_name);
            ps.setString(1,new_pwd);
            ps.setString(3,user_pwd);
            count = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(conn,ps,rs);
        }
        return count;
    }

    public int search(int user_id,String user_pwd){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int flag = 0;
        try {
            conn = DBUtil.getConnection();
            String sql = "select *  from user Where (user_id = ? AND user_pwd = ?)";
            /*Scanner input = new Scanner(System.in);
            System.out.println("输入证件号");
            String Suserid = input.nextLine();
            int userid = Integer.parseInt(Suserid);

            System.out.println("输入密码");
            String userpwd = input.nextLine();*/
            ps = conn.prepareStatement(sql);
            ps.setInt(1,user_id);

            ps.setString(2,user_pwd);
            //4、执行SQL
            rs = ps.executeQuery();

            if(rs.next()){

                flag = 1;
                //return 1;
            }
            //System.out.println(rs);
        } catch (Exception e) {
            //System.out.println("输入有误");
            e.printStackTrace();
        }finally {
            DBUtil.close(conn,ps,rs);
            return flag;
        }
    }

}
