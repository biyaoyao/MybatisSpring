package byy.com.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import byy.com.model.City;

public interface CityDao {

	HashMap<String, Object> city_info(City city);

	List<HashMap<String, Object>> city_list();

}
