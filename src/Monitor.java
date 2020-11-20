/*
 * Na classe Monitor, reescreva o m�todo getMensalidade para o mesmo levar em considera��o 
 * a bolsa de desconto que o monitor possui. 
 * Por exemplo, se a mensalidade � de R$ 800 e o monitor possui bolsa de 0.25 (25% de desconto), 
 * o m�todo getMensalidade deve retornar R$ 600 (R$ 800 - R$ 200 referentes aos 25% de desconto). 
 * Transforme o getMensalidade de Aluno em final para ver o que ocorre.
 * o Monitor s� paga multa quando passa mais de 30 dias com o livro. Sobrescreva o metodo herdado
 * calcularMulta para adequar o calculo para o monitor.
 * 
 

Obs: Os valores acima s�o apenas exemplos. Voc� deve definir com quais valores vai testar.
DICA: Para resolver esse problema lembre-se de usar o operador super visto em sala.*/

public class Monitor extends Aluno {
	
	private double bolsa;
	
	
	public void setBolsa(double bolsa) {
		bolsa = this.bolsa;
	}
	public double getBolsa() {
		return bolsa;
	}
	
	public float calcularMulta(int getNumDias) {
		if (getNumDias >= 30) {
			getNumDias = (getNumDias - 30) * 1; 
			return getNumDias;
		}
		return getNumDias - getNumDias;
		
	}
	
}
