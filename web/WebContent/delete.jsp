<%@ page language="java" import="test.ConnectDB" pageEncoding="gbk"%>    
<%    
    ConnectDB.update("delete from student where sid ="+request.getParameter("sid")); //获得要删除人的sid并删除    
    response.sendRedirect("list.jsp");  //转到list.jsp页面    
%>    
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">    
<html>    
    <head>    
        <title>删除界面</title>    
    </head>    
    <body>    
        This is my JSP page.<br>    
    </body>    
</html>  
