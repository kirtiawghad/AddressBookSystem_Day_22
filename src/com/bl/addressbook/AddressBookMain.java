package com.bl.addressbook;
import java.util.Scanner;
public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");

        AddressBook obj = new AddressBook();
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println( "1.AddContact\n"+"2.EditContact\n" +"3.DeleteContact\n"+ "4.DisplayContact");
            System.out.println("Enter the number");
            number = sc.nextInt();

            switch (number){
                case 1:
                    System.out.println("Enter the number of contact you want ot add : ");
                    int numberOfContacts = sc.nextInt();
                    for (int i =0; i < numberOfContacts ; i++){
                        obj.addContacts();
                    }
                    break;
                case 2:
                    obj.editContacts();
                    break;
                case 3:
                    obj.deleteContacts();
                    break;
                case 4:
                    obj.displayContacts();
                    break;
                default:
                    System.out.println("invalid details!!");
            }
        }while (number != 5);

    }
}
