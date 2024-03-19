/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.individual2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
/**
 *
 * @author Мария
 */
public class Individual2 {

    public static void main(String[] args) {
        System.out.println("Майорова М.С., РИБО-02-22, Вариант-2, Практика 1.8");
        int flag = 1;
        
        ArrayList<Telephone> phones = new ArrayList<>();
        phones.add(new Telephone("Panasonic","X35235ZMD","white", false ));
        phones.add(new Telephone("Samsung S10","XYZ123456789","black", true ));
        phones.add(new Telephone("Iphone X","ASIOS77777QWERTY","black", true ));
        
        
        Scanner sc = new Scanner(System.in);
        while (flag == 1){
            System.out.println("Enter model");
            String model = sc.next();
            System.out.println("Enter number");
            String number = sc.next();
            for (Telephone tel : phones){
                if (tel.getNumber().equals(number)){
                    System.out.println("The wrong number. Enter another number");
                    number = sc.next();
                }
            }
            System.out.println("Enter color");
            String color = sc.next();
            System.out.println("Enter type");
            Boolean type = sc.nextBoolean();
            phones.add(new Telephone(model,number,color,type));
            System.out.println("Add more? 1-yes, 2-no");
            flag = sc.nextInt();
            
            
        }
        
        System.out.println("Enter reNumber");
        String reNumber = sc.next();
        Iterator<Telephone> iter = phones.iterator();
        while (iter.hasNext()){
            Telephone tel = iter.next();
            if (tel.getNumber().equals(reNumber)){
                iter.remove();
            }
        }
        
        int choice = 0;
        System.out.println("If you want to delete the list, enter -1-");
        choice = sc.nextInt();
        if (choice==1){
            phones.clear();
        }
        
        //System.out.println(phones.size());
        //for (Telephone tel : phones){
        //    System.out.println(tel);
        //}
        for (Telephone tel : phones){
            System.out.println(tel.getModel() + " " +tel.getNumber() + " " + tel.getColor() + " " + tel.isType() );
        }
    } 
}