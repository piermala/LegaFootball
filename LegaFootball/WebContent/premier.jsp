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
	
		<h3 id="title">Classifica Premier League 2001-2002</h3>
		
		<a href="premierMin.jsp" class="btn btn-success" id="btn" role="button">Squadra con minor differenza reti</a>
		<hr>
		
		<table class="table" id="premierTable">
			
			<thead>
				<tr>
				  <th>#</th>
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
					
					List<Squadra> squadre = c.getSquadre();
					
					for (int i=0; i < squadre.size(); i++){
					
					%>	
						
						<tr>	
							
							<td><%=i + 1%></td>
							<td><%=squadre.get(i).getNome()%></td>
							<td><%=squadre.get(i).getPartiteVinte() + squadre.get(i).getPartitePareggiate() + squadre.get(i).getPartitePerse()%></td>
							<td><%=squadre.get(i).getPartiteVinte()%></td>
							<td><%=squadre.get(i).getPartitePareggiate()%></td>
							<td><%=squadre.get(i).getPartitePerse()%></td>
							<td><%=squadre.get(i).getGoalFatti()%></td>
							<td><%=squadre.get(i).getGoalSubiti()%></td>
							<td><%=squadre.get(i).getDifferenzaReti()%></td>
							<td><%=squadre.get(i).getPunti()%></td>
							
						</tr>
						
					<%
					
					}
					
					%>
				
			</tbody>
			
		</table>
		
	</div>
	
</body>

</html>