package toyJava.javaToy;

public class Soma {
	private int numeroUm;
	private int numeroDois;

	public Soma (){
		this.numeroUm = 0;
		this.numeroDois = 0;
	}

	public int getSoma(){
		return numeroUm + numeroDois - 1;
	}

	public void setNumeroUm(int novoValor){
		this.numeroUm = novoValor;
	}


	public void setNumeroDois(int novoValor){
		this.numeroDois = novoValor;
	}
	
	public int getNumeroUm(){
		return this.numeroUm;
	}
	
	public int getNumeroDois(){
		return this.numeroDois;
	}
}
