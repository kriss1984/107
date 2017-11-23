package cn.kriss.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DataServlet extends HttpServlet{

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        doPost(request,response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        String name  = request.getParameter("name");
        String phone  = request.getParameter("phone");
        String what  = request.getParameter("what");
        String hope  = request.getParameter("hope");
        String others  = request.getParameter("others");
        System.out.println("name:"+name);
        System.out.println("phone:"+phone);
        System.out.println("what:"+what);
        System.out.println("hope:"+hope);
        System.out.println("others:"+others);
        String json  = "{\"name\":\""+name+"\",\"phone\":\""+phone+"\",\"what\":\""+what+"\",\"hope\":\""+hope+"\",\"others\":\""+others+"\"}";

        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(json);
    }
}
