import java.util.Scanner;

public class DecBin {
	public static void main(String[] args) {
		PilhaInt pilha = new PilhaInt();
	
	
	
	pilha.init();
	
	Scanner le = new Scanner(System.in);
	System.out.print("digite decimal ");
	int decimal = le.nextInt();	
	int resto;
	while (decimal > 0) {
		resto = decimal %2;
		pilha.push(resto);
		decimal = decimal /2;
	}
	
	System.out.println("Número em binário");
	
	pilha.esvazia();
	System.out.println();
	le.close();
	}
}
