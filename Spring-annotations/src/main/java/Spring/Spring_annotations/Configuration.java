package Spring.Spring_annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
 

@org.springframework.context.annotation.Configuration
@ComponentScan(basePackages="Spring.Spring_annotations")
@PropertySource("classpath:prop")
public class Configuration {
	
	
//	@Bean
//	public Teacher teacher(){
//		Teacher teacher = new Scienceteacher();
//		return teacher;
//	}
//
//	@Bean
//	public Principal principal(){
//		Principal principal = new Principal();
//		return principal;
//	}
//	
//   @Bean
//	public College college(){
//		College college = new College();
//		college.setPrincipal(principal());
//		college.setTeacher(teacher());
//		return college;
//   }   
}
