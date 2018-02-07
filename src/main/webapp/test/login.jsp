<%--
  Created by IntelliJ IDEA.
  User: hanchao
  Date: 2018/2/7
  Time: 23:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录测试：注解、校验</title>
</head>
<script type="text/javascript" src="../static/js/jquery-3.2.1.min.js"></script>
<body>
<div>
    <input type="text" value="David" name="username" id="username"/>
    <input type="password" value="123456" name="password" id="password"/>
    <input type="button" value="校验测试" onclick="login()"/>
</div>
</body>
<script type="text/javascript">
    function login() {
        $.ajax({
            type:'POST',
            url:'/mvc/login',
            data:JSON.stringify({username:$('#username').val(),password:$('#password').val()}),
            contentType:'application/json;charset=utf-8',
            success:function (data) {
                alert(data.message);
            },
            error:function (data) {
                alert(data.message);
            }
        });
    }
</script>
</html>
