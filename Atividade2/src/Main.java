import java.util.Scanner;

public class Main {
	    public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
		Fatura arthur = new Fatura();
		System.out.println("Diga o numero da sua fatura: ");
		String numero = scan.next();
		arthur.setNumero(numero);
		System.out.println("Diga o nome do produto: ");
		String descricao = scan.next();
		arthur.setDescricao(descricao);
		System.out.println("Diga o preço do produto: ");
		double preco = scan.nextDouble();
		arthur.setPreco(preco);
		System.out.println("Diga a quantidade que deseja comprar: ");
		int quantComprada = scan.nextInt();
		arthur.setQuantComprada(quantComprada);
		
		System.out.println("Numero da fatura: "+arthur.getNumero());
		System.out.println("Nome do produto: "+arthur.getDescricao());
		System.out.println("Preço do Produto: "+arthur.getPreco());
		System.out.println("Quantidade Comprada: "+arthur.getQuantComprada());
		System.out.println("Valor da Fatura: "+arthur.getValorFatura(quantComprada, preco));
		
		
		
    }
	    
}
