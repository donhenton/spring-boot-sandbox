package com.dhenton9000;

 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

//@EnableJpaRepositories(basePackages = "com.dhenton9000.repository")
//@EntityScan(basePackages = {"com.dhenton9000.domain"})
//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication 
public class MainApplication {

    
        @Bean
        public EmbeddedServletContainerCustomizer containerCustomizer()
        {
            return (container ->{
                ErrorPage custom404Page = new ErrorPage(HttpStatus.NOT_FOUND,"/404");
                container.addErrorPages(custom404Page);
                
            });
        }
        
         
	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}
}
