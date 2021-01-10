package br.com.zup.estrelas.trilhas;

public class ClienteDados {

	private String nome;

	private int idade;
	private String cpf;
	private String telefone;
	private String endereco;
	private String email;

	public ClienteDados(String nome, int idade, String cpf, String telefone, String endereco, String email) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco = endereco;
		this.email = email;
	}

	public ClienteDados() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
public void dadosCliente () {
		
		System.out.printf("\nNome: " + this.getNome());
		System.out.printf("Idade: " + this.getIdade());
		System.out.printf("CPF: ", this.getCpf());
		System.out.printf("Telefone: ", this.getTelefone());
		System.out.printf("Endereço: ", this.getEndereco());
		System.out.printf("Email: ", this.getEmail());
		System.out.println("==========================================");
	}

}
