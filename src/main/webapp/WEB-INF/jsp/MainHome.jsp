<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
	<meta charset="UTF-8">
	<title>Pick Up Your BookS</title>
	<link rel="stylesheet" href="./css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="./css/iconfont.css">
	<link rel="stylesheet" type="text/css" href="./css/MainHome.css">
	<script type="text/javascript" src="./js/jquery-3.2.1.min.js"></script>
	<script type="text/javascript" src="./js/bootstrap.min.js"></script>
</head>



<body class="night-mode">
<%@include file="nav.jsp"%>
<div class="container main-content">
	<div class="row carousel-contanier">
		<div class="carousel slide" id="recommend-carousel">
			<div class="carousel-inner">
				<div class="item fadein active">
					<div class="banner">
						<a href="#" style="">
							<img src="./images/1.jpg" alt="First slide">
						</a>
					</div>
				</div>
				<div class="item">
					<div class="banner">
						<a href="#" style="">
							<img src="./images/2.jpg" alt="First slide">
						</a>
					</div>
				</div>
				<div class="item">
					<div class="banner">
						<a href="#" style="">
							<img src="./images/3.jpg" alt="First slide">
						</a>
					</div>
				</div>
			</div>
			<a href="#" class="carousel-control left">
				<span class="glyphicon glyphicon-chevron-left"></span>
				<span class="sr-only">&lsaquo;</span>
			</a>
			<a href="#" class="carousel-control right">
				<span class="glyphicon glyphicon-chevron-right"></span>
				<span class="sr-only">&rsaquo;</span>
			</a>
		</div>
	</div>
	<div class="row main">
		<div class="main-left col-md-8 col-xs-8">
			<div class="recommend-collection">
				<a href="#" class="collection">
					<img src="./images/collection/EntertainmentGossip.png" alt="">
					<div class="collection-name">娱乐八卦</div>
				</a>
				<a href="#" class="collection">
					<img src="./images/collection/Animate.jpg" alt="">
					<div class="collection-name">漫画&动画</div>
				</a>
				<a href="#" class="collection">
					<img src="./images/collection/Books.jpg" alt="">
					<div class="collection-name">读书</div>
				</a>
				<a href="#" class="collection">
					<img src="./images/collection/Prose.jpg" alt="">
					<div class="collection-name">散文</div>
				</a>
				<a href="#" class="collection">
					<img src="./images/collection/Camera.png" alt="">
					<div class="collection-name">摄影</div>
				</a>
				<a href="#" class="collection">
					<img src="./images/collection/Moyu.jpg" alt="">
					<div class="collection-name">上班<span style="text-decoration:line-through;">摸鱼</span></div>
				</a>
				<a href="#" class="collection">
					<img src="./images/collection/Rua.jpg" alt="">
					<div class="collection-name">猛男</div>
				</a>
				<a href="#" class="collection">
					<img src="./images/collection/RPG.jpg" alt="">
					<div class="collection-name">游戏<span style="text-decoration:line-through;">打Gay</span></div>
				</a>
				<a href="#" class="collection">
					<img src="./images/collection/Music.png" alt="">
					<div class="collection-name">音乐</div>
				</a>
				<a href="#" class="more-collection">
					更多热门专题  >
				</a>
			</div>
			<div class="split-line"></div>



			<div class="list-container">
				<ul class="note-list">

					<c:forEach items="${TArticle}" var="at">
						<li class="note-item">
							<a class="note-img" href="#">
								<img src="${at.img}">
							</a>
							<div class="note-content">
								<div class="author">
									<a class="avatar" target="_blank" href="#">
										<img class="img-rounded" src="./images/avatar/kaziya.jpg">
									</a>
									<div class="name">
										<a target="_blank" href="#">${at.authorName}</a>
										<span class="time" data-shared-at="2017-09-09T20:13:35+08:00">${at.createTime}</span>
									</div>
								</div>
								<a class="title" target="_blank" href="#">${at.title}</a>
								<p class="abstract">
										${at.content}
								</p>
								<div class="meta">
									<a class="collection-tag" target="_blank" href="#">${at.tag}</a>
									<a target="_blank" href="#">
										<span class="glyphicon glyphicon-eye-open"></span> ${at.browse}
									</a>
									<a target="_blank" href="#">
										<span class="glyphicon glyphicon-comment"></span> ${at.collection}
									</a>
									<a target="_blank" href="#">
										<span class="glyphicon glyphicon-heart"></span> ${at.reward}
									</a>
									<a class="dislike">
										<i class="iconfont icon-dislike"></i>不爱的
									</a>
								</div>
							</div>
						</li>


					</c:forEach>
				</ul>
			</div>

			<a  href="#" class="load-more">阅读更多</a>




		</div>
		<%@include file="right-main.jsp"%>
	</div>
</div>
<div class="side-tool">
	<ul>
		<li class="back-to-top">
			<a class="function-btn">
				<i class="iconfont icon-less"></i>
			</a>
		</li>
	</ul>
</div>
<%@include file="footer.jsp"%>
</body>
<script type="text/javascript">
    $(function(carousel){
        var slideon=setInterval(turnImgs, 3000);
        function fi(e) {
            $(e).addClass('fadein');
        };
        function fo(e) {
            $(e).removeClass('fadein');
        };
        var imgs = $(".carousel-inner").children();
        var imgs_len = $(".carousel-inner").children().length - 1;
        function turnImgs(dir) {
            var cur_index=$(".carousel-inner").children("div.fadein").index();
            // alert(cur_index);
            // alert(imgs.eq(cur_index).html());
            if(dir==1){
                if (cur_index == imgs_len) {
                    fo(imgs.eq(cur_index));
                    fi(imgs.eq(0));
                } else {
                    fo(imgs.eq(cur_index));
                    fi(imgs.eq(cur_index+1));
                }
            }
            else{
                if (cur_index == 0) {
                    fo(imgs.eq(0));
                    fi(imgs.eq(imgs_len));
                } else {
                    fo(imgs.eq(cur_index));
                    fi(imgs.eq(cur_index-1));
                }
            }
        };
        $(".carousel-control.right").click(function(){
            turnImgs(1);
        });
        $(".carousel-control.left").click(function(){
            turnImgs(0);
        });
        $("#recommend-carousel").hover(function() {
            clearInterval(slideon);
        }, function() {
            slideon=setInterval(turnImgs, 3000);
        });
    });
    $(function(to_top){
        $(window).scroll(function(){
            if($(this).scrollTop()<500){
                // $(".back-to-top").show();
                if($(".side-tool").is(":visible")){
                    console.log(1);
                    $(".side-tool").hide();
                }
            }
            else{
                if($(".side-tool").is(":hidden")){
                    console.log(2);
                    $(".side-tool").show();
                }

            }
        });
        $(".side-tool .back-to-top .function-btn").click(function(event) {
            $("body,html").animate({scrollTop:0},900);
        });
    });
    $(function(modal){
        $(".theme .theme-btn").on('click',function(){
            if($(".theme .modal-popup").is(":hidden")){
                $(".theme .modal-popup").fadeIn();
            }
            else{
                $(".theme .modal-popup").fadeOut();
            }
        });
    });
    $(function(follow){
        $(".author-list .author-item .follow").on('click',function(){
            if($(this).hasClass('following')){
                $(this).removeClass('following');
                $(this).empty();
                $(this).html("+ 关注");
            }
            else{
                $(this).addClass('following');
                $(this).empty();
                $(this).html('<i class="iconfont icon-selected"></i> 已关注');
            }

        });
    });
</script>
</html>