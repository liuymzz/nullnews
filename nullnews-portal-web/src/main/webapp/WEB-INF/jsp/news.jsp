<%@ page pageEncoding="UTF-8"%>
<%@include file="headTemp.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="am-g am-container">
	<div class="am-u-sm-12 am-u-md-12 am-u-lg-8">
		<div class="newstitles">
			<h2>${passage.passageTitle}</h2>
			<a href="/userIndex/${userInfo.userId}"> <img src="${userInfo.userUri}" class="face"> <span>${userInfo.userName}</span>
			</a> 发布时间：
			<fmt:formatDate value="${passage.passageTime}" type="both" />
			阅读：${passage.passageLookCount}
		</div>
		<a href="#"><img src="/Temp-images/ad2.png"
			class="am-img-responsive" width="100%" /></a>

		<div class="contents">${passage.passageContent}</div>
		<p style="text-align: center;">
			<button id="likeBtn" class="am-btn am-btn-warning am-btn-xl">点赞</button>
			<span style="font-size: 14">${passage.passageLikeCount}个人觉得很赞</span>
		</p>
		<center>
			<form class="am-form">
				<div class="am-form-group">
					<textarea id="commentContent" rows="5" id="doc-ta-1"></textarea>
				</div>
				<p>
					<button id="commentForPassage" onclick="comment(this);"
						type="button" class="am-btn am-btn-default">评论</button>
				</p>
			</form>
		</center>
		<br>

		<%@include file="comment.jsp"%>
		<div class="shang">
			<img src="/images/shang.png">
		</div>
		<!--data-ds-short-name="amazeui" 多说的用户名-->
		<div data-am-widget="duoshuo" class="am-duoshuo am-duoshuo-default"
			data-ds-short-name="amazeui">
			<div class="ds-thread"></div>
		</div>
	</div>
	<div class="am-u-sm-0 am-u-md-0 am-u-lg-4">
		<div data-am-widget="titlebar" class="am-titlebar am-titlebar-default">
			<h2 class="am-titlebar-title ">最佳编辑</h2>
		</div>

		<div data-am-widget="list_news"
			class="am-list-news am-list-news-default right-bg">
			<ul class="am-list">
			<c:forEach items="${allLikeCountPassageList}" var="userByAllLikeCount">
			<a href="/userIndex/${userByAllLikeCount.userId}">
				<li
					class="am-g am-list-item-desced am-list-item-thumbed am-list-item-thumb-left"
					style="list-style-type: none;">
					<div class="am-u-sm-4 am-list-thumb">
						<img
							src="${userByAllLikeCount.userUri}" class="face" />
						
					</div>

					<div class=" am-u-sm-8 am-list-main">
						<h3 class="am-list-item-hd">
						${userByAllLikeCount.userName}
						</h3>

						<div class="am-list-item-text">${userByAllLikeCount.userBrief}</div>
					</div>
				</li>
				</a>
				</c:forEach>
				<hr data-am-widget="divider" style=""
					class="am-divider am-divider-default" />
				
			</ul>
		</div>

		<div data-am-widget="titlebar" class="am-titlebar am-titlebar-default">
			<h2 class="am-titlebar-title ">热门用户</h2>
		</div>

		<div data-am-widget="list_news"
			class="am-list-news am-list-news-default right-bg">
			<ul class="am-list">
			<c:forEach items="${followCountList}" var="userByFollowCount">
				<a href="/userIndex/${userByFollowCount.userId}">
				<li
					class="am-g am-list-item-desced am-list-item-thumbed am-list-item-thumb-left"
					style="list-style-type: none;">
					<div class="am-u-sm-4 am-list-thumb">
						<img
							src="${userByFollowCount.userUri}" class="face" />
					</div>

					<div class=" am-u-sm-8 am-list-main">
						<h3 class="am-list-item-hd">
							${userByFollowCount.userName}
						</h3>

						<div class="am-list-item-text">${userByFollowCount.userBrief}</div>
					</div>
				</li>
				</a>
				</c:forEach>
				<hr data-am-widget="divider" style=""
					class="am-divider am-divider-default" />
				
			</ul>
		</div>
		<div data-am-widget="titlebar" class="am-titlebar am-titlebar-default">
			<h2 class="am-titlebar-title ">评测</h2>
		</div>

		<div data-am-widget="list_news"
			class="am-list-news am-list-news-default right-bg">
			<ul class="am-list">
				<li
					class="am-g am-list-item-desced am-list-item-thumbed am-list-item-thumb-left">
					<div class="am-u-sm-4 am-list-thumb">
						<a href="http://www.douban.com/online/11624755/"> <img
							src="/Temp-images/face.jpg" />
						</a>
					</div>

					<div class=" am-u-sm-8 am-list-main">
						<h3 class="am-list-item-hd">
							<a href="http://www.douban.com/online/11624755/">勾三古寺</a>
						</h3>

						<div class="am-list-item-text">代码压缩和最小化。在这里，我们为你收集了9个最好的JavaScript压缩工具将帮</div>
					</div>
				</li>
				<hr data-am-widget="divider" style=""
					class="am-divider am-divider-default" />
				<li
					class="am-g am-list-item-desced am-list-item-thumbed am-list-item-thumb-left">
					<div class="am-u-sm-4 am-list-thumb">
						<a href="http://www.douban.com/online/11624755/"> <img
							src="/Temp-images/face.jpg" />
						</a>
					</div>

					<div class=" am-u-sm-8 am-list-main">
						<h3 class="am-list-item-hd">
							<a href="http://www.douban.com/online/11624755/">勾三古寺</a>
						</h3>

						<div class="am-list-item-text">代码压缩和最小化。在这里，我们为你收集了9个最好的JavaScript压缩工具将帮</div>

					</div>
				</li>
				<hr data-am-widget="divider" style=""
					class="am-divider am-divider-default" />
				<li
					class="am-g am-list-item-desced am-list-item-thumbed am-list-item-thumb-left">
					<div class="am-u-sm-4 am-list-thumb">
						<a href="http://www.douban.com/online/11624755/"> <img
							src="/Temp-images/face.jpg" />
						</a>
					</div>

					<div class=" am-u-sm-8 am-list-main">
						<h3 class="am-list-item-hd">
							<a href="http://www.douban.com/online/11624755/">勾三古寺</a>
						</h3>

						<div class="am-list-item-text">代码压缩和最小化。在这里，我们为你收集了9个最好的JavaScript压缩工具将帮</div>

					</div>
				</li>
			</ul>
		</div>

		<ul
			class="am-gallery am-avg-sm-1
  am-avg-md-1 am-avg-lg-1 am-gallery-default"
			data-am-gallery="{ pureview: true }">
			<li>
				<div class="am-gallery-item">
					<a href="http://s.amazeui.org/media/i/demos/bing-1.jpg" class="">
						<img src="http://s.amazeui.org/media/i/demos/bing-1.jpg"
						alt="远方 有一个地方 那里种有我们的梦想" />
						<h3 class="am-gallery-title">远方 有一个地方 那里种有我们的梦想</h3>
						<div class="am-gallery-desc">
							<div class="am-fr">北京</div>
							<div class="am-fl">2016/11/11</div>
						</div>
					</a>
				</div>
			</li>
			<li>
				<div class="am-gallery-item">
					<a href="http://s.amazeui.org/media/i/demos/bing-2.jpg" class="">
						<img src="http://s.amazeui.org/media/i/demos/bing-2.jpg"
						alt="某天 也许会相遇 相遇在这个好地方" />
						<h3 class="am-gallery-title">某天 也许会相遇 相遇在这个好地方</h3>
						<div class="am-gallery-desc">
							<div class="am-fr">北京</div>
							<div class="am-fl">2016/11/11</div>
						</div>
					</a>
				</div>
			</li>
			<li>
				<div class="am-gallery-item">
					<a href="http://s.amazeui.org/media/i/demos/bing-2.jpg" class="">
						<img src="http://s.amazeui.org/media/i/demos/bing-2.jpg"
						alt="某天 也许会相遇 相遇在这个好地方" />
						<h3 class="am-gallery-title">某天 也许会相遇 相遇在这个好地方</h3>
						<div class="am-gallery-desc">
							<div class="am-fr">北京</div>
							<div class="am-fl">2016/11/11</div>
						</div>
					</a>
				</div>
			</li>
		</ul>

	</div>
</div>

<div data-am-widget="gotop" class="am-gotop am-gotop-fixed">
	<a href="#top" title="回到顶部"> <span class="am-gotop-title">回到顶部</span>
		<i class="am-gotop-icon am-icon-chevron-up"></i>
	</a>
</div>

<script>
	(function($) {
		$
				.extend({
					tipsBox : function(options) {
						options = $.extend({
							obj : null, //jq对象，要在那个html标签上显示
							str : "+1", //字符串，要显示的内容;也可以传一段html，如: "<b style='font-family:Microsoft YaHei;'>+1</b>"
							startSize : "12px", //动画开始的文字大小
							endSize : "30px", //动画结束的文字大小
							interval : 600, //动画时间间隔
							color : "#cd4450", //文字颜色
							weight : "bold", //文字
							callback : function() {
							} //回调函数
						}, options);
						$("body").append(
								"<span class='num'>" + options.str + "</span>");
						var box = $(".num");
						var left = options.obj.offset().left
								+ options.obj.width() / 2;
						var top = options.obj.offset().top
								- options.obj.height();
						box.css({
							"position" : "absolute",
							"left" : left + "px",
							"top" : top + "px",
							"z-index" : 9999,
							"font-size" : options.startSize,
							"line-height" : options.endSize,
							"color" : options.color,
							"font-weight" : options.weight
						});
						box.animate({
							"font-size" : options.endSize,
							"opacity" : "0",
							"top" : top - parseInt(options.endSize) + "px"
						}, options.interval, function() {
							box.remove();
							options.callback();
						});
					}
				});
	})(jQuery);
</script>

<script>
	/* 评论 */
	function comment(obj) {
		/* 先判断评论框中有没有输入内容 */
		if ($("#commentContent").val().length <= 0) {
			alert('请先输入内容')
			return false;
		}
		var parentId;
		if (obj.id == "commentForPassage") {
			parentId = -1;
		} else {

		}

		$.ajax({
			type : "POST",
			url : "/comment",
			contentType : "application/json;charset=utf-8",
			data : JSON.stringify({
				'userId' : '${passage.userId}',
				'commentParentId' : parentId,
				'commentContent' : $("#commentContent").val(),
				'passageId' : '${passage.passageId}'
			}),
			dataType : "json",
			success : function(message) {
				alert(message.state);
				location.reload(true);
			},
			error : function() {
				alert('网络错误');
			}
		});

	}

	$(function() {
		/* 利用js从cookie获取数据判断当前用户是否已经点赞 */
		if ($.cookie('nullnews_news_isLisk_${passage.passageId}') == 'yes') {
			$('#likeBtn').addClass('am-disabled');
			$('#likeBtn').text('已点赞');
		}

		/* 点赞按钮点击事件 */
		$("#likeBtn")
				.click(
						function() {
							$
									.post(
											"/newslike",
											{
												passageId : '${passage.passageId}'
											},
											function(data, status) {
												if (data.error == 1) {
													alert('网络错误，请稍后再试');
													return false;
												} else {
													$('#likeBtn').addClass(
															'am-disabled');
													$('#likeBtn').text('已点赞');
													$
															.cookie(
																	'nullnews_news_isLisk_${passage.passageId}',
																	'yes'); // 存储点赞信息 
												}
											});
							$.tipsBox({
								obj : $(this),
								str : "+ 1",
								callback : function() {
									//alert(5);
								}
							});
						});
	});
</script>

<%@include file="floorTemp.jsp"%>