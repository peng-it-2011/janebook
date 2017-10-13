<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<!DOCTYPE html>
<html lang="zh-CN">
<head>
	<meta charset="UTF-8">
	<title>Pick Up Your BookS</title>
	<link rel="stylesheet" href="./css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="./css/iconfont.css">
	<link rel="stylesheet" type="text/css" href="./css/MainHome-login.css">
	<link rel="stylesheet" type="text/css" href="./css/mytopic.css">
	<script type="text/javascript" src="./js/jquery-3.2.1.min.js"></script>
	<script type="text/javascript" src="./js/bootstrap.min.js"></script>
</head>

<body>
<shiro:authenticated>
	<%@include file="nav-login.jsp"%>
</shiro:authenticated>
<shiro:guest>
	<%@include file="nav.jsp"%>
</shiro:guest>
<div class="container mytopic">
	<div class="row">
		<div class="col-md-8 topic-left">
			<div class="topic-left-top">
				<a href="#" class="topic-img">
					<img src="${classify.classifyImg}">
				</a>
				<a href="" class="btn btn-defualt topic-follow">
					<i class="iconfont icon-selected">
						<span>已关注</span>
					</i>
				</a>
				<div class="btn btn-hollow topic-collection" id="shoulu">收录</div>
				<div class="topic-title">
					<a href="" class="title">${classify.classifyName}</a>
				</div>
				<div class="topic-info">
					收录了一篇文章-1人关注
				</div>
			</div>
			<ul class="topic-left-center">
				<li class="option active">
					<a href="#"><i class="iconfont icon-comments"></i> 最新评论</a>
				</li>
				<li class="option">
					<a href="#"><i class="iconfont icon-articles"></i> 最新目录</a>
				</li>
				<li class="option">
					<a href="#"><i class="iconfont icon-hot"></i> 热门</a>
				</li>
			</ul>
			<div class="bottom">
				<ul class="ming-list" style="border:none;">
					<c:forEach items="${TArticle}" var="tArticles">
					<li class="ming">
						<a href="#" class="ming-img">
							<img src="${tArticles.img}" alt="">
						</a>
						<div class="ming-content">
							<div class="ming-author">
								<a href="#" class="avatar">
									<img src="images/user/3.jpg" alt="">
								</a>
								<div class="ming-info">
									<a target="_blank" href="/janebook/myhomepage?name=${tArticles.authorName}" class="avatar-name">${tArticles.authorName}</a>
									<span class="avatar-time">${tArticles.createTime}</span>
								</div>
							</div>
							<a target="_blank" href="/janebook/article/show/${tArticles.id}" class="ming-title">${tArticles.title}</a>
							<p class="ming-abstract">
								${tArticles.content}
							</p>
							<div class="ming-meta">
								<a href="#">
									<i class="iconfont icon-liulan"></i>12
								</a>
								<a href="#">
									<i class="iconfont icon-comments"></i>1
								</a>
								<span>
                                        <i class="iconfont icon-Love"></i>2
                                    </span>
							</div>
						</div>
					</li>
					</c:forEach>
				</ul>
			</div>
		</div>
		<div class="col-md-3 ho-rightpart">
			<div class="title">专题公告</div>
			<div class="discrition">
				<div class="ming-text">投稿须知：1.请作者用心管理自己的作品，为作品建立文集和专题，在文章中加上目录和上下章节的链接，排版优美的作品优先收录。请参考管理员的做法</div>
			</div>
			<div>
				<div class="add-border">
					<div class="title">管理员</div>
					<ul class="topic-list">
						<li>
							<a href="" class="ming-collection"><img src="images/user/3.jpg"></a>
							<a href="" class="ming-name ming-list-sp">怀左同学</a>
						</li>
					</ul>
				</div>
				<div class="add-border" style="padding-bottom: 10px;">
					<div class="title">关注的人</div>
					<ul class="topic-list">
						<li>
							<a href="" class="ming-collection-pre"><img src="images/user/4.jpg"></a>
							<a href="" class="ming-collection-pre"><img src="images/user/5.jpg"></a>
							<a href="" class="ming-collection-pre"><img src="images/user/6.jpg"></a>
						</li>
					</ul>
				</div>
				<div style="padding-top: 10px;">
					<a href="">编辑专题</a>·
					<a href="">删除专题</a>
				</div>
			</div>
		</div>
	</div>
</div>
</body>

</html>
<script>
    $(function(follow) {
        $("#shoulu").on("mouseenter mouseleave click", function(event) {
            var _this = $(".follow");
            if ($(this).hasClass('following')) {

                if (event.type == 'mouseenter') {
                    $(_this).text("取消收录");
                } else if (event.type == 'mouseleave') {
                    $(_this).text("正在收录");
                } else {
                    $(_this).removeClass('following');
                    $(_this).text("+ 收录");
                }
            } else {
                if (event.type == 'click') {
                    $(_this).addClass('following');
                    $(_this).text("正在收录");
                }
            }
        });
    });
</script>