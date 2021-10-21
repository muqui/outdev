package com.boot.alberto.services;
import java.math.BigInteger;
import java.io.*;
import java.util.*;

import org.springframework.stereotype.Repository;

@Repository
public class Factorial {
	ArrayList<String> result;
	public ArrayList<String>  calculo() {
		 result= new ArrayList<String>();
		 result.add("Input n = 1 Output: 1");
		  String str = "";
	         System.out.println("Input = 1 Output: 1" );
	        for (int j = 2; j < 46; j++) {
	            str = "";
	            for (int i = 0; i < j; i++) {
	                str = str + "1";
	            }
	            int n = str.length();
	            Factorial main = new Factorial();
	            int total_1 = 0;
	            int total_2 = 0;
	            int total = 0;
	            BigInteger totalPasos = new BigInteger("1");
	            String temp = "";

	            while (str.contains("11")) {
	                total_1 = 0;
	                total_2 = 0;
	                total = 0;
	                //busca el ultimo 2
	                int numberTwo = str.indexOf('2');
	                //crea un string temperal con 2
	                if (numberTwo > 0) {
	                    temp = str.substring(numberTwo, str.length());

	                }

	                //si existe un dos en la cadena
	                int fin = (numberTwo > 0) ? numberTwo - 2 : str.length() - 2;

	                if (str.length() > 1) {
	                    try {
	                        str = str.substring(0, fin);

	                        str = str + "2" + temp;
	                        //
	                        for (int i = 0, nn = str.length(); i < nn; i++) {
	                            total++;
	                            char c = str.charAt(i);
	                            if (c == '1') {
	                                total_1 = total_1 + 1;
	                            }
	                            if (c == '2') {
	                                total_2 = total_2 + 1;
	                            }
	                        }
	                    } catch (Exception e) {
	                        System.out.println("Exception " + e);
	                    }
	                }
	                BigInteger factorialtotal = main.factorial(total);
	                BigInteger factorialUno = main.factorial(total_1);
	                BigInteger factorialDos = main.factorial(total_2);
	                BigInteger denominador = factorialDos.multiply(factorialUno);
	                BigInteger factorialResultado = factorialtotal.divide(denominador);
	                totalPasos = totalPasos.add(factorialResultado);
	            }
	            System.out.println("Input n = " + j + " Output: " + totalPasos);
	            result.add("Input n = " + j + " Output: " + totalPasos);
	        }
	        return result;
	}
	
	public BigInteger factorial(int n) {
        BigInteger f = new BigInteger("1");
        for (int i = 2; i <= n; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }

}
