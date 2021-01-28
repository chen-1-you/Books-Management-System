package test;

import java.sql.*;

public class test {

  public static void main(String args[]) {

    try {

      Class.forName("com.mysql.jdbc.Driver");     //加载MYSQL JDBC驱动程序   

//      Class.forName("org.gjt.mm.mysql.Driver");

     System.out.println("Success loading Mysql Driver!");

    }

    catch (Exception e) {

      System.out.print("Error loading Mysql Driver!");

      e.printStackTrace();

    }

    try {

      Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=utf-8","root","199728");

           //连接URL为   jdbc:mysql//服务器地址/数据库名  ，后面的2个参数分别是登陆用户名和密码

 

      System.out.println("Success connect Mysql server!");

      Statement stmt = connect.createStatement();

      ResultSet rs = stmt.executeQuery("select * from user");

                                                              //user 为你表的名称

while (rs.next()) {

        System.out.println(rs.getString("name"));

      }

    }

    catch (Exception e) {

      System.out.print("get data error!");

      e.printStackTrace();

    }
    
//    try {
//    	 String driver = "com.mysql.jdbc.Driver";//根据报错信息修改
//    	 String url="jdbc:mysql://localhost:3306/test?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=utf-8";//链接的mysql
//    	 Class.forName(driver).newInstance();//处理异常
//    	 Connection connection = DriverManager.getConnection(url,"root","554517318");//处理异常
//    	 System.out.println(connection.toString());//测试是否连接成功
//    	 } catch (Exception e) {
//    	 e.printStackTrace();
//    	 System.out.println("error:数据库连接出错");
//    	}

  }

}