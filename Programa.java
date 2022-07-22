
public class Programa {

	public static void main(String[] args) {
		
		Filmes filme1 = new Filmes();
		Filmes filme2 = new Filmes();
		
		filme1.titulo = "Os vingadores";
		filme1.duracaoEmMinutos = 142;
		filme1.exibirDuracaoEmHoras();
		
		filme2.titulo = "Hotel Transilvânia";
		filme2.duracaoEmMinutos = 93;
		filme2.exibirDuracaoEmHoras();
		

	}

}
