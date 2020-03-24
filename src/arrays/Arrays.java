/*
 * Jonas Matulis
 * March 24 2020
 */
package arrays;
    import java.util.Scanner;
/**
 *
 * @author jtmat
 */
public class Arrays {

    /**
     * @param args the command line arguments
     * Prompts user for a list a movie and swap the order of them
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner (System.in);
        String [ ] movies = new String [5];
        
      
      
        
        
        System.out.println("Enter your 5 favorite movies:");
        for (int i = 0; i <= 4; i = i + 1) {
           movies[i] = keyedInput.nextLine();
           
        }
        
        System.out.println("How good the movies are in order:");
        for (int i = 4; i >= 0; i = i - 1){
                System.out.println(movies[i]);
        }
        
    }
    
}
