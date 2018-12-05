package com.changmin.controller;

import com.changmin.domain.Product;
import com.changmin.form.ProductForm;
import com.changmin.validator.ProductValidator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @Author:pcm5566
 * @Date:2018/12/5
 */
public class SaveProductController implements Controller {

    public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
        ProductForm productForm = new ProductForm();
        productForm.setName(request.getParameter("name"));
        productForm.setDescription(
                request.getParameter("description"));
        productForm.setPrice(request.getParameter("price"));

        ProductValidator productValidator = new ProductValidator();
        List<String> errors = productValidator.validate(productForm);
        if(errors.isEmpty()){
            // create model
            Product product = new Product();
            product.setName(productForm.getName());
            product.setDescription(productForm.getDescription());
            try {
                product.setPrice(Float.parseFloat(
                        productForm.getPrice()));
            } catch (NumberFormatException e) {
            }
            // code to save product

            // store model in a scope variable for the view
            request.setAttribute("product", product);

            return "/WEB-INF/jsp/ProductDetails.jsp";
        }else{
            request.setAttribute("errors", errors);
            request.setAttribute("form", productForm);
            return "/WEB-INF/jsp/ProductForm.jsp";
        }
    }

}