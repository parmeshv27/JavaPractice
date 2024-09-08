package lessimp;

import java.util.Random;

public class RandomNum {
	
	public static void main(String[] args) {
		
      Random random=new Random();

		String st=String.format("%05d", random.nextInt(4000));
		System.out.println(st);
	}

}
