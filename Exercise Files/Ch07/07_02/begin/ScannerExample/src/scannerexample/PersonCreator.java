
package scannerexample;

import java.util.Scanner;

/**
 * @author luis
 */
public class PersonCreator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the name: ");
        String name = scanner.next();

        System.out.println("enter the age: ");
        int age = scanner.nextInt();

        System.out.println("enter the phone number: ");
        Long phoneNumber = scanner.nextLong();

//        System.out.println("Enter the name, age and phone number: ");
//        String name = scanner.next();
//        int age = scanner.nextInt();
//        Long phoneNumber = scanner.nextLong();
        
        Person person = new Person(name, age, phoneNumber);
    }
}
