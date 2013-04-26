package MyVariables;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: soofis
 * Date: 4/25/13
 * Time: 3:54 PM
 * To change this template use File | Settings | File Templates.
 */
@Component
public class HelloWorld {
    @Autowired
    private BuilderClass bc;

    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        HelloWorld hw = applicationContext.getBean(HelloWorld.class);
        hw.print();
    }

    public void print()
    {
        System.out.println(bc.getS());
    }
}
