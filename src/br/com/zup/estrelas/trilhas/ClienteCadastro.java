package br.com.zup.estrelas.trilhas;

import java.util.ArrayList;

public class ClienteCadastro {

	// Map<String, ClienteDados> registroDeCliente = new HashMap<String,
	// ClienteDados>();

	ArrayList<ClienteDados> clientes = new ArrayList<>();

	public void adicionarCliente(String nome, int idade, String cpf, String telefone, String endereco, String email) {

		ClienteDados clienteAdicionado = new ClienteDados(nome, idade, cpf, telefone, endereco, email);

		clientes.add(clienteAdicionado);
		System.out.println(clienteAdicionado);

	}

	public void listarClientes(ClienteCadastro cliente) {

		for (ClienteDados clientesLista : clientes) {
			System.out.println(clientesLista);
		}

	}

	public boolean consultarClientePeloCpf(String cpf, ClienteCadastro cliente) {

		if (cliente.equals(cpf)) {
			System.out.println(cliente);
			return true;
		}

		System.out.println("Cliente inexistente");
		return false;
	}

	public boolean deletarCliente(String cpf, ClienteCadastro cliente) {

		if (cliente.equals(cpf)) {
			clientes.remove(cliente);
			System.out.println("Cliente removido!");
			return true;
		}
		System.out.println("Cliente inexistente!");
		return false;

	}
}
