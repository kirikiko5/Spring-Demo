package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		//load configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanlifeCycle-applicationContext.xml");

		
		//retrieve bean from spring container
		Coach myCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		boolean result = (myCoach == alphaCoach);
		
		System.out.println(result + "\n");
		
		System.out.println(myCoach + "\n");
		
		System.out.println(alphaCoach + "\n");
		
		//close de context
		context.close();
 	}

}
