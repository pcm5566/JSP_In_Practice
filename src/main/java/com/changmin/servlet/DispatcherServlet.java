package com.changmin.servlet;

import com.changmin.controller.InputPorductController;
import com.changmin.controller.SaveProductController;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author:pcm5566
 * @Date:2018/12/5
 */
public class DispatcherServlet extends HttpServlet {

    private static final long serialVersionUID = 1579L;

    @Override
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws IOException, ServletException {
        process(request, response);
    }

    @Override
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
            throws IOException, ServletException {
        process(request, response);
    }

    private void process(HttpServletRequest request,
                         HttpServletResponse response)
            throws IOException, ServletException {

        String uri = request.getRequestURI();
        /*
         * uri is in this form: /contextName/resourceName,
         * for example: /app10a/product_input.
         * However, in the event of a default context, the
         * context name is empty, and uri has this form
         * /resourceName, e.g.: /product_input
         */
        int lastIndex = uri.lastIndexOf("/");
        String action = uri.substring(lastIndex + 1);

        // forward to a view
        String dispatchUrl = null;
        if (action.equals("product_input.action")) {
            InputPorductController controller = new InputPorductController();
            dispatchUrl = controller.handleRequest(request, response);
        } else if (action.equals("product_save.action")) {
            SaveProductController controller = new SaveProductController();
            dispatchUrl = controller.handleRequest(request, response);
        }
        if (dispatchUrl != null) {
            RequestDispatcher rd =
                    request.getRequestDispatcher(dispatchUrl);
            rd.forward(request, response);
        }
    }
}
