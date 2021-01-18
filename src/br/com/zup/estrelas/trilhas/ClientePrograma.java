package br.com.zup.estrelas.trilhas;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class ClientePrograma {

	public static void menu() {
		System.out.println("------CADASTRO DE CLIENTES-----");
		System.out.println("(1) Adicionar cliente");
		System.out.println("(2) Listar clientes");
		System.out.println("(3) Buscar cliente por CPF");
		System.out.println("(4) Deletar cliente");
		System.out.println("(0) Sair\n");
		System.out.println("Digite a opção desejada: \n");

	}

	public static void adicionarCliente(Scanner teclado, ClienteCadastro cliente) {

		System.out.println("Digite o nome: ");
		String nome = teclado.next();

		System.out.println("Digite o CPF: ");
		String cpf = teclado.next();

		System.out.println("Digite a idade: ");
		int idade = teclado.nextInt();

		System.out.println("Digite o endereço: ");
		String endereco = teclado.next();

		System.out.println("Digite o telefone: ");
		String telefone = teclado.next();

		System.out.println("Digite o email: ");
		String email = teclado.next();

		cliente.adicionarCliente(nome, idade, cpf, telefone, endereco, email);
		System.out.println("Cliente cadastrado com sucesso!\n\n");

	}

	public static void listarClientes(ClienteCadastro cliente) {

		cliente.listarClientes();

	}

	public static void consultarClientePeloCpf(Scanner teclado, ClienteCadastro cliente) {
		System.out.println("Digite o CPF do cliente que deseja listar:");
		String cpf = teclado.next();

		cliente.consultarClientePeloCpf(cpf);

	}

	private static void deletarCliente(Scanner teclado, ClienteCadastro cliente) {
		System.out.println("Digite o CPF do cliente que deseja deletar:");
		String cpf = teclado.next();

		cliente.deletarCliente(cpf);
		System.out.println("Cliente deletado com sucesso!\n");

	}

	public static void main(String[] args)  throws SQLException, IOException{
		
		//Connection conn = new ConnectionFactory().getConnection();

		ClienteCadastro cliente = new ClienteCadastro();

		Scanner teclado = new Scanner(System.in);
		int opcao;

		do {

			menu();
			opcao = teclado.nextInt();

			switch (opcao) {

			case (1):

				adicionarCliente(teclado, cliente);

				break;

			case (2):
				listarClientes(cliente);

				break;

			case (3):

				consultarClientePeloCpf(teclado, cliente);

				break;

			case (4):

				deletarCliente(teclado, cliente);
				break;

			case (0):
				break;

			default:
				System.out.println("Opção inválida!\n");
				break;

			}
		} while (opcao != 0);

		teclado.close();

	}

}
