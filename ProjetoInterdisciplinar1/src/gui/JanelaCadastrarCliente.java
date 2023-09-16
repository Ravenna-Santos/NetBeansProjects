package gui;

import java.awt.BorderLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Rectangle;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.util.Vector;

import javax.swing.JButton;

import basico.Cliente;
import fachada.Fachada;

public class JanelaCadastrarCliente extends JInternalFrame {

	private JPanel jContentPane = null;
	private JLabel jLabel1 = null;
	private JLabel jLabel2 = null;
	private JLabel jLabel3 = null;
	private JLabel jLabel4 = null;
	private JLabel jLabel5 = null;
	private JLabel jLabel6 = null;
	private JTextField campoNome = null;
	private JTextField campoCelular = null;
	private JTextField campoCpf = null;
	private JTextField campoCep = null;
	private JTextField campoComplEnd = null;
	private JTextField campoEmail = null;
	
	private JButton botaoCadastrar = null;

	/**
	 * This is the xxx default constructor
	 */
	public JanelaCadastrarCliente() {
		super();
		initialize();
	
		
	}
	
	private void initialize() {
		this.setSize(273, 200);
		this.setTitle("Cadastrar Cliente");
		this.setContentPane(getJContentPane());
		this.setClosable(true);
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel6 = new JLabel();
			jLabel6.setBounds(new Rectangle(52, 109, 38, 16));
			jLabel6.setHorizontalAlignment(SwingConstants.RIGHT);
			jLabel6.setText("Email:");
			
			jLabel5 = new JLabel();
			jLabel5.setBounds(new Rectangle(52, 109, 38, 16));
			jLabel5.setHorizontalAlignment(SwingConstants.RIGHT);
			jLabel5.setText("ComplEnd:");
			
			jLabel4 = new JLabel();
			jLabel4.setBounds(new Rectangle(52, 109, 38, 16));
			jLabel4.setHorizontalAlignment(SwingConstants.RIGHT);
			jLabel4.setText("Cep:");
			jLabel3 = new JLabel();
			jLabel3.setBounds(new Rectangle(34, 86, 56, 16));
			jLabel3.setHorizontalAlignment(SwingConstants.RIGHT);
			jLabel3.setText("Cpf:");
			jLabel2 = new JLabel();
			jLabel2.setBounds(new Rectangle(52, 40, 38, 16));
			jLabel2.setHorizontalAlignment(SwingConstants.RIGHT);
			jLabel2.setText("Celular:");
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(52, 63, 38, 16));
			jLabel1.setHorizontalAlignment(SwingConstants.RIGHT);
			jLabel1.setText("Nome:");
			
			
			
			jContentPane.add(jLabel1, null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(jLabel4, null);
			jContentPane.add(jLabel5, null);
			jContentPane.add(jLabel6, null);
			
			jContentPane.add(getCampoNome(), null);
			jContentPane.add(getCampoCelular(), null);
			jContentPane.add(getCampoCpf(), null);
			jContentPane.add(getCampoCep(), null);
			jContentPane.add(getCampoComplEnd(), null);
			jContentPane.add(getCampoEmail(), null);
			jContentPane.add(getBotaoCadastrar(), null);
		}
		return jContentPane;
	}

	
	private JTextField getCampoNome() {
		if (campoNome == null) {
			campoNome = new JTextField();
			campoNome.setBounds(new Rectangle(107, 38, 125, 20));
		}
		return campoNome;
	}

	
	private JTextField getCampoEmail() {
		if (campoEmail == null) {
			campoEmail = new JTextField();
			campoEmail.setBounds(new Rectangle(107, 61, 125, 20));
		}
		return campoEmail;
	}

	
	private JTextField getCampoCelular() {
		if (campoCelular == null) {
			campoCelular = new JTextField();
			campoCelular.setBounds(new Rectangle(107, 84, 125, 20));
		}
		return campoCelular;
	}

	
	private JTextField getCampoCpf() {
		if (campoCpf == null) {
			campoCpf = new JTextField();
			campoCpf.setBounds(new Rectangle(107, 107, 125, 20));
		}
		return campoCpf;
	}
	
	private JTextField getCampoCep() {
		if (campoCep == null) {
			campoCep = new JTextField();
			campoCep.setBounds(new Rectangle(107, 107, 125, 20));
		}
		return campoCep;
	}
	
	private JTextField getCampoComplEnd() {
		if (campoComplEnd == null) {
			campoComplEnd = new JTextField();
			campoComplEnd.setBounds(new Rectangle(107, 107, 125, 20));
		}
		return campoComplEnd;
	}

	
	private JButton getBotaoCadastrar() {
		if (botaoCadastrar == null) {
			botaoCadastrar = new JButton();
			botaoCadastrar.setBounds(new Rectangle(132, 135, 98, 22));
			botaoCadastrar.setText("Cadastrar");
			botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					
					String nome = campoNome.getText();
					String email = campoEmail.getText();
					String celular = campoCelular.getText();
					String cpf = campoCpf.getText();
					String cep = campoCep.getText();
					String complEnd = campoComplEnd.getText();
					
					
					
					
					
					
					
					//Contato c = new Contato(categoria, celular, email, fone, nome);
					
					Cliente c = new Cliente();
				
					c.setNome(nome);
					c.setEmail(email);
					c.setCpf(cpf);
					c.setCelular(celular);
					c.setCep(cep);
					c.setComplEnd(complEnd);
					
					
						Fachada.getInstancia().adicionarCliente(c);
						JOptionPane.showMessageDialog(null, "Cliente Cadastrado com sucesso!");
					
					
					
					
				}
			});
		}
		return botaoCadastrar;
	}

}
