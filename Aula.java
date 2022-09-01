package ana;
import java.util.Scanner;
public class Aula {

	public static void main(String[] args) {
		double n1, n2, mp;
		Scanner Ana = new Scanner(System.in);
		                
		System.out.println("Declare a Nota do 1ª Bimestre");
		n1 = Ana.nextDouble();
		System.out.println("Declare a Nota do 2ª Bimestre");
		n2 =  Ana.nextDouble();
		                
		mp =(n1*2+ n2*3)/5;
		System.out.println("Declare a Media Ponderada do aluno e:"+mp);

	}

}
