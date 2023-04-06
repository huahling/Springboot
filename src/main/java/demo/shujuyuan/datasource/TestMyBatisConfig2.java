//package demo.shujuyuan.datasource;
//
//import java.sql.SQLException;
//
//import javax.sql.DataSource;
//
//import com.mysql.cj.jdbc.MysqlXADataSource;
//import demo.shujuyuan.Jta.DBConfig2;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import com.atomikos.jdbc.AtomikosDataSourceBean;
//
//@Configuration
//// basePackages 最好分开配置 如果放在同一个文件夹可能会报错
//@MapperScan(basePackages = "demo.shujuyuan.Test2", sqlSessionTemplateRef = "test2SqlSessionTemplate")
//public class TestMyBatisConfig2 {
//
//	// 配置数据源
//	@Bean(name = "test2DataSource")
//	public DataSource testDataSource(DBConfig2 testConfig) throws SQLException {
//		MysqlXADataSource mysqlXaDataSource = new MysqlXADataSource();
//		mysqlXaDataSource.setUrl(testConfig.getJdbcUrl());
//
//		mysqlXaDataSource.setPassword(testConfig.getPassword());
//		mysqlXaDataSource.setUser(testConfig.getUsername());
//		mysqlXaDataSource.setPinGlobalTxToPhysicalConnection(true);
//
//		AtomikosDataSourceBean xaDataSource = new AtomikosDataSourceBean();
//		xaDataSource.setXaDataSource(mysqlXaDataSource);
//		xaDataSource.setUniqueResourceName("test2DataSource");
//
//
//		return xaDataSource;
//	}
//
//	@Bean(name = "test2SqlSessionFactory")
//	public SqlSessionFactory testSqlSessionFactory(@Qualifier("test2DataSource") DataSource dataSource)
//			throws Exception {
//		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//		bean.setDataSource(dataSource);
//		return bean.getObject();
//	}
//
//	@Bean(name = "test2SqlSessionTemplate")
//	public SqlSessionTemplate testSqlSessionTemplate(
//			@Qualifier("test2SqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
//		return new SqlSessionTemplate(sqlSessionFactory);
//	}
//}