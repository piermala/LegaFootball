<%@page import="java.util.List"%>
<%@page import="model.Squadra"%>
<%@page import="model.Campionato"%>
<%@page import="gestione.GestioneCampionato"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE>

<html>

<head>
	<title>Premier League</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body>

	<nav class="navbar navbar-default" style="background-color: red;">
	
		<div class="container">
		
			<div class="navbar-header">
				<span class="navbar-brand"><img src="img/premier_league.png" width="90" height="80" /></span>
				<a class="navbar-brand" style="color: black;">Premier League</a>
			</div>
			
		</div>
		
	</nav>

	<div class="container">
	
		<h3 id="title">Squadra con la minor differenza reti</h3>
		
		<a href="premier.jsp" class="btn btn-success" id="btn" role="button">Classifica completa di Premier League</a>
		<hr>
		
		<table class="table" id="premierTable">
			
			<thead>
				<tr>
				  <th>Squadra</th>
				  <th>PG</th>
				  <th>V</th>
				  <th>P</th>
				  <th>S</th>
				  <th>GF</th>
				  <th>GS</th>
				  <th>DR</th>				  
				  <th>PTI</th>
				</tr>
			</thead>
			
			<tbody>
				
					<%
					
					Campionato c = new Campionato("Premier League");
					GestioneCampionato g = new GestioneCampionato();
					
					g.aggiungiSquadre(c);
					
					Squadra s = g.getSquadraMinDiffReti(c);
					
					%>	
						
						<tr>	
							
							<td><%=s.getNome()%></td>
							<td><%=s.getPartiteVinte() + s.getPartitePareggiate() + s.getPartitePerse()%></td>
							<td><%=s.getPartiteVinte()%></td>
							<td><%=s.getPartitePareggiate()%></td>
							<td><%=s.getPartitePerse()%></td>
							<td><%=s.getGoalFatti()%></td>
							<td><%=s.getGoalSubiti()%></td>
							<td><%=s.getDifferenzaReti()%></td>
							<td><%=s.getPunti()%></td>
							
						</tr>
										
			</tbody>
			
		</table>
		
	</div>
	
</body>

</html>