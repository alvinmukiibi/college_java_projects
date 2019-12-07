/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innerclasses;

/**
 *
 * @author ALVIN
 */

//public class Outerclass {
//    
//    
//    private  int age = 5;
//    
//    private int addNos(int a, int b)
//    {
//        return (a + b);
//    }
//    
//    public static void main(String args[])
//    {
//        //the outer class must instantiate the inner class to access its members
//       
//        Outerclass.Innerclass inner = new Outerclass.Innerclass();
//        
//        //System.out.println(Innerclass.ft);  
//        inner.demo();
//        System.out.println(Innerclass.ft); //the outer class can access the inner class' private and static members
//    
//    }
//    
//    /* an innerclass is a member of the outerclass just like instance variables and methods
//    it can also access the outerclass' private and static members */
//    static class Innerclass{
//        
//        private static double ft = 6.7;
//        public static final int p = 8;
//        
//        public  void demo()  //if this method was made static then the whole class would have to be static, unlike for final static constants
//        {
//            
//           // u cant access instance variables of the outerclass in a static inner class
//           // System.out.println("The age is " + age); //innerclass can access outer members even of they were private
//            
//          // System.out.println("The sum of 3 and 5 is " + addNos(3,5));
//            
//            
//            System.out.println("This is an innerclass invocation");
//        }
//        
//    }
//    
//}

 

 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /*
package innerclasses;

/**
 *
 * @author ALVIN
 */
public class Outerclass {

    private int age = 5;
    public int k = 8;

    public int addNos(int a, int b) {
        return (a + b);
    }

    public void demo() {
        System.out.println("Outer class invocation");
        //local class

        int q = 99;
        final int p = 8;
        class local {

            public int c = 5;

            public void getlocal() {
                System.out.println("The value of q is " + age);
            }
        }
        local lo = new local();
        lo.getlocal();

    }

    public static void main(String args[]) {
        //the outer class must instantiate the inner class to access its members
        Outerclass outer = new Outerclass();
        Outerclass.Innerclass inner = outer.new Innerclass();
        Innerclass.Moreinner moreinner = inner.new Moreinner(); //object of the more inner class
        moreinner.print();
        inner.demo();
        System.out.println(inner.ft); //the outer class can access the inner class' private and static members
    }

    //an innerclass is a member of the outerclass just like instance variables and methods
    //it can also access the outerclass' private and static members
    class Innerclass {

        private double ft = 6.7;
        public static final int d = 4;

        public void demo() //if this method was made static then the whole class would have to be static, unlike for final static constants
        {
            System.out.println("The age is " + age); //innerclass can access outer members even if they were private
            
            System.out.println("The sum of 3 and 5 is " + addNos(3,5));
             
            System.out.println("Inner class invocation");

        }

        public void main() {
            Outerclass.this.demo(); //to invoke the method defn of the outerclass
            
        }

        class Moreinner {

            public void print() {
                System.out.println("more inner class");
            }
        }

    }

}
