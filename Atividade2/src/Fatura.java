
public class Fatura {
	private String numero;
	private String descricao;
	private int QuantComprada;
	private double preco;
	
	public void configura (String num,int quantComprada){	
		if ( quantComprada < 0){
		this.QuantComprada = 0;
	}
		if ( preco < 0){
	    this.preco = 0.0;
	}
}
	
	public double getValorFatura (int quantComprada, double preco){
		double quantFatura;  
	    quantFatura = this.QuantComprada * this.preco;  
	    return quantFatura;  
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantComprada() {
		return QuantComprada;
	}
	public void setQuantComprada(int QuantComprada) {
		this.QuantComprada = QuantComprada;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
}

