
public class Editora {
	private int codigo;
	private String nome;
	private String cidade;
	
	public Editora(int codigo, String nome, String cidade) {
		this.codigo = codigo;
		this.nome= nome;
		this.cidade = cidade;
	}
	
	public void setCodigo(int codigo) {
		codigo = this.codigo;
	}
	public int getCodigo() {
		return codigo;
	}
	
	public void setNome(String nome) {
		nome = this.nome;
	}
	public String getNome() {
		return nome;
	}
	
	public void setCidade(String cidade) {
		cidade = this.cidade;
	}
	public String getCidade() {
		return cidade;
		
	}

}
