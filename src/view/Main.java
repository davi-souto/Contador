package view;
import controller.Gerenciador;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Textos t = new Textos();
		Gerenciador gerenciador = new Gerenciador();
		Scanner ler = new Scanner(System.in);
		int confirmar = -1;
		
		
		while (confirmar != 0) {
			t.menuInicial();
			confirmar = ler.nextInt();
			switch(confirmar) {
			case 1:
				gerenciador.cadastrarRecebimento();
				break;
			case 2:
				gerenciador.mostrarTodosRegistros();
				break;
			case 3:
				gerenciador.somarTotal();
				break;
			}
		}
	}

}
