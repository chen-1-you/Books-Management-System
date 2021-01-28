<%@ page language="java" import="test.ConnectDB" pageEncoding="UTF-8"%>    
<%
	request.setCharacterEncoding("UTF-8");   
	response.setCharacterEncoding("UTF-8");   
	response.setContentType("text/html; charset=utf-8");//这三段一定要加进来否则会不能显示汉字   
	String oid =request.getParameter("sid");     
	String oname =request.getParameter("sname");
	String oage =request.getParameter("sage");%>
<%    
	String updateUser="update student set sname= '"+oname+"' where sid="+oid;
    ConnectDB.update(updateUser);
 	String updateUser1="update student set sage= '"+oage+"' where sid="+oid;
    ConnectDB.update(updateUser1);
    response.sendRedirect("list.jsp");  //转到list.jsp页面    
%>    
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">    
<html>    
    <head>    
        <title>修改页面</title>    
    </head>    
    <body>    
        这是我的jsp页面！<br>    
    </body>    
</html>  
