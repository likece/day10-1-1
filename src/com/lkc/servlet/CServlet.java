package com.lkc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CServlet extends HttpServlet {

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//获取参数
		String s1=request.getParameter("num1");
		String s2=request.getParameter("num2");
		//转换成int类型
		int num1=Integer.parseInt(s1);
		int num2=Integer.parseInt(s2);
		//加运算
		int sum=num1+num2;
		//将结果保存到request域中
		request.setAttribute("result", sum);
		//转发到result.jsp路径下
		request.getRequestDispatcher("/jia/result.jsp").forward(request, response);

	}

}
