package cn.wengsj.gpmsserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.wengsj.gpmsserver.dao.mapping")
public class GpmsServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GpmsServerApplication.class, args);
	}

}
