
public class Prueba {

	public static void sumar (int num, int numero) {
		int resultado= num+numero;
		System.out.println("El resultado de la suma es "+resultado);
	}
	public static void restar (int num, int numero) {
		int resultado= num-numero;
		System.out.println("El resultado de la resta es "+resultado);
	}
	public static void main(String[] args) {
		int num=2;
		int numero=4;
		sumar(num,numero);
		restar(num, numero);
	}

}
