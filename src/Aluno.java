
public class Aluno {

	private int codigo;
	private String nome;
	private Livro prateleira[] = new Livro[50];
	private int numDias;
	private static int i = 0;
	private int matricula;
	public static float mensalidade;

	// bumbum
	public Aluno(int codigo, String nome, int numDias, int matricula, float mensalidade) {
		this.codigo = codigo;
		this.nome = nome;
		this.numDias = numDias;
		this.matricula = matricula;
		Aluno.mensalidade = mensalidade;
	}

	public void setMatricula(int matricula) {
		matricula = this.matricula;
	}

	public int getMatricula() {
		return matricula;
	}

	// M�todo est�tico, n�o usa o this. e o argumento � chamado pela classe

	public static void setMensalidade(float mensalidade) {
		Aluno.mensalidade = mensalidade;
	}

	public static Float getMensalidade() {
		return mensalidade;
	}

	public void setCodigo(int codigo) {
		codigo = this.codigo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void addLivros(Livro prateleira) {
		this.prateleira[i] = prateleira;
		i++;

	}

	public void setNumDias(int numDias) {
		this.numDias = numDias;
	}

	public int getNumDias() {
		return numDias;
	}

	public float calcularMulta(int getNumDias) {
		if (getNumDias >= 15) {
			getNumDias = getNumDias - 15 * 1;
			return getNumDias;
		}
		return getNumDias - getNumDias;

	}

	public static void setI(int i) {
		Aluno.i = i;
	}

	public static int getI() {
		return i;
	}

}

// codigo, nome (com sets e gets) e um array de livros chamado Livros. V

// crie um m�todo chamado addLivro que adiciona um livro no array. V

// Adicione o getLivro o qual retorna um determinado livro do array. V

/*
 * Acrescente um m�todo chamado calcularMulta, este m�todo deve idicar se um
 * usu�rio precisa pagar multa e de quanto seria esse valor, ponha que o m�todo
 * receba o n�mero de dias que o usu�rio passou com o livro e calcule o valor da
 * multa, sabendo que ap�s o 15 dia o usu�rio paga 1 real por dia V por dia V
 */