<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp"/>
 
	  <div class="container mt-3">
		  <h2>Cadastramento de Voto</h2>
		 
	
		  <form action="/voto/incluir" method="post">
		  
		  
		  <c:if test="${not empty eleitores}">
		  	<label>Eleitor:</label>
		  	<select class="form-control"  name="eleitor.id">
		    	<c:forEach var="e" items="${eleitores}">
		    	<option value="${e.id}">${e.nome}</option>
		    	</c:forEach>
		  	</select>
		  	</c:if>
		  
			<c:if test="${empty solicitantes}">
				<c:set var="botao" value="disabled"/>
		  		<label>Não existem solicitantes cadastrados!!!</label>
		  	</c:if>
		  
		    <div class="mb-3 mt-3">
		      <label>Localização:</label>
		      <input type="text" class="form-control" placeholder="Entre com a localização" name="localizacao" value="localizacao">
		    </div>
	
		    <button type="submit" class="btn btn-primary">Cadastrar</button>
		  </form>
		</div>
	 
 
</body>
</html>