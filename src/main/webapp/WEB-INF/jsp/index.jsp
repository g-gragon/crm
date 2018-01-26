<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <%@include file="/common/head.jsp" %>
</head>

<body>
<div class="container">
    <div id="pf-hd">
        <div class="pf-logo">
            <img src="images/main/main_logo.png" alt="logo">
        </div>

        <div class="pf-user">
            <div class="pf-user-photo">
                <img src="images/main/user.png" alt="">
            </div>
            <h4 class="pf-user-name ellipsis">uimaker</h4>
            <i class="iconfont xiala">&#xe607;</i>

            <div class="pf-user-panel">
                <ul class="pf-user-opt">
                    <li>
                        <a href="javascript:;">
                            <i class="iconfont">&#xe60d;</i>
                            <span class="pf-opt-name">用户信息</span>
                        </a>
                    </li>
                    <li class="pf-modify-pwd">
                        <a href="http://www.uimaker.com">
                            <i class="iconfont">&#xe634;</i>
                            <span class="pf-opt-name">修改密码</span>
                        </a>
                    </li>
                    <li class="pf-logout">
                        <a href="login.html">
                            <i class="iconfont">&#xe60e;</i>
                            <span class="pf-opt-name">退出</span>
                        </a>
                    </li>
                </ul>
            </div>
        </div>

    </div>

    <div id="pf-bd">
        <div id="pf-sider">

            <ul class="sider-nav">
                <li class="current">
                    <a href="javascript:;">
                        <span class="iconfont sider-nav-icon">&#xe620;</span>
                        <span class="sider-nav-title">营销管理</span>
                        <i class="iconfont">&#xe642;</i>
                    </a>
                    <ul class="sider-nav-s">
                        <li class="active"><a href="#">营销机会</a></li>
                        <li><a href="#">营销计划</a></li>
                    </ul>
                </li>
                <li>
                    <a href="javascript:;">
                        <span class="iconfont sider-nav-icon">&#xe625;</span>
                        <span class="sider-nav-title">客户管理</span>
                        <i class="iconfont">&#xe642;</i>
                    </a>
                    <ul class="sider-nav-s">
                        <li class="active"><a href="#">客户信息</a></li>
                        <li><a href="#">客户流失</a></li>
                    </ul>
                </li>
                <li>
                    <a href="javascript:;">
                        <span class="iconfont sider-nav-icon">&#xe62f;</span>
                        <span class="sider-nav-title">服务管理</span>
                        <i class="iconfont">&#xe642;</i>
                    </a>
                    <ul class="sider-nav-s">
                        <li class="active"><a href="#">新建服务</a></li>
                        <li><a href="#">指派</a></li>
                        <li><a href="#">处理</a></li>
                        <li><a href="#">结果</a></li>
                        <li><a href="#">归档</a></li>
                    </ul>
                </li>
                <li>
                    <a href="javascript:;">
                        <span class="iconfont sider-nav-icon">&#xe647;</span>
                        <span class="sider-nav-title">统计报表</span>
                        <i class="iconfont">&#xe642;</i>
                    </a>
                    <ul class="sider-nav-s">
                        <li class="active"><a href="#">客户贡献</a></li>
                    </ul>
                </li>
                <li>
                    <a href="javascript:;">
                        <span class="iconfont sider-nav-icon">&#xe611;</span>
                        <span class="sider-nav-title">基础数据管理</span>
                        <i class="iconfont">&#xe642;</i>
                    </a>
                    <ul class="sider-nav-s">
                        <li class="active"><a href="#">字典表管理</a></li>
                        <li><a href="#" onclick="doJump('产品信息','product/toList');">查询产品信息</a></li>
                        <li><a href="#" onclick="doJump('产品库存','storage/toList');">查询库存</a></li>
                    </ul>
                </li>
                <li>
                    <a href="javascript:;">
                        <span class="iconfont sider-nav-icon">&#xe633;</span>
                        <span class="sider-nav-title">权限管理</span>
                        <i class="iconfont">&#xe642;</i>
                    </a>
                    <ul class="sider-nav-s">
                        <li class="active"><a href="#">用户管理</a></li>
                        <li><a href="#">角色管理</a></li>
                        <li><a href="#">权限管理</a></li>
                        <li><a href="#">功能管理</a></li>
                    </ul>
                </li>
            </ul>
        </div>

        <div id="pf-page">
            <div id="tabs" class="easyui-tabs" style="width:100%;height:100%;">
                <div title="首页" style="padding:10px 5px 5px 10px;">
                    <iframe class="page-iframe" src="workbench.html" frameborder="no" border="no" height="100%"
                            width="100%" scrolling="auto"></iframe>
                </div>
            </div>
        </div>
    </div>

    <div id="pf-ft">
        <div class="system-name">
            <i class="iconfont">&#xe6fe;</i>
            <span>信息管理系统&nbsp;v1.0</span>
        </div>
        <div class="copyright-name">
            <span>CopyRight&nbsp;2016&nbsp;&nbsp;uimaker.com&nbsp;版权所有</span>
            <i class="iconfont">&#xe6ff;</i>
        </div>
    </div>
</div>

<script type="text/javascript">
    // 点击菜单栏添加子页面
    function doJump(title, url) {
        if ($('#tabs').tabs('exists', title)) {
            $('#tabs').tabs('select', title);
        } else {
            $('#tabs').tabs('add', {
                title: title,
                content: ' <iframe class="page-iframe" src="' + url + '" frameborder="no" border="no" height="100%"width="100%" scrolling="auto"></iframe>',
                closable: true
            });
        }
    }

    $('.easyui-tabs').tabs({
        tabHeight: 44,
        onSelect: function (title, index) {
            var currentTab = $('.easyui-tabs').tabs("getSelected");
            if (currentTab.find("iframe") && currentTab.find("iframe").size()) {
                currentTab.find("iframe").attr("src", currentTab.find("iframe").attr("src"));
            }
        }
    })

    $(window).resize(function () {
        $('.tabs-panels').height($("#pf-page").height() - 46);
        $('.panel-body').height($("#pf-page").height() - 76)
    }).resize();

    var page = 0,
        pages = ($('.pf-nav').height() / 70) - 1;

    if (pages === 0) {
        $('.pf-nav-prev,.pf-nav-next').hide();
    }
    $(document).on('click', '.pf-nav-prev,.pf-nav-next', function () {


        if ($(this).hasClass('disabled')) return;
        if ($(this).hasClass('pf-nav-next')) {
            page++;
            $('.pf-nav').stop().animate({'margin-top': -70 * page}, 200);
            if (page == pages) {
                $(this).addClass('disabled');
                $('.pf-nav-prev').removeClass('disabled');
            } else {
                $('.pf-nav-prev').removeClass('disabled');
            }

        } else {
            page--;
            $('.pf-nav').stop().animate({'margin-top': -70 * page}, 200);
            if (page == 0) {
                $(this).addClass('disabled');
                $('.pf-nav-next').removeClass('disabled');
            } else {
                $('.pf-nav-next').removeClass('disabled');
            }

        }
    })
    // setTimeout(function(){
    //    $('.tabs-panels').height($("#pf-page").height()-46);
    //    $('.panel-body').height($("#pf-page").height()-76)
    // }, 200)
</script>
</body>
</html>

