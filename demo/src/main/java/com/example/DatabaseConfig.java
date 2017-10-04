package com.example;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by jro on 03.10.2016.
 */
@Configuration
public class DatabaseConfig {


    @Bean
    @ConfigurationProperties(prefix = "datasource2")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }
}
