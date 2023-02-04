<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Rock Paper Scissors Lizard Spock Game</title>
</head>
<body>
 <h1> Welcome to the Rock Paper Scissors Lizard Spock!</h1>
 <form action="getWinnerServlet" method="post">
 	Choose the hand for each player: <br>
 	
 	<label for="first-hand">First Hand:</label>
 	<select name="first-hand" id="first-hand">
 		<option value="rock">Rock</option>
 		<option value="paper">Paper</option>
 		<option value="scissors">Scissors</option>
 		<option value="lizard">Lizard</option>
 		<option value="spock">Spock</option>
 	</select>
 	
	<label for="second-hand">Second Hand:</label>
 	<select name="second-hand" id="second-hand">
 		<option value="rock">Rock</option>
 		<option value="paper">Paper</option>
 		<option value="scissors">Scissors</option>
 		<option value="lizard">Lizard</option>
 		<option value="spock">Spock</option>
 	</select> <br>
 		
 	<input type="submit" value="Find Winner" />
 </form>
</body>
</html>