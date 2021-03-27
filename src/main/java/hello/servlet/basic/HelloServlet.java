package hello.servlet.basic;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

@WebServlet(name = "helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    // 해당 서블릿이 호출되면 서비스 메서드가 호출된다.
    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        System.out.println("HelloServlet.service");
        System.out.println("request = " + request);
        System.out.println("response = " + response);

        String username = request.getParameter("username");
        System.out.println("username = " + username);

        // http content-type (header)에 정보가 들어간다.
        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8");
        // http message body에 데이터가 들어간다.
        response.getWriter().write("hello " + username);

    }
}
