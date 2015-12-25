package org.bhi.q2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author carlo nino mabalatan Refer to week 7 apply intro
 */
public class ScannerExample {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        Scanner myInputStr = new Scanner(System.in);

        System.out.println("Please Enter Name of Football Team: ");
        String footballname = myInputStr.next();

        System.out.println("Please Enter Number of Goals: ");
        int goals = myInput.nextInt();

        System.out.println("Please Enter Number of Goals Behind: ");
        int goalsBehind = myInput.nextInt();

        int totalPoints = goals * 6 + goalsBehind;

        String outputMessage = "The FootBall Team is: " + footballname;
        String outputPoints = "The Total Goal is: " + totalPoints;

        JOptionPane.showMessageDialog(null, outputMessage + "\n" + outputPoints);

    }

}
