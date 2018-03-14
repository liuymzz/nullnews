<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title></title>
<meta charset="utf-8">

</head>
<body>
	<div id="list">
		<c:forEach items="${commentsAndUsers}" var="userAndComment">
			<div class="box clearfix">
				<a class="close" href="javascript:;">×</a> <img class="head"
					src="${userAndComment.userInfo.userUri}" alt="" />
				<div class="content">
					<div class="main">
						<p class="txt">
							<span class="user">${userAndComment.userInfo.userName}：</span>${userAndComment.userComment.commentContent}
						</p>
					</div>
					<div class="info clearfix">
						<span class="time"><fmt:formatDate
								value="${userAndComment.userComment.commentTime}" type="both" /></span>
						<input name="commentId"
							value="${userAndComment.userComment.commentId}" hidden> <input
							name="commentLike"
							value="${userAndComment.userComment.commentLike}" hidden>
						<a class="praise" href="javascript:;" onclick="likeComment(this)">赞</a>
					</div>
					<div class="praises-total" total="4" style="display: block;">${userAndComment.userComment.commentLike}个人觉得很赞</div>
					<!-- 				<div class="comment-list"> -->
					<!-- 					<div class="comment-box clearfix" user="self"> -->
					<!-- 						<img class="myhead" src="/images/my.jpg" alt="" /> -->
					<!-- 						<div class="comment-content"> -->
					<!-- 							<p class="comment-text"> -->
					<!-- 								<span class="user">我：</span>写的太好了。 -->
					<!-- 							</p> -->
					<!-- 							<p class="comment-time"> -->
					<!-- 								2014-02-19 14:36 <a href="javascript:;" class="comment-praise" -->
					<!-- 									total="1" my="0" style="display: inline-block">1 赞</a> <a -->
					<!-- 									href="javascript:;" class="comment-operate">删除</a> -->
					<!-- 							</p> -->
					<!-- 						</div> -->
					<!-- 					</div> -->
					<!-- 				</div> -->
					<!-- 				<div class="text-box"> -->
					<!-- 				<textarea class="comment" autocomplete="off">评论…</textarea>-->
					<!-- 					<button class="btn ">回 复</button> -->
					<!-- 					<span class="word"><span class="length">0</span>/140</span> -->
					<!-- 				</div> -->
				</div>
			</div>
		</c:forEach>

	</div>

	<script type="text/javascript">
		function likeComment(obj) {
			var $obj = $(obj);
			$.ajax({
				type : "POST",
				url : "/likeComment",
				contentType : "application/json;charset=utf-8",
				data : JSON.stringify({
					'commentId' : $obj.siblings("[name='commentId']").val(),
					'commentLike' : $obj.siblings("[name='commentLike']").val()
				}),
				dataType: "json",
				success : function(message) {
					if (message.error == 0) {
						obj.innerHTML = '已赞';
					}
				},
				error:function(){
					alert('网络错误');
				}

			});
			
		}
	</script>

</body>
</html>