
public class Pessoa {

	//ATRIBTOS
	
	private String nome;
	private int idade;
	
	//CONSTRUTORES
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	//GETTERS
	
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}
	
	//METODOS
	
	public void fezAniversario() {
		idade++;
	}
	
	@Override
	public String toString() {
		return nome + ", " + idade + " ano(s)";
	}
	
	
}
