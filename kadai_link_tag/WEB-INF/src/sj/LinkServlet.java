package sj;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LinkServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		
		  // リクエストのエンコード設定
        request.setCharacterEncoding("UTF-8");

        // JSPからのリクエストデータ取得
        String userName = request.getParameter("name");

		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		request.setAttribute("text", "Servletからデータを受信しました"+ userName + "さん、こんにちは！");
		RequestDispatcher dispatchere = request.getRequestDispatcher("/index.jsp?");
		dispatchere.forward(request, response);
	}
}
