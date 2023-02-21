package Trabalho;

public class Main {

	public static void main(String[] args) {
		
		int [] arado = { 7,3,5,4 };
		 
		Zoo panga = new Zoo(3,arado);
		
		
		int [] resultado = panga.Procesa(arado);
		System.out.print("El resultado es: ");
		for(int z = 0; z<resultado.length;z++) {System.out.print(resultado[z]+" ");}

	}

}
