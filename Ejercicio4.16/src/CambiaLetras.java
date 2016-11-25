import java.util.*;
public class CambiaLetras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		String palabra;
		System.out.println("Introduzca una palabra:");
		palabra=teclado.nextLine();
		palabra=palabra.substring(palabra.length()-1, palabra.length())+palabra.substring(1,palabra.length()-1)+palabra.substring(0,1);
		System.out.println(palabra);
	}

}
