package colecao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.sql.PreparedStatement;

import basico.Cliente;

public class ColecaoClienteDB implements InterfarceColecaoCliente {
	
	public void adicionarCliente(Cliente c) {
		try {
			PreparedStatement stmt = Conexao.getConnection().prepareStatement("insert into cliente (nome, celular, cpf, cep, complEnd, email) "
					+ "values (?, ?, ?, ?, ?, ?)");
			stmt.setString(1, c.getNome());
			stmt.setString(2, c.getCelular());
			stmt.setString(3, c.getCpf());
			stmt.setString(4, c.getCep());
			stmt.setString(5, c.getComplEnd());
			stmt.setString(6, c.getEmail());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void atualizarCliente(Cliente c) {
		try {
			PreparedStatement stmt = Conexao.getConnection().prepareStatement("update cliente set nome=?, celular=?, cpf=?, cep=?, "
					+ "complEnd=?, email=? where id=?");
			stmt.setString(1, c.getNome());
			stmt.setString(2, c.getCelular());
			stmt.setString(3, c.getCpf());
			stmt.setString(4, c.getCep());
			stmt.setString(5, c.getComplEnd());
			stmt.setString(6, c.getEmail());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Vector<Cliente> listarClientes() {
		Vector<Cliente> resposta = new Vector<Cliente>();
		try {
			PreparedStatement stmt = Conexao.getConnection().prepareStatement("select * from cliente");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				Cliente cli = new Cliente();
				cli.setId(rs.getInt("id"));
				cli.setNome(rs.getString("nome"));
				cli.setCelular(rs.getString("celular"));
				cli.setCpf(rs.getString("cpf"));
				cli.setCep(rs.getString("cep"));
				cli.setComplEnd(rs.getString("complEnd"));
				cli.setEmail(rs.getString("email"));
				resposta.add(cli);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
		return resposta;
	}

	public Cliente procurarClienteId(int id) {
		try {
			PreparedStatement stmt = Conexao.getConnection().prepareStatement("select * from cliente where id=?");
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				Cliente cli = new Cliente();
				cli.setId(rs.getInt("id"));
				cli.setNome(rs.getString("nome"));
				cli.setCelular(rs.getString("celular"));
				cli.setCpf(rs.getString("cpf"));
				cli.setCep(rs.getString("cep"));
				cli.setComplEnd(rs.getString("complEnd"));
				cli.setEmail(rs.getString("email"));
				return cli;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
		return null;
	}

	public void removerCliente(Cliente c) {
		try {
			PreparedStatement stmt = Conexao.getConnection().prepareStatement("delete from cliente where id=?");
			stmt.setInt(1, c.getId());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}


