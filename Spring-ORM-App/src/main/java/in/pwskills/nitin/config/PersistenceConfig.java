package in.pwskills.nitin.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;




@Configuration
@EnableTransactionManagement
public class PersistenceConfig {
	@Bean
	public DataSource dataSource() {
		 DriverManagerDataSource ds = new DriverManagerDataSource();
		    ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		    ds.setUrl("jdbc:mysql://localhost:3306/ayush");
		    ds.setUsername("root");
		    ds.setPassword("root");
		    return ds;
	}
	
	@Bean
	public LocalSessionFactoryBean sessionFactory(DataSource datasource) {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(datasource);
		 
		//replace with you entity package
		sessionFactory.setPackagesToScan("in.pwskills.nitin.beans");
		
		//set hibernate properties
		sessionFactory.setHibernateProperties(hibernateproperties());
		return sessionFactory;
		
	}

	private Properties hibernateproperties() {
		Properties properties = new Properties();
		properties.setProperty("hibernate.show_sql", "true");
		properties.setProperty("hibernate.format_sql", "true");
		properties.setProperty("hibernate.hbm2ddl.auto", "update");
		
		return properties;
	}
	
	@Bean
	public HibernateTemplate hibernateTemplate(SessionFactory sessionFactory) {
		return new HibernateTemplate(sessionFactory);
	}
	
	@Bean
	public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(sessionFactory);
		return txManager;
	}
	
}
