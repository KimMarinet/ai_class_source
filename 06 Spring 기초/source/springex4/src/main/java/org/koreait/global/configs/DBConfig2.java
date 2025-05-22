package org.koreait.global.configs;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Profile("prod")
@Configuration
@EnableTransactionManagement
@EnableJdbcRepositories("org.koreait")
public class DBConfig2 {
    @Bean(destroyMethod = "close")
    public DataSource dataSource() {
        System.out.println("dev-dataSource()");
        DataSource ds = new DataSource();
        // 연결 설정
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/study2");
        ds.setUsername("study2");
        ds.setPassword("1234");

        // 커넥션 풀 설정
        ds.setInitialSize(2);
        ds.setMaxActive(10);
        ds.setTestWhileIdle(true);


        return ds;
    }
}
