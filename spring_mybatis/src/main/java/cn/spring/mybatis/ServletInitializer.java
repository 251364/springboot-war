
package cn.spring.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
//import org.springframework.boot.web.support.SpringBootServletInitializer;

@MapperScan(value = "cn.spring.mybatis.mapper")

@SpringBootApplication
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ServletInitializer.class);
	}

	static Logger logger = LoggerFactory.getLogger(ServletInitializer.class);

	public static void main(String[] args) {
		SpringApplication.run(ServletInitializer.class, args);
		logger.info("日志文件能启动成功吗 !");
	}
}

// jar包：执行SpringBoot主类的main方法，启动ioc容器，创建嵌入式的Servlet容器；
// war包：启动服务器，服务器启动SpringBoot应用【SpringBootServletInitializer】，启动ioc容器；
