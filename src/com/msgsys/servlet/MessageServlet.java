package com.msgsys.servlet;

import com.msgsys.entity.Message;
import com.msgsys.entity.User;
import com.msgsys.service.Impl.MessageServiceImpl;
import com.msgsys.service.MessageService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 作者：shizeming
 * 日期: 2020/11/26 20:24
 * 描述:
 */
@WebServlet("/message.do")
public class MessageServlet extends BaseServlet {
    MessageService messageService=null;

    public MessageServlet(){
        messageService=new MessageServiceImpl();
    }
@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    super.doPost(request,response);
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      super.doGet(request,response);
    }


    public void queryList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user=(User)request.getSession().getAttribute("user");
        System.out.println(user.getId());
        List<Message> messages =messageService.queryMessageByToUid(user.getId());
        request.setAttribute("messages",messages);
        System.out.println(messages);

        request.getRequestDispatcher("/list.jsp").forward(request,response);


    }

}
