package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from the container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach baseCoach = context.getBean("baseCoach", Coach.class);
		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
		Coach cricketOne = context.getBean("cricketCoach", Coach.class);
		
		
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(baseCoach.getDailyWorkOut());
		System.out.println(tennisCoach.getDailyWorkOut());
		
		System.out.println(baseCoach.getDailyFortune());
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(cricketOne.getDailyFortune());
		//close the context
		context.close();
	}

}
