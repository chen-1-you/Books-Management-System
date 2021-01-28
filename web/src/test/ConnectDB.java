package test;

import java.sql.Connection;    
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;    
import java.sql.SQLException;    
import java.sql.Statement;    
import java.util.ArrayList;  
  
import test.Person;  
  
public class ConnectDB {  
    private static Connection conn = null;  //���� 
    private static PreparedStatement stmt = null;  //����ָ�� java���Ǻ�cmd���н�
    private static ResultSet rs = null;  //�������ı� 
      
    public static void startConnect() {  
        try {  
            Class.forName("com.mysql.jdbc.Driver");  //���Ҫ��������
            try {  
                conn = DriverManager.getConnection(  
                        "jdbc:MySQL://127.0.0.1:3306/test?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=utf-8", "root", "199728");   
            } catch (SQLException e) {  
                // TODO: handle exception  
                e.printStackTrace();  
            }  
        } catch (ClassNotFoundException e) {  
            // TODO: handle exception  
            e.printStackTrace();  
        }  
    }  
      
    public static void endConnect() throws SQLException {     
    	 //�ر�����    
        if (rs != null) {    
            rs.close();    
            rs = null;    
        }    
        if (stmt != null) {    
            stmt.close();    
            stmt = null;    
        }    
        if (conn != null) {    
            conn.close();    
            conn = null;    
        }    
    }    
    
    public static void update(String sql) throws SQLException {     
    
    	 //���ݿ����  
        startConnect();   //����mysql
        stmt = conn.prepareStatement("select * from student");    //�������ӵ��н�
        stmt.executeUpdate(sql);    //ִ�в���ָ��
        endConnect();    //�ر�����
    }    
    
    public static ArrayList getList1(String sql) throws SQLException {    
    
    	 //���ݿ��ѯ   
        ArrayList list = new ArrayList();    
        startConnect();   
        stmt = conn.prepareStatement("select * from student");  
        rs = stmt.executeQuery(sql);    
        while (rs.next()) {    
            Person st = new Person();    
            st.setSid(rs.getString("sid"));    
            st.setName(rs.getString("sname"));  
            st.setAge(rs.getString("sage"));    
            list.add(st);    
        }    
        endConnect();    
        return list;    
    }    
    
}

