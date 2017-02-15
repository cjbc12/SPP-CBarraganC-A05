/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.cbarraganc.a05.p1;
import java.util.Scanner;
/**
 *
 * @author Carlos Javier Barragán Carrión
 * IMT A01410357
 */
public class SPPCBarraganCA05P1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
    getWord("una cadena");
    getNumber("un numero double");
    getLong("un numero Long");
    getChar("un carácter");
    }
    static String getWord(String palabra){
     Scanner kb= new Scanner(System.in);
        String a = "";
        boolean flag;
        do{
            System.out.println("Introduce "+palabra);
            try{
               a=kb.nextLine();
               flag=true;
            } catch (Exception ex) {
               flag=false;
               System.out.println("Esto no es una cadena " +ex);
            kb.nextLine();
            }
       }while(flag==false);
        return a;
    }
    static double getNumber(String msg){
     Scanner kb= new Scanner(System.in);
        double numero = 0;
        boolean flag;
        do{
            System.out.println("Introduce "+msg);
            try{
               numero=kb.nextDouble();
               flag=true;
            } catch (Exception ex) {
               flag=false;
               System.out.println("El numero insertado no es un double " +ex);
            kb.nextLine();
            }
       }while(flag==false);
        return numero;
    }
    static long getLong(String palabra){
        Scanner kb= new Scanner(System.in);
        long numerito = 0;
        boolean flag;
        do{
            System.out.println("Introduce "+palabra);
            try{
               numerito=kb.nextLong();
               flag=true;
            } catch (Exception ex) {
               flag=false;
               System.out.println("El numero insertado no es un long number " +ex);
               kb.nextLine();
            }
       }while(flag==false);
        return numerito;
    }
    static char getChar(String palabra){
        Scanner kb= new Scanner(System.in);
        char i = 0;
        boolean flag;
        do{
            System.out.println("Introduce "+palabra);
            try{
               i=kb.next().charAt(0);
               flag=true;
            } catch (Exception ex) {
               flag=false;
               System.out.println("Esto no es un solo caracter " +ex);
               kb.nextLine();
            }
       }while(flag==false);
        return i;
    }
    }