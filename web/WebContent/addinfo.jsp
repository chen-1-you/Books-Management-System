<%@page import="test.ConnectDB"%>  
<%@ page language="java" import="test.ConnectDB" pageEncoding="UTF-8"%>    
<%    
    request.setCharacterEncoding("UTF-8");   
    response.setCharacterEncoding("UTF-8");   
    response.setContentType("text/html; charset=utf-8");   
 
    String sid=request.getParameter("sid");     
    String name =request.getParameter("sname");    
    String age = request.getParameter("sage");    
    
    try {
    	 ConnectDB.update("insert into student (sid,sname,sage) values ('"+sid+"','"+name+"','"+age+"')"); 
    	response.sendRedirect("list.jsp");
    }
    catch (Exception e) {
    	
    	%>
				编号已存在！！！<br>
				重新添加，请点击<a href="add.jsp">这里</a>！！！
				
<% 
    }
%>    
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">    
<html>    
    <head>    
        <title>添加详细界面</title>    
    </head>    
    <body>    
        请添加!<br>    
    </body>    
</html> 
