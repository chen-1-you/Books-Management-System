<%@ page language="java" import="test.ConnectDB" pageEncoding="gbk"%>    
<%    
    ConnectDB.update("delete from student where sid ="+request.getParameter("sid")); //���Ҫɾ���˵�sid��ɾ��    
    response.sendRedirect("list.jsp");  //ת��list.jspҳ��    
%>    
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">    
<html>    
    <head>    
        <title>ɾ������</title>    
    </head>    
    <body>    
        This is my JSP page.<br>    
    </body>    
</html>  
