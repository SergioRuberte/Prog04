import java.util.*;
public class MayusMinusNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int vecesmin=0, vecesmay=0, t=0, vecesnum=0;
		String patronmin="abcdefghijklmn�opqrstuvwxyz";
		String patronmay="ABCDEFGHIJKLMN�OPQRSTUVWXYZ";
		String patronnum="0123456789";
		String  frase;
		do{
			System.out.println("Introduce una frase: (m�x. 80 letras)");
			frase=teclado.nextLine();
		}while(frase.length()>80);
		/*---------------------------------------------*/
		for (t=0;t<frase.length();t++)
			{
				if (patronmin.indexOf(frase.charAt(t))!=-1)	
					vecesmin++;
		}
		System.out.println("Encontradas: "+ vecesmin +" min�sculas");
		/*---------------------------------------------*/
		for (t=0;t<frase.length();t++)
			{
				if (patronmay.indexOf(frase.charAt(t))!=-1)	
					vecesmay++;
		}
		System.out.println("Encontradas: "+ vecesmay +" may�sculas");
		/*---------------------------------------------*/
		for (t=0;t<frase.length();t++)
		{
			if (patronnum.indexOf(frase.charAt(t))!=-1)	
				vecesnum++;
	}
	System.out.println("Encontrados: "+ vecesnum +" n�meros");
	}


}
