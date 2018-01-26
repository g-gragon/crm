<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <%@include file="/common/head.jsp" %>
</head>

<body>
<div class="container">
    <table id="dg" style="width:100%;height:554px" title="产品库存信息" class="easyui-datagrid" toolbar="#tb"
           title="Load Data" iconCls="icon-save"
           rownumbers="true" pagination="true" url="storage/list">
        <thead>
        <tr>
            <th field="strId" width="110">库存ID</th>
            <th field="pname" width="226">产品名</th>
            <th field="strWarehouse" width="112">仓库名</th>
            <th field="strWare" width="105">货位</th>
            <th field="strCount" width="130">数量</th>
            <th field="strRemark" width="136">备注</th>
        </tr>
        </thead>
    </table>
    <div id="tb" style="padding:0 30px;">
        产品名称: <input id="pname" class="easyui-textbox" type="text" name="name"
                     style="width:166px;height:35px;line-height:35px;"></input>
        仓库名称: <input id="strWarehouse" class="easyui-textbox" type="text" name="name"
                     style="width:166px;height:35px;line-height:35px;"></input>
        <a href="javascript:doSearch();" class="easyui-linkbutton" iconCls="icon-search" data-options="selected:true"
           plain="true">查询</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-reload">重置</a>
    </div>
</div>
<script type="text/javascript">
    function doSearch() {
        $('#dg').datagrid('load', {
            pname: $('#pname').val(),
            strWarehouse: $('#strWarehouse').val()
        });
    }
</script>
</body>
</html>

