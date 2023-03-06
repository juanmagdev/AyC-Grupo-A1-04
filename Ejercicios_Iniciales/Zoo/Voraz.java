package Trabajo;

public class Zoo {
	
	private int dif;
	private int [] animales;

	
	public Zoo (int x, int [] y) {dif=x; animales=y;}
	
	
	
	public void auxiliar () {
		int [] a = animales;
		int [] QuienComeMas = new int [2];
		while(sePuedeComer(a)) {
			
			for (int b = 0 ; b<a.length; b++) {
			  int i = b-1, comer = 0;
			  while(ComerIzquierda(a,b,i) ) {
				   i--;
				   }
			  comer =(b-i-1);
			  i = b+1;
			  while(ComerDerecha(a,b,i) ) {
				   i++;
				   }
			  comer += (i-b-1);
			  
			  if (QuienComeMas[1]<comer) {
				  QuienComeMas[0]=b; 
				  QuienComeMas[1]=comer;
		      }
			}

			a = AuxiComer(a,QuienComeMas[0]);
			QuienComeMas[0] = 0; QuienComeMas[1]=0;
		    
		}
		for(int lunallena=0; lunallena<a.length; lunallena++) System.out.print(a[lunallena]+" ");
	    System.out.println("");
		
		

	}
	
	
	public int [] AuxiComer (int [] a, int b) {
		int i = b-1;
		  while(ComerIzquierda(a,b,i) ) {
			   a = remueveElemento(a,i);
			   b--; i--;
			   }
		  i= b+1; 
		  while(ComerDerecha(a,b,i) ) {
			  a = remueveElemento(a,i);
			   i++;
			   }

	
		return a;
		
		
	}
	public boolean ComerIzquierda(int [] a, int b,int c) {
		if (b==0 || c<0) {return false;}
		else {
			if (a[b]-a[c]>0 && a[b]-a[c]<dif+1) {return true;}
			else {return false;}
		}
	}
	public boolean ComerDerecha(int [] a, int b,int c) { 
		if (b==a.length-1 || c>=a.length) {return false;}
		else {
			if (a[b]-a[c]>0 && a[b]-a[c]<dif+1) {return true;}
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
