package ch2lab;

public class NumberVariablesPrinter
{
   public static void main(String[] args)
   {
      double n1 = 150;
      double n2 = n1;

      n2 = n2 * 20; // Grow n2

      System.out.println(n1);
      System.out.println(n2);
   }
}
/*150
 * 3000
 * When you copy a primitive type value, the original and the copy of the number are independent values. 
 * But when you copy an object reference, both the original and the copy are references to the same object.
 */
