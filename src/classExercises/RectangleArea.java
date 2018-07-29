package thisAFolder;
import java.util.Scanner;

public class RectangleArea {
	public static void main (String [ ] args) {
		
Scanner in = new Scanner (System.in);

System.out.println("Input Length");
int length = in.nextInt();
System.out.println("Input Width");
int width = in.nextInt();

int perimeter = 2*(length+width);

System.out.println("The perimeter is " + perimeter);

int area = length*width;

System.out.println("The area is " + area);
	}
}