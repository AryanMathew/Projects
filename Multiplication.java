import java.util.Scanner;
public class Multiplication{
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);

		System.out.println("Welcome to the multiplication tutor!");
		System.out.print("\nWhat is your name?: ");
		String name=scanner.nextLine();
		System.out.println("\nLet's see how good you are at multiplication, "+name);
		System.out.println("\nType \"-1\" to exit and see your score");

		int answer=0;
		int right=0;
		int counter=0;
		while (answer!=-1){

			int a=(int)(Math.random()*10)+1;
			int b=(int)(Math.random()*10)+1;
			System.out.print("\nWhat is "+a+"*"+b+"?");
			answer=scanner.nextInt();

				if (answer==a*b){
					System.out.println("Correct!");
					right++;
				}

				else
					System.out.println("Incorrect, the answer was "+a*b);









			counter++;
		}

		counter--;
		System.out.println("\nLet's see "+name+" ,you got "+right+" over "+counter+" correct.");


	}
}