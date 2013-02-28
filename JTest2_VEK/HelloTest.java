import java.util.Random;
public class HelloTest{
	public static void main(String[] args) {
		System.out.println("Hello, Test!");
		Random r = new Random();
		System.out.println("Here is one pseudorandom number: "  
			+ r.nextInt());
		System.out.println("Here are another two: " + "\n" + r.nextInt()
			+ "\n" + r.nextInt());
		System.out.println("This line was added on GitHub.")
	}
}
