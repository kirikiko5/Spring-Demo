package springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	//nuevos campos
	private String emailAddress;
	private String team;
	
	public CricketCoach() {
		System.out.println("Dentro del constructor sin argumentos");
	}
	
	//Metodos setterEmail
	public void setEmailAddress (String emailAddress) {
		System.out.println("Dentro del setter de email");
		this.emailAddress = emailAddress;
	}

	//metodo getEmail
	public String getEmailAddress() {
		return emailAddress;
	}
	
	//Metodo setterTeam
	public void setTeam(String team) {
		System.out.println("Dentro del setter de Team");
		this.team = team;
	}
	
	//Metodo getTeam
	public String getTeam() {
		return team;
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Dentro del setter de Fortuna");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkOut() {
		return "Go to hell";
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
