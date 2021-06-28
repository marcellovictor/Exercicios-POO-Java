package entidades;

public class Contato {

	//ATRIBUTOS
	private String nome;
	private String numero;
	
	//CONSTRUTORES
	
	public Contato(String nome ) {
		this.nome = nome;
	}
	
	public Contato(String nome, String numero) {
		this.nome = nome;
		this.numero = numero;
	}
	
	//GETTERS E SETTERS
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	//EQUALS E HASHCODE
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	//
	
	@Override
	public String toString() {
		return nome + " - " + numero;
	}
	
	
	
}
