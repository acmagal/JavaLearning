
public class Principal {
	public static void main(String[]args) {
		
		Editora arqueiro = new Editora(1234, "Editora Arqueiro", "S�o Paulo");//Construtor com par�metros
		//arqueiro.cidade = "S�o Paulo";                    //Public
		//arqueiro.codigo = 1234;
		//arqueiro.nome = "Editora Arqueiro";
		
		//arqueiro.setCidade("S�o Paulo");
		//arqueiro.setCodigo(1234);                        //Private
		//arqueiro.setNome("Editora Arqueiro");
		
		Autor adams = new Autor(12345,"Douglas Adams" , "Inglaterra");
		//adams.codigo = 12345;
		//adams.nome = "Douglas Adams";
		//adams.endereco = "Inglaterra";
		
		//adams.setCodigo(1234);
		//adams.setNome("Douglas Adams");
		//adams.setEndereco("Inglaterra");
		
		Livro guia =  new Livro(1234, "Douglas Adams", "O Guia do Mochileiro Das Gal�xias" ,"Editora Arqueiro");
		//guia.codigo = 1234;
		//guia.autor = "Douglas Adams";
		//guia.nome = "O Guia do Mochileiro Das Gal�xias";
		//guia.editora = "Editora Arqueiro";
		
		//guia.setAutor("Douglas Adams");
		//guia.setCodigo(12345);
		//guia.setEditora("Editora Arqueiro");
		//guia.setNome("O Guia do Mochileiro Das Gal�xias");
		
		Aluno andre = new Aluno(1234,"Andr� Cavalcante",20,1710191,300);
		//andre.setMatricula(1710191);
		//andre.setNome("Andr� Cavalcante");
		//Aluno.setMensalidade(300);
		
		andre.addLivros(guia); //Adiciono o livro que criei
		
		Monitor nicolas = new Monitor();
		//nicolas.setMatricula(1711401);
		//nicolas.setNome("Nicolas Buno");
		//nicolas.setBolsa(40);
		
		Aluno maria = new Aluno();
		System.out.println("Multa igual a R$" + maria.calcularMulta(10));
		
		Monitor ana = new Monitor();
		System.out.println("Multa igual a R$" + ana.calcularMulta(15));
		
		
		
	}
}
