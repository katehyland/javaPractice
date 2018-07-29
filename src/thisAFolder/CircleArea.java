package thisAFolder;
import java.util.Scanner;

public class CircleArea {


	public static void main (String [ ] args) {
			
	Scanner in = new Scanner (System.in);

	System.out.println("Input Radius");
	int r = in.nextInt();
	
	float pi = 3.14159265359f;
	
	float area = pi * r * r; 
	
	System.out.println(area);
		}
	}
