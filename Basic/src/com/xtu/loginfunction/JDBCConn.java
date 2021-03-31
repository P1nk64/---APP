package com.xtu.loginfunction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCConn {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            //1、注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2、获取连接
            conn = DriverManager.getConnection("jdbc:mysql://81.70.41.251:3306/P1nk64","P1nk64","123456");

            //3、获取预编译的数据库操作对象
            String sql = "insert into user(user_id,user_name,user_pwd) values(?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1,1);
            ps.setString(2,"BAnder");
            ps.setString(3,"123");
            //4、执行SQL
            int count = ps.executeUpdate();
            System.out.println(count);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (ps!=null){
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
