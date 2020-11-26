package com.msgsys.servlet;

import com.msgsys.entity.User;
import com.msgsys.service.Impl.UserServiceImpl;
import com.msgsys.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import static com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY;

/**
 * 作者：shizeming
 * 日期: 2020/11/26 18:03
 * 描述:
 */
@WebServlet( "/user.do")
public class UserServlet extends BaseServlet {
    UserService userService=new UserServiceImpl();
    protected void  doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doGet(request,response);
    }
    //注册
     public void register(HttpServletRequest request, HttpServletResponse response){
          String uname=request.getParameter("uname");
          String upass=request.getParameter("upass");
          String email=request.getParameter("email");
         User user=new User(uname,upass,email);
         int result=userService.register(user);
         System.out.println(result);
     }
     //登入
     public void login(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
         String uname=request.getParameter("uname");
         String upass=request.getParameter("upass");
         System.out.println(uname+upass);
         User user=userService.login(new User(uname,upass,null));
         response.setContentType("text/html;charset=utf-8");
         request.setCharacterEncoding("utf-8");
         //获取验证码
         String token=(String) request.getSession().getAttribute(KAPTCHA_SESSION_KEY);
         System.out.println("谷歌生成的验证码："+token);
         String code=  request.getParameter("code");

         if (token!=null&&token.equalsIgnoreCase(code)){
             if (user!=null){
                 HttpSession session=request.getSession();
                 session.setAttribute("user",user);
                 request.getRequestDispatcher("/message.do?action=queryList").forward(request,response);
             }
         }

        else {
             response.getWriter().print("验证码输入错误");
             response.sendRedirect(request.getContextPath()+"/login.jsp");
         }
     }
}
