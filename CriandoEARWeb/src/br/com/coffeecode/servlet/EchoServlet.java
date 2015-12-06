package br.com.coffeecode.servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.coffeecode.ejb.TesteEjbLocal;

/**
 * Servlet implementation class EchoServlet
 */
@WebServlet("/echo")
public class EchoServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
       
    @EJB
    private TesteEjbLocal testeEjb;
 
    /**
     * 
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String text = req.getParameter("text");
        String newText = testeEjb.addPipe(text);
        resp.getWriter().print(newText);
    }
}
