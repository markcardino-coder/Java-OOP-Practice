/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main.java;

/**
 *
 * @author Asus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
class PrintAccount {
 
    private String studentName;
    private int credits;

    // Constructor
    public PrintAccount(String studentName, int credits) {
        this.studentName = studentName;

        if (credits < 0) {
            this.credits = 0;
        } else {
            this.credits = credits;
        }
    }

    // Add credits
    public boolean addCredits(int amount) {
        if (amount <= 0) {
            return false;
        }

        this.credits += amount;
        return true;
    }

    // Print pages
    public boolean printPages(int pages) {
        if (pages <= 0 || pages > this.credits) {
            return false;
        }

        this.credits -= pages;
        return true;
    }

    // Get credits
    public int getCredits() {
        return this.credits;
    }

    // Get student name
    public String getStudentName() {
        return this.studentName;
    }
}


    

        PrintAccount nathan = new PrintAccount("Nathan", 10);
        PrintAccount primo = new PrintAccount("Primo", -4);

        System.out.println("Starting Credits:");
        System.out.println("Nathan: " + nathan.getCredits());
        System.out.println("Primo: " + primo.getCredits());

        System.out.println("\nNathan prints 4 pages: "
                + nathan.printPages(4));
        System.out.println("Nathan's credits: " + nathan.getCredits());

        System.out.println("\nNathan prints 7 pages: "
                + nathan.printPages(7));
        System.out.println("Nathan's credits: " + nathan.getCredits());

        System.out.println("\nNathan adds -3 credits: "
                + nathan.addCredits(-3));
        System.out.println("Nathan's credits: " + nathan.getCredits());

        System.out.println("\nNathan adds 4 credits: "
                + nathan.addCredits(4));

        System.out.println("\nFinal Credits:");
        System.out.println("Nathan: " + nathan.getCredits());
        System.out.println("Primo: " + primo.getCredits());
    }
}