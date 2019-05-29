package springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	@Override
	public int[] getFortune() {
		Random rand = new Random();
		int[] aux = new int[3];
		for (int i = 0; i < aux.length; i++) {
			aux[i] = (rand.nextInt(900) + 1);
		}
		return aux;
		
	}

}
