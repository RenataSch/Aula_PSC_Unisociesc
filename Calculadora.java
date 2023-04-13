package projetoPáscoa;

import java.util.Scanner;

import projetoPáscoa.Operacao;
import projetoPáscoa.Adicao;
import projetoPáscoa.Divisao;
import projetoPáscoa.Multiplicacao;
import projetoPáscoa.Subtracao;

public class Calculadora {

	public static void main(String[] args) {
		//Entrada
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a operacao(1-adicao, 2-subtracao, 3-multiplicacao, 4-divisao, 5-exponencao, fatorial:");
		int tipo = teclado.nextInt();
		System.out.println("Digite o valor 1:");
		int valor1 = teclado.nextInt();
		int valor2 = 0;
		if (tipo != 6) {
		System.out.println("Digite o valor 2:");
		valor2 = teclado.nextInt();
		}
		teclado.close();
		//Nivel 1
		switch (tipo) {
		case 1 : System.out.println("Adicao="+(valor1+valor2)); break;
		case 2 : System.out.println("Subtracao="+(valor1-valor2)); break;
		case 3 : System.out.println("Multiplicacao="+(valor1*valor2)); break;
		case 4 : System.out.println("Divisao="+(valor1/valor2)); break;
		default : System.out.println("Operacao inválida!");
		}
		//Nível 2
		Operacao operacaoNivel2;
		switch (tipo) {
		case 1 : operacaoNivel2 = new Adicao();
				operacaoNivel2.setNumero1(valor1);
				operacaoNivel2.setNumero2(valor2);
				System.out.println("Adicao="+operacaoNivel2.calcula());
				break;
		case 2 : operacaoNivel2 = new Subtracao();
				operacaoNivel2.setNumero1(valor1);
				operacaoNivel2.setNumero2(valor2);
				System.out.println("Subtracao="+operacaoNivel2.calcula());
				break;
		case 3 : operacaoNivel2 = new Multiplicacao();
				operacaoNivel2.setNumero1(valor1);
				operacaoNivel2.setNumero2(valor2);
				System.out.println("Multiplicacao"+operacaoNivel2.calcula());
				break;
		case 4 : operacaoNivel2 = new Divisao();
				operacaoNivel2.setNumero1(valor1);
				operacaoNivel2.setNumero2(valor2);
				System.out.println("Divisao"+operacaoNivel2.calcula());
				break;
		default : operacaoNivel2 = null;
				System.out.println("Não foi possível identificar a operação desejada!");
				//Nível 3
				Operacao operacaoNivel3;
				switch (tipo) {
				case 1 : operacaoNivel3 = new Adicao();
				System.out.println("Adicao="+operacaoNivel3.calcula(valor1, valor2));
				break;
				case 2 : operacaoNivel3 = new Subtracao();
				System.out.println("Subtracao="+operacaoNivel3.calcula(valor1, valor2));
				break;
				case 3 : operacaoNivel3 = new Multiplicacao();
				System.out.println("Multiplicacao="+operacaoNivel3.calcula(valor1, valor2));
				break;
				case 4 : operacaoNivel3 = new Divisao();
				System.out.println("Divisao="+operacaoNivel3.calcula(valor1, valor2));
				break;
				default : operacaoNivel3 = null;
				System.out.println("Não foi possível identificar a operação desejada!");
				}
				boolean queroTestarNivel4 = false;
				if (queroTestarNivel4 == true) {
					Operacao operacaoNivel4;
					switch (tipo){
						case 1 : operacaoNivel4 = new Adicao(); break;
						case 2 : operacaoNivel4 = new Subtracao(); break;
						case 3 : operacaoNivel4 = new Multiplicacao(); break;
						case 4 : operacaoNivel4 = new Divisao(); break;
						default : operacaoNivel4 = null;
						System.out.println("Não foi possível identificar a operação desejada!");
					}
				}	
				}	
		
		//Saída
		System.out.println(operacaoNivel2.calcula(valor1, valor2));
	}


}
