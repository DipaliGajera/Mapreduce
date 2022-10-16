import java.util.Scanner;

public class GenerateRandomNumbers
{
	private static double r=0f;
	public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a radious:");
		r = sc.nextDouble();
		System.out.println("Enter a total index pair of (x,y):");
		int index = sc.nextInt();
		
		int X[] = new int[index];
		int Y[] = new int[index];
		sc.close();
	
		for (int i = 0; i < index; i++) 
        {
		   X[i] = (int) (Math.random() * (r + 1));
		   Y[i] = (int) (Math.random() * (r + 1));
		   System.out.println("(" +X[i] + "," + Y[i] + ")");
		}
	}
}