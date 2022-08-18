package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    private static List<Contacts> contactList = new ArrayList<>();

    public static void main(String[] args) {
        int choice=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Address Book");

        while (choice!=4) {
            System.out.println("1. Add new contact \n2. Edit Contact \n3. Print All Contacts \n4. Exit");
            choice = scan.nextInt();
            switch (choice){
                case 1 :
                    contactList.add(new Contacts());
                    break;
                case 2 :
                    editContact();
                    break;
                case 3:
                    printAllContacts();
                    break;
                case 4 :
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }
    }

    private static void printAllContacts() {
        for (int i =0;i<contactList.size();i++) {
            System.out.println(contactList.get(i));
        }
    }

    private static void editContact() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name of contact to Edit");
        String name = scan.nextLine();
        for(Contacts contacts :contactList) {
            if(contacts.firstName.equals(name)) {
                System.out.println(contacts);
                System.out.println("Enter what you want to edit \n1.First Name \n2.Last Name"
                        + " \n3.Address \n4.City \n5.State \n6.E-mail \n7.Phone Number");
                int choice = scan.nextInt();
                scan.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("Enter the new First Name");
                        String newFirstName = scan.nextLine();
                        contacts.firstName = newFirstName;
                        break;

                    case 2:
                        System.out.println("Enter the new Last Name");
                        String newLastName = scan.nextLine();
                        contacts.lastName = newLastName;
                        break;

                    case 3:
                        System.out.println("Enter the new Address");
                        String newAddress = scan.nextLine();
                        contacts.address = newAddress;
                        break;

                    case 4:
                        System.out.println("Enter the new City");
                        String newCity = scan.nextLine();
                        contacts.city = newCity;
                        break;

                    case 5:
                        System.out.println("Enter the new State");
                        String newState = scan.nextLine();
                        contacts.state = newState;
                        break;
                    case 6:
                        System.out.println("Enter the new E-mail");
                        String newEmail = scan.nextLine();
                        contacts.email = newEmail;
                        break;

                    case 7:
                        System.out.println("Enter the new Phone Number");
                        String newPhoneNo = scan.nextLine();
                        contacts.phoneNo = newPhoneNo;
                        break;
                    default:
                        System.out.println("Invalid Input");
                }
            }
        }
    }
}