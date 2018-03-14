<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@include file="headTemp.jsp"%>
<!--banner-->
<div class="banner">
	<div class="am-g am-container">
		<div class="am-u-sm-12 am-u-md-12 am-u-lg-8">
			<div data-am-widget="slider" class="am-slider am-slider-c1"
				data-am-slider='{"directionNav":false}'>
				<ul class="am-slides">
					<c:forEach items="${ad1List}" var="ad1">
						<li><a href="${ad1.adUrl}"><img src="${ad1.adPicture}"></a>
							<div class="am-slider-desc">${ad1.adTitle}</div></li>
					</c:forEach>
				</ul>
			</div>
		</div>
		<div class="am-u-sm-0 am-u-md-0 am-u-lg-4 padding-none">
			<div class="star am-container">
				<span><img src="/images/star.png">最新资讯</span>
			</div>
			<ul
				class="padding-none am-gallery am-avg-sm-2 am-avg-md-4 am-avg-lg-2 am-gallery-overlay"
				data-am-gallery="{ pureview: true }">
				<c:forEach items="${newPassageList}" var="passage">
					<li>
						<div class="am-gallery-item">
							<a href="/news/${passage.passageId}"><img
								src="${passage.passagePicture}"
								style="width: 100%; height: 25%;">
								<h3 class="am-gallery-title">${passage.passageTitle}</h3>
								<div class="am-gallery-desc">2375-09-26</div> </a>
						</div>
					</li>
				</c:forEach>
			</ul>
		</div>
	</div>
</div>

<!--banner2-->
<div class="am-container">
	<ul
		class="padding-none banner2 am-gallery am-avg-sm-2 am-avg-md-4 am-avg-lg-4 am-gallery-overlay"
		data-am-gallery="{ pureview: true }">
		<c:choose>
			<c:when test="${lookCountPassageList}!=null">
				<c:forEach items="${lookCountPassageList}" var="lookCountPassage">
					<li>
						<div class="am-gallery-item">
							<a href="/news/${lookCountPassage.passageId}"> <img
								src="${lookCountPassage.passagePicture}" style="height: 35%;" />
								<h3 class="am-gallery-title">${lookCountPassage.passageTitle}</h3>
								<div class="am-gallery-desc">2375-09-26</div>
							</a>
						</div>
					</li>
				</c:forEach>
			</c:when>
			<c:otherwise>
				<c:forEach items="${lookAllCountPassageList}"
					var="lookAllCountPassage">
					<li>
						<div class="am-gallery-item">
							<a href="/news/${lookAllCountPassage.passageId}"> <img
								src="${lookAllCountPassage.passagePicture}" style="height: 35%;">
								<h3 class="am-gallery-title">${lookAllCountPassage.passageTitle}</h3>
								<div class="am-gallery-desc">2375-09-26</div>
							</a>
						</div>
					</li>
				</c:forEach>
			</c:otherwise>
		</c:choose>
	</ul>
</div>
<!--news-->
<div class="am-g am-container newatype">
	<div class="am-u-sm-12 am-u-md-12 am-u-lg-8 oh">
		<div data-am-widget="titlebar" class="am-titlebar am-titlebar-default"
			style="border-bottom: 0px; margin-bottom: -10px">
			<h2 class="am-titlebar-title ">热门资讯</h2>
			<nav class="am-titlebar-nav">
				<a href="#more">more &raquo;</a>
			</nav>
		</div>

		<div data-am-widget="list_news"
			class="am-list-news am-list-news-default news">
			<div class="am-list-news-bd">
				<ul class="am-list">
					<c:choose>
						<c:when test="${likeCountPassageList}!=null">
							<c:forEach items="${likeCountPassageList}"
								var="PassageByLikeCount">
								<li
									class="am-g am-list-item-desced am-list-item-thumbed am-list-item-thumb-left"
									data-am-scrollspy="{animation:'fade'}">
									<div class="am-u-sm-5 am-list-thumb">
										<a href="/news/${PassageByLikeCount.passageId}"> <img
											src="${PassageByLikeCount.passagePicture}"
											style="height: 25%" />
										</a>

									</div>

									<div class=" am-u-sm-7 am-list-main">
										<h3 class="am-list-item-hd">
											<a href="/news/${PassageByLikeCount.passageId}">${PassageByLikeCount.passageTitle}</a>
										</h3>
										<div class="am-list-item-text">"${PassageByLikeCount.passageContent}
										</div>
									</div>

								</li>
							</c:forEach>
						</c:when>
						<c:otherwise>
							<c:forEach items="${likeAllCountPassageList}"
								var="PassageByLikeCountAll">
								<li
									class="am-g am-list-item-desced am-list-item-thumbed am-list-item-thumb-left"
									data-am-scrollspy="{animation:'fade'}">
									<div class="am-u-sm-5 am-list-thumb">
										<a href="/news/${PassageByLikeCountAll.passageId}"> <img
											src="${PassageByLikeCountAll.passagePicture}"
											style="height: 25%" />
										</a>

									</div>

									<div class=" am-u-sm-7 am-list-main">
										<h3 class="am-list-item-hd">
											<a href="/news/${PassageByLikeCountAll.passageId}">${PassageByLikeCountAll.passageTitle}</a>
										</h3>
										<div class="am-list-item-text">${PassageByLikeCountAll.passageContent}</div>
									</div>

								</li>
							</c:forEach>
						</c:otherwise>
					</c:choose>
				</ul>
			</div>
			<a href="#"><img src="/Temp-images/ad2.png"
				class="am-img-responsive" width="100%" /></a>


		</div>
	</div>
	<div class="am-u-sm-12 am-u-md-12 am-u-lg-4">
		<div data-am-widget="titlebar" class="am-titlebar am-titlebar-default">
			<h2 class="am-titlebar-title ">最佳编辑</h2>
		</div>
		<div data-am-widget="list_news"
			class="am-list-news am-list-news-default right-bg"
			data-am-scrollspy="{animation:'fade'}">
			<ul class="am-list">

				<c:forEach items="${allLikeCountPassageList}"
					var="userByAllLikeCount">
					<a href="/userIndex/${userByAllLikeCount.userId}">
						<li
						class="am-g am-list-item-desced am-list-item-thumbed am-list-item-thumb-left"
						style="list-style-type: none;">
							<div class="am-u-sm-4 am-list-thumb">
								<img src="${userByAllLikeCount.userUri}" class="face" />

							</div>

							<div class=" am-u-sm-8 am-list-main">
								<h3 class="am-list-item-hd">${userByAllLikeCount.userName}
								</h3>

								<div class="am-list-item-text">${userByAllLikeCount.userBrief}</div>
							</div>
					</li>
					</a>
					<hr data-am-widget="divider" style=""
						class="am-divider am-divider-default" />
				</c:forEach>
			</ul>
		</div>

		<div data-am-widget="titlebar" class="am-titlebar am-titlebar-default">
			<h2 class="am-titlebar-title ">热门用户</h2>
		</div>

		<div data-am-widget="list_news"
			class="am-list-news am-list-news-default right-bg"
			data-am-scrollspy="{animation:'fade'}">
			<ul class="am-list">
				<c:forEach items="${followCountList}" var="userByFollowCount">
					<a href="/userIndex/${userByFollowCount.userId}">
						<li
						class="am-g am-list-item-desced am-list-item-thumbed am-list-item-thumb-left"
						style="list-style-type: none;">
							<div class="am-u-sm-4 am-list-thumb">
								<img src="${userByFollowCount.userUri}" class="face" />
							</div>

							<div class=" am-u-sm-8 am-list-main">
								<h3 class="am-list-item-hd">${userByFollowCount.userName}</h3>

								<div class="am-list-item-text">${userByFollowCount.userBrief}</div>
							</div>
					</li>
					</a>
					<hr data-am-widget="divider" style=""
						class="am-divider am-divider-default" />
				</c:forEach>
			</ul>
		</div>
	</div>
</div>

<div data-am-widget="gotop" class="am-gotop am-gotop-fixed">
	<a href="#top" title="回到顶部"> <span class="am-gotop-title">回到顶部</span>
		<i class="am-gotop-icon am-icon-chevron-up"></i>
	</a>
</div>
<%@include file="floorTemp.jsp"%>