package com.msgsys.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 作者：shizeming
 * 日期: 2020/11/26 17:52
 * 描述:
 */

public class BaseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        doGet(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action=request.getParameter("action");
        try {
            Method method=  this.getClass().getDeclaredMethod(action,HttpServletRequest.class, HttpServletResponse.class);
            System.out.println("method= "+method);

            method.invoke(this,request,response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
