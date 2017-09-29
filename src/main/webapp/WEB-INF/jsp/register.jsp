<%@ page language="java" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=Edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0,user-scalable=no">
	<link rel="stylesheet" href="css/restyle.css" />
	<link rel="stylesheet" type="text/css" href="./css/restyle.css">
	<link rel="stylesheet" href="./css/iconfont.css">
	<title>注册 - 捡书</title>
</head>
<body class="no-padding reader-black-font nounderline" lang="zh-CN">
<div class="sign">
	<div class="logo">
		<a>
			<img src="./img/logo.png" width="122" height="62" alt="logo">
		</a>
	</div>
	<div class="main">
		<h4 class="title">
			<div class="normal-title">
				<a class href="/janebook/login">登录 </a>
				<b>·</b>
				<a id="js-sign-up-btn" class="active" href="/janebook/register">注册</a>
			</div>
		</h4>
		<div class="js-sign-up-container">
			<form class="new_user" id="new_user" action="/janebook/Userregister" accept-charset="UTF-8" method="post">
				<div class="input-prepend restyle">
					<input placeholder="你的昵称" type="text"
						   value name="userId" id="user_nickname" style="border-bottom: 0px; border-radius: 0px;">
					<i class="iconfont icon-yonghu1"></i>
				</div>
				<div class="input-prepend restyle no-radius js-normal">
					<input type="hidden" value="CN" name="user[mobile_number_country_code]"
						   id="user_mobile_number_country_code" style="border-bottom: 0px; border-radius: 0px;">
					<input placeholder="手机号" type="tel" name="phone"
						   id="user_mobile_number" style="border-bottom: 0px; border-radius: 0px;">
					<i class="iconfont icon-shouji2"></i>
				</div>
				<input type="hidden" name="oversea" id="oversea" value="false">
				<input type="hidden" name="force_user_nonexist" id="force_user_nonexist" value="true">
				<div class="input-prepend">
					<input placeholder="设置密码" type="password"
						   name="password" id="user_password" style=" border-radius: 0px;">
					<i class="iconfont icon-suo"></i>
				</div>
				<input type="submit" name="commit" value="注册"
					   class="sign-up-button" data-disable-with="注册">
				<p class="sign-up-msg">
					点击 “注册” 即表示您同意并愿意遵守简书
					<br>
					<a target="_blank" href="http://www.jianshu.com/p/c44d171298ce">用户协议</a>
					和
					<a target="_blank" href="http://www.jianshu.com/p/2ov8x3">隐私政策</a>
					。
				</p>
			</form>

			<!-- 更多注册方式 -->
			<div class="more-sign">
				<h6>
					社交账号直接注册
				</h6>
				<ul>
					<li><a class="weibo"  target="_blank" href=""><i class="iconfont icon-sina"></i></a></li>
					<li><a class="weixin" target="_blank" href=""><i class="iconfont icon-icon-"></i></a></li>
					<li><a class="qq" target="_blank" href=""><i class="iconfont icon-qq"></i></a></li>
				</ul>
			</div>
		</div>
	</div>
</div>
</body>
</html>
