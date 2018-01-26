<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <%@include file="/common/head.jsp" %>
</head>

<body>
<div class="container">
    <table id="dg" style="width:100%;height:554px" title="产品列表" class="easyui-datagrid" toolbar="#tb"
           title="Load Data" iconCls="icon-save"
           rownumbers="true" pagination="true" url="product/list">
        <thead>
        <tr>
            <th field="proId" width="110">产品ID</th>
            <th field="proName" width="226">产品名</th>
            <th field="proPrice" width="112">价格</th>
            <th field="proBatch" width="105">级别</th>
            <th field="proType" width="130">类型</th>
            <th field="proUnit" width="136">单位</th>
            <th field="proRemark" width="170">描述</th>
        </tr>
        </thead>
    </table>
    <div id="tb" style="padding:0 30px;">
        产品名称: <input id="proName" class="easyui-textbox" type="text" name="name"
                     style="width:166px;height:35px;line-height:35px;"></input>
        <a href="javascript:doSearch();" class="easyui-linkbutton" iconCls="icon-search" data-options="selected:true"
           plain="true">查询</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-reload">重置</a>
    </div>
</div>
<script type="text/javascript">
    function doSearch() {
        $('#dg').datagrid('load', {
            proName: $('#proName').val()
        });
    }
</script>
</body>
</html>

