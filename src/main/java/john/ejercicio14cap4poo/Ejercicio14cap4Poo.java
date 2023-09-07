/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package john.ejercicio14cap4poo;
import java.util.Scanner;

/**
 *
 * @author johnferneymontoyaramirez
 */
public class Ejercicio14cap4Poo {

    public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	System.out.println("Ingrese las ventas del dpto 1: ");
	double vd1 = entrada.nextDouble();
	System.out.println("Ingrese las ventas del dpto 2: ");
	double vd2 = entrada.nextDouble();
	System.out.println("Ingrese las ventas del dpto 3: ");
	double vd3 = entrada.nextDouble();
	System.out.println("Ingrese el salario de vendedores: ");
	double salar = entrada.nextDouble();
	double totVen = vd1 + vd2 + vd3;
	double sal1, sal2, sal3;
	double porVen = 0.33 * totVen;
	if (vd1 > porVen) {
	    sal1 = salar + 0.2 * salar;
	} else {
	    sal1 = salar;
	}
	if (vd2 > porVen) {
	    sal2 = salar + 0.2 * salar;
	} else {
	    sal2 = salar;
	}
	if (vd3 > porVen) {
	    sal3 = salar + 0.2 * salar;
	} else {
	    sal3 = salar;
	}

	System.out.println("Salario vendedores depto. 1 " + sal1 + " "
	    + ", salario vendedores depto. 2 " + sal2 + " "
	    + ", salario vendedores depto. 3" + sal3);
    }
}
