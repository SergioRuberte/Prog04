import java.util.Scanner;

public class BorraOcurrencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String cadena;
		String letra;
		int cont=0, n;
		System.out.println("Introduce una cadena:");
		cadena=teclado.nextLine();
		do{
		System.out.println("Introduce una letra:");
		letra=teclado.nextLine();
		}while(letra.length()>1);
		
		while(cont<3){
			n=cadena.indexOf(letra);
			cadena=cadena.substring(0, n).concat(cadena.substring(n+1,cadena.length()));
			cont++;
		}
		System.out.println(cadena);
	}

}