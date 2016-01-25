package byy.com.api.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

/**
 * 所有action 的父类
 * @since 2015/08/19
 * @author 2i
 *
 */
public class BaseAction {

	/**
	 * 向客户端返回自字符串
	 * @param response
	 * @param value
	 */
	protected void write2client(HttpServletResponse response, String value) {
		response.setCharacterEncoding("UTF-8");
		PrintWriter out;
		try {
			out = response.getWriter();
			out.write(value);
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected ModelAndView getModelAndView() {
		ModelAndView  mav = new ModelAndView(); 
		return mav; 
	}
}
