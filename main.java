import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String num;
		
		System.out.println("Escolha a forma de calcular pi:");
		System.out.println("1. Método de Monte Carlo");
		System.out.println("2. Fórmula de Leibniz");
		
		do {
			num = scan.next();
			
			if(num.equals("1")) {
				System.out.println("1");
                scan.close();
			}else if(num.equals("2")) {
				System.out.println("2");
                scan.close();
			}else {
				System.out.println("Digite 1 ou 2:");
			}
			
		}while(!num.equals("1") && !num.equals("2"));
		
	}

    public static void Leibniz(){

        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Digite a quantidade de termos:");

        while (!scan.hasNextInt()) {
			scan.next();
			System.out.println("Digite um valor válido");
		}
		num = scan.nextInt();
        scan.close();
		
		double a=1;
		double r=0;
		for(int i=0; i<num; i++) {
			r+= 1/a;
			a+=2;
			r-=1/a;
			a+=2;
            System.out.println(r);
		}
		r*=4;
		System.out.println("Aproximação de pi: "+r);
    }

}