package test;

import java.sql.*;

public class test {

  public static void main(String args[]) {

    try {

      Class.forName("com.mysql.jdbc.Driver");     //����MYSQL JDBC��������   

//      Class.forName("org.gjt.mm.mysql.Driver");

     System.out.println("Success loading Mysql Driver!");

    }

    catch (Exception e) {

      System.out.print("Error loading Mysql Driver!");

      e.printStackTrace();

    }

    try {

      Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=utf-8","root","199728");

           //����URLΪ   jdbc:mysql//��������ַ/���ݿ���  �������2�������ֱ��ǵ�½�û���������

 

      System.out.println("Success connect Mysql server!");

      Statement stmt = connect.createStatement();

      ResultSet rs = stmt.executeQuery("select * from user");

                                                              //user Ϊ��������

while (rs.next()) {

        System.out.println(rs.getString("name"));

      }

    }

    catch (Exception e) {

      System.out.print("get data error!");

      e.printStackTrace();

    }
    
//    try {
//    	 String driver = "com.mysql.jdbc.Driver";//���ݱ�����Ϣ�޸�
//    	 String url="jdbc:mysql://localhost:3306/test?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=utf-8";//���ӵ�mysql
//    	 Class.forName(driver).newInstance();//�����쳣
//    	 Connection connection = DriverManager.getConnection(url,"root","554517318");//�����쳣
//    	 System.out.println(connection.toString());//�����Ƿ����ӳɹ�
//    	 } catch (Exception e) {
//    	 e.printStackTrace();
//    	 System.out.println("error:���ݿ����ӳ���");
//    	}

  }

}