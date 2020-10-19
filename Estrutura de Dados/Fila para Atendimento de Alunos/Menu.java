import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		FilaInt filaAlunos = new FilaInt();
		filaAlunos.init();
		
		int opcao, RM;
		
		do {
			System.out.println("1- Inserir aluno na fila");
			System.out.println("2- Atender 1º aluno da fila");
			System.out.println("3- Encerrar programa");
			opcao = teclado.nextInt();
			switch(opcao) {
			case 1: //insere 1 aluno na fila de atendimento
				System.out.println("Digite o RM do aluno para atendimento: ");
				RM = teclado.nextInt();
				filaAlunos.enqueue(RM);
				break;
			case 2: //retira o 1º aluno da fila para ser atendido
				if(filaAlunos.isEmpty() == false) {
					RM = filaAlunos.dequeue();
					System.out.println("Aluno a ser atendido: "+RM);
				} else {
					System.out.println("Não há alunos na fila");
				}
				break;
				
			case 3: //finaliza o programa apenas se a fila estiver vazia
				if(filaAlunos.isEmpty()) {
					System.out.println("Encerrando o atendimento de alunos.");
				}
				break;
			default: System.out.println("Opção Inválida.");
					opcao = 0;
			}
		}while(opcao != 3);
		teclado.close();
	}

}
