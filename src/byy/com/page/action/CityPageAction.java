package byy.com.page.action;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import byy.com.model.City;
import byy.com.service.CitysService;


/***
 * 
 * @author byy
 *
 */
 
@Controller
@RequestMapping("page/")
public class CityPageAction  {
	
	@Autowired
	private CitysService mCitysService;
	/***
	 * 城市详情
	 * @return
	 */

	@RequestMapping("cityInfo")
	public ModelAndView cityInfo(HttpServletRequest request,
			HttpServletResponse response,City city){
		    ModelAndView mav = new ModelAndView("cityInfo");
		    mav.addObject("cityInfo",  mCitysService.city_info(city));
		return mav; 
	}
	
	/***
	 * 城市详情
	 * @return
	 */

	@RequestMapping("cityList")
	public ModelAndView cityList(HttpServletRequest request,
			HttpServletResponse response){
		    ModelAndView mav = new ModelAndView("cityList");
		    mav.addObject("cityList",  mCitysService.city_list());
		return mav; 
	}
	
	
}
