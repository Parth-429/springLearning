package springJDBCLearning.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"springJDBCLearning.studentDao"})
public class JdbcConfig {
    @Bean(name = {"dataSource"})
    public DataSource getDataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/Univercity");
        dataSource.setUsername("root");
        dataSource.setPassword("qwertyuiop");
        System.out.println(dataSource);
        return dataSource;
    }
    @Bean(name = {"jdbcTemplate"})
    public JdbcTemplate getJDBCTemplate(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(getDataSource());
        System.out.println(jdbcTemplate);
        return jdbcTemplate;
    }
}
