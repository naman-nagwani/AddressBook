package com.bridgelabz;

import java.util.Scanner;

public class Contacts {
    public String firstName;
    public String lastName;
    public String address;
    public String city;
    public String state;
    public String email;
    public String phoneNo;

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
        this.phoneNo = scan.nextLine();
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "\nfirstName='" + firstName + '\'' +
                "\nlastName='" + lastName + '\'' +
                "\naddress='" + address + '\'' +
                "\ncity='" + city + '\'' +
                "\nstate='" + state + '\'' +
                "\nemail='" + email + '\'' +
                "\nphoneNo='" + phoneNo + '\'' +
                '}';
    }
}

