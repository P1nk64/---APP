package com.xtu.mainfunction;
import com.xtu.character.*;
import com.xtu.loginfunction.JDBCConn;

public class MainFuction {
    public static void main(String[] args) {
        JDBCConn.SignUp();
        JDBCConn.SignIn();
        ProcessFuction pf = new ProcessFuction();
    }
}
