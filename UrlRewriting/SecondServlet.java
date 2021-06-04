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
  
public class SecondServlet extends HttpServlet {  
  
public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
        try{  
  
        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
          
        //getting value from the query string  
        String n=request.getParameter("uname");  
        out.print("Hello This is a Url rewriting program "+n);  
  
        out.close();  
  
                }catch (Exception e)
                {System.out.println(e);}  
    }  
      
  
} 
