import java.io.*;
import java.util.*;
import javax.servlet.*;
public class server extends GenericServlet
{
public void service(ServletRequest req,ServletResponse res)throws 
ServletException,IOException
{
 PrintWriter pw=res.getWriter();
 pw.print("<h2>Logged in Successfully...</h2>");
 pw.print("<h3><u>Login Details</u></h3>");
 Enumeration e=req.getParameterNames();
 while(e.hasMoreElements())
 {
 String str1=(String)e.nextElement();
 String str2=req.getParameter(str1);
 pw.print(str1+"="+str2+"<br/>");
 }
 pw.close();
}}