<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>


<html>
<head>

<title>HOLA FORMULARIOS</title>



</head>
<body>

	<%
		/*podemos leer los datos del request a una variable*/
		String edad = (String) request.getParameter("edad");
		String prefieres = (String) request.getParameter("preferencia");
		out.print("tu nombre es " + request.getParameter("nombre") + " " + request.getParameter("apellido"));
		out.print("<br/>");
		out.print("tienes " + edad + " a�os");
		out.print("<br/>");
		out.print("tu lenguaje favorito es " + request.getParameter("lenguaje"));
		out.print("<br/>");
		out.print("y prefieres el(a) " + prefieres + " de un proyecto");
		out.print("<br/>");
		/*podemos usar los datos directamente desde el request*/
		out.print("Bienvenido a jsp " + request.getParameter("nombre").toString().toUpperCase());
	%>

</body>
</html>