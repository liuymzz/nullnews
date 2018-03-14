<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>NULL登陆</title>
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/gloab.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/index.css"
	rel="stylesheet">
<script src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
<script src="${pageContext.request.contextPath}/js/register.js"></script>
</head>
<body class="bgf4">
	<div class="login-box f-mt10 f-pb50">
		<div class="main bgf">
			<div class="reg-box-pan display-inline">
				<div class="step">
					<ul>
						<li class="col-xs-4 on"><span class="num"><em
								class="f-r5"></em><i></i></span> <span class="line_bg lbg-r"></span>
							<p class="lbg-txt"></p></li>
						<li class="col-xs-4"><span class="num"><em
								class="f-r5"></em><i>NULL</i></span> <span class="line_bg lbg-l"></span>
							<span class="line_bg lbg-r"></span>
							<p class="lbg-txt">NULL科技登陆</p></li>
						<li class="col-xs-4"><span class="num"><em
								class="f-r5"></em><i></i></span> <span class="line_bg lbg-l"></span>
							<p class="lbg-txt"></p></li>
					</ul>
				</div>
				<div class="reg-box" id="verifyCheck"
					style="margin-top: 20px; margin-left: 100px;">
					<form action="/user/userLogin" method="post">
						<div class="part1">
							<div class="item col-xs-12">
								<span class="intelligent-label f-fl"><b class="ftx04">*</b>手机号：</span>
								<div class="f-fl item-ifo">
									<input type="text" class="txt03 f-r3 required" keycodes="tel"
										tabindex="2" data-valid="isNonEmpty||isPhone"
										data-error="手机号码不能为空||手机号码格式不正确" maxlength="11" name="userPhone" id="phone" />
									<span class="ie8 icon-close close hide"></span> <label
										class="icon-sucessfill blank hide"></label> <label
										class="focus">请填写11位有效的手机号码</label> <label class="focus valid"></label>
								</div>
							</div>
							<div class="item col-xs-12">
								<span class="intelligent-label f-fl"><b class="ftx04">*</b>密码：</span>
								<div class="f-fl item-ifo">
									<input type="password" name="userPassword" id="password" maxlength="20"
										class="txt03 f-r3 required" tabindex="3"
										style="ime-mode: disabled;" onpaste="return  false"
										autocomplete="off"
										data-valid="isNonEmpty||between:6-20||level:2"
										data-error="密码错误" /> <span class="ie8 icon-close close hide"
										style="right: 55px"></span> <span class="showpwd"
										data-eye="password"></span> <label
										class="icon-sucessfill blank hide"></label> <label
										class="focus valid"></label> <span class="clearfix"></span>
								</div>
							</div>
							
							<span style="color: red;">${errorTip}</span>
							
							<div class="item col-xs-12" style="height: auto">
								<span class="intelligent-label f-fl">&nbsp;</span>
								<p class="f-size14 required" data-valid="isChecked"
									data-error="请先同意条款">
									<input type="checkbox" checked /><a
										href="javascript:showoutc();" class="f-ml5">我已阅读并同意条款</a>
								</p>
								<label class="focus valid"></label>
							</div>
							<div class="item col-xs-12">
								<span class="intelligent-label f-fl">&nbsp;</span>
								<div class="f-fl item-ifo">
									<button type="submit" class="btn btn-blue f-r3" id="btn_part1">登陆</button>
								</div>
							</div>
							
						</div>
					</form>



				</div>
			</div>
		</div>
	</div>
	<div class="m-sPopBg" style="z-index: 998;"></div>
	<div class="m-sPopCon regcon">
		<div class="m-sPopTitle">
			<strong>服务协议条款</strong><b id="sPopClose" class="m-sPopClose"
				onClick="closeClause()">×</b>
		</div>
		<div class="apply_up_content">
			<pre class="f-r0">
		<strong>同意以下服务条款，提交注册信息</strong>
        </pre>
		</div>
		<center>
			<a
				class="btn btn-blue btn-lg f-size12 b-b0 b-l0 b-t0 b-r0 f-pl50 f-pr50 f-r3"
				href="javascript:closeClause();">已阅读并同意此条款</a>
		</center>
	</div>
	<script>

// 		$("#btn_part1").click(function() {
// 			if (!verifyCheck._click())
// 				return;
			
// 			$.ajax({
// 				type : "POST",
// 				url : "/user/userLogin",
// 				contentType : "application/json;charset=utf-8",
// 				data : JSON.stringify({
// 					"userPassword":$("[name=userPassword]").val(),
// 					"userPhone":$("[name=userPhone]").val()
// 				}),
// 				dataType : "json",
// 				async: false,
// 				success : function(message) {
// 					if (message.error == 1) {
// 						alert('用户账号密码错误')
// 					} else {
// 						window.location.href='${pageContext.request.contextPath}/index'
// 					}
// 				}
// 			});
			
// 		});
	
		
		function showoutc() {
			$(".m-sPopBg,.m-sPopCon").show();
		}
		function closeClause() {
			$(".m-sPopBg,.m-sPopCon").hide();
		}
	</script>
</body>
</html>
