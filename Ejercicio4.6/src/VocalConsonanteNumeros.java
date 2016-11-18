import java.util.Scanner;

public class VocalConsonanteNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int vecescon=0, vecesvoc=0, vecesnum=0, t=0;
		String patronvoc="aeiou";
		String patroncon="qwrtypsdfghjklñzxcvbnm";
		String patronnum="1234567890";
		String frase;
		do{
			System.out.println("Introduce una frase: (máx. 80 letras)");
			frase=teclado.nextLine();
		}while(frase.length()>80);
		frase=frase.toLowerCase();
		for (t=0;t<frase.length();t++)
			{
				if (patroncon.indexOf(frase.charAt(t))!=-1)	
					vecescon++;
		}
			System.out.println("Encontradas: "+ vecescon +" consonantes");
		for (t=0;t<frase.length();t++)
			{
				if (patronvoc.indexOf(frase.charAt(t))!=-1)	
					vecesvoc++;
		}
			System.out.println("Encontradas: "+ vecesvoc +" vocales");
		for (t=0;t<frase.length();t++)
			{
				if (patronnum.indexOf(frase.charAt(t))!=-1)	
				vecesnum++;
	}
			System.out.println("Encontrados: "+ vecesnum +" numeros");
	}


}
