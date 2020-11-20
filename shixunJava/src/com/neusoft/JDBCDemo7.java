package com.neusoft;

import com.neusoft.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 * 模拟用户登录程序
 */

public class JDBCDemo7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎使用");
        System.out.println("请输入用户名");
        String userName = scanner.next();
        System.out.println("请输入密码");
        String passsword = scanner.next();

        boolean flag = login(userName,passsword);
        if(flag){
            System.out.println("登陆成功");
        }else{
            System.out.println("用户名或密码错误");
        }
    }

    /**
     * 用户登录
     * @param userName
     * @param passsword
     * @return
     */

    public static boolean login(String userName,String passsword){
        //参数校验
        if(userName == null || passsword == null){
            return  false;
        }
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConnection();
            String sql = "select * from users where username = '"+userName+"' and password = '"+passsword+"'";
            System.out.println(sql);
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            return rs.next();
        }catch (Exception e){
            e.printStackTrace();
        }
        //

        return  false;
    }
}
