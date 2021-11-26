package country.service.impl;

import country.service.Country;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {
	
	@Bean
	@Scope("singleton")
	public Country england() {
		England england = new England(){
			@Override
			public String greet() {
				return "welcome from config";
			}
		};
		
		return england;
	}
}
