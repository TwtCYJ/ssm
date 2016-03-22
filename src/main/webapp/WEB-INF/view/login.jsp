<%--
  Created by IntelliJ IDEA.
  User: Yingjie Chen
  Date: 2016/3/22
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
<body>
<center><h1>登陆页面</h1><hr>
    <form action="${ctx}/user/login" method="post">
        <table>
            <tr><td>账号：</td><td><input type="text" name="userName"></td></tr>
            <tr><td>密码：</td><td><input type="password" name="password"></td></tr>
            <tr><td><input type="submit" value="登陆"></td><td><a href="${ctx}/register.jsp">还没注册</a></td></tr>
        </table>
    </form>
</center>
</body>
<body>

</body>
</html>
