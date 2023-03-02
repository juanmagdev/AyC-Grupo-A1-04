package Trabalho;

public class Main {

	public static void main(String[] args) {
		
		int [] arado = { 7,7,5, 1, 3, 3, 11, 20,19,16, 34, 33, 12, 23, 6, 6, 4, 3, 2, 1};
		 
		Zoo panga = new Zoo(3,arado);
		
		
		int [] resultado = panga.Procesa(arado);
		System.out.print("El resultado es: ");
		for(int z = 0; z<resultado.length;z++) {System.out.print(resultado[z]+" ");}

	}

}
