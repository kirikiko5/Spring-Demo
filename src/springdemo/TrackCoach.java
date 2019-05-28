package springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach() {}
	
	//Declaramos el constructor con la dependencia
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "Run 5K";
	}

	@Override
	public String getDailyFortune() {
		return "Me cago en todo " + fortuneService.getFortune();
	}

}
