package UT7;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio_701 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A) Añadir números aleatorios comprendidos entre 0 y 20
		ArrayList<Integer> numerosAleatorios = new ArrayList<Integer>();
		Integer temp;
		
		for(int i=0; i<=10; i++) {
			temp = (int) (Math.random() * 21);
			numerosAleatorios.add(temp);
		}
		System.out.println();
		//B) Mostrar los elementos actuales con un bucle for normal
		for(int i = 0; i < numerosAleatorios.size(); i++) {
			System.out.print(numerosAleatorios.get(i) + " ");
		}
		System.out.println();
		//C) Añadir 5 elementos aleatorios más al final, también comprendidos entre 0 y 20
		for(int i = 0; i < 5; i++) {
			temp = (int) (Math.random() * 21);
			numerosAleatorios.add(temp);
		}
		System.out.println();
		//D) Mostrar los elementos actuales con un bucle for-each
		for (int numero : numerosAleatorios) {
			System.out.print(numero + " ");
		}
		System.out.println();
		//E) Insertar en los índices 5 al 9, cinco elementos aleatorios comprendidos entre 0 y 99
		for (int i = 5; i < 10; i++) {
			temp = (int) (Math.random() * 10 + 90);
			numerosAleatorios.add(i, temp);
		}
		System.out.println();
		//F)Mostrar los elementos actuales del ArrayList a través de un iterator
		Iterator<Integer> it = numerosAleatorios.iterator();
		while (it.hasNext())
			System.out.print(it.next() + " ");
		
		//G)Eliminar el elemento que se encuentra en el índice 12
		numerosAleatorios.remove(12);
		System.out.println();
		
		//H)Averiguar si el núemero 16 se encuentra en el ArrayList
		if (numerosAleatorios.indexOf(16) == -1)
			System.out.println("el 16 no se encuentra en el ArrayList");
		else
			System.out.println("el 16 se encuentra en el ArrayList");
		System.out.println();
		
		//I)Mostrar los elementos actuales del ArrayList
		System.out.println(numerosAleatorios);
		
		//J)Ordenar el ArrayList
		Collections.sort(numerosAleatorios);
		
		//K)Mostrar los elementos del mismo por cualquiera de los métodos anteriores
		for (int numero : numerosAleatorios) {
			System.out.print(numero + " ");
		}
		
	}

}
