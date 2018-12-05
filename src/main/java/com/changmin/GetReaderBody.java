package com.changmin;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author:pcm5566
 * @Date:2018/12/5
 */
public class GetReaderBody extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        BufferedReader br = request.getReader();
        String input = "";
        String body = "";
        while ((input = br.readLine())!= null){
            body += input + "<br/>";
        }
        response.setContentType("Text/Html;charset = utf-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE HTML PUBLIC\"-//W3C//DTD HTML 4.01 Transitional//EN\">");
        out.println("<HTML>");
        out.println("<HEAD><TITLE>A servlet</TITLE><HEAD>");
        out.println("<body>");
        out.print(body);
        out.println("</body>");
        out.println("</HTML>");
        out.flush();
        out.close();
    }
}
