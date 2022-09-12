package com.bridgelabz;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileHandler {

    public void readFromFile() {
        Path path = Paths.get("src/main/resources/AddressBookText.txt");

        try {
            System.out.println(Files.readAllLines(path));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void writeIntoFile(String adBookName, AddressBook addressBook) {

        Path path = Paths.get("src/main/resources/AddressBookText.txt");

        try {
            String data = "";
            for (Contacts contact: addressBook.contactList) {
                data += contact.toString();
            }
            Files.write(path,data.getBytes());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void writeIntoCSV(String name, AddressBook addressBook) {

        try {
            CSVWriter csv = new CSVWriter(new FileWriter("src/main/resources/AddressBookCSV.csv"));
            for (Contacts contact: addressBook.contactList) {
                String[] data = new String[] {contact.firstName,contact.lastName,contact.address,contact.city,contact.state,contact.email,contact.phoneNo};
                csv.writeNext(data);
            }
            csv.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
