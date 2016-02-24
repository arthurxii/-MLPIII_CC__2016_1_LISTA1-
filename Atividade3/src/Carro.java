
public class Carro {
	private String cor;
	private String modelo;
	private int velocidadeMaxima;
	private int velocidadeAtual;
	
	public Carro(String cor, String modelo, int velocidadeMaxima){
		this.cor = cor;
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public void ligar(){
		if (velocidadeAtual == 0){
			System.out.println("Ligando carro...carro ligado!");	
		}else{
			System.out.println("Carro j� estava ligado");
		}
}
	public void acelerar(int velocidade){
		if(velocidadeMaxima <= (velocidadeAtual + velocidade)){
			velocidadeAtual += velocidade;
		} else{
			System.out.println("Velocidade maxima excedida!:");
		}
	}	

    public String retornarCor(String string) {
    	return cor;
}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public String retornarCor() {
		return null;
	}

    
}
