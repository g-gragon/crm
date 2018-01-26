<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<base href="<%= request.getContextPath()+"/"%>"/>
<link href="css/base.css" rel="stylesheet">
<link href="css/platform.css" rel="stylesheet">
<link href="css/easyui.css" rel="stylesheet" >
<link rel="stylesheet" type="text/css" href="css/icon.css">
<link rel="stylesheet" href="css/providers.css">
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery.easyui.min.js"></script>
<script type="text/javascript" src="js/main.js"></script>
<script type="text/javascript" src="js/easyui-lang-zh_CN.js"></script>

<title>客户资源管理系统</title>
<script>
    function del(href) {
        if (confirm("您确定要删除此条记录吗？")) {
            location.href = href;
            window.event.returnValue = false;
        } else
            window.event.returnValue = false;
    }

    function doExit() {
        if (confirm("您确定要退出吗？")) {
            location.href = 'user/toIndex?exit=true';
            window.event.returnValue = false;
        } else
            window.event.returnValue = false;
    }
</script>

<!-- 消息取值 -->
<c:if test="${!empty msg}">
    <script>
        var msg = "${msg}";

        function showMessage() {
            alert(msg);
        }

        window.onload = showMessage;
    </script>
    <c:remove var="msg" scope="session"/>
</c:if>
