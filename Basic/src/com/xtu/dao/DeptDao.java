package com.xtu.dao;

import com.xtu.loginfunction.JDBCConn;
import com.xtu.utils.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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

    public int delete(int user_id){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int count = 0;
        try {
            String sql = "delete from user where user_id = ?";
            conn = DBUtil.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1,user_id);
            count = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(conn,ps,rs);
        }
        return count;

    }

    public int update(int user_id,String user_name,String user_pwd){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int count = 0;
        try {
            String sql = "update user set user_name = ? , user_pwd=? where user_id = ?";
            conn = DBUtil.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(3,user_id);
            ps.setString(1,user_name);
            ps.setString(2,user_pwd);
            count = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(conn,ps,rs);
        }
        return count;
    }

}
