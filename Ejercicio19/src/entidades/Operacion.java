package entidades;

@FunctionalInterface
public interface Operacion<T> {
	
	/**
	 * Método que realiza operación matemática con los dos números indicados por parámetros.
	 * @param n1 primer número que compone la operación.
	 * @param n2 segundo número que compone la operación.
	 * @return el resultado de la operación entre sendos números.
	 */
	public T operacion (T n1, T n2);

}
