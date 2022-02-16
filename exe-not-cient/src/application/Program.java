package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		int cont = 0;

		double n = leitor.nextDouble();

		if(n >= 1 && n < 10){
			System.out.print("+" + String.format("%.4f", n) + "E+00");
		} else if(n >= 10) {
			while(n > 9) {
				cont++;
				n /= 10;
			}
			if(cont < 10) {
				System.out.print("+" + String.format("%.4f", n) + "E+0" + cont);
			} else {
				System.out.print("+" + String.format("%.4f", n) + "E+" + cont);
			}
		} else if(n > 0 && n < 1){
			while(n < 1) {
				cont++;
				n *= 10;
			}
			System.out.print("+" + String.format("%.4f", n) + "E-0" + cont);
		} else if(n < 0 && n > -1) {
			while(n > -1) {
				cont++;
				n *= 10;
			}
			System.out.print(String.format("%.4f", n) + "E-0" + cont);
		} else if(n <= -1 && n > -10) {
			System.out.print(String.format("%.4f", n) + "E+00");
		} else if(n < -10) {
			while(n < -9) {
				cont++;
				n /= 10;
			}
			if(cont < 10) {
				System.out.print(String.format("%.4f", n) + "E+0" + cont);
			} else {
				System.out.print(String.format("%.4f", n) + "E+" + cont);
			}
		} else if(n == 0) {
			String zero = Double.toString(n);
			if(zero.charAt(0) == '-') {
				System.out.print(String.format("%.4f", n) + "E+00");
			} else {
				System.out.print("+" + String.format("%.4f", n) + "E+00");
			}
		} else if(n == -0) {
			System.out.print(String.format("%.4f", n) + "E+00");
		}
		
		leitor.close();

	}

}
