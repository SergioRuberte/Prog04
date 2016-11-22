import java.util.*;
public class CuentaLetras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String cadena;
		String cadenaUpper;
		String distinto = "";
		int repetido = 0;
		int j,i ;

		//Pide la frase, la guarda en cadena y la convierte a mayuscula.
		System.out.println("Escribe una frase. 60 caracter max");
		cadena = teclado.nextLine();
		cadenaUpper = cadena.toUpperCase();		
		//Hacemos un control para que la longitud de la cadena no supere los 60 caracteres.
		//si lo supera pedimos de nuevo la frase.
		while(!(cadenaUpper.length()<=60)){		
			System.out.println("Escribe una frase. 60 caracter max");
			cadena = teclado.nextLine();
			cadenaUpper = cadena.toUpperCase();		
		}
		//almacenamos todas las letras distintas. Si sale una que ya ha sido almacenada no se vuelve a almacenar.
		for(int a =0; a<cadenaUpper.length();a++){	
			if(!(distinto.indexOf(cadenaUpper.charAt(a))!=-1)){
				distinto += cadenaUpper.charAt(a);
			}		
		}
		//Muestra la repeticion de cada letra
		System.out.println("Las repeticiones por letras son;");
		for(i =0; i<distinto.length();i++){
			repetido  = 0;
			for(j = 0 ;j<cadenaUpper.length();j++){		
				if(distinto.charAt(i)==cadenaUpper.charAt(j)){
					repetido++;
				}
			}
			System.out.println(distinto.charAt(i)+"<-->"+repetido);
		}
		System.out.println("Tiene "+ distinto.length()+ " letras distintas");
	}
}
