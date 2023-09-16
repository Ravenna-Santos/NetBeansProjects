package gui;

import javax.swing.table.DefaultTableModel;

import basico.Cliente;

public class ClienteTableModel extends DefaultTableModel {
	
	private String []columnNames = {"Id", "Nome", "Celular", "Cpf", "Cep",
			"ComplEnd", "Email"};
	private Class<?> []columnClass = {Integer.class, String.class, String.class, String.class, String.class};
	
	public void addCliente(Cliente c) {
		Object linha[] = new Object[5];
		linha[0] = c.getId();
		linha[1] = c.getNome();
		linha[2] = c.getCelular();
		linha[3] = c.getCpf();
		linha[4] = c.getCep();
		linha[5] = c.getComplEnd();
		linha[6] = c.getEmail();
		
		addRow(linha);
	}
	
	public boolean isCellEditable(int a, int b){
		return false;
	} 
	
	public void removeAllElements() {
		while(getRowCount() > 0) {
			removeRow(getRowCount() -1);
		}
	}
	public String getColumnName(int i) {
		return columnNames[i];
	}
	
	public Class getColumnClass(int i) {
		return columnClass[i];
	}
	
	public int getColumnCount() {
		return columnNames.length;
	}
	
	
}