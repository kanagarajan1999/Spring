package spring.springioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
       Sim sim=context.getBean("sim",Sim.class);
       BeanFactory factory = new XmlBeanFactory(new FileSystemResource("beans1.xml"));
       Sim sim1=factory.getBean("sim",Sim.class);
       sim.calling();
       sim.data();
       sim1.calling();
       sim1.data();
    }
}
