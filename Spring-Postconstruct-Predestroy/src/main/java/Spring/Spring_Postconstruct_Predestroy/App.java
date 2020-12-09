package Spring.Spring_Postconstruct_Predestroy;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
public static void main( String[] args ) throws ClassNotFoundException, SQLException{
       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
       Colleges college = context.getBean("colleges",Colleges.class);
       college.selectallrows();
//       college.delete("'mcc'");
       context.close();
     
       
    }
}
