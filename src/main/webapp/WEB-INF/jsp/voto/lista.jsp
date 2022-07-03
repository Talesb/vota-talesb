<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="security"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AppMIT</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container mt-3">
		<h2>Cadastramento de Votos</h2>

		<security:authorize access="hasRole('ADMIN')">

			<form action="/voto" method="get">
				<div class="form-group">
					<label>Elei��es:</label> <select class="form-control"
						name="idEleicao">
						<c:forEach var="e" items="${eleicoes}">
							<option value="${e.id}">${e.descricao}</option>
						</c:forEach>
					</select>
				</div>
				<button type="submit" class="btn btn-primary">Novo</button>
			</form>

			<hr>

		</security:authorize>

		<c:if test="${not empty lista}">
			<h2>Total de Votos: ${lista.size()}</h2>

			<table class="table table-striped">
				<thead>
					<tr>
						<th>ID</th>
						<th>Localiza��o</th>
						<th>Eleitor</th>
						<th>Elei��o</th>
						<th>Candidato</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="s" items="${lista}">
						<tr>
							<td>${s.id}</td>
							<td>${s.localizacao}</td>
							<td>${s.nomeEleitor}</td>
							<td>${s.descricaoEleicao}</td>
							<td>${s.nomeCandidato}</td>

							<security:authorize access="hasRole('ADMIN')">

								<td><a href="/voto/${s.id}/excluir">excluir</a></td>

							</security:authorize>

						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>

		<c:if test="${empty lista}">
			<h2>N�o existem votos cadastrados!!!</h2>
		</c:if>

	</div>
</body>
</html>