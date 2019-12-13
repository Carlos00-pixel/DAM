
public class Prueba {

	public static void sumar (int num, int numero) {
		int resultado= num+numero;
		System.out.println("El resultado de la suma es "+resultado);
	}
	public static void restar (int num, int numero) {
		int resultado= num-numero;
		System.out.println("El resultado de la resta es "+resultado);
	}
	public static void multiplicar (int num, int numero) {
		int resultado= num*numero;
		System.out.println("El resultado de la multiplicacion es "+resultado);
	}
	public static void division (int num, int numero) {
		int resultado= num/numero;
		System.out.println("El resultado de la multiplicacion es "+resultado);
	}
	public static void potencia (int num, int numero) {
		int resultado=(int) Math.pow(num, numero);
		System.out.println("El resultado de la potencia es "+resultado);
	}
	public static void main(String[] args) {
		int num=2;
		int numero=4;
		sumar(num,numero);
		restar(num, numero);
		multiplicar(num, numero);
		division(num, numero);
		potencia(num, numero);
	}

}
