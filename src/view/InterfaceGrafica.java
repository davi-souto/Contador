package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class InterfaceGrafica extends JFrame {

	private JPanel contentPane;
	private JTextField cliente;
	private JTextField valor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceGrafica frame = new InterfaceGrafica();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InterfaceGrafica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton cadastrar = new JButton("Cadastrar Opera\u00E7\u00E3o");
		cadastrar.setBounds(10, 93, 159, 23);
		contentPane.add(cadastrar);
		
		JButton mostrar = new JButton("Mostrar Hist\u00F3rico de Opera\u00E7\u00F5es");
		mostrar.setBounds(241, 11, 183, 23);
		contentPane.add(mostrar);
		
		JButton total = new JButton("Valor Total");
		total.setBounds(10, 200, 89, 23);
		contentPane.add(total);
		
		cliente = new JTextField();
		cliente.setBounds(10, 26, 132, 20);
		contentPane.add(cliente);
		cliente.setColumns(10);
		
		JLabel lblCliente = new JLabel("Cliente:");
		lblCliente.setBounds(10, 11, 46, 14);
		contentPane.add(lblCliente);
		
		valor = new JTextField();
		valor.setBounds(10, 62, 132, 20);
		contentPane.add(valor);
		valor.setColumns(10);
		
		JLabel txtvalor = new JLabel("Valor:");
		txtvalor.setBounds(10, 48, 46, 14);
		contentPane.add(txtvalor);
	}
}
