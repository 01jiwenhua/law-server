<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" contentType="text/html;
charset=UTF-8" pageEncoding="UTF-8"%>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="UTF-8" />
    <title>常见问题与帮助</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Accordion with CSS3" />
    <meta name="keywords" content="accordion, css3, sibling selector, radio buttons, input, pseudo class" />
    <meta name="author" content="Codrops" />
    <link rel="shortcut icon" href="../favicon.ico">
    <link rel="stylesheet" type="text/css" href="./css/demo.css" />
    <link rel="stylesheet" type="text/css" href="./css/style.css" />
    <script type="text/javascript" src="./js/modernizr.custom.29473.js"></script>
</head>
<body style="background: #F5F5F5;">
<div class="container">
    <%--<div style="text-align:center;clear:both;">--%>
        <%--<script src="./js/gg_bd_ad_720x90.js" type="text/javascript"></script>--%>
        <%--<script src="./js/follow.js" type="text/javascript"></script>--%>
    <%--</div>--%>


    <section class="ac-container">
        <div>
            <input id="ac-1" name="accordion-1" type="checkbox" />
            <label for="ac-1">首页搜索和每个模块内搜索有什么区别？</label>
            <article class="ac-small">
                <p>答：首页搜索可以对数据内所有数据进行检索查询，模块内搜索只是对该模块内数据进行检索查询。</p>
            </article>
        </div>
        <div>
            <input id="ac-2" name="accordion-1" type="checkbox" />
            <label for="ac-2">不知道名称的化学品怎么查询？</label>
            <article class="ac-medium">
                <p>答：除了对知道名称的化学品通过搜索功能查询外，应用同时支持对不知道名称的化学品的查询，通过【首页】<span>-</span>【危化品查询】<span>-</span>【未知物质查询】选择理化特性和健康危害，然后点击查询，即可检索出符合条件的化学品。<span></span> </p>
            </article>
        </div>
        <div>
            <input id="ac-3" name="accordion-1" type="checkbox" />
            <label for="ac-3">收藏功能怎么使用？收藏内容怎么查看？</label>
            <article class="ac-large">
                <p>答：在法律法规、标准规范、政策文件、化学品的详情页面右上角有收藏按钮，点击即可对当前页面显示的内容进行收藏，已收藏的文件或物质，可以通过主页面【收藏】进行查看。<span></span></p>
            </article>
        </div>
        <div>
            <input id="ac-4" name="accordion-1" type="checkbox" />
            <label for="ac-4">如何修改个人信息？</label>
            <article class="ac-large">
                <p>答：打开应用【我的】<span>-</span>【个人资料】，就可以对个人信息（头像、姓名、证件类型、号码等）和工作信息（工作单位、部门、职务）进行修改，然后保存即可。<span></span> </p>
            </article>
        </div>
    </section>
</div>
</body>
</html>
