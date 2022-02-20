import javax.swing.*;

public class JavaLibs5026211101{

    public static void main(String[] args) {

        //1. Name
        String response;
        response = JOptionPane.showInputDialog("Your name");

        String name = response;

        //2 and 3 integer math to generate number
        response = JOptionPane.showInputDialog("Think of a number");
        int a = Integer.parseInt(response);

        response = JOptionPane.showInputDialog("And another number");
        int b = Integer.parseInt(response);

        int sum = a + b;

        //4 and 5 double math to generate percentage
        response = JOptionPane.showInputDialog("Think about a double number");
        double c = Double.parseDouble(response);

        response = JOptionPane.showInputDialog("Think about another double number");
        double d = Double.parseDouble(response);

        double percentage = c + d;

        //6. String input for your dream
        response = JOptionPane.showInputDialog("Your dream");

        String dream = response;

        //7. integer increase to generate bad number
        response = JOptionPane.showInputDialog("The number that you liked the most");
        int e = Integer.parseInt(response);

        int bad = (e) + 4;

        //8. String input for Bad things
        response = JOptionPane.showInputDialog("Your biggest fear");

        String haunt = response;

        //9. String input for lucky word
        response = JOptionPane.showInputDialog("Your lucky word");

        String luck = response;

        //10. Integer input for amount of time
        response = JOptionPane.showInputDialog("The amount of time (in years) you need to join ITS");
        int time = Integer.parseInt(response);

        //Print
        String newline = System.lineSeparator();
        String message = "Hi my name is " + name + " I just found this number: " + sum + " I don't know " + newline +
                " what to say because the chances for me to get that number " + percentage + " Percent. " + newline +
                " Which is quite an acceptable number. " + dream + " Is something that i want to achieve. " + newline +
                " Apparently, " + bad + "Is my own unlucky number, thank god i didn't get that number. " + newline +
                " However, there is one thing i want to show to you, to be honest i hate " + haunt + " They " + newline +
                " are scary and please avoid that thing in your life. You may as well found your " + luck + " Please " + newline +
                " be careful on your journey and i will see you in " + time + " years. ";

        System.out.println(message);

    }
}