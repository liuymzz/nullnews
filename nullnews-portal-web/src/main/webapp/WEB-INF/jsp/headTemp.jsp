<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%> 
<html class="no-js">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<title></title>

<!--360 browser -->
<meta name="renderer" content="webkit">
<meta name="author" content="wos">
<!-- Android -->
<meta name="mobile-web-app-capable" content="yes">
<link rel="icon" sizes="192x192"
	href="${pageContext.request.contextPath}/images/i/app.png">
<!--Safari on iOS -->
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="apple-mobile-web-app-title" content="Amaze UI" />
<link rel="apple-touch-icon-precomposed"
	href="${pageContext.request.contextPath}/images/i/app.png">
<!--Win8 or 10 -->
<meta name="msapplication-TileImage"
	content="${pageContext.request.contextPath}/images/i/app.png">
<meta name="msapplication-TileColor" content="#e1652f">

<link rel="icon" type="image/png"
	href="${pageContext.request.contextPath}/images/i/favicon.png">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/amazeui.css">
<link rel="stylesheet" href="/css/comment.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/public.css">

<!--[if (gte IE 9)|!(IE)]><!-->
<script src="${pageContext.request.contextPath}/assets/js/jquery.min.js"></script>

<script
	src="${pageContext.request.contextPath}/assets/js/amazeui.min.js"></script>
	<script src="https://cdn.bootcss.com/jquery-cookie/1.4.1/jquery.cookie.js"></script>
<script src="${pageContext.request.contextPath}/js/public.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/comment.js"></script>
</head>
<body>
	<header class="am-topbar am-topbar-fixed-top wos-header">
		<div class="am-container">
			<h1 class="am-topbar-brand">
				<a href="#"><img src="/images/logo.png" alt=""></a>
			</h1>

			<button
				class="am-topbar-btn am-topbar-toggle am-btn am-btn-sm am-btn-warning am-show-sm-only"
				data-am-collapse="{target: '#collapse-head'}">
				<span class="am-sr-only">导航切换</span> <span class="am-icon-bars"></span>
			</button>

			<div class="am-collapse am-topbar-collapse" id="collapse-head">
				<ul class="am-nav am-nav-pills am-topbar-nav">
					<!-- class="am-active" -->
					<li><a href="/index">首页</a></li>
					<li><a href="/zixun">资讯</a></li>
					<li><a href="/category">专栏</a></li>
					<li class="am-dropdown" data-am-dropdown><a
						class="am-dropdown-toggle" data-am-dropdown-toggle
						href="javascript:;"> 案例 <span class="am-icon-caret-down"></span>
					</a>
						<ul class="am-dropdown-content">
							<li class="am-dropdown-header">案例</li>
							<li><a href="#">1. 游戏案例</a></li>
							<li><a href="#">2. 营销案例</a></li>
							<li><a href="#">3. 工具案例</a></li>
							<li><a href="cases.html">4. 全部案例</a></li>
						</ul></li>
					<li><a href="/profile">评测</a></li>
					<li><a href="/quanzi">圈子</a></li>

				</ul>
				<div style="margin-top: 1%">
					<c:choose>
						<c:when test="${empty LOGIN_YES}">
							<div class="am-topbar-right">
								<a href="/user/regist">
									<button class="am-btn am-btn-default am-topbar-btn am-btn-sm">
										<span class="am-icon-pencil"></span>注册
									</button>
								</a>
							</div>

							<div class="am-topbar-right">
								<a href="/user/login">
									<button class="am-btn am-btn-danger am-topbar-btn am-btn-sm">
										<span class="am-icon-user"></span> 登录
									</button>
								</a>
							</div>
						</c:when>
						<c:otherwise>
							<div class="am-topbar-right">
								<img alt="头像" src="${LOGIN_YES.userUri}" style="height: 50px">
								<li class="am-dropdown" data-am-dropdown><a
									class="am-dropdown-toggle" data-am-dropdown-toggle
									href="javascript:;"> ${LOGIN_YES.userName} <span
										class="am-icon-caret-down"></span>
								</a>
									<ul class="am-dropdown-content">
										<li><a href="/personal">个人中心</a></li>
										<li><a href="/publishPassage">写文章</a></li>
										<li><a href="/user/logout">退出登陆</a></li>
									</ul></li>
							</div>
						</c:otherwise>
					</c:choose>
				</div>
			</div>

		</div>
	</header>