import java.io.IOException;

//Exception subclassing
public class ExceptionTest {
   public static void main(String[] args) {
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
   } 
} 
// subclasses of Exception
class ExceptionA extends Exception {
   public ExceptionA(String s){super(s);}
}
class ExceptionB extends ExceptionA {
   public ExceptionB(String s){super(s);}
} 