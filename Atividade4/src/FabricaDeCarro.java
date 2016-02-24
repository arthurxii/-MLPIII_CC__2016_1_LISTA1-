
public class FabricaDeCarro {
	private String nome;
	private String registro;

	private static FabricaDeCarro uniqueInstance;
	FabricaDeCarro() {
	}
	
	public static synchronized FabricaDeCarro getInstance() {
		if (uniqueInstance == null)
		uniqueInstance = new FabricaDeCarro();
		return uniqueInstance;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public static FabricaDeCarro getUniqueInstance() {
		return uniqueInstance;
	}

	public static void setUniqueInstance(FabricaDeCarro uniqueInstance) {
		FabricaDeCarro.uniqueInstance = uniqueInstance;
	}
	
}
