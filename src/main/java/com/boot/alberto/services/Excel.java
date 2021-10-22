package com.boot.alberto.services;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class Excel {
	ArrayList<String> result;
	Map<String, BigInteger> mapLetra = new HashMap<String, BigInteger>();
	 HashMap< Integer, String> map = new HashMap<>();
	 public Excel() {
		
		 mapLetra.put("A", new BigInteger("1"));
		 mapLetra.put("B", new BigInteger("2"));
		 mapLetra.put("C", new BigInteger("3"));
		 mapLetra.put("D", new BigInteger("4"));
		 mapLetra.put("E", new BigInteger("5"));	 
		 mapLetra.put("F", new BigInteger("6"));
		 mapLetra.put("G", new BigInteger("7"));
		 mapLetra.put("H", new BigInteger("8"));
		 mapLetra.put("I", new BigInteger("9"));
		 mapLetra.put("J", new BigInteger("10"));
		 mapLetra.put("K", new BigInteger("11"));
		 mapLetra.put("L", new BigInteger("12"));
		 mapLetra.put("M", new BigInteger("13"));
		 mapLetra.put("N", new BigInteger("14"));
		 mapLetra.put("O", new BigInteger("15"));
		 mapLetra.put("P",new BigInteger("16"));
		 mapLetra.put("Q",new BigInteger("17"));
		 mapLetra.put("R", new BigInteger("18"));
		 mapLetra.put("S", new BigInteger("19"));
		 mapLetra.put("T", new BigInteger("20"));
		 mapLetra.put("U", new BigInteger("21"));
		 mapLetra.put("V", new BigInteger("22"));
		 mapLetra.put("W", new BigInteger("23"));
		 mapLetra.put("X", new BigInteger("24"));
		 mapLetra.put("Y", new BigInteger("25"));
		 mapLetra.put("Z", new BigInteger("26"));
		   map.put(0, "Z");
	       map.put(1, "A");
	       map.put(2, "B");
	       map.put(3, "C");
	       map.put(4, "D");
	       map.put(5, "E");
	       map.put(6, "F");
	       map.put(7, "G");
	       map.put(8, "H");
	       map.put(9, "I");
	       map.put(10, "J");
	       map.put(11, "K");
	       map.put(12, "L");
	       map.put(13, "M");
	       map.put(14, "N");
	       map.put(15, "P");
	       map.put(16, "O");
	       map.put(17, "Q");
	       map.put(18, "R");
	       map.put(19, "S");
	       map.put(20, "T");
	       map.put(21, "U");
	       map.put(22, "V");
	       map.put(23, "W");
	       map.put(24, "X");
	       map.put(25, "Y");
	       map.put(26, "Z");
	 }	
//  columnTitle  return number  
 public BigInteger decimal(String valor) {
	 int potencia = 0;
	 
	  BigInteger resultado = new BigInteger("0");
	  BigInteger potenciaResultado = new BigInteger("0");
	  BigInteger base = new BigInteger("26");
	 while(valor.length() > 0 ){
		 
		 String last = valor.substring(valor.length()-1);
		 // double potencia =map.get(last) * Math.pow(26,potencia);
		  potenciaResultado = mapLetra.get(last).multiply(base.pow(potencia)); 
		  resultado =  resultado.add(potenciaResultado) ;
		 valor = valor.substring(0,valor.length()-1);
		 
		potencia++;
	 }	
	 return resultado;	 
 }
 //number  return   columnTitle
 public String colunmTitle(int numero) {
     String resultado = "";
     do {
         int residuo = numero % 26;
         if (residuo == 0) {
             numero = numero - 1;
         }
         numero = numero / 26;
         //   System.out.println("numero " + numero + " residuo" + residuo);            
         resultado = resultado + map.get(residuo);
     } while (numero > 0);
     StringBuilder input1 = new StringBuilder();
     input1.append(resultado);
     return input1.reverse().toString();
 }
 
 public ArrayList<String>  createdFile() {
	 result= new ArrayList<String>();
	int fin = number();	 
	for (int i = fin; i <fin+100; i++) {          
	      
	      result.add(" input columnTitle '" + colunmTitle(i) + "' Output: " + i);
	     if(i == 2147483647 )
	    	 break;	    
	 }     	
	return result;    
 }
 public int number() {
	   int min = 1;
	      int max = 2147483647;	        	      
	      int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);	 
	     
	      return random_int;
 }

}
