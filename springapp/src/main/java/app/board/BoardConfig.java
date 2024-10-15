package app.board;

import javax.sql.DataSource;

import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

@Configuration
public class BoardConfig {
	public DataSource dataSource() {
		SimpleDriverDataSource ds
		= new SimpleDriverDataSource();
		
		ds.setDriver(null);
		ds.setUrl(null);
		
		
		return ds;
		
	}
		
}
