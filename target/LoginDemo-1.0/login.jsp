<%-- 
    Document   : login
    Created on : 2023年12月15日, 上午9:12:31
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>會員登入頁面</h1>
        您現在所在的位置: <%= request.getRequestURI() %>
        <form method="get" action="CheckLogin2">
            帳號:<input type="text" name="username" value="" /><br/>
            密碼:<input type="password" name="passwd" value="" /><br/>
            <input type="submit" value="登入" />
            <input type="reset" value="清除" />
           
        </form>        
    </body>
</html>
