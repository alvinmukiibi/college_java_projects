

 // Collections method sort.
    import java.util.List;
    import java.util.Arrays;
    import java.util.Collections;
  public class sort {

public static void main( String[] args )
{
 String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };

 // Create and display a list containing the suits array elements
 List< String > list = Arrays.asList( suits ); // create List
 //System.out.printf( "Unsorted array elements: %s\n", list );
Collections.sort( list );


 // output list
 System.out.printf( "Sorted array elements: %s\n", list );
 } // end main
}   

