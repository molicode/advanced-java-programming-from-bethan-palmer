
package functionalinterfaceexample;

import lambdaexample.MessagePrinter;

/**
 *
 * @author luis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GreetingMessage gretingMessage = new GreetingMessage() {
            @Override
            public void greet(String name) {
                System.out.println("Hello " + name);
            }
        };
        gretingMessage.greet("Luis");
        
        GreetingMessage greetingMessage2 = (String name) -> {
            System.out.println("Hello " + name);
        };
        greetingMessage2.greet("Luis");

        MessagePrinter messagePrinter = () -> {
            System.out.println("This is a message");
        };
        messagePrinter.printMessage();
    }
    
}
