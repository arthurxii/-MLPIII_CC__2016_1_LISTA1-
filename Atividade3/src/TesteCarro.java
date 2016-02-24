
public class TesteCarro {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Carro fusca = new Carro("Vermelho", "1989", 200);
		fusca.ligar();
		fusca.acelerar(200);
		
		System.out.println("A cor do carro: "+fusca.getCor());
		System.out.println("O modelo do carro: "+fusca.getModelo());
		System.out.println("A Velocidade atual: "+fusca.getVelocidadeAtual());
		System.out.println("Meu fusquinha turbinado!");
		
		
	}

}
