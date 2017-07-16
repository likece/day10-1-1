package com.lkc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BServlet extends HttpServlet {

	/**
	获取客户端的ip，请求方式，User-Agent
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String addr=request.getRemoteAddr();
		String method=request.getMethod();
		System.out.println("请求方式："+method);
		String UserAgent=request.getHeader("User-Agent");
		System.out.println(UserAgent);
		if(UserAgent.toLowerCase().contains("chrome")){
			System.out.println("您好，"+addr+",您使用的是谷歌");
		}else if(UserAgent.toLowerCase().contains("firefox")){
			System.out.println("您好，"+addr+",您使用的是火狐");
		}else if(UserAgent.toLowerCase().contains("msie")){
			System.out.println("您好，"+addr+",您使用的是IE");
		}
		
	}

}
