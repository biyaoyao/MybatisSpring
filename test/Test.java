import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import byy.com.model.City;

public class Test {
	private  static myInterface face;
	public static void main(String[] args) {
		 //mybatis的配置文件
		face=new interFaceTest();
        String resource = "conf.xml";
      //使用类加载器加载mybatis的配置文件（它也加载关联的映射文件）
        InputStream is = Test.class.getClassLoader().getResourceAsStream(resource);
      //构建sqlSession的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = sessionFactory.openSession();
        
        String statement = "byy.com.mapping.cityMapper.getCity";//映射sql的标识字符串
	    City city=session.selectOne(statement,1);
	    System.out.println(city.getDistrict());
	    face.inTerface();
	    
	}

}
