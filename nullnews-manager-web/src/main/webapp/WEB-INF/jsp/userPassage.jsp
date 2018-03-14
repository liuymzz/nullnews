<%@page pageEncoding="UTF-8"%>
<%@include file="headTemp.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<div class="tpl-page-container tpl-page-header-fixed">
	<%@include file="leftTemp.jsp"%>






	<div class="tpl-content-wrapper">
		<div class="tpl-content-page-title">NULL科技用户文章列表</div>
		<ol class="am-breadcrumb">
			<li><a href="#" class="am-icon-home">首页</a></li>
			<li><a href="#">文章管理</a></li>
			<li class="am-active">用户文章列表</li>
		</ol>
		<div class="tpl-portlet-components">
			<div class="portlet-title">
				<div class="caption font-green bold">
					<span class="am-icon-code"></span>用户文章列表
				</div>
				<div class="tpl-portlet-input tpl-fz-ml">
					<div class="portlet-input input-small input-inline">
						<div class="input-icon right">
							<i class="am-icon-search"></i> <input type="text"
								class="form-control form-control-solid" placeholder="搜索...">
						</div>
					</div>
				</div>


			</div>
			<div class="tpl-block">
				<div class="am-g">
					<div class="am-u-sm-12 am-u-md-6">
						<div class="am-btn-toolbar"></div>
					</div>


				</div>
				<div class="am-g">
					<div class="tpl-table-images">
						<c:forEach items="${pageInfo.list}" var="passageAnduser">


							<div class="am-u-sm-12 am-u-md-6 am-u-lg-4">
								<div class="tpl-table-images-content">

									<div class="tpl-table-images-content-i-time">
										发布时间：
										<fmt:formatDate value="${passageAnduser.passage.passageTime}"
											pattern="yyyy-MM-dd HH:mm:ss" />
									</div>
									<div class="tpl-i-title">${passageAnduser.passage.passageTitle}</div>
									<a href="javascript:;" class="tpl-table-images-content-i">
										<div class="tpl-table-images-content-i-info">
											<span class="ico"> <img
												src="${passageAnduser.userInfo.userUri}" alt="">${passageAnduser.userInfo.userName}
											</span>

										</div> <span class="tpl-table-images-content-i-shadow"></span> <img
										src="${passageAnduser.passage.passagePicture}" alt="">
									</a>
									<div class="tpl-table-images-content-block">

										<div class="tpl-i-more">
											<ul>
												<li><span class="am-icon-qq am-text-warning">${passageAnduser.passage.passageLikeCount}</span></li>
												<li><span class="am-icon-weixin am-text-success">
														${passageAnduser.passage.passageLookCount}</span></li>
											</ul>
										</div>
										<div class="am-btn-toolbar">
											<div
												class="am-btn-group am-btn-group-xs tpl-edit-content-btn">
												<button type="button"
													class="am-btn am-btn-default am-btn-danger">
													<span class="am-icon-trash-o"></span>锁定
												</button>
											</div>
										</div>
									</div>

								</div>

							</div>
						</c:forEach>
						
					
					<div class="am-u-lg-12">
						<div class="am-cf">

							<div class="am-fr">
								<ul class="am-pagination tpl-pagination">
									<li class="am-disabled"><a href="#">«</a></li>
									<li class="am-active"><a href="#">1</a></li>
									<li><a href="#">2</a></li>
									<li><a href="#">3</a></li>
									<li><a href="#">4</a></li>
									<li><a href="#">5</a></li>
									<li><a href="#">»</a></li>
								</ul>
							</div>
						</div>
						<hr>
					</div>
                  </div>
				</div>

			</div>
		</div>
		<div class="tpl-alert"></div>
	</div>










</div>




<script src="assets/js/jquery.min.js"></script>
<script src="assets/js/amazeui.min.js"></script>
<script src="assets/js/app.js"></script>
</body>

</html>