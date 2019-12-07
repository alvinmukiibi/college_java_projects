
package windsor;

/**
 *
 * @author ALVIN
 */
public class Revision {
    String make;
    String color;
    boolean engineState;
    
    void startEngine()
    {
        if(engineState == true)
        {
            System.out.println("The engine state is on");
        }
        else
        {
            engineState = true;
            System.out.println("The engine state has now been switched on");
        }
    }    
}
