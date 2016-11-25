import java.util.*;
public class CambiaApellidos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		String n1, n2, nombre1, nombre2, apellido1, apellido2;
		int esp;
		System.out.println("Introduzca un nombre y un apellido:");
		n1=teclado.nextLine();
		System.out.println("Introduzca otro nombre y apellido:");
		n2=teclado.nextLine();
		esp=n1.indexOf(" ");
		nombre1=n1.substring(0, esp);
		apellido1=n1.substring(esp+1,n1.length());
		esp=n2.indexOf(" ");
		nombre2=n2.substring(0, esp);
		apellido2=n2.substring(esp+1,n2.length());
		System.out.println(nombre1+" "+apellido2);
		System.out.println(nombre2+" "+apellido1);
	}

}
