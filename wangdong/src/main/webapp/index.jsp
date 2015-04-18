<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8" %>
<%@ page import="java.io.*,java.security.CodeSource" %>
<html>
<body>
<h2>Hello World!</h2>
<%
String name=request.getParameter("classname");
PrintWriter printwriter=new PrintWriter(response.getWriter());
if(name==null || name.isEmpty())
{
 printwriter.write("name==null");
 
}else{
	
	Class<?> clazz=null;
	try{
	 clazz=Class.forName(name);	
	}catch(Exception e)
	{
	
	}
	if(clazz==null)
	{
		printwriter.println("name is not find");
	}else{
		CodeSource codesource=clazz.getProtectionDomain().getCodeSource();
		String location=codesource.getLocation().getPath();
		printwriter.println(name+"location:"+location);
	}
	
}
 printwriter.flush();
%>

</body>
</html>
