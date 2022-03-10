import java.util.Locale;
import java.util.Scanner;

public class NotasMediaCurso {

	public static void main(String[] args) {
		double not1, not2, not3;
		
		Scanner sc= new Scanner(System.in);
		
		sc.useLocale(Locale.US);
		//en esta linea usamos el metodo useLocate para colocar los 
		//puntos en vez de las comas por defecto. 
		
		System.out.println("Introduce la primera nota: ");
		not1=sc.nextDouble();
		
		System.out.println("Introduce la segunda nota: ");
		not2=sc.nextDouble();
		
		System.out.println("Introduce la tercera nota: ");
		not3=sc.nextDouble();
		
		int result= (int) ((not1+not2+not3)/3);
		
		/*
		 * En este ejercicio utilizamos la precendecia y el casteo. 
		 * Veamos la linea 22 con detalle:
		 * 1- con los "(parentesis)" lo que le estamos diciendo a Java es que haga 
		 * primero la operacion de la suma.
		 * 
		 * 2-colocamos un parentesis de entrada y de cierre 
		 * --> ((not1+not2+not3)/3)<-- para indicarle a Java que luego haga la 
		 * division. 
		 * 
		 * 3- El resultado -double- se castea con esto -->(int) y el 
		 * resultado pasa a entero 
		 * 
		 * Es necesario declarar la variable result como entero porque 
		 * por sintaxis debe colocarte el tipo de dato que va a castear. 
		 */
		
		System.out.println("La nota media del curso es: "+ result);
		
		sc.close();
	
	}

}
