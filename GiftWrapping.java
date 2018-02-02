/**
 * @author Briana Berger
 * @version Christmas
 */
import java.util.Scanner;
public class GiftWrapping
{
    public static void main (String [ ] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Total length of wrapping? (in inches)");
        int length = in.nextInt();
        
        System.out.print("Total width of wrapping? (in inches)");
        int width = in.nextInt();
        
        for ( int row = 0 ; row < length ; row++ )
        {
            for ( int col = 0 ; col < width ; col++ )
            {
                if((col % 2) == 0)
                {
                    System.out.print("*");
                }
                else if((col % 2) != 0)
                {
                    System.out.print("=");
                }
            }
            System.out.println() ;
        }
    }
}
