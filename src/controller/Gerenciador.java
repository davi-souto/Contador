package controller;
import view.Textos;
import model.Registro;
import java.util.Scanner;
import java.util.ArrayList;

public class Gerenciador {
	private ArrayList<Registro> registro = new ArrayList<Registro>();
	Registro r = new Registro();
	Textos t = new Textos();
	Scanner ler = new Scanner(System.in);
	
	public void cadastrarRecebimento() {
		System.out.println("Digite de quem você recebeu: ");
		r.setCliente(ler.nextLine());
		
		System.out.println("Digite a quantia recebida: ");
		r.setCapital(ler.nextDouble());
		
		System.out.println("Cliente: " + r.getCliente());
		System.out.println("Capital: " + r.getCapital());
		
		t.menuConfirmar();
		int confirmar = ler.nextInt();
		switch(confirmar) {
		case 1:
			registro.add(r);
			System.out.println("Operação registrada!");
			break;
		}
	}

	public void mostrarTodosRegistros() {
		for(int i = 0; i < registro.size(); i++) {
			System.out.println(registro.get(i).getCliente() + "$--$" + registro.get(i).getCapital());
		}
	}
	
	public void somarTotal() {
		double t = 0;
		for (int i = 0; i < registro.size(); i++) {
			t += registro.get(i).getCapital();
		}
		System.out.println("Total: " + t);
	}
}
