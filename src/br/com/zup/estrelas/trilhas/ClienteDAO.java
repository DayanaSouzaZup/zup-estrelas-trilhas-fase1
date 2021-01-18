//package br.com.zup.estrelas.trilhas;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class ClienteDAO {
//
//	private Connection conn;
//	ClienteDados cliente = new ClienteDados();
//
//	public ClienteDAO() {
//		this.conn = new ConnectionFactory().getConnection();
//	}
//
//	public boolean insereCliente(ClienteDados cidade) throws SQLException {
//
//		String sqlInsercao = "insert into cliente" + "(CPF, nome, idade, endereco, telefone, email)"
//				+ "values (?,?,?,?,?,?)";
//
//		PreparedStatement instrucao = conn.prepareStatement(sqlInsercao);
//
//		instrucao.setString(1, cliente.getCpf());
//		instrucao.setString(2, cliente.getNome());
//		instrucao.setInt(3, cliente.getIdade());
//		instrucao.setString(4, cliente.getEndereco());
//		instrucao.setString(5, cliente.getTelefone());
//		instrucao.setString(6, cliente.getEmail());
//
//		instrucao.execute();
//		instrucao.close();
//
//		return true;
//	}
//
//	public List<ClienteCadastro> listaClientes() {
//
//	}
//
//	List<ClienteCadastro> clientes = new ArrayList<>();
//	String sql = "select * from clientes.cidade";
//
//	try
//	{
//		PreparedStatement imprime = conn.prepareStatement(sql);
//		ResultSet rs = imprime.executeQuery();
//
//		while (rs.next()) {
//			ClienteDados cliente = new ClienteDados();
//
//			cliente.setCpf(rs.getString("cpf"));
//			cliente.setNome(rs.getString("nome"));
//			cliente.setIdade(rs.getInt("idade"));
//			cliente.setEndereco(rs.getString("endereco"));
//			cliente.setTelefone(rs.getString("Telefone"));
//			cliente.setEmail(rs.getString("email"));
//			clientes.add(cliente);
//		}
//		imprime.close();
//	}catch(
//	SQLException e)
//	{
//		System.out.println("Erro ao listar cidades");
//		System.out.println(e.getMessage());
//	}
//
//	return cidades;
//}
//}
//
//	public boolean removeCliente(String cpf) {
//
//		String sql = "delete from cliente " + "where cpf = ?";
//		try {
//			PreparedStatement imprime = conn.prepareStatement(sql);
//			imprime.setCpf(1, cpf);
//
//			imprime.execute();
//			imprime.close();
//
//		} catch (SQLException e) {
//			System.out.println("Erro ao deletar cliente");
//			System.out.println(e.getMessage());
//			return false;
//		}
//		return true;
//	}
//
//	public boolean retornaCliente(String cpf) {
//		String sql = "select * from estrelas.cliente " + "where cpf = ?";
//		try {
//			PreparedStatement imprime = conn.prepareStatement(sql);
//			imprime.setString(2, cliente.getNome());
//
//			imprime.execute();
//			imprime.close();
//		} catch (SQLException e) {
//			System.out.println("Erro ao modificar cliente");
//			System.out.println(e.getMessage());
//			return false;
//		}
//		return true;
//	}
//
//	public String pesquisaCliente(String cpf) {
//		String sql = "select * from estrelas.cliente " + "where cpf = ?";
//		try {
//			PreparedStatement imprime = conn.prepareStatement(sql);
//			imprime.setString(2, cliente.getNome());
//
//			imprime.execute();
//			imprime.close();
//		} catch (SQLException e) {
//			System.out.println("Erro ao modificar cliente");
//			System.out.println(e.getMessage());
//
//		}
//	}
//}
//}
