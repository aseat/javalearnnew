package java18;

import java.io.*;
import javax.servlet.http.*;
import java.util.Date;
import java.util.*;

@WebServlet("/HelloServlet")
;public class HelloServlet extendsÅ@HttpServlet{

protected void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException{
Date date =new Date();
PrintWriter write=res.getWriter();
res.setContentType("text/html");
write.write("<html><body>");
write.write("Today is"+date.toString());
write.write("</body><>/html");
}
}
