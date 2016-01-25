package byy.com.daoImp;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import byy.com.dao.CityDao;
import byy.com.model.City;
@Repository("CityDao")
public class CityDaoImp extends BaseDaoImp implements CityDao {

	@Override
	/**
	 * 根据id获取城市详情
	 */
	public HashMap<String, Object> city_info(City city) {
		 String statement = "byy.com.mapping.cityMapper.getCity";//映射sql的标识字符串
		    HashMap<String, Object> map=getSession().selectOne(statement,city.getId());
	        
	       
		    if(map==null){
		    	map=new  HashMap<String, Object>();
		    	 map.put("error", "找不到相关数据");
		    	 System.out.println(map==null);
		    	 
		    }else{
		    }
		    return map;
	}

	@Override
	/**
	 * 城市列表
	 */
	public List<HashMap<String, Object>> city_list() {
		
        String statement = "byy.com.mapping.cityMapper.getCityList";//映射sql的标识字符串
        List<HashMap<String, Object>>  cityList=getSession().selectList(statement);
		return cityList;
	}

}
