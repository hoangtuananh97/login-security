<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Phone</title>
	  <link rel="stylesheet" href="<c:url value="/resources/css/w3.css"/> " />
      <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.css"/> " />
      <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/style.css"/> "/>
      <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/fontawesome-all.css" />  "/>
      <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/simpleLightbox.css"/>"/>
      <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/mystyle.css"/> ">
      <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/animate.css" />">
</head>
<body>
	<tiles:insertAttribute name="header" />
	<tiles:insertAttribute name="content" />
	<tiles:insertAttribute name="footer" />
</body>
   <script type="text/javascript" src="https://code.jquery.com/jquery-3.3.1.js"></script>
   <script type="text/javascript" src="<c:url value="/resources/js/bootstrap.js"/>"></script>
   <script type="text/javascript" src="<c:url value="/resources/js/isotope.pkgd.min.js"/>"></script>
   <script type="text/javascript" src="<c:url value="/resources/js/imagesloaded.pkgd.min.js"/>"></script>
   <script type="text/javascript" src="<c:url value="/resources/js/myfitjs.js"/>"></script> <!-- fit -->
   <script type="text/javascript" src="<c:url value="/resources/js/mysearch.js"/>"></script> <!-- tim kiem -->
   <script type="text/javascript" src="<c:url value="/resources/js/mynojquery.js"/>"></script> <!-- thuong hieu -->
   <script type="text/javascript" src="<c:url value="/resources/js/myjquery.js"/>"></script> <!-- active thuong hieu -->
</html>