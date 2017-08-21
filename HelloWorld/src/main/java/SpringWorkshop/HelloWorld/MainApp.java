package SpringWorkshop.HelloWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String args[]){
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		App app = (App) context.getBean("helloWorld");
		System.out.println(app.getMessage());
	}

}
