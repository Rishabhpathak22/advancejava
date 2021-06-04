/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  

/**
 *
 * @author Rishabh Pathak
 */ 
public class FirstServlet extends HttpServlet {  
  
public void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException{  
        try{  
  
        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
          
        String n=request.getParameter("userName");  
        out.print("Welcome "+n);  
          
        HttpSession session=request.getSession();  
        session.setAttribute("uname",n);  
  
        out.print("<a href='SecondServlet'>visit</a>");  
                  
        out.close();  
  
                }catch(Exception e){System.out.println(e);}  
    }  
  
}  
