package BasicSkeletonProject.BasicSkeletonProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import BasicSkeletonProject.service.Impl.Car;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("Bean.xml");
         Car c= (Car)cxt.getBean("car");
         c.drive();
         
    }
}
