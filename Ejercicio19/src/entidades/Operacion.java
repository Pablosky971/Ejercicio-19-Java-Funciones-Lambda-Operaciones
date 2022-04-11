package entidades;

@FunctionalInterface
public interface Operacion<T> {
	
	/**
	 * M�todo que realiza operaci�n matem�tica con los dos n�meros indicados por par�metros.
	 * @param n1 primer n�mero que compone la operaci�n.
	 * @param n2 segundo n�mero que compone la operaci�n.
	 * @return el resultado de la operaci�n entre sendos n�meros.
	 */
	public T operacion (T n1, T n2);

}
