package Spring.Spring_annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main( String[] args ){
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);
    	College college = context.getBean("college",College.class);
    	college.test();
//    	context.registerShutdownHook();
    	context.close();
    }
}
