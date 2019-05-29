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
		int[] numero = fortuneService.getFortune();;
		String aux = "";
		for (int i = 0; i < numero.length; i++) {
			aux = aux + ", " + Integer.toString(numero[i]);
		}
		return aux;
	}
}
