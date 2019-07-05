<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>StreetViewRatingApp_HPSCIL@wangjiale</title>
	<link href="css/rating.css" rel="stylesheet" type="text/css">
    <script src="lib/jquery-1.11.2.min.js"></script>
    <link href="lib/jquery-easyui-1.5.1/themes/material/easyui.css" rel="stylesheet" >
    <link href="lib/jquery-easyui-1.5.1/themes/icon.css" rel="stylesheet" >
    <link href="lib/jquery-easyui-1.5.1/themes/color.css" rel="stylesheet" >
    <script src="lib/jquery-easyui-1.5.1/jquery.easyui.min.js"></script>
</head>
<body>
	<div id="header">
		<img id="logo" src="images/LOGO.png">
        <h1>StreetViewRatingApp</h1>
        <p id="usr">@username:${user.username}</p>
        <p id="msg">You have beening rated ${number} images!</p>
     </div>
	<img id="img" src="/StreetViews/${imgUrl}">
    <p id="location">@Geo-Location:${location}</p>
    <form action="<%=basePath%>rating" method="post">
        <span style="top:25%" class="category">Wealthy:</span><div id="wealthyScore" class="score"><input name="wealthyScore" class="easyui-slider" value="${pwealthyValue}"
            data-options="showTip:true,rule:[0,'|',25,'|',50,'|',75,'|',100]"></div>
        <span style="top:33%" class="category">Safely:</span><div id="safelyScore" class="score"><input name="safelyScore" class="easyui-slider" value="${psafelyValue}"
            data-options="showTip:true,rule:[0,'|',25,'|',50,'|',75,'|',100]"></div>
        <span style="top:41%" class="category">Lively:</span><div id="livelyScore" class="score"><input name="livelyScore" class="easyui-slider" value="${plivelyValue}"
            data-options="showTip:true,rule:[0,'|',25,'|',50,'|',75,'|',100]"></div>
        <span style="top:49%" class="category">Beautiful:</span><div id="beautifulScore" class="score"><input name="beautifulScore" class="easyui-slider" value="${pbeautifulValue}"
            data-options="showTip:true,rule:[0,'|',25,'|',50,'|',75,'|',100]"></div>
        <span style="top:57%" class="category">Boring:</span><div id="boringScore" class="score"><input name="boringScore" class="easyui-slider" value="${pboringValue}"
            data-options="showTip:true,rule:[0,'|',25,'|',50,'|',75,'|',100]"></div>
        <span style="top:65%" class="category">Depression:</span><div id="depressionScore" class="score"><input name="depressionScore" class="easyui-slider" value="${pdepressionValue}"
            data-options="showTip:true,rule:[0,'|',25,'|',50,'|',75,'|',100]"></div>
        <span style="top:72%" class="category">Operation:</span><div class="score" style="top:72%">
            <input type="submit" value="Sure" style="width: 100%;border-radius: 4px;"/>
	    </div>
    </form>
    <footer>Copyright @ 2018 [<span class="txt">WangJiale</span>] Developer<br>High-Performance Spatial Computational Intelligence Lab, <span class="txt">HPSCIL</span></footer>
	<!-- 
	StreetViewRatingApp_HPSCIL@:${user.username}<br/>
	<img src="/StreetViews/${imgUrl}"><br/>
	${imgUrl}<br/>
	reference value:wealthy:${pwealthyValue} safely:${psafelyValue} lively:${plivelyValue} beautiful:${pbeautifulValue} boring:${pboringValue} depression:${pdepressionValue}<br/>
	<form action="<%=basePath%>rating" method="post">
		Wealthy:
		<input type="text" name="wealthyScore" /><br/> 
		Safely:
		<input type="text" name="safelyScore" /><br/> 
		Lively:
		<input type="text" name="livelyScore" /><br/> 
		Beautiful:
		<input type="text" name="beautifulScore" /><br/> 
		Boring:
		<input type="text" name="boringScore" /><br/> 
		Depression:
		<input type="text" name="depressionScore" /><br/>
		<input type="submit" value="确认" /><br/>
	</form> 
	-->
</body>
</html>