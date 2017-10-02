package ch2lab;

import java.awt.Rectangle;

public class RectanglePrinter
{
   public static void main(String[] args)
   {
      Rectangle r1 = new Rectangle(0, 0, 100, 50);
      Rectangle r2 = r1;
      r2.grow(10, 20);

      System.out.println(r1);
      System.out.println(r2);
   }
}
/*Output
 * java.awt.Rectangle[x=-10,y=-20,width=120,height=90]
 * java.awt.Rectangle[x=-10,y=-20,width=120,height=90]
 * With the initialization of r2 changed as indicated above, r1 and r2 refer to the same object.
 * When the grow method is applied to r2, it changes the same object r1 is referring to.
 */