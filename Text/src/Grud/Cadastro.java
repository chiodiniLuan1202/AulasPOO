package Grud;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

public class Cadastro extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCargo;
	private JTextField txtMatricula;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro frame = new Cadastro();
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
	public Cadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 474, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				Cliente cliente =  new Cliente();
				cliente.setNome(txtNome.getText());
				cliente.setCargo(txtCargo.getText());
				cliente.setMatricula(txtMatricula.getText());
				
				JOptionPane.showMessageDialog(null, cliente.salvar());
				
				txtNome.setText("");
				txtCargo.setText("");
				txtMatricula.setText("");
				
			}
		});
		btnEnviar.setBounds(344, 417, 89, 23);
		contentPane.add(btnEnviar);
		
		txtNome = new JTextField();
		txtNome.setBounds(67, 302, 322, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(32, 277, 46, 14);
		contentPane.add(lblNome);
		
		txtCargo = new JTextField();
		txtCargo.setBounds(67, 358, 322, 20);
		contentPane.add(txtCargo);
		txtCargo.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Cargo");
		lblNewLabel.setBounds(31, 333, 64, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblDadosPessoais = new JLabel("Dados Pessoais");
		lblDadosPessoais.setBounds(10, -2, 161, 14);
		contentPane.add(lblDadosPessoais);
		
		JLabel lblMatricula = new JLabel("Matricula");
		lblMatricula.setBounds(29, 224, 142, 14);
		contentPane.add(lblMatricula);
		
		txtMatricula = new JTextField();
		txtMatricula.setBounds(67, 243, 322, 20);
		contentPane.add(txtMatricula);
		txtMatricula.setColumns(10);
		
		table = new JTable();
		table.setBounds(-1, 11, 434, 143);
		contentPane.add(table);
		
		JButton btnNewButton = new JButton("Novo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(10, 165, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnBuscar = new JButton("Excluir");
		btnBuscar.setBounds(178, 165, 89, 23);
		contentPane.add(btnBuscar);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(344, 165, 89, 23);
		contentPane.add(btnAlterar);
	}
}
