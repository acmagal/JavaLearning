
public class Livro {
	private int codigo; 
	private String autor;
	private String nome;
	private String editora;
	
	public Livro (int codigo, String autor, String nome, String editora) {
		this.codigo = codigo;
		this.autor = autor;
		this.nome = nome;
		this.editora = editora;
	}
	
	public void setCodigo(int codigo) {
		codigo = this.codigo;
	}
	public int getCodigo() {
		return codigo;
	}
	
	public void setAutor(String autor) {
		autor = this.autor;
	}
	public String getAutor() {
		return autor;
	}
	
	public void setNome(String nome) {
		nome = this.nome;
	}
	public String getNome() {
		return nome;
	}
	
	public void setEditora(String editora) {
		editora = this.editora;
	}
	public String getEditora() {
		return editora;
	}
}
