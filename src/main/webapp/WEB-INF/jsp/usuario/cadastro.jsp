<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container mt-3">
		<h2>Cadastramento de Usuário</h2>

		<form action="/usuario/incluir" method="post">
			<div class="mb-3 mt-3">
				<label>Nome:</label> <input type="text" class="form-control"
					placeholder="Entre com o nome" name="nome" value="">
			</div>

			<div class="mb-3 mt-3">
				<label>Email:</label> <input type="text" class="form-control"
					placeholder="Entre com o email" name="email" value="">
			</div>

			<div class="mb-3 mt-3">
				<label>Senha:</label> <input type="text" class="form-control"
					placeholder="Entre com a senha" name="senha" value="">
			</div>

			<div class="mb-3 mt-3">
				<label>Acesso:</label> <select class="form-control" name="acesso">
					<c:forEach var="r" items="${roles}">
						<option value="${r.id}">${r.nome}</option>
					</c:forEach>
				</select>
			</div>

			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>

	</div>

</body>
</html>