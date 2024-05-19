import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite o primeiro parâmetro: ");

		int numeroUm = leitor.nextInt();
        
		System.out.print("Digite o segundo parâmetro: ");
		int numeroDois = leitor.nextInt();

		leitor.close();
		try {

            contar(numeroUm, numeroDois);
		
		}catch (ParametrosInvalidosException e) {

            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

        if (parametroUm > parametroDois)
            throw new ParametrosInvalidosException();

		    int contagem = parametroDois - parametroUm;
		    for(int numero = 1; numero <= contagem; numero++ ){
                System.out.println("Imprimindo o número " + numero);
        }
	}
}