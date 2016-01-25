package byy.com.api.action;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import byy.com.model.City;
import byy.com.service.CitysService;
import byy.com.util.CollectionToJson;


/***
 * 
 * @author byy
 *
 */
 
@Controller
@RequestMapping("api/")
public class CityApiAction  extends BaseAction {
	
	@Autowired
	private CitysService mCitysService;
	/***
	 * 城市详情
	 * @return
	 * @throws IOException 
	 */

	@SuppressWarnings("static-access")
	@RequestMapping("cityInfo")
	public void cityInfo(HttpServletRequest request,
			HttpServletResponse response,City city) throws IOException{
		    CollectionToJson json=new CollectionToJson();
		    String data=json.byObject(mCitysService.city_info(city));
		    write2client(response, data);
		   
	}
	
	/***
	 * 城市详情
	 * @return
	 * @throws IOException 
	 */

	@SuppressWarnings("static-access")
	@RequestMapping("cityList")
	public void cityList(HttpServletRequest request,
			HttpServletResponse response) throws IOException{
		    CollectionToJson json=new CollectionToJson();
		    String data=json.byList(mCitysService.city_list(),"cityList");
		    write2client(response, data);
	}
	
	
}
