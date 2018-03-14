<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!doctype html>
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
<link rel="icon" sizes="192x192" href="images/i/app.png">
<!--Safari on iOS -->
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="apple-mobile-web-app-title" content="Amaze UI" />
<link rel="apple-touch-icon-precomposed" href="images/i/app.png">
<!--Win8 or 10 -->
<meta name="msapplication-TileImage" content="images/i/app.png">
<meta name="msapplication-TileColor" content="#e1652f">

<link rel="icon" type="image/png" href="images/i/favicon.png">
<link rel="stylesheet" href="assets/css/amazeui.min.css">
<link rel="stylesheet" href="css/public.css">

<!--[if (gte IE 9)|!(IE)]><!-->
<script src="assets/js/jquery.min.js"></script>
<!--<![endif]-->
<!--[if lte IE 8 ]>
<script src="http://libs.baidu.com/jquery/1.11.3/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
<script src="assets/js/amazeui.ie8polyfill.min.js"></script>
<![endif]-->
<script src="assets/js/amazeui.min.js"></script>
<script src="js/public.js"></script>
</head>
<body>

<%@include file="headTemp.jsp"%>

<div id="category_top">
    <div class="am-hide-lg-only kz" id="leftbtn">
        <i class="am-icon-angle-left"></i>
    </div>
    <div class="am-hide-lg-only kz" style="right: 0px;" id="rightbtn">
        <i class="am-icon-angle-right"></i>
    </div>
    <div class="am-container">
        <ul class="am-avg-sm-2 am-avg-md-3 am-avg-lg-6 am-thumbnails"
            id="topface">
            <c:set var="no" value="1"></c:set>
            <c:forEach items="${userPageInfo.list}" var="passage">
                <li><a href="/userIndex/${passage.userId}">
                        <div class="ctl active">
                            <img src="${passage.userUri}">
                            <h3>NO.${no}</h3><c:set var="no" value="${no +1}"></c:set>
                            <p>${passage.userName}</p>
                        </div>
                        <button type="button" class="am-btn am-btn-primary">进入专栏</button>
                </a></li>
            </c:forEach>
        </ul>

    </div>

</div>

<script>
    var countnum = 5 //一共多少个图 例如6个请输入5
    $("#leftbtn")
            .click(
                    function() {
                        var temp_href = $("#topface li:eq(0) a").attr(
                                "href");
                        var temp_img = $("#topface li:eq(0) img").attr(
                                "src");
                        var temp_h3 = $("#topface li:eq(0) h3").html();
                        var temp_p = $("#topface li:eq(0) p").html();

                        for (i = 0; i < countnum; i++) {
                            var n = i + 1;
                            $("#topface li:eq(" + i + ") a").attr(
                                    'href',
                                    $("#topface li:eq(" + n + ") a").attr(
                                            "href"));
                            $("#topface li:eq(" + i + ") img").attr(
                                    'src',
                                    $("#topface li:eq(" + n + ") img")
                                            .attr("src"));
                            $("#topface li:eq(" + i + ") h3").html(
                                    $("#topface li:eq(" + n + ") h3")
                                            .html());
                            $("#topface li:eq(" + i + ") p")
                                    .html(
                                            $("#topface li:eq(" + n + ") p")
                                                    .html());
                        }
                        ;
                        $("#topface li:eq(" + countnum + ") a").attr(
                                'href', temp_href);
                        $("#topface li:eq(" + countnum + ") img").attr(
                                'src', temp_img);
                        $("#topface li:eq(" + countnum + ") h3").html(
                                temp_h3);
                        $("#topface li:eq(" + countnum + ") p")
                                .html(temp_p);
                    });
    $("#rightbtn")
            .click(
                    function() {
                        var temp_href = $(
                                "#topface li:eq(" + countnum + ") a").attr(
                                "href");
                        var temp_img = $(
                                "#topface li:eq(" + countnum + ") img")
                                .attr("src");
                        var temp_h3 = $(
                                "#topface li:eq(" + countnum + ") h3")
                                .html();
                        var temp_p = $("#topface li:eq(" + countnum + ") p")
                                .html();

                        for (i = countnum; i > 0; i--) {
                            var n = i - 1;
                            $("#topface li:eq(" + i + ") a").attr(
                                    'href',
                                    $("#topface li:eq(" + n + ") a").attr(
                                            "href"));
                            $("#topface li:eq(" + i + ") img").attr(
                                    'src',
                                    $("#topface li:eq(" + n + ") img")
                                            .attr("src"));
                            $("#topface li:eq(" + i + ") h3").html(
                                    $("#topface li:eq(" + n + ") h3")
                                            .html());
                            $("#topface li:eq(" + i + ") p")
                                    .html(
                                            $("#topface li:eq(" + n + ") p")
                                                    .html());
                        }
                        ;
                        $("#topface li:eq(0) a").attr('href', temp_href);
                        $("#topface li:eq(0) img").attr('src', temp_img);
                        $("#topface li:eq(0) h3").html(temp_h3);
                        $("#topface li:eq(0) p").html(temp_p);
                    });
</script>


<div id="cattit">
    <ul class="am-avg-sm-2 am-avg-md-2 am-avg-lg-2">
        <li><h3>
                <a href="/category?u=0">用户专栏</a>
            </h3></li>
        <li><h3>
                <a href="/category?u=1">小编专栏</a>
            </h3></li>
    </ul>
</div>
<hr data-am-widget="divider" style=""
    class="am-divider am-divider-default" />
<div id="cattlist" class="am-container">
    <ul class="am-avg-sm-1 am-avg-md-3 am-avg-lg-4">
        <c:forEach items="${pageInfo2.list}" var="u">
            <li><a href="/userIndex/${u.userId}"><div
                        class="cattlist_0">
                        <div class="cattlist_1">
                            <div class="am-g">

                                <div class="am-u-sm-4 am-u-md-5 am-u-lg-5 am-vertical-align">
                                    <div class="am-vertical-align-middle">
                                        <img src="${u.userUri}">
                                    </div>
                                </div>
                                <div class="am-u-sm-8 am-u-md-7 am-u-lg-7">

                                    <h3>${u.userName}</h3>
                                    <p>
                                        文章<span>${u.userPassageNum}</span>
                                    </p>
                                </div>
                            </div>
                        </div>
                        <div class="cattlist_2">
                            <p>${u.userBrief}</p>
                        </div>
                        <!-- 						<div class="cattlist_3"> -->
                        <!-- 							<button type="button" class="am-btn am-btn-warning"> -->
                        <!-- 								<i class="am-icon-plus"></i> 橙色按钮 -->
                        <!-- 							</button> -->
                        <!-- 						</div> -->
                    </div> </a></li>
        </c:forEach>
    </ul>
</div>

<div class="am-container" style="margin: 100px auto">
    <ul data-am-widget="pagination"
        class="am-pagination am-pagination-default am-text-center">

        <c:choose>
            <c:when test="${pageInfo2.pageNum eq 1}">
                <li class="am-pagination-first am-disabled"><a href="#"
                    class="">第一页</a></li>

                <li class="am-pagination-prev am-disabled"><a href="#"
                    class="">上一页</a></li>
            </c:when>
            <c:otherwise>
                <li class="am-pagination-first "><a href="/personal?start=1"
                    class="">第一页</a></li>

                <li class="am-pagination-prev "><a
                    href="/personal?start=${pageInfo2.pageNum-1}" class="">上一页</a></li>
            </c:otherwise>
        </c:choose>



        <c:forEach begin="1" end="${pageInfo2.pages}" step="1" var="i">
            <c:choose>
                <c:when test="${i eq pageInfo2.pageNum}">
                    <li class="am-active am-disabled"><a href="">${i}</a></li>
                </c:when>
                <c:otherwise>
                    <li><a href="/personal?start=${i}">${i}</a></li>
                </c:otherwise>
            </c:choose>
        </c:forEach>

        <c:choose>
            <c:when test="${pageInfo2.pages eq pageInfo2.pageNum}">
                <li class="am-pagination-next am-disabled"><a href="#"
                    class="">下一页</a></li>

                <li class="am-pagination-last am-disabled"><a href="#"
                    class="">最末页</a></li>
            </c:when>
            <c:otherwise>
                <li class="am-pagination-next"><a
                    href="/personal?start=${pageInfo2.pageNum+1}" class="">下一页</a></li>

                <li class="am-pagination-last "><a
                    href="/personal?start=${pageInfo2.pages}" class="">最末页</a></li>
            </c:otherwise>
        </c:choose>
    </ul>
</div>




<div data-am-widget="gotop" class="am-gotop am-gotop-fixed">
    <a href="#top" title="回到顶部"> <span class="am-gotop-title">回到顶部</span>
        <i class="am-gotop-icon am-icon-chevron-up"></i>
    </a>
</div>
<%@include file="floorTemp.jsp"%>
</body>
</html>