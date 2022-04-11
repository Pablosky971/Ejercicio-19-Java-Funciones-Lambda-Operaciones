package main;



import entidades.Operacion;

public class MainOperacion {

	public static void main(String[] args) {
		// Definimos la operaciones, empleando la interfaz funcional definida.
		
		/**
		 * Suma de los dos n�meros enteros establecidos como par�metros.
		 */
		Operacion<Integer> sumaEnteros = (n1,n2) -> n1 + n2;
		
		/**
		 * Suma de los dos n�meros enteros establecidos como par�metros.
		 */
		Operacion<Double> sumaReales = (n1,n2) -> n1 + n2;
		
		/**
		 * Resta de los dos n�meros enteros establecidos como par�metros.
		 */
		Operacion<Integer> restaEnteros = (n1,n2) -> n1 - n2;
		
		/**
		 * Resta de los dos n�meros enteros establecidos como par�metros.
		 */
		Operacion<Double> restaReales = (n1,n2) -> n1 - n2;
		
		/**
		 * Producto de los dos n�meros enteros establecidos como par�metros.
		 */
		Operacion<Integer> productoEnteros = (n1,n2) -> n1 * n2;
		
		/**
		 * Producto de los dos n�meros enteros establecidos como par�metros.
		 */
		Operacion<Double> productoReales = (n1,n2) -> n1 * n2;
		
		/**
		 * Divisi�n de los dos n�meros enteros establecidos como par�metros.
		 */
		Operacion<Integer> divisionEnteros = (n1,n2) -> n1 / n2;
		
		/**
		 * Divisi�n de los dos n�meros enteros establecidos como par�metros.
		 */
		Operacion<Double> divisionReales = (n1,n2) -> n1 / n2;
		
		/**
		 * Potencia de los dos n�meros enteros establecidos como par�metros.
		 * El primer n�mero es la base y el segundo el exponente al que se eleva.
		 */
		Operacion<Integer> potenciaEnteros = (n1,n2) -> {
			
			Integer res = n1;
			
			if(n2 == 0) {
				res = 1;
			}
			
			if(n2 == 1) {
				res = n1;
			}
			
			if(n2 >= 2) {
			for(int i = 1; i<n2; i++) {
				res *= n1;
			}
			
			}
			return res;
		};
		
		/**
		 * Potencia los dos n�meros enteros establecidos como par�metros.
		 * El primer n�mero es la base y el segundo el exponente al que se eleva.
		 */
		Operacion<Double> potenciaReales = (n1,n2) -> {
			Double res = n1;
			
			if(n2 == 0.0) {
				res = 1.0;
			}
			
			if(n2 == 1.0) {
				res = n1;
			}
			
			if(n2 >= 2.0) {
			for(int i = 1; i<n2; i++) {
				res *= n1;
			}
			
			}
			return res;
			
		};
		
		
		// Probamos las implementaciones definidas.
		
		Integer e = sumaEnteros.operacion(3,2);
		System.out.println("Resultado de la suma de enteros " + e);
		
		Double r = sumaReales.operacion(3.0, 2.0);
		System.out.println("Resultado de suma de dos n�meros reales " + r);
		
		e = restaEnteros.operacion(3, 2);
		System.out.println("Resultado de la resta de dos n�meros enteros " + e);
		
		r = restaReales.operacion(3.0, 2.0);
		System.out.println("Resultado de la retsa de dos n�meros reales " + r);
		
		e = productoEnteros.operacion(3,3);
		System.out.println("Resultado del producto de dos n�meros enteros " + e);
		
		r = productoReales.operacion(3.0, 3.0);
		System.out.println("Resultado del producto de dos n�meros reales " + r);
		
		e = divisionEnteros.operacion(9, 3);
		System.out.println("Resultado de la divisi�n de dos n�meros enteros " + e);
		
		r = divisionReales.operacion(9.0, 3.0);
		System.out.println("Resultado de la divisi�n de dos n�meros reales " + r);
		
		e = potenciaEnteros.operacion(5, 3);
		System.out.println("Resultado de la potencia de dos n�mero enteros " + e);
		
		r = potenciaReales.operacion(6.0, 0.0);
		System.out.println("Resultado de la potencia de n�meros reales " + r);
		
		
		

	}

}
