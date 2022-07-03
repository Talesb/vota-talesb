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
		<h2>Cadastramento de Candidato</h2>

		<security:authorize access="hasRole('ADMIN')">
			<form action="/candidato" method="get">
				<button type="submit" class="btn btn-primary">Novo</button>
			</form>
			<hr>

		</security:authorize>

		<c:if test="${not empty lista}">
			<h2>Total de Candidatos: ${lista.size()}</h2>

			<table class="table table-striped">
				<thead>
					<tr>
						<th>Número</th>
						<th>Nome</th>
						<th>Eleição</th>
						<th>Votos</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="cand" items="${lista}">
						<tr>
							<td>${cand.numero}</td>
							<td>${cand.nome}</td>
							<td>${cand.eleicao}</td>
							<td>${cand.quantidadeDeVotos}</td>
							<security:authorize access="hasRole('ADMIN')">
								<td><a href="/candidato/${cand.id}/excluir">excluir</a></td>
							</security:authorize>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>

		<c:if test="${empty lista}">
			<h2>Não existem candidatos cadastrados!!!</h2>
		</c:if>

	</div>
</body>
</html>