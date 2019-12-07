/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author ALVIN
 */
public class Stud implements Student{
    
    int age = 3; //will be seen first before they go to the one in the interface being implemented
    //String name = "John";
    public void sayName()  //even though u might not explicitly define a method as public in the interface, it must be explicitly defined as public in the implementing class, otherwise u would be lowering its access previleges to default   
    {
        System.out.println(name);
    }
    
    public int add(int a)
    {
        return(a + age); //will see 
    }
    public void sayName(int b)
    {
        //overloading a method
    }
    public static void main(String args[])
    {
        Stud st = new Stud();
        //st.sayName();
        System.out.println(st.add(7));
        Student.unique();
    }
}
