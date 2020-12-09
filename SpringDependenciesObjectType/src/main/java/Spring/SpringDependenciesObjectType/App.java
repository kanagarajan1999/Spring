package Spring.SpringDependenciesObjectType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ){
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    Student student = context.getBean("Stu",Student.class);
    student.cheating();
    AnotherStudent anotherstudent = context.getBean("AnotherStudent",AnotherStudent.class);
    anotherstudent.cheat();
    }
}
