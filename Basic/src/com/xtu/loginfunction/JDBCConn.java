package com.xtu.loginfunction;

import com.xtu.utils.DBUtil;

import java.sql.*;
import java.util.ResourceBundle;

public class JDBCConn {
    public static void main(String[] args) {
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
            ps = conn.prepareStatement(sql);
            ps.setInt(1,3);
            ps.setString(2,"Covena");
            ps.setString(3,"998877");
            //4、执行SQL
            int count = ps.executeUpdate();
            System.out.println(count);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            DBUtil.close(conn,ps,rs);
        }


    }
}
