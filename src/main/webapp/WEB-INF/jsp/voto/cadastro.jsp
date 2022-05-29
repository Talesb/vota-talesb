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
		<h2>Cadastramento de Voto</h2>


		<c:if test="${eleicaoSelecionada == null}">

			<form action="/voto/selecionareleicao" method="post">

				<c:if test="${not empty eleicoes}">
					<label>Eleição:</label>
					<select class="form-control" name="eleicao.id">
						<c:forEach var="e" items="${eleicoes}">
							<option value="${e.id}">${e.descricao}</option>
						</c:forEach>
					</select>
				</c:if>

				<br>

				<button type="submit" class="btn btn-primary">Selecionar
					Eleição para voto</button>

			</form>

		</c:if>


		<c:if test="${eleicaoSelecionada != null && not empty candidatos}">

			<form action="/voto/incluir" method="post">




				<!-- 		  	Eleicao -->

				<select class="form-control" name="eleicao.id">
					<option value="${eleicaoSelecionada.id}">${eleicaoSelecionada.descricao}</option>
				</select>

				<!-- 		  	Eleitores -->

				<c:if test="${not empty eleitores}">
					<label>Eleitor:</label>
					<select class="form-control" name="eleitor.id">
						<c:forEach var="e" items="${eleitores}">
							<option value="${e.id}">${e.nome}</option>
						</c:forEach>
					</select>
				</c:if>

				<c:if test="${empty eleitores}">
					<c:set var="botao" value="disabled" />
					<label>Não existem Eleitores cadastrados!!!</label>
				</c:if>

				<!-- 		  	Candidato -->

				<c:if test="${not empty candidatos}">
					<label>Candidato:</label>
					<select class="form-control" name="candidato.id">
						<c:forEach var="c" items="${candidatos}">
							<option value="${c.id}">${c.nome}</option>
						</c:forEach>
					</select>
				</c:if>

				<c:if test="${empty candidatos}">
					<c:set var="botao" value="disabled" />
					<label>Não existem Candidatos cadastrados!!!</label>
				</c:if>

				<div class="mb-3 mt-3">
					<label>Localização:</label> <input type="text" class="form-control"
						placeholder="Entre com a localização" name="localizacao"
						value="localizacao">
				</div>

				<button type="submit" class="btn btn-primary">Cadastrar</button>


			</form>

		</c:if>

		<c:if test="${eleicaoSelecionada != null &&  empty candidatos}">
			<label>Não existem Candidatos cadastrados, Selecione outra
				eleição!!!</label>
		</c:if>



	</div>


</body>
</html>