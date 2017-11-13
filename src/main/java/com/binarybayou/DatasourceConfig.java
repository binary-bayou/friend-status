package com.binarybayou;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
//import org.springframework.jdbc.datasource.*;

import javax.sql.DataSource;

/**
 * Created by joshuaeaton on 8/21/17.
 */
@Profile("cloud")
@Configuration
public class DatasourceConfig {

        @Value("${spring.datasource.url}")
        private String url;
        @Value("${spring.datasource.password}")
        private String username;
        @Value("${spring.datasource.password}")
        private String password;

        @Bean
        public DataSource getDataSource() {

            String driverClassName = "org.postgresql.Driver";

            /*Create the datasource and return it*/
            return DataSourceBuilder
                    .create()
                    .url( url )
                    .username( username )
                    .password( password )
                    .driverClassName( driverClassName )
                    .build();
        }
}
