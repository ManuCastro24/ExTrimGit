package boletin8;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//arrays bidimensional de 5 x 5 
		int [][] tabla = new int [5][5];
		
		//iniciamos una variable que coja todos las posiciones de 0 a 5
		for(int fila = 0; fila < tabla.length; fila++) {
			//iniciamos una variable que coja todos las posiciones de 0 a 5 a partir de la que teniamos anterior
			for(int columna = 0; columna < tabla[fila].length; columna++) {
				
				//operacion de suma de las filas y columnas
				tabla[fila][columna] = fila + columna;
				
			}
		}
		
		for (int row = 0; row < tabla.length; row++) {
			
			
			 for (int column = 0; column < tabla[row].length;column++) {
				 
			 System.out.print(tabla[row][column] + " ");
			 }
			 //esto es para que nos imprima con un salto de por medio para que pase de una fila y columna a la siguiente
			 System.out.println();
			} 
	}
	

}