package com.changmin;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author:pcm5566
 * @Date:2018/12/5
 */
public class HelloServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public void init(){
        System.out.println("初始化init()方法");
    }
    protected void service(HttpServletRequest request, HttpServletResponse response){
        System.out.println("调用protected service方法");
    }
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException {
        System.out.println("调用doGet方法");
        response.setContentType("text/html;charset=GBK");
        PrintWriter out = response.getWriter();
        out.print("收到信息");
    }
    public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException {
        System.out.println("调用doPost方法");
        response.setContentType("text/html;charset=GBK");
        PrintWriter out = response.getWriter();
        out.print("收到信息");
    }
    public void destroy(){
        System.out.println("调用destroy方法");
    }
}
