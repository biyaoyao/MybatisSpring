package byy.com.service;

import java.util.HashMap;
import java.util.List;

import byy.com.model.City;

public interface CitysService {

	public HashMap<String,Object> city_info(City city);

	public List<HashMap<String,Object>>  city_list();
}
