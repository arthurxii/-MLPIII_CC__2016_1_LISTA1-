import java.util.Scanner;

public class TesteFabrica {
            public static void main (String[] args){
			Scanner scan = new Scanner (System.in);
			FabricaDeCarro Fabrica = new FabricaDeCarro();
			System.out.println("Diga o nome da fabrica: ");
			String nome = scan.next();
			Fabrica.setNome(nome);
			System.out.println("Diga o registro da fabrica: ");
			String registro = scan.next();
			Fabrica.setRegistro(registro);
			
			System.out.println("Nome da fabrica: "+Fabrica.getNome());
			System.out.println("Registro da fabrica: "+Fabrica.getRegistro());
			
			
			
        }
}
