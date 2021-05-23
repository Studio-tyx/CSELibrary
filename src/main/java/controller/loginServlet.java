package controller;

import com.alibaba.fastjson.JSON;
import entity.User;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

@WebServlet("/login")
public class loginServlet extends HttpServlet {
    private UserService userService = new UserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        /* 设置响应头允许ajax跨域访问 */
        resp.setHeader("Access-Control-Allow-Origin", "*");

        /* 星号表示所有的异域请求都可以接受， */
        resp.setHeader("Access-Control-Allow-Methods", "GET,POST");

        //获取微信小程序get的参数值并打印
        String userid = req.getParameter("user_id");
        String password = req.getParameter("password");
//        System.out.println("userid = " + userid + " password = " + password);
        User user = userService.login(userid, password);

        // 将对象转为 JSON 字符串
        String jsonString = JSON.toJSONString(user);
//        System.out.println("jsonString = " + jsonString);

        // 返回 JSON 字符串给小程序端
        Writer out = resp.getWriter();
        out.write(jsonString);
        out.flush();    // 清空缓冲区的数据流
        out.close();    // 关闭流
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       doGet(req, resp);
    }
}
