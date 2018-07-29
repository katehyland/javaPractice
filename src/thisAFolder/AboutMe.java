package thisAFolder;

import java.util.Scanner;

public class AboutMe {
	public static void main (String [ ] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your astrological sign");
		String horoscope =sc.next();
		System.out.println("Enter your favorite programming language");
		String language = sc.next();
		System.out.println("Enter your eye color");
		String eyeColor= sc.next();
		System.out.println("horoscope:"+horoscope+" language:"+language+" eyeColor:"+eyeColor);
		sc.close();
	}
}
