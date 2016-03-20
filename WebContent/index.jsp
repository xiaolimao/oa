<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<a href="springmvc/testViewAndViewResolver">Test ViewAndViewResolver</a>
	<br><br>
	
	<form action="springmvc/testModelAttribute" method="Post">
		<input type="hidden" name="id" value="1"/>
		username: <input type="text" name="username" value="Tom"/>
		<br>
		email: <input type="text" name="email" value="tom@atguigu.com"/>
		<br>
		age: <input type="text" name="age" value="12"/>
		<br>
		<input type="submit" value="Submit"/>
	</form>
	
	<a href="springmvc/testSessionAttributes">Test SessionAttributes</a>
	<br><br>
	
	<a href="springmvc/testModelAndView">Test ModelAndView</a>
	<br><br>
	
	<a href="springmvc/testServletAPI">Test ServletAPI</a>
	<br><br>
	
	<form action="springmvc/pojo" method="post">
		username: <input type="text" name="username"/>
		<br>
		password: <input type="password" name="password"/>
		<br>
		email: <input type="text" name="email"/>
		<br>
		age: <input type="text" name="age"/>
		<br>
		province： <input type="text" name="address.province"/>
		<br>
		city： <input type="text" name="address.city"/>
		<input type="submit" value="提交">
	</form>
	
	<a href="springmvc/testRestCookie">Test testRestHeader</a>
	
	<br><br/>
	
	<a href="springmvc/testRestHeader">Test testRestHeader</a>
	
	<br><br/>
	
	<a href="springmvc/testRestParams?userName=atguigu&age=10">Test Params</a>
	
	<br><br/>
	
	<form action="springmvc/testRest/1" method="post" >
		<input type="hidden" name="_method" value="put"/>
		<input type="submit" value="put提交"/>
	</form>
	
	<form action="springmvc/testRest/1" method="post" >
		<input type="hidden" name="_method" value="delete"/>
		<input type="submit" value="delete删除"/>
	</form>
	
	<form action="springmvc/testRest" method="post" >
		<input type="submit" value="POST请求"/>
	</form>
	
	
	<a href="springmvc/pathVariable/1?userName=atguigu&age=10">Test pathVariable</a>
	
	<br><br/>
	
	<a href="springmvc/params?userName=atguigu&age=10">Test params</a>
	
	<br><br/>
	
	
	<a href="springmvc/helloworld">Hello springmvc</a>
	
	<br><br/>

	<a href="helloworld">Hello World</a>
	
</body>
</html>