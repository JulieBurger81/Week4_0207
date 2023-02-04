<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Winner of game</title>
</head>
<body>
<p>
	The first player's hand was a ${RSPWinnerPage.getFirstHand()}. <br />
	The second player's hand was a ${RSPWinnerPage.getSecondHand()}.<br />
	${RSPWinnerPage.getWinner()} <br />
</p>
<a href="index.jsp">Play another round.</a>
</body>
</html>



	