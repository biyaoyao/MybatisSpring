package byy.com.serviceImp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import byy.com.dao.CityDao;
import byy.com.daoImp.CityDaoImp;
import byy.com.model.City;
import byy.com.service.CitysService;

@Service("CitysService")
public class CityServiceImp implements CitysService {
	@Autowired
	private CityDao mCityDao;

	@Override
	public HashMap<String, Object> city_info(City city) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		int id = city.getId();
		if (id == -1) {
			map.put("error", "参数出错？");
			return map;
		}
		map = mCityDao.city_info(city);
		return map;
	}

	@Override
	public List<HashMap<String, Object>> city_list() {
		// TODO Auto-generated method stub
		List<HashMap<String, Object>> list=new ArrayList<HashMap<String, Object>>();
		list = mCityDao.city_list();
		return list;
	}

}
