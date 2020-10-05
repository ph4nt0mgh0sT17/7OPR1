package cz.osu;

import cz.osu.utils.IntroductionDisplayer;
import lombok.extern.slf4j.Slf4j;

import javax.swing.*;

@Slf4j
public class OsuApp {

    public static void main(String[] args) {
        System.out.println(IntroductionDisplayer.renderIntroduction());

        // Testing the getting input of users from the UI
        JOptionPane.showMessageDialog(null,"Welcome to the JAVA");
        String name = JOptionPane.showInputDialog("What is your name?");

        String message = String.format("My name is %s and I am glad to be here!", name);

        JOptionPane.showMessageDialog(null, message);

        name = JOptionPane.showInputDialog("Type an integer number:");
        int k = Integer.parseInt(name);
        System.out.println("The integer number: " + k);

        message = String.format("The loaded integer number is: %d is here", k);
        JOptionPane.showMessageDialog(null, message);

        name = JOptionPane.showInputDialog("Type an double number:");
        double db = Double.parseDouble(name);
        System.out.println("The dboule number: " + db);

        message = String.format("The loaded double number is: %7.2f is here", db);
        JOptionPane.showMessageDialog(null, message);
    }


}
