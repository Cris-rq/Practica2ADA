////////////////////////////////////////////////////////////////////////////////////////////
// ALUMNO: CRISTINA ESPEJO ROQUE
//         RAFAEL MORET GALAN
// GRUPO: 2 INFORMATICA GRUPO C
////////////////////////////////////////////////////////////////////////////////////////////

public class OrdenacionRapida extends Ordenacion {
  
	public static <T extends Comparable<? super T>> void ordenar(T v[]) {
	    ordRapidaRec(v, 0, v.length-1);
	}

	// Debe ordenar ascendentemente los primeros @n elementos del vector @v con 
	// una implementaci�n recursiva del m�todo de ordenaci�n r�pida.	
	public static <T extends Comparable<? super T>> void ordRapidaRec(T v[], int izq, int der) {
		if(izq < der){
			int s = partir(v, v[der], izq, der);
			ordRapidaRec(v, izq, s-1);
			ordRapidaRec(v, s+1, der);
		}
	}
	   
   public static <T extends Comparable<? super T>> int partir(T v[], T pivote, int izq, int der) {
		int i = izq -1;
		for(int j = izq; j < der; j++){ // Recorro array
			if(v[j].compareTo(pivote) <= 0){ // Si es menor o igual que el pivote
				i++; // Indice que indica hasta donde se encuentran los menores al pivote
				T aux = v[i]; // Intercambia el valor menor al pivote encontrado
				v[i] = v[j];    // con el primer valor mayor al pivote que vamos
				v[j] = aux;     // arrastrando
			}
		}
		//Intercambiamos el pivote para ponerlo detrás de sus menores
		T aux = v[i+1]; 
		v[i+1] = v[der];
		v[der] = aux;
		return i+1;   	
   }

	// Peque�os ejemplos para pruebas iniciales.
	public static void main (String args[]) {
	
		Integer vEnt[] = {3,8,6,5,2,9,1,1,4};
		ordenar(vEnt);
		System.out.println(vectorAString(vEnt));

		Character vCar[] = {'d','c','v','b'};
		ordenar(vCar);
		System.out.println(vectorAString(vCar)); 
	}	
    
}
