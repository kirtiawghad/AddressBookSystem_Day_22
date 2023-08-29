package com.bl.addressbook;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    Scanner sc = new Scanner(System.in);
    ArrayList<Contacts> contactsArrayList = new ArrayList<Contacts>();

    public void addContacts(){
        Contacts obj = new Contacts();
        System.out.println("enter the first name");
        obj.setFirstName(sc.next());

        System.out.println("enter the Last name");
        obj.setLastName(sc.next());

        System.out.println("enter the address");
        obj.setAddress(sc.next());

        System.out.println("enter the city");
        obj.setCity(sc.next());

        System.out.println("enter the state");
        obj.setState(sc.next());

        System.out.println("enter the Zipcode");
        obj.setZipCode(sc.nextDouble());

        System.out.println("enter the mobile number");
        obj.setMobileNumber(sc.nextDouble());

        System.out.println("enter the mail");
        obj.setEmail(sc.next());

        contactsArrayList.add(obj);

    }


    public void displayContacts() {

        for (int i = 0; i < contactsArrayList.size(); i++){

            Contacts obj = contactsArrayList.get(i);
            System.out.println(obj.toString());

        }
    }
}