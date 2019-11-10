import java.util.Arrays;
import java.util.Collections;
import java.util.List;

////////////////////////////////////////////////////////////////////////////////////////////
// ALUMNO: CRISTINA ESPEJO ROQUE
//         RAFAEL MORET GALAN
// GRUPO: 2 INFORMATICA GRUPO C
////////////////////////////////////////////////////////////////////////////////////////////

public class OrdenacionRapidaBarajada extends OrdenacionRapida {
	
	// Implementaci�n de QuickSort con reordenaci�n aleatoria inicial (para comparar tiempos experimentalmente)
	public static <T extends Comparable<? super T>> void ordenar(T v[]) {
		barajar(v);
		OrdenacionRapida.ordenar(v);
    }

	// Reordena aleatoriamente los datos de un vector
    private static <T> void barajar(T v[]) {
		List<T> l = Arrays.asList(v);
		Collections.shuffle(l);
		l.toArray(v);

	}	
	
/* 	public static void main(String[] args) {
		Integer [] v = {3,8,6,5,2,9,1,1,4};
		ordenar(v);
		System.out.println(vectorAString(v));
	} */
	

}
