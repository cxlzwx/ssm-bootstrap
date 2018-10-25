package com.it.ssm.mysqlconnection;/**
 * Created by sunrise on 2018/8/25.
 */

import java.sql.*;

/**
 * @ClassName TestMysqlMaxCon
 * @Description 测试MySQL最大连接数
 * @Author sunrise
 * @Date 2018/8/25 1:48
 * @Version 1.0
 */
public class TestMysqlMaxCon {

    public static void main(String[] args) {
        //声明Connection对象
        Connection con;
        //驱动程序名
        String driver = "com.mysql.jdbc.Driver";
        //URL指向要访问的数据库名mydata
        String url = "jdbc:mysql://localhost:3306/springboot1";
        //MySQL配置时的用户名
        String user = "root";
        //MySQL配置时的密码
        String password = "1234";
        //遍历查询结果集
        try {
            //加载驱动程序
            Class.forName(driver);
            //1.getConnection()方法，连接MySQL数据库！！
            //连接数过多报错
            for (int i = 0; i < 300; i++) {
                con = DriverManager.getConnection(url, user, password);
                System.out.println(con);
            }

        } catch (ClassNotFoundException e) {
            //数据库驱动类异常处理
            System.out.println("Sorry,can`t find the Driver!");
            e.printStackTrace();
        } catch (SQLException e) {
            //数据库连接失败异常处理
            e.printStackTrace();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            System.out.println("数据库数据成功获取！！");
        }
    }

}

