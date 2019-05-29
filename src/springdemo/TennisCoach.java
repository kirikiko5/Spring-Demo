package springdemo;

public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkOut() {
		return "Let's do some practice!!!";
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
	
	public void tennisStart() {
		System.out.println("Coach Start");
	}
	
	public void tennisDestroy() {
		System.out.println("Tennis Destroy");
	}
}
