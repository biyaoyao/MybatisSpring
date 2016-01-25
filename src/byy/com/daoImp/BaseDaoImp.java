package byy.com.daoImp;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import byy.com.page.action.CityPageAction;

public class BaseDaoImp {
	/**
	 * 数据库封装
	 * @return SqlSession
	 */
     public SqlSession getSession() {
    	    String resource = "conf.xml";
	      //使用类加载器加载mybatis的配置文件（它也加载关联的映射文件）
	        InputStream is = CityPageAction.class.getClassLoader().getResourceAsStream(resource);
	      //构建sqlSession的工厂
	        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
			return sessionFactory.openSession(); 
     }
}
