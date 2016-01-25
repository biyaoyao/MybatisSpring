package byy.com.service;

import java.io.InputStream;

import org.springframework.beans.factory.annotation.Autowired;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * Service父类
 * 
 * @since 2015年7月6日 23:54:37
 * @author YangKang
 * 
 */
public class BaseService {

	@Autowired
	private  SqlSession session;
	 
	protected SqlSession getSession(){
		
		 String resource = "conf.xml";
	      //使用类加载器加载mybatis的配置文件（它也加载关联的映射文件）
	      InputStream is = BaseService.class.getClassLoader().getResourceAsStream(resource);
	      //构建sqlSession的工厂
	      SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
	       /* SqlSession session = sessionFactory.openSession();*/
	      return sessionFactory.openSession();
		 
	}
}
