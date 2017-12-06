package controller;
import view.Textos;
import model.Registro;
import java.util.Scanner;
import java.util.ArrayList;

public class Gerenciador {
	private ArrayList<Registro> registro = new ArrayList<Registro>();
	
	Textos t = new Textos();
	Scanner ler = new Scanner(System.in);
	
	public void cadastrarRecebimento() {
		Registro r = new Registro();
		System.out.println("Digite de quem você recebeu: ");
		r.setCliente(ler.next());
		
		System.out.println("Digite a quantia recebida: ");
		r.setCapital(ler.nextDouble());
		
		System.out.println("--------------------------------");
		System.out.println("Cliente: " + r.getCliente());
		System.out.println("Capital: " + r.getCapital());
		System.out.println("--------------------------------");
		
	
		registro.add(r);
		System.out.println("Operação registrada!");
	}

	public void mostrarTodosRegistros() {
		System.out.println("--------------------------------");
		System.out.println("Operações: " + registro.size());
		for(int i = 0; i < registro.size(); i++) {
			System.out.println("--------------------------------");
			System.out.println("Cliente: " + registro.get(i).getCliente() + " //Dinheiro: " + registro.get(i).getCapital());
			System.out.println("--------------------------------");
		}
	}
	
	public void somarTotal() {
		double t = 0;
		for (int i = 0; i < registro.size(); i++) {
			t += registro.get(i).getCapital();
		}
		System.out.println("--------------------------------");
		System.out.println("Total: " + t);
		System.out.println("--------------------------------");
	}
	
	


}
