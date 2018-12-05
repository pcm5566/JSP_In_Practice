package com.changmin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author:pcm5566
 * @Date:2018/12/5
 */
public class InputPorductController implements Controller {

    public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
        // TODO Auto-generated method stub
        return "/WEB-INF/jsp/ProductForm.jsp";
    }

}