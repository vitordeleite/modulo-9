package modulo9tarefa;
import java.util.Scanner;
public class Convert {
	public static void main(String args[]) {
		Scanner texto = new Scanner(System.in);
		int nub1 = texto.nextInt();
		System.out.println("número primitivo "+ nub1);
		Integer nub2 = nub1;
		System.out.println("número wrapper " + nub2);
	}

}
