package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		//cargar el archivo de configuracion
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		//Recoger el bean del contenedor
		CricketCoach cricketCoach = context.getBean("cricketCoach", CricketCoach.class);
		
		System.out.println(cricketCoach.getDailyFortune());
		
		System.out.println(cricketCoach.getDailyWorkOut());
		
		System.out.println(cricketCoach.getTeam());
		System.out.println(cricketCoach.getEmailAddress());
		
		
		context.close();
	}

}
