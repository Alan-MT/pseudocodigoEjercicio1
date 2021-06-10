import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String args[]) {
		Scanner sca = new Scanner(System.in);
		int impares = 0;
		int pares = 0;
		int n;
		int numale;
		System.out.println("Ingrese un numero:");
		n = sca.nextInt();
		for (int i=1;i<=n;i++) {
			numale = (int)(Math.random()*100+1);
			if (numale%2==0) {
				pares += 1;
			} else {
				impares += 1;
			}
		}
		System.out.println("Numero pares "+pares);
		System.out.println("numeros impares "+impares);
	}


}

