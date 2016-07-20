package com.sanny.conf;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by sanny on 20.07.16.
 */
@Configuration
@Import(DataBaseConfig.class)
@EnableWebMvc
@ComponentScan("com.sanny.rest")
public class WebAppConfig {

}
