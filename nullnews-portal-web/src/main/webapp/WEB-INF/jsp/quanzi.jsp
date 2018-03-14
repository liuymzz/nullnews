<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="headTemp.jsp"%>
<div class="am-container" style="margin-top: 10px">
	<img src="Temp-images/tad1.png" class="am-img-responsive" alt="" />
</div>
<div class="star am-container mcenter">
	<span><img src="images/star.png">最新文章</span>
</div>
<div class="am-container events">
	<ul data-am-widget="gallery"
		class="am-gallery am-avg-sm-1 am-avg-md-2 am-avg-lg-2 am-gallery-bordered"
		data-am-gallery="{  }">
		<c:forEach items="${pageInfo.list}" var="passage">
			<li>
				<div class="am-gallery-item">
					<a href="/news/${passage.passageId}" class=""> <img
						src="${passage.passagePicture}" alt="封面图" />
						<div class="efe">${passage.passageTitle}</div>
						<div class="am-gallery-desc fee">
							<div class="am-fr">
								<fmt:formatDate value="${passage.passageTime}" type="both" />
							</div>
						</div>
					</a>
				</div>
			</li>
		</c:forEach>
	</ul>
	<div class="am-fr"></div>
	<button type="button" class="am-btn am-btn-default am-btn-block"
		style="margin: 20px 0">更多活动</button>
</div>
<div class="star am-container mcenter">
	<span><img src="images/star.png">往期活动</span>
</div>
<div class="am-container">
	<ul data-am-widget="gallery"
		class="am-gallery am-avg-sm-2 am-avg-md-3 am-avg-lg-3 am-gallery-default"
		data-am-gallery="{ pureview: true }">
		<li>
			<div class="am-gallery-item">
				<a href="http://s.amazeui.org/media/i/demos/bing-1.jpg" class="">
					<img src="http://s.amazeui.org/media/i/demos/bing-1.jpg"
					alt="远方 有一个地方 那里种有我们的梦想" />
					<div class="events-btn">
						<button type="button" class="am-btn am-btn-primary">活动回顾</button>
					</div>
				</a>
			</div>
		</li>
		<li>
			<div class="am-gallery-item">
				<a href="http://s.amazeui.org/media/i/demos/bing-2.jpg" class="">
					<img src="http://s.amazeui.org/media/i/demos/bing-2.jpg"
					alt="某天 也许会相遇 相遇在这个好地方" />
					<div class="events-btn">
						<button type="button" class="am-btn am-btn-default">活动回顾</button>
					</div>
				</a>
			</div>
		</li>
		<li>
			<div class="am-gallery-item">
				<a href="http://s.amazeui.org/media/i/demos/bing-3.jpg" class="">
					<img src="http://s.amazeui.org/media/i/demos/bing-3.jpg"
					alt="不要太担心 只因为我相信" />
					<div class="events-btn">
						<button type="button" class="am-btn am-btn-default">活动回顾</button>
					</div>
				</a>
			</div>
		</li>
		<li>
			<div class="am-gallery-item">
				<a href="http://s.amazeui.org/media/i/demos/bing-4.jpg" class="">
					<img src="http://s.amazeui.org/media/i/demos/bing-4.jpg"
					alt="终会走过这条遥远的道路" />
					<div class="events-btn">
						<button type="button" class="am-btn am-btn-default">活动回顾</button>
					</div>
				</a>
			</div>
		</li>
		<li>
			<div class="am-gallery-item">
				<a href="http://s.amazeui.org/media/i/demos/bing-3.jpg" class="">
					<img src="http://s.amazeui.org/media/i/demos/bing-3.jpg"
					alt="不要太担心 只因为我相信" />
					<div class="events-btn">
						<button type="button" class="am-btn am-btn-default">活动回顾</button>
					</div>
				</a>
			</div>
		</li>
		<li>
			<div class="am-gallery-item">
				<a href="http://s.amazeui.org/media/i/demos/bing-4.jpg" class="">
					<img src="http://s.amazeui.org/media/i/demos/bing-4.jpg"
					alt="终会走过这条遥远的道路" />
					<div class="events-btn">
						<button type="button" class="am-btn am-btn-default">活动回顾</button>
					</div>
				</a>
			</div>
		</li>
	</ul>
	<div class="am-fr"></div>
	<button type="button" class="am-btn am-btn-default am-btn-block"
		style="margin: 20px 0">更多活动</button>
</div>
<div class="star am-container mcenter">
	<span><img src="images/star.png">媒体报道</span>
</div>
<div class="am-container">
	<ul data-am-widget="gallery"
		class="am-gallery am-avg-sm-2 am-avg-md-4 am-avg-lg-6 am-gallery-bordered"
		data-am-gallery="{  }">
		<li>
			<div class="am-gallery-item">
				<a href="http://s.amazeui.org/media/i/demos/bing-1.jpg" class="">
					<img src="http://s.amazeui.org/media/i/demos/bing-1.jpg"
					alt="远方 有一个地方 那里种有我们的梦想" />
					<h3 class="am-gallery-title">远方 有一个地方 那里种有我们的梦想</h3>
					<div class="am-gallery-desc">2375-09-26</div>
				</a>
			</div>
		</li>
		<li>
			<div class="am-gallery-item">
				<a href="http://s.amazeui.org/media/i/demos/bing-2.jpg" class="">
					<img src="http://s.amazeui.org/media/i/demos/bing-2.jpg"
					alt="某天 也许会相遇 相遇在这个好地方" />
					<h3 class="am-gallery-title">某天 也许会相遇 相遇在这个好地方</h3>
					<div class="am-gallery-desc">2375-09-26</div>
				</a>
			</div>
		</li>
		<li>
			<div class="am-gallery-item">
				<a href="http://s.amazeui.org/media/i/demos/bing-3.jpg" class="">
					<img src="http://s.amazeui.org/media/i/demos/bing-3.jpg"
					alt="不要太担心 只因为我相信" />
					<h3 class="am-gallery-title">不要太担心 只因为我相信</h3>
					<div class="am-gallery-desc">2375-09-26</div>
				</a>
			</div>
		</li>
		<li>
			<div class="am-gallery-item">
				<a href="http://s.amazeui.org/media/i/demos/bing-4.jpg" class="">
					<img src="http://s.amazeui.org/media/i/demos/bing-4.jpg"
					alt="终会走过这条遥远的道路" />
					<h3 class="am-gallery-title">终会走过这条遥远的道路</h3>
					<div class="am-gallery-desc">2375-09-26</div>
				</a>
			</div>
		</li>
		<li>
			<div class="am-gallery-item">
				<a href="http://s.amazeui.org/media/i/demos/bing-1.jpg" class="">
					<img src="http://s.amazeui.org/media/i/demos/bing-1.jpg"
					alt="远方 有一个地方 那里种有我们的梦想" />
					<h3 class="am-gallery-title">远方 有一个地方 那里种有我们的梦想</h3>
					<div class="am-gallery-desc">2375-09-26</div>
				</a>
			</div>
		</li>
		<li>
			<div class="am-gallery-item">
				<a href="http://s.amazeui.org/media/i/demos/bing-2.jpg" class="">
					<img src="http://s.amazeui.org/media/i/demos/bing-2.jpg"
					alt="某天 也许会相遇 相遇在这个好地方" />
					<h3 class="am-gallery-title">某天 也许会相遇 相遇在这个好地方</h3>
					<div class="am-gallery-desc">2375-09-26</div>
				</a>
			</div>
		</li>
		<li>
			<div class="am-gallery-item">
				<a href="http://s.amazeui.org/media/i/demos/bing-3.jpg" class="">
					<img src="http://s.amazeui.org/media/i/demos/bing-3.jpg"
					alt="不要太担心 只因为我相信" />
					<h3 class="am-gallery-title">不要太担心 只因为我相信</h3>
					<div class="am-gallery-desc">2375-09-26</div>
				</a>
			</div>
		</li>
		<li>
			<div class="am-gallery-item">
				<a href="http://s.amazeui.org/media/i/demos/bing-4.jpg" class="">
					<img src="http://s.amazeui.org/media/i/demos/bing-4.jpg"
					alt="终会走过这条遥远的道路" />
					<h3 class="am-gallery-title">终会走过这条遥远的道路</h3>
					<div class="am-gallery-desc">2375-09-26</div>
				</a>
			</div>
		</li>
		<li>
			<div class="am-gallery-item">
				<a href="http://s.amazeui.org/media/i/demos/bing-3.jpg" class="">
					<img src="http://s.amazeui.org/media/i/demos/bing-3.jpg"
					alt="不要太担心 只因为我相信" />
					<h3 class="am-gallery-title">不要太担心 只因为我相信</h3>
					<div class="am-gallery-desc">2375-09-26</div>
				</a>
			</div>
		</li>
		<li>
			<div class="am-gallery-item">
				<a href="http://s.amazeui.org/media/i/demos/bing-4.jpg" class="">
					<img src="http://s.amazeui.org/media/i/demos/bing-4.jpg"
					alt="终会走过这条遥远的道路" />
					<h3 class="am-gallery-title">终会走过这条遥远的道路</h3>
					<div class="am-gallery-desc">2375-09-26</div>
				</a>
			</div>
		</li>
		<li>
			<div class="am-gallery-item">
				<a href="http://s.amazeui.org/media/i/demos/bing-3.jpg" class="">
					<img src="http://s.amazeui.org/media/i/demos/bing-3.jpg"
					alt="不要太担心 只因为我相信" />
					<h3 class="am-gallery-title">不要太担心 只因为我相信</h3>
					<div class="am-gallery-desc">2375-09-26</div>
				</a>
			</div>
		</li>
		<li>
			<div class="am-gallery-item">
				<a href="http://s.amazeui.org/media/i/demos/bing-4.jpg" class="">
					<img src="http://s.amazeui.org/media/i/demos/bing-4.jpg"
					alt="终会走过这条遥远的道路" />
					<h3 class="am-gallery-title">终会走过这条遥远的道路</h3>
					<div class="am-gallery-desc">2375-09-26</div>
				</a>
			</div>
		</li>
	</ul>

</div>


<div data-am-widget="gotop" class="am-gotop am-gotop-fixed">
	<a href="#top" title="回到顶部"> <span class="am-gotop-title">回到顶部</span>
		<i class="am-gotop-icon am-icon-chevron-up"></i>
	</a>
</div>

<%@include file="floorTemp.jsp"%>