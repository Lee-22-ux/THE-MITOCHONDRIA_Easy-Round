/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package four;

/**
 *
 * @author MilkTea
 */
import java.util.Scanner;
public class Four {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Yac = new Scanner(System.in);
        String [] Alyssa = {"Lee", "Jayson", "Jana"};
        
        System.out.print("List of Names:[");
        
        int i = 0;
        while (i <= 2) {
            System.out.print(Alyssa[i] + " ");
            i++;
        }
        System.out.println("]");
        
        System.out.println("Enter a name from the list;");
        String Jana = Yac.nextLine();
        System.out.println("Welcome, " + Jana + "!");
    }
    
}
