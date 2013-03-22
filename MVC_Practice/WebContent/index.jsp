<?xml version="1.0" encoding="ISO-8859-1" ?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0">
	<jsp:directive.page contentType="text/html; charset=ISO-8859-1" 
		pageEncoding="ISO-8859-1" session="false"/>
	<jsp:output doctype-root-element="html"
		doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN"
		doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"
		omit-xml-declaration="true" />
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Model-View-Controller Practice</title>
</head>
<body>
<h1>Model-View-Controller Practice</h1>
<h3>Hello Servlet</h3>
<form method="get" action="Controller">
<p>Enter your name, please: 
<input type="text" name="userName"/>
<input type="submit" value="Go to Hello Servlet"/></p>
</form>
<h3>Reverso Page</h3>
<form method="get" action="Controller">
<p>You must visit the Hello Servlet and give your name before you go here.</p>
<p>Enter a string
<input type="text" name="originalString" /><br />
<input type="submit" value="See Reversed String"/></p>
</form>
</body>
</html>
</jsp:root>