<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>注册</title>
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/gloab.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/index.css"
	rel="stylesheet">
<link href="https://cdn.bootcss.com/amazeui/2.7.2/css/amazeui.css"
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
								class="f-r5"></em><i>1</i></span> <span class="line_bg lbg-r"></span>
							<p class="lbg-txt">填写账户信息</p></li>
						<li class="col-xs-4"><span class="num"><em
								class="f-r5"></em><i>2</i></span> <span class="line_bg lbg-l"></span> <span
							class="line_bg lbg-r"></span>
							<p class="lbg-txt">验证账户信息</p></li>
						<li class="col-xs-4"><span class="num"><em
								class="f-r5"></em><i>3</i></span> <span class="line_bg lbg-l"></span>
							<p class="lbg-txt">注册成功</p></li>
					</ul>
				</div>
				<div class="reg-box" id="verifyCheck" style="margin-top: 20px;">
					<div class="part1">
						<div class="item col-xs-12">
							<span class="intelligent-label f-fl"><b class="ftx04">*</b>用户名：</span>
							<div class="f-fl item-ifo">
								<input type="text" maxlength="20" class="txt03 f-r3 required"
									tabindex="1" data-valid="isNonEmpty||between:3-20||isUname"
									data-error="用户名不能为空||用户名长度3-20位||只能输入中文、字母、数字、下划线，且以中文或字母开头"
									id="adminNo" name="userName" /> <span
									class="ie8 icon-close close hide"></span> <label
									class="icon-sucessfill blank hide"></label> <label
									class="focus"><span>3-20位，中文、字母、数字、下划线的组合，以中文或字母开头</span></label>
								<label class="focus valid"></label>
							</div>
						</div>
						<div class="item col-xs-12">
							<span class="intelligent-label f-fl"><b class="ftx04">*</b>手机号：</span>
							<div class="f-fl item-ifo">
								<input type="text" class="txt03 f-r3 required" keycodes="tel"
									tabindex="2" data-valid="isNonEmpty||isPhone"
									data-error="手机号码不能为空||手机号码格式不正确" maxlength="11" id="phone"
									name="userPhone" onblur="onblurCheckPhoneNum()" /> <span
									class="ie8 icon-close close hide"></span> <label
									class="icon-sucessfill blank hide"></label> <label
									class="focus">请填写11位有效的手机号码</label> <label class="focus valid"></label>
							</div>
						</div>
						<div class="item col-xs-12">
							<span class="intelligent-label f-fl"><b class="ftx04">*</b>短信验证：</span>
							<div class="f-fl item-ifo">
								<input type="text" maxlength="6"
									class="txt03 f-r3 f-fl required" tabindex="4"
									style="width: 167px" id="randCode" data-valid="isNonEmpty"
									data-error="验证码不能为空" name="userSecureCode" />
								<button type="button" class="am-btn am-btn-warning"
									id="getSecurityCodeBtn" onclick="getSecurityCode()">获取验证码</button>
								<span class="ie8 icon-close close hide"></span> <label
									class="icon-sucessfill blank hide" style="left: 380px"></label>
								<label class="focus valid" style="left: 370px"></label>
							</div>
						</div>
						<div class="item col-xs-12">
							<span class="intelligent-label f-fl"><b class="ftx04">*</b>密码：</span>
							<div class="f-fl item-ifo">
								<input type="password" id="password" maxlength="20"
									name="userPassword" class="txt03 f-r3 required" tabindex="3"
									style="ime-mode: disabled;" onpaste="return  false"
									autocomplete="off"
									data-valid="isNonEmpty||between:6-20||level:2"
									data-error="密码不能为空||密码长度6-20位||该密码太简单，有被盗风险，建议字母+数字的组合" /> <span
									class="ie8 icon-close close hide" style="right: 55px"></span> <span
									class="showpwd" data-eye="password"></span> <label
									class="icon-sucessfill blank hide"></label> <label
									class="focus">6-20位英文（区分大小写）、数字、字符的组合</label> <label
									class="focus valid"></label> <span class="clearfix"></span> <label
									class="strength"> <span class="f-fl f-size12">安全程度：</span>
									<b><i>弱</i><i>中</i><i>强</i></b>
								</label>
							</div>
						</div>
						<div class="item col-xs-12">
							<span class="intelligent-label f-fl"><b class="ftx04">*</b>确认密码：</span>
							<div class="f-fl item-ifo">
								<input type="password" maxlength="20"
									class="txt03 f-r3 required" tabindex="4"
									style="ime-mode: disabled;" onpaste="return  false"
									autocomplete="off"
									data-valid="isNonEmpty||between:6-16||isRepeat:password"
									data-error="密码不能为空||密码长度6-16位||两次密码输入不一致" id="rePassword" /> <span
									class="ie8 icon-close close hide" style="right: 55px"></span> <span
									class="showpwd" data-eye="rePassword"></span> <label
									class="icon-sucessfill blank hide"></label> <label
									class="focus">请再输入一遍上面的密码</label> <label class="focus valid"></label>
							</div>
						</div>
						<div class="item col-xs-12">
							<span class="intelligent-label f-fl"><b class="ftx04">*</b>验证码：</span>
							<div class="f-fl item-ifo">
								<input id="authCodeId" name="authCode" type="text" maxlength="4"
									name="authCode" class="txt03 f-r3 f-fl required" tabindex="4"
									style="width: 167px" id="randCode" data-valid="isNonEmpty"
									data-error="验证码不能为空" /> <span
									class="ie8 icon-close close hide"></span> <label
									class="f-size12 c-999 f-fl f-pl10"> <img id="code"
									src="/user/registCode" />
								</label> <label class="icon-sucessfill blank hide" style="left: 380px"></label>
								<label class="focusa">看不清？<a
									href="javascript:reloadCode();" class="c-blue">换一张</a></label> <label
									class="focus valid" style="left: 370px"></label>
							</div>
						</div>
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
								<a href="javascript:;" class="btn btn-blue f-r3" id="btn_part1">下一步</a>
							</div>
						</div>
					</div>
					<div class="part2" style="display: none">
						<div class="alert alert-info" style="width: 700px">短信已发送至您手机，请输入短信中的验证码，确保您的手机号真实有效。</div>
						<div class="item col-xs-12 f-mb10" style="height: auto">
							<span class="intelligent-label f-fl">手机号：</span>
							<div class="f-fl item-ifo c-blue">15824450934</div>
						</div>
						<div class="item col-xs-12">
							<span class="intelligent-label f-fl"><b class="ftx04">*</b>验证码：</span>
							<div class="f-fl item-ifo">
								<input type="text" maxlength="6" id="verifyNo"
									class="txt03 f-r3 f-fl required" tabindex="4"
									style="width: 167px" data-valid="isNonEmpty||isInt"
									data-error="验证码不能为空||请输入6位数字验证码" /> <span
									class="btn btn-gray f-r3 f-ml5 f-size13" id="time_box" disabled
									style="width: 97px; display: none;">发送验证码</span> <span
									class="btn btn-gray f-r3 f-ml5 f-size13" id="verifyYz"
									style="width: 97px;">发送验证码</span> <span
									class="ie8 icon-close close hide" style="right: 130px"></span>
								<label class="icon-sucessfill blank hide"></label> <label
									class="focus"><span>请查收手机短信，并填写短信中的验证码（此验证码3分钟内有效）</span></label>
								<label class="focus valid"></label>
							</div>
						</div>
						<div class="item col-xs-12">
							<span class="intelligent-label f-fl">&nbsp;</span>
							<div class="f-fl item-ifo">
								<a href="javascript:;" class="btn btn-blue f-r3" id="btn_part2">注册</a>
							</div>
						</div>
					</div>
					<div class="part3" style="display: none">
						<div class="item col-xs-12">
							<span class="intelligent-label f-fl"><b class="ftx04">*</b>真实姓名：</span>
							<div class="f-fl item-ifo">
								<input type="text" maxlength="10" class="txt03 f-r3 required"
									tabindex="1" data-valid="isNonEmpty||between:2-10||isZh"
									data-error="真实姓名不能为空||真实姓名长度2-10位||只能输入中文" id="adminNo" /> <span
									class="ie8 icon-close close hide"></span> <label
									class="icon-sucessfill blank hide"></label> <label
									class="focus">2-10位，中文真实姓名</label> <label class="focus valid"></label>
							</div>
						</div>
						<div class="item col-xs-12">
							<span class="intelligent-label f-fl"><b class="ftx04">*</b>身份证号：</span>
							<div class="f-fl item-ifo">
								<input type="text" class="txt03 f-r3 required" tabindex="2"
									data-valid="isNonEmpty||isCard"
									data-error="身份证号不能为空||身份证号码格式不正确" maxlength="18" id="phone" />
								<span class="ie8 icon-close close hide"></span> <label
									class="icon-sucessfill blank hide"></label> <label
									class="focus">请填写18位有效的手机号码</label> <label class="focus valid"></label>
							</div>
						</div>
						<div class="item col-xs-12">
							<span class="intelligent-label f-fl">&nbsp;</span>
							<div class="f-fl item-ifo">
								<a href="javascript:;" class="btn btn-blue f-r3" id="btn_part3">下一步</a>
							</div>
						</div>
					</div>
					<div class="part4 text-center" style="display: none">
						<h3>恭喜cz82465，您已注册成功，现在开始您的投资之旅吧！</h3>
						<p class="c-666 f-mt30 f-mb50">
							页面将在 <strong id="times" class="f-size18">10</strong> 秒钟后，跳转到 <a
								href="http://www.17sucai.com/" class="c-blue">用户中心</a>
						</p>
					</div>
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
	<script type="text/javascript">
		/* 查询输入的手机号码是否已经被注册  */
		function checkPhoneNum(obj) {
			var p;
			$.ajax({
				type : "POST",
				async : false,
				url : "/user/checkPhoneNum",
				data : {
					"phoneNum" : obj.val()
				},
				dataType : "json",
				success : function(message) {
					if (message.error == 1) {
						alert("手机号已经被注册");
						p = false;
					} else {
						p = true;
					}
				}
			});
			return p;
		}

		/* 发送手机短信验证码 */
		function getSecurityCode() {
			if ($("#phone").val().length != 11) {
				alert("请输入正确的手机号码");
				return false;
			} else {
				$.ajax({
					type : "POST",
					url : "/user/sendSecurityCode",
					contentType : "application/json; charset=utf-8",
					data : JSON.stringify({
						"userPhone" : $("#phone").val()
					}),
					dataType : "json",
					success : function(message) {
						if (message.error == 1) {
							alert("验证码发送失败，请检查你的手机号码或稍后再试");
						} else {
							$("#getSecurityCodeBtn").addClass("am-disabled");
							$("#getSecurityCodeBtn").text("验证码已发送");
						}
					}
				});
			}
		}
	</script>


	<script>
		function onblurCheckPhoneNum() {
			/* onblur状态检查手机号码 */
			var a = checkPhoneNum($("[name=userPhone]"));
			if (a == false) {
				$("#getSecurityCodeBtn").addClass("am-disabled");
			}else{
				$("#getSecurityCodeBtn").attr("class","am-btn am-btn-warning");
			}
			
		}

		function reloadCode() {
			$("#code").attr("src", "/user/registCode?r=" + Math.random());
		};

		$(function() {
			//第一页的确定按钮
			$("#btn_part1")
					.click(
							function() {
								/* 校验文本框输入内容是否正确 */
								if (!verifyCheck._click())
									return;
								var p = true;

								/* 校验用户输入短信验证码是否正确 */
								$
										.ajax({
											type : "POST",
											url : "/user/checkSecurityCode",
											contentType : "application/json; charset=utf-8",
											data : JSON
													.stringify({
														"userPhone" : $(
																"#phone").val(),
														"userSecureCode" : $(
																"[name=userSecureCode]")
																.val()
													}),
											async : false,
											dataType : "json",
											success : function(message) {
												if (message.error == 1) {
													alert("短信验证码错误");
													p = false;
												}
											}
										});

								/* 校验普通验证码 */
								$.ajax({
									type : "POST",
									url : "/user/checkAuthCode",
									data : {
										"authCode" : $("#authCodeId").val()
									},
									async : false,
									dataType : "json",
									success : function(message) {
										if (message.error == 1) {
											alert("验证码错误");
											p = false;
										}
									}
								});

								/* 检查手机号码 */
								var a = checkPhoneNum($("[name=userPhone]"));
								if (a == false) {
									return false;
								}

								/* 之前的判断是否全部通过 */
								if (p == false) {
									return false;
								}

								/* 提交注册信息 */
								$
										.ajax({
											type : "POST",
											url : "/user/registerUser",
											contentType : "application/json; charset=utf-8",
											data : JSON.stringify({
												"userName" : $(
														"[name=userName]")
														.val(),
												"userPassword" : $(
														"[name=userPassword]")
														.val(),
												"userPhone" : $(
														"[name=userPhone]")
														.val()
											}),
											dataType : "json",
											success : function(message) {
												if (message.error == 1) {
													alert('注册失败，请稍后再试');
												} else {
													window.location.href = '${pageContext.request.contextPath}/index'
												}
											}
										});

							});
		});

		function showoutc() {
			$(".m-sPopBg,.m-sPopCon").show();
		}

		function closeClause() {
			$(".m-sPopBg,.m-sPopCon").hide();
		}
	</script>
	<div style="text-align: center;"></div>
</body>
</html>
