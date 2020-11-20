
public class Autor {

	private int codigo;
	private String nome;
	private String endereco;
	
	public Autor (int codigo, String nome, String endereco) {
		this.codigo = codigo;
		this.nome = nome;
		this.endereco = endereco;
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
	
	public void setEndereco(String endereco) {
		endereco = this.endereco;
	}
	public String getEndereco() {
		return endereco;
	}
}
