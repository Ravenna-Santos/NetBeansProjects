package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import basico.Cliente;
import fachada.Fachada;

import java.awt.Dimension;
import java.util.Vector;

public class JanelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JDesktopPane desktop = null;
	private JMenuBar barraDeMenu = null;
	private JMenu jMenuCadastrar = null;
	private JMenu jMenuListar = null;
	private JMenuItem menuCadastrarCliente = null;
	private JMenuItem menuListarCliente = null;


	/**
	 * This is the default constructor
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPrincipal frame = new JanelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public JanelaPrincipal() {
		super();
		initialize();
	}


	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
                setExtendedState(JFrame.MAXIMIZED_BOTH);
		//this.setSize(592, 302);
		this.setJMenuBar(getBarraDeMenu());
		this.setContentPane(getJContentPane());
		this.setTitle("Agenda de Clientes");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			jContentPane.add(getDesktop(), BorderLayout.CENTER);
		}
		return jContentPane;
	}

	/**
	 * This method initializes desktop	
	 * 	
	 * @return javax.swing.JDesktopPane	
	 */
	private JDesktopPane getDesktop() {
		if (desktop == null) {
			desktop = new JDesktopPane();
		}
		return desktop;
	}

	
	
	private JMenuBar getBarraDeMenu() {
		if (barraDeMenu == null) {
			barraDeMenu = new JMenuBar();
			barraDeMenu.add(getJMenuCadastrar());
		//	barraDeMenu.add(getJMenuListar());
		}
		return barraDeMenu;
	}

		
		
	 
	private JMenu getJMenuCadastrar() {
		if (jMenuCadastrar == null) {
			jMenuCadastrar = new JMenu();
			jMenuCadastrar.setText("Cadastrar");
			jMenuCadastrar.add(getMenuCadastrarCliente());
		}
		return jMenuCadastrar;
	}

	/**
	 
	private JMenu getJMenuListar() {
		if (jMenuListar == null) {
			jMenuListar = new JMenu();
			jMenuListar.setText("Listar");
			jMenuListar.add(getMenuListarCliente());
		}
		return jMenuListar;
	}

	
	 */
	private JMenuItem getMenuCadastrarCliente() {
		if (menuCadastrarCliente == null) {
			menuCadastrarCliente = new JMenuItem();
			menuCadastrarCliente.setText("Cliente");
			menuCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					JanelaCadastrarCliente jcc = new JanelaCadastrarCliente();
					jcc.setVisible(true);
					desktop.add(jcc);
				}
			});
		}
		return menuCadastrarCliente;
	}

	/**
	
	
	private JMenuItem getMenuListarCliente() {
		if (menuListarCliente == null) {
			menuListarCliente = new JMenuItem();
			menuListarCliente.setText("Categoria");
			menuListarCliente.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					JanelaListarCliente jlc = new JanelaListarCliente();
					jlc.setVisible(true);
					desktop.add(jlc);
				}
			});
		}
		return menuListarCliente;
	}

	
	 */

}
