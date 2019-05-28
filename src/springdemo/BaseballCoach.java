package springdemo;

public class BaseballCoach implements Coach {
	
	//private field for the dependency
	
	private FortuneService fortuneService;
	
	
	//Constructor
	public BaseballCoach (FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkOut() {
		return "Something";
	}

	@Override
	public String getDailyFortune() { 
		
		//helper class
		return fortuneService.getFortune();
	}
}
