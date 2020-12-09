package Spring.Spring_annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {
	@Value("${Name.name}")
	private String name;
	
	
//	public void setPrincipal(Principal principal) {
//		this.principal = principal;
//	}
//
//	public void setTeacher(Teacher teacher) {
//		this.teacher = teacher;
//	}
     
//     @Required
//	public void setName(String name) {
//		this.name = name;
//	}

	@Autowired
	private Principal principal;
	@Autowired
	@Qualifier("scienceteacher")
	private Teacher teacher;

	//constructor injection
//	public College(Principal principal) {
//		this.principal = principal;
//	}

/*	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}*/

	public void test(){
		teacher.teach();
		principal.principalinfo();
		System.out.println("testing this call method"+name);
	}
}
