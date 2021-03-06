package br.com.calc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.calc.enums.OperacoesEnum;

/**
 * Servlet implementation class Calc
 */
@WebServlet("/Calc")
public class Calc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String valor1 = request.getParameter("valor1");
		String valor2 = request.getParameter("valor2");
		String operacao = request.getParameter("operacao");
		
		double valorHum = Double.parseDouble(valor1 != "" ? valor1 : "0");
		double valorDois = Double.parseDouble(valor2 != "" ? valor2 : "0");
		Integer ope = Integer.parseInt(operacao);
		
		double resultadoCalculo = calcular(ope, valorHum, valorDois);
		
		out.print("Resultado:<br>" + resultadoCalculo);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	protected double calcular(Integer operacao, double valor1, double valor2) {
		double resultado = 0d;
		if(operacao.equals(OperacoesEnum.SOMA.getCodigoOperacao())) {
			resultado = valor1 + valor2;
		}else if(operacao.equals(OperacoesEnum.SUBTRACAO.getCodigoOperacao())) {
			resultado = valor1 + valor2;
		}else if(operacao.equals(OperacoesEnum.MULTIPLICACAO.getCodigoOperacao())) {
			resultado = valor1 * valor2;
		}else {
			resultado = valor1 / valor2;
		}
		
		return resultado;
		
	}

}
