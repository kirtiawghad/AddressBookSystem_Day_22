package com.bl.addressbook;
import java.util.Scanner;
public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");

        AddressBook obj = new AddressBook();
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println( "1.AddContact\n" + "2.DisplayContact");
            System.out.println("Enter the number");
            number = sc.nextInt();

            switch (number){
                case 1:
                    obj.addContacts();
                    break;
                case 2:
                    obj.displayContacts();
                    break;
                default:
                    System.out.println("invalid details!!");
            }
        }while (number != 2);

    }
}
