
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Bem Vindo a tela de cadastro do sistema</title>
</head>
<body class="${usuario.nome}" id="${usuario.nome}">
	<h1>Cadastro do sistema</h1>
	<form name="frmUsuario" action="adicionaUsuario" method="POST">
		Nome: <input type="text" name="nome"  value="${usuario.nome}" /><br />
		<button name="brnEnviar">Enviar</button>

	</form>
</body>
</html>