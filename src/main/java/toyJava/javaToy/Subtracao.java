package toyJava.javaToy;

public class Subtracao {
	private int numeroUm;
	private int numeroDois;
	
	public Subtracao() {
		this.numeroUm = 0;
		this.numeroDois = 0;
	}
	
	public int getSub(){
		return this.numeroUm - this.numeroDois;
	}

	public void setNumeroUm(int novoNumero){
		this.numeroUm = novoNumero;
	}
}
