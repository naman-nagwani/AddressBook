package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {
    private static int num=0;
    public static void main(String[] args) {
        int n=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Address Book");
        Contacts [] contacts = new Contacts[100];
        while (n!=2) {
            System.out.println("1. Add new contact");
            System.out.println("2. Add Exit");
            n = scan.nextInt();
            switch (n){
                case 1 :
                    contacts[num] = new Contacts();
                    contacts[num].showDetails();
                    num++;
                    break;
                case 2 :
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }
    }
}

class Contacts {
    public String firstName;
    public String lastName;
    public String address;
    public String city;
    public String state;
    public String email;
    public long phoneNo;

    Contacts() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Creating new contacts");
        System.out.println("Enter the details of contact");
        System.out.println("Enter First Name :");
        this.firstName = scan.nextLine();
        System.out.println("Enter Last Name :");
        this.lastName = scan.nextLine();
        System.out.println("Enter Address :");
        this.address = scan.nextLine();
        System.out.println("Enter city :");
        this.city = scan.nextLine();
        System.out.println("Enter state :");
        this.state = scan.nextLine();
        System.out.println("Enter e-mail :");
        this.email = scan.nextLine();
        System.out.println("Enter phone number :");
        this.phoneNo = scan.nextLong();
    }

    public void showDetails() {
        System.out.println("First Name : "+ this.firstName);
        System.out.println("Last Name : "+ this.lastName);
        System.out.println("Address : "+ this.address);
        System.out.println("City : "+ this.city);
        System.out.println("State : "+ this.state);
        System.out.println("E-mail : "+ this.email);
        System.out.println("Phone Number : "+ this.phoneNo);
    }
}
