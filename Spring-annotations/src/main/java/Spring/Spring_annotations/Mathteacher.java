package Spring.Spring_annotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Mathteacher implements Teacher{

	public void teach() {
		System.out.println("hi i am your math teacher");
		System.out.println("my name is virat");
	}

}
