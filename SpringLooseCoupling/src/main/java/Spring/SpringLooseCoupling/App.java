package Spring.SpringLooseCoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args )   {
    	 ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	 Student Stu = context.getBean("Stu",Student.class);
    	 Stu.cheating();
    }
}
