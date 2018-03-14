<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>发布文章</title>
<link href="https://cdn.bootcss.com/amazeui/2.7.2/css/amazeui.css"
	rel="stylesheet">
<style type="text/css">
.toolbar {
	border: 1px solid #ccc;
}

.text {
	border: 1px solid #ccc;
	height: 50%;
}
</style>
</head>
<body style="margin: 5%; height: 100%">
	<input type="hidden" id="userId" value="1">
	<p>
		<label for="doc-ipt-file-2">文章标题</label> <input id="title" type="text"
			class="am-form-field am-radius" placeholder="请输入文章标题" required /> <span
			id="titleTips" style="color: red;" hidden="hidden">请填写标题</span>
	</p>

	<div class="am-form-group am-form-file">
		<label for="doc-ipt-file-2">文章封面图</label>
		<div>
			<button id="picButton" class="am-btn am-btn-default am-btn-sm">
				<i class="am-icon-cloud-upload"></i> 选择要上传的封面图片
			</button>
		</div>
		<img id="cover"> <input id="coverPicture" type="file"
			id="doc-ipt-file-2" name="file"
			accept="image/png,image/gif,image/jpeg"> <input
			id="coverPictureURL" type="hidden"> <span
			id="coverPictureTips" style="color: red;" hidden="hidden">请选择封面图片</span>
	</div>

	<div id="editor1" class="toolbox"></div>
	<div id="editor2" class="text"></div>
	<span id="contentTips" style="color: red;" hidden="hidden">文章内容不允许为空</span>
	<button type="button" id="submit"
		class="am-btn am-btn-default am-btn-block" display="float:right">发布</button>



	<!-- 引入jquery -->
	<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.js"></script>
	<!-- js上传文件插件 -->
	<script src="http://119.29.216.209:82/js/ajaxfileupload.js"></script>
	<!-- 富文本编辑器所需js,注意， 只需要引用 JS，无需引用任何 CSS ！！！-->
	<script type="text/javascript"
		src="https://cdn.bootcss.com/wangEditor/3.0.8/wangEditor.js"></script>
	<script type="text/javascript">
		/* 富文本编辑器 */
		var E = window.wangEditor;
		var editor = new E('#editor1', '#editor2');
		editor.customConfig.uploadImgServer = '/publishPassage/uploadPicture'; // 上传图片到服务器
		editor.customConfig.uploadFileName = 'file'; //设置上传文件fileName
		editor.customConfig.uploadImgMaxLength = 1; //文件最大上传数量
		editor.customConfig.menus = [ 'head', // 标题
		'bold', // 粗体
		'italic', // 斜体
		'underline', // 下划线
		'strikeThrough', // 删除线
		'foreColor', // 文字颜色
		'backColor', // 背景颜色
		'link', // 插入链接
		'list', // 列表
		'justify', // 对齐方式
		'quote', // 引用
		'image', // 插入图片
		'table', // 表格
		'video', // 插入视频
		'code', // 插入代码
		'undo', // 撤销
		'redo' // 重复
		];
		editor.create();

		/* 提交所有数据 */
		$("#submit").click(function() {
			if ($("#title").val().length <= 0) {
				$("#titleTips").show();
				return false;
			} else {
				$("#titleTips").hide();
			}
			if ($("#coverPictureURL").val().length <= 0) {
				$("#coverPictureTips").show();
				return false;
			} else {
				$("#coverPictureTips").hide();
			}
			if (editor.txt.text().length <= 0) {
				$("#contentTips").show();
				return false;
			} else {
				$("#contentTips").hide();
			}
			$.ajax({
				type : "POST",
				url : "/publishPassage/publish",
				contentType : "application/json; charset=utf-8",
				data : JSON.stringify(GetJsonData()),
				dataType : "json",
				success : function(message) {
					alert(message.state);
				}
			});
		});

		/* 生成需要提交的json数据 */
		function GetJsonData() {
			var json = {
				"passageContent" : editor.txt.html(),
				"passagePicture" : $("#coverPictureURL").val(),
				"passageTitle" : $("#title").val(),
			};
			return json;
		}

		/* 异步上传封面图片 */
		$("#coverPicture").change(function() {
			$.ajaxFileUpload({
				url : '/publishPassage/uploadPicture', //用于文件上传的服务器端请求地址
				secureuri : false, //是否需要安全协议，一般设置为false
				fileElementId : 'coverPicture', //文件上传域的ID
				dataType : 'json', //返回值类型 一般设置为json
				success : function(data, status) //服务器成功响应处理函数
				{
					$("#coverPictureURL").val(data.data[0]);
					$("#cover").attr("src", data.data[0]);
					$("#picButton").hide();
					$("#coverPicture").hide();
				},
				error : function(data, status, e)//服务器响应失败处理函数
				{
					alert('图片上传失败');
				}
			})
		});

		/* 判断是否登陆，未登录去到登录页 */
		$(function() {
			if ("${LOGIN_YES}" == "" || "${LOGIN_YES}" == null) {
				if (confirm("您还未登陆，不能发表文章，点击确定登陆，取消返回主页")) {
					window.location.href="/user/login";
				} else {
					window.location.href="/index";
				}
			}
		});
	</script>

</body>
</html>