package com.bridgelabz;

import java.util.*;

public class AddressBookMain {

    private static List<AddressBook> addressBookList = new ArrayList<>();

    private static Map<String, AddressBook> map
            = new HashMap<String, AddressBook>();

    private static AddressBook addressBook;

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        int n = 0;
        Scanner scan = new Scanner(System.in);

        while (n != 6) {
            System.out.println("1.Create new Address book \n2.Remove Address book"
                    + "\n3.Print all Address book \n4. Select Address book \n5. Search \n6. Exit");
            n = scan.nextInt();
            switch (n) {
                case 1:
                    addNewAddressBook();
                    break;
                case 2:
                    removeAddressBook();
                    break;
                case 3:
                    showAddressBook();
                    break;
                case 4:
                    selectAddressBook();
                    break;
                case 5:
                    search();
                    break;
                case 6:
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }

    }

    private static void search() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Name of State or City");
        String searchData = scan.nextLine();
        for (AddressBook addressBook : addressBookList) {
            addressBook.contactList.stream().filter(contacts -> contacts.state.equals(searchData)||contacts.city.equals(searchData)).forEach(contacts -> System.out.println(contacts));
        }
    }

    private static void selectAddressBook() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of address book to be selected");
        String name = scan.nextLine();
        for (Map.Entry<String, AddressBook> m : map.entrySet()) {
            if (m.getKey().equals(name)) {
                addressBook = m.getValue();
                int option = 0;
                while (option != 5) {
                    System.out.println("1.Add Contact \n2.Remove Contact"
                            + " \n3.Edit Contact \n4.Print all Contact \n5. Back to main menu");
                    option = scan.nextInt();
                    switch (option) {
                        case 1:
                            addressBook.addNewContact();
                            break;
                        case 2:
                            addressBook.deleteContact();
                            break;
                        case 3:
                            addressBook.editContact();
                            break;
                        case 4:
                            addressBook.printAllContacts();
                            break;
                        case 5:
                            System.out.println("Back to main menu");
                            break;
                        default:
                            System.out.println("Invalid Selection ");
                    }
                }

            }
        }
    }

    private static void showAddressBook() {

        for (Map.Entry<String, AddressBook> m : map.entrySet()) {
            System.out.println(m.getKey());
        }
    }

    private static void removeAddressBook() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of Address Book to be removed");
        String name = scan.nextLine();
        for (Map.Entry<String, AddressBook> m : map.entrySet()) {
            if (m.getKey().equals(name)) {
                map.remove(name);
            }
        }
    }

    public static void addNewAddressBook() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of Address Book");
        String name = scan.nextLine();
        AddressBook addressBook = new AddressBook();
        addressBookList.add(addressBook);
        map.put(name, addressBook);
    }
}
