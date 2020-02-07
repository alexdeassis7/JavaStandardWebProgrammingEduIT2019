<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>JAVA SERVER PAGESGracais
<head>
<meta charset="ISO-8859-1">
<title>Soy un JSP</title>
</head>
<body>
<%String edad = (String) request.getParameter("edad");
String prefieres = (String) request.getParameter("preferencia");
out.print("tu nombre es " + request.getParameter("nombre") + "  " + request.getParameter("apellido"));
out.print("<br/>");
out.print("tienes " + edad + "años");
out.print("<br/>");
out.print("tu lenguaje favorito es " + request.getParameter("lenguaje"));
out.print("<br/>");
out.print("y prefieres el/la" + prefieres + "de un proyecto ");
out.print("<br/>");
out.print("Bienvenido a Educacion IT "+ request.getParameter("nombre").toString().toUpperCase());

out.print("request.getLocalAddr() :" + request.getLocalAddr());
out.print(" request.getRemoteHost() :" + request.getRemoteHost());
out.print("request.getContentType() :" + request.getContentType());
out.print("request.getContextPath() :" + request.getContextPath());

%>
</body>
</html>







