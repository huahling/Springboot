//package demo.shujuyuan.datasource;
//
//import java.sql.SQLException;
//
//import javax.sql.DataSource;
//
//import com.mysql.cj.jdbc.MysqlXADataSource;
//import demo.shujuyuan.Jta.DBConfig1;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import com.atomikos.jdbc.AtomikosDataSourceBean;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//
//@Configuration
//// basePackages 最好分开配置 如果放在同一个文件夹可能会报错
//@MapperScan(basePackages = "demo.shujuyuan.Test1", sqlSessionTemplateRef = "testSqlSessionTemplate")
//public class TestMyBatisConfig1 {
//
//	// 配置数据源
//	@Primary
//	@Bean(name = "testDataSource")
//	public DataSource testDataSource(DBConfig1 testConfig) throws SQLException {
//		MysqlXADataSource mysqlXaDataSource = new MysqlXADataSource();
//		mysqlXaDataSource.setUrl(testConfig.getJdbcUrl());
//		mysqlXaDataSource.setPassword(testConfig.getPassword());
//		mysqlXaDataSource.setUser(testConfig.getUsername());
//		mysqlXaDataSource.setPinGlobalTxToPhysicalConnection(true);
//
//		AtomikosDataSourceBean xaDataSource = new AtomikosDataSourceBean();
//		xaDataSource.setXaDataSource(mysqlXaDataSource);
//		xaDataSource.setUniqueResourceName("testDataSource");
//
//
//		return xaDataSource;
//	}
//
//	@Bean(name = "testSqlSessionFactory")
//	public SqlSessionFactory testSqlSessionFactory(@Qualifier("testDataSource") DataSource dataSource)
//			throws Exception {
//
//		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
////		bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:/qr/hei/TeacherMapper.xml"));
//		bean.setDataSource(dataSource);
//		return bean.getObject();
//	}
//
//	@Bean(name = "testSqlSessionTemplate")
//	public SqlSessionTemplate testSqlSessionTemplate(
//			@Qualifier("testSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
//		return new SqlSessionTemplate(sqlSessionFactory);
//	}
//}