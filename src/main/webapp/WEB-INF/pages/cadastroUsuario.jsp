
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

 
<%@include file="../includes/header.jsp" %> 
 
<div class="container">
	<h1>Cadastro do sistema</h1>
	
	<%@include file="../includes/menuMain.jsp" %> 
	
	<form name="frmUsuario" action="adicionaUsuario" method="POST">
		Nome: <input type="text" name="nome"  value="${usuario.nome}" /><br />
		<button name="brnEnviar">Enviar</button>

	</form>
</div>
</body>
</html>