<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
    <link href="css/register.css" rel="stylesheet" type="text/css">
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
    </div>
    <div id="form1">
	    <form id="ff" method="post" action="<%=basePath%>register">
	    	<table cellpadding="5">
	    		<tr>
	    			<td>Username:</td>
	    			<td><input class="easyui-textbox" type="text" name="username" data-options="required:true"></input></td>
	    		</tr>
	    		<tr>
	    			<td>Password:</td>
	    			<td><input class="easyui-textbox" type="password" name="password" data-options="required:true"></input></td>
	    		</tr>
	    		<tr>
	    			<td>Country:</td>
	    			<td><input class="easyui-textbox" type="text" name="country" data-options="required:true"></input></td>
	    		</tr>
	    		<tr>
	    			<td>Province:</td>
	    			<td><input class="easyui-textbox" type="text" name="province" data-options="required:true"></input></td>
	    		</tr>
                <tr>
                    <td>City:</td>
                    <td><input class="easyui-textbox" type="text" name="city" data-options="required:true"></input></td>
                </tr>
                <tr>
                    <td>Occupation:</td>
                    <td><input class="easyui-textbox" type="text" name="occupation" data-options="required:true"></input></td>
                </tr>
	    		<tr>
	    			<td>Gender:</td>
	    			<td>
	    				<select class="easyui-combobox" name="gender" data-options="required:true" style="width:160px">
                            <option value="0">Male</option>
                            <option value="1">female</option>
                        </select>
	    			</td>
	    		</tr>
                <tr>
                    <td>Incomelevel:</td>
                    <td>
                        <select class="easyui-combobox" name="incomelevel" data-options="required:true" style="width:160px">
                            <option value="1">high</option>
                            <option value="2">medium</option>
                            <option value="3">low</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Operation:</td>
                    <td>
                        <input type="submit" class="easyui-linkbutton" value="Submit" style="width:76px;height:26px"/>
            	    	<input type="button" class="easyui-linkbutton" onclick="clearForm()" value="Clear" style="width:76px;height:26px"/>
                    </td>
                </tr>
	    	</table>
	    </form>
	</div>
    <script>
		function clearForm(){
			$('#ff').form('clear');
		}
	</script>
    <footer>Copyright @ 2018 [<span class="txt">WangJiale</span>] Developer<br>High-Performance Spatial Computational Intelligence Lab, <span class="txt">HPSCIL</span></footer>
	
	<!--
	<form action="<%=basePath%>register" method="post">
	    username:
		<input type="text" name="username" /><br/> 
		password:
		<input type="password" name="password" /><br/> 
		country:
		<input type="text" name="country" /><br/> 
		province:
		<input type="text" name="province" /><br/> 
		city:
		<input type="text" name="city" /><br/> 
		occupation:
		<input type="text" name="occupation" /><br/> 
		gender:
		<label><input type="radio" name="gender" value="0"/>male</label>
		<label><input type="radio" name="gender" value="1"/>female</label><br/>
		incomelevel:
		<select name="incomelevel">
			<option>-请选择-</option>
			<option value="1">high</option>
			<option value="2">medium</option>
			<option value="3">low</option>
		</select><br/> 
		<input type="submit" value="确认" />
	</form>
	-->
</body>
</html>