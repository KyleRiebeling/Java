/*Programmer Name: Kyle Riebeling
 * Assignment Start: 12:05 PM 5/21/2023
 * Assignment Completion: 12:39 PM 5/21/2023
 * Total Hours of Assignment: ~ 30 minutes  
 * Comments: 
 */

import java.io.IOException;

//Exception subclassing
public class ExceptionTest {
   public static void main(String[] args) {
      java.util.Date date = new java.util.Date();
      for ( int i = 0; i < 5; i++){
         try{
            switch (i){
               case 0:
                  throw new ExceptionA("Error 1");
               case 1:
                  throw new ExceptionB("Error 2");
               case 2:
                  throw new NullPointerException("Error 3");
               case 3:
                  throw new IOException("Error 4");
               case 4:
                  throw new Exception("Error 5");
            }
         }
         catch (NullPointerException n){
            System.out.println("NullPointerException: " + n.getMessage());
         }catch (IOException io) {
            System.out.println("IOException: " + io.getMessage());
        } catch (ExceptionB b) {
            System.out.println("ExceptionB: " + b.getMessage());
        } catch (ExceptionA a) {
            System.out.println("ExceptionA: " + a.getMessage());
        } catch (Exception e) {
            System.out.println("Base Exception: " + e.getMessage());
        }
      }
      System.out.printf("\nThank you for using the Exception application.\nTime of calculation is %s\n\n", date);
      System.exit(0);
   } 
} 
// subclasses of Exception
class ExceptionA extends Exception {
   public ExceptionA(String s){super(s);}
}
class ExceptionB extends ExceptionA {
   public ExceptionB(String s){super(s);}
} 