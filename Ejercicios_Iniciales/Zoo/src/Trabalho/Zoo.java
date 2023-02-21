package Trabalho;

public class Zoo {
	
	private int dif;
	private int [] animales;

	
	public Zoo (int x, int [] y) {dif=x; animales=y;}
	
	public int [] Procesa (int [] a) {
		int [] menor = a;
		for (int i = 0; i<a.length; i++) {
			int [] iterador = auxiliar(a,i);
			if (menor.length>iterador.length) {menor=iterador;}
		}
		return menor;
	}
	
	public int [] auxiliar (int [] a, int b) {
		
		if (!sePuedeComer(a)) {return a;}
		else {
			if (ComerIzquierda(a,b) && ComerDerecha(a,b) ) {
				int [] izq = Procesa(remueveElemento(a,b-1));
				int [] der = Procesa(remueveElemento(a,b+1));
				int [] result = (izq.length<der.length) ? izq : der;
				return result;	
			}
			else if (ComerIzquierda(a,b)) {return Procesa(remueveElemento(a,b-1));}
			else if (ComerDerecha(a,b)) {return Procesa(remueveElemento(a,b+1));}
			else {return a;}	
		}
	}
	public boolean ComerIzquierda(int [] a, int b) {
		if (b==0) {return false;}
		else {
			if (a[b]-a[b-1]>0 && a[b]-a[b-1]<dif+1) {return true;}
			else {return false;}
		}
	}
	public boolean ComerDerecha(int [] a, int b) {
		if (b==a.length-1) {return false;}
		else {
			if (a[b]-a[b+1]>0 && a[b]-a[b+1]<dif+1) {return true;}
			else {return false;}
		}
	}
	
	public boolean sePuedeComer(int [] x) {
		if (x.length==1) {return false;}
		else {
			int contador = 0;
			for (int i = 1; i<x.length; i++) {
				if ( x[i-1]-x[i]>0 && x[i-1]-x[i]<dif+1) {contador++;}
				if ( x[i]-x[i-1]>0 && x[i]-x[i-1]<dif+1) {contador++;}
			}
			return (contador!=0);
		}	
	}
	
	   public int[] remueveElemento(int[] arrayObjetos, int i) {
		    int[] nuevoArray = new int[arrayObjetos.length - 1];
		     if (i > 0){
		           System.arraycopy(arrayObjetos, 0, nuevoArray, 0, i);
		     }
		     if (nuevoArray.length > i){
		      System.arraycopy(arrayObjetos, i + 1, nuevoArray, i, nuevoArray.length - i);
		     }
		     return nuevoArray;
		   }
	
	
	

}
