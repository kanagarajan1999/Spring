package Spring.Spring_annotations;

import org.springframework.stereotype.Component;

@Component
public class Scienceteacher implements Teacher {

	public void teach(){
		System.out.println("hi i am your science teacher");
		System.out.println("my name is dhoni");
	}
}
