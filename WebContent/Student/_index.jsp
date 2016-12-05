<%@page import="sun.awt.SunHints.Value"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet" href="Student/css/stylesheet.css" type="text/css">
</head>
<body>
	<div class="content">
		<h1>DANH SÁCH SINH VIÊN</h1>
		<div class="list_student">
			<div class="line">
				<center>
					<div class="id">
						<p>ID</p>
					</div>
					<div class="name">
						<p>NAME</p>
					</div>
					<div class="code">
						<p>CODE</p>
					</div>
					<div class="address">
						<p>ADDRESS</p>
					</div>
					<div class="average_score">
						<p>Ave-Score</p>
					</div>
					<div class="birth">
						<p>BIRTH</p>
					</div>
				</center>
				<div class="clear"></div>
			</div>

			<c:forEach items="${list}" var="record">
				<div class="line">
					<div class="id">
						<p>${record.getId()}</p>
					</div>
					<div class="name">
						<p>${record.getName()}</p>
					</div>
					<div class="code">
						<p>${record.getCode()}</p>
					</div>
					<div class="address">
						<p>${record.getAddress()}</p>
					</div>
					<div class="average_score">
						<p>${record.getAverage_score()}</p>
					</div>
					<div class="birth">
						<p>${record.getBirth()}</p>
					</div>
					<div class="clear"></div>
				</div>
			</c:forEach>
		</div>
	</div>

</body>
</html>