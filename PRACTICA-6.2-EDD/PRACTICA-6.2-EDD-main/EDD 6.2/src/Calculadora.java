/**
 * Esta clase representa una calculadora básica que realiza operaciones aritméticas simples.
 * Guarda el resultado y la última operación realizada para su consulta.
 *
 * @author Borja Pellicer
 */
public class Calculadora {
	private float lastResult; // Último resultado de la operación
	private String lastOp; // Última operación realizada

	/**
	 * Devuelve el último resultado de la operación.
	 *
	 * @return Último resultado de la operación
	 */
	public float getLastResult() {
		return this.lastResult;
	}

	/**
	 * Devuelve la última operación realizada.
	 *
	 * @return Última operación realizada
	 */
	public String getLastOp() {
		return this.lastOp;
	}

	/**
	 * Realiza la suma de dos números y guarda el resultado.
	 *
	 * @param op1 Primer operando
	 * @param op2 Segundo operando
	 * @return Resultado de la suma
	 */
	public float suma(float op1, float op2) {
		float result = op1 + op2;
		this.lastResult = result;
		this.lastOp = "Suma";
		return result;
	}

	/**
	 * Realiza la resta de dos números y guarda el resultado.
	 *
	 * @param op1 Primer operando
	 * @param op2 Segundo operando
	 * @return Resultado de la resta
	 */
	public float resta(float op1, float op2) {
		float result = op1 - op2;
		this.lastResult = result;
		this.lastOp = "Resta";
		return result;
	}

	/**
	 * Realiza la multiplicación de dos números y guarda el resultado.
	 *
	 * @param op1 Primer operando
	 * @param op2 Segundo operando
	 * @return Resultado de la multiplicación
	 */
	public float multiplica(float op1, float op2) {
		float result = op1 * op2;
		this.lastResult = result;
		this.lastOp = "Multiplica";
		return result;
	}

	/**
	 * Realiza la división de dos números y guarda el resultado.
	 *
	 * @param op1 Dividendo
	 * @param op2 Divisor
	 * @return Resultado de la división
	 */
	public float divideix(float op1, float op2) {
		float result = op1 / op2;
		this.lastResult = result;
		this.lastOp = "Divideix";
		return result;
	}

	/**
	 * Comprueba si un número es mayor que otro.
	 *
	 * @param op1 Primer número
	 * @param op2 Segundo número
	 * @return true si op1 es mayor que op2, false en caso contrario
	 */
	public boolean majorQue(float op1, float op2) {
		return op1 > op2;
	}

	/**
	 * Restablece el estado de la calculadora, poniendo el último resultado a 0 y la última operación a "Ninguna".
	 */
	public void restablecer() {
		this.lastResult = 0;
		this.lastOp = "Ninguna";
	}
}



