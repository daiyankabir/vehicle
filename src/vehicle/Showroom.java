/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
//</editor-fold>

/**
 *
 * @author daiya
 */
public class Showroom {
     Scanner console = new Scanner(System.in);
     private final ArrayList<NormalVehicle> normalvehicle = new ArrayList<>();
     private final ArrayList<SportsVehicle> sportsvehicle = new ArrayList<>();
     private final ArrayList<HeavyVehicle> heavyvehicle = new ArrayList<>();
     private boolean loopVariable = true;
     public int count=30;
     public void showMenu() {

        while (loopVariable) {
            try {
                System.out.println("1: Add Vehicle.\n2: Remove Vehicle.\n3: List Vehicles.\n4: Exiting");
                int userInput = console.nextInt();
                switch (userInput) {
                    case 1:
                    addVehicle();
                    break;
                    case 2:
                    removeVehicle();
                    break;
                    case 3:
                    listVehicles();
                    break;
                    case 4:
                    loopVariable = false;
                    break;
                }
                } catch (InputMismatchException e) {
                console.nextLine();
                System.out.println("\n" + e + " \nhas happened, choose value from 1 o 4.\n Click enter to continue...");
                console.nextLine();
            }
        }
    }
     
    private void addVehicle() {
           while (loopVariable) {
            try {
                System.out.println("1: Add Normal Vehicle.\n2: Add Sports Vehicle.\n3: Add Heavy Vehicles.\n4: Show Menu");
                int userInput = console.nextInt();
                switch (userInput) {
                    case 1:
                    normalvehicle();
                    break;
                    case 2:
                    sportsvehicle();
                    break;
                    case 3:
                    heavyvehicle();
                    break;
                    case 4:
                    showMenu();
                    break;
                }
                } catch (InputMismatchException e) {
                console.nextLine();
                System.out.println("\n" + e + " \nhas happened, choose value from 1 o 4.\n Click enter to continue...");
                console.nextLine();
            }
        }
    }

    private void removeVehicle() {
               while (loopVariable) {
            try {
                System.out.println("1: Remove Normal Vehicle.\n2: remove Sports Vehicle.\n3: remove Heavy Vehicles.\n4: Show Menu");
                int userInput = console.nextInt();
                switch (userInput) {
                    case 1:
                    removenormalvehicle();
                    break;
                    case 2:
                    removesportsvehicle();
                    break;
                    case 3:
                    removeheavyvehicle();
                    break;
                    case 4:
                    showMenu();
                    break;
                }
                } catch (InputMismatchException e) {
                console.nextLine();
                System.out.println("\n" + e + " \nhas happened, choose value from 1 o 4.\n Click enter to continue...");
                console.nextLine();
            }
        }
    }

    private void listVehicles() {
      System.out.println("Vehicle List:\n ");
      normalvehicle.forEach((_item) -> {
          System.out.println("Normal Vehicle = " + normalvehicle);
         });	
      sportsvehicle.forEach((_item) -> {
          System.out.println("Sports Vehicle = " + sportsvehicle);
         });	
      heavyvehicle.forEach((_item) -> {
          System.out.println("Heavy Vehicle = " + heavyvehicle);
         });	

    }

    private void normalvehicle() {
        
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Add Model Number:");
        String mn= sc.nextLine(); 
        
        
        System.out.println("Add Engine Power:");
        String ep= sc.nextLine(); 
        
        System.out.println("Add Tire size:");
        int t= sc.nextInt(); 
        
        NormalVehicle nv = new NormalVehicle(mn, Engine.Oil, ep, t);
        normalvehicle.add(nv);
        System.out.println("Normal Vehicle Added");
        
 	System.out.println("Customer Count: " + count);

 

    
    }
    private void sportsvehicle() {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Add Model Number:");
        String mn= sc.nextLine(); 
        
        
        System.out.println("Add Engine Power:");
        String ep= sc.nextLine(); 
        
        System.out.println("Add Tire size:");
        int t= sc.nextInt(); 
        System.out.println("Turbo:");
        String tu= sc.nextLine(); 
        
        SportsVehicle sv = new SportsVehicle(mn, Engine.Oil, ep, t,tu);
        sportsvehicle.add(sv);
        System.out.println("Sports Vehicle Added");
        
        count=count+20;
        System.out.println("Customer Count: " + count);
    }

    private void heavyvehicle() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Add Model Number:");
        String mn= sc.nextLine(); 
        
        
        System.out.println("Add Engine Power:");
        String ep= sc.nextLine(); 
        
        System.out.println("Add Tire size:");
        int t= sc.nextInt(); 
        System.out.println("Weight:");
        String w= sc.nextLine(); 
        
        HeavyVehicle hv = new HeavyVehicle(mn, Engine.DIESEL, ep, t,w);
        heavyvehicle.add(hv);
        System.out.println("Heavy Vehicle Added");
        System.out.println("Customer Count: " + count);
    }
    private void removenormalvehicle() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Index of the list: ");
         int rnm= sc.nextInt();
         normalvehicle.remove(rnm);
    }

    private void removesportsvehicle() {
         Scanner sc=new Scanner(System.in);
        System.out.println("Index of the list: ");
        int rs= sc.nextInt();
         sportsvehicle.remove(rs);
    }

    private void removeheavyvehicle() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Index of the list: ");
        int rh= sc.nextInt();
        heavyvehicle.remove(rh);
    }


     
}    

