package br.com.zup.estrelas.trilhas;

import java.util.ArrayList;

public class ClienteCadastro {

	// Map<String, ClienteDados> registroDeCliente = new HashMap<String,
	// ClienteDados>();

	ArrayList<ClienteDados> clientesArmazenados = new ArrayList<>();

	public void adicionarCliente(String nome, int idade, String cpf, String telefone, String endereco, String email) {

		ClienteDados clienteAdicionado = new ClienteDados(nome, idade, cpf, telefone, endereco, email);

		clientesArmazenados.add(clienteAdicionado);
		clienteAdicionado.printCliente();

	}

	public void listarClientes() {

		for (ClienteDados clientesLista : clientesArmazenados) {
			clientesLista.printCliente();
		}

	}

	public boolean consultarClientePeloCpf(String cpf) {

		for (ClienteDados clienteListadoCpf : clientesArmazenados) {

			if (clienteListadoCpf.getCpf().equals(cpf)) {
				clienteListadoCpf.printCliente();
				return true;
			}
		}

		System.out.println("Cliente inexistente");
		return false;
	}

	public boolean deletarCliente(String cpf) {

		for (ClienteDados clienteParaSerDeletado : clientesArmazenados) {
			
			if (clienteParaSerDeletado.getCpf().equals(cpf)) {
				clientesArmazenados.remove(clienteParaSerDeletado);
				return true;
			}
		}
		System.out.println("Cliente inexistente!");
		return false;

	}

	 
	
}
