
public class Filmes {
	
	String titulo;
	int duracaoEmMinutos;
	
	public void exibirDuracaoEmHoras() {
		int horas = (duracaoEmMinutos / 60);
		int minutos = (duracaoEmMinutos % 60);
		System.out.println("O filme " + titulo + " possui " + horas + " horas e " + 
		minutos + " minutos de duração ");
		
	}

}
