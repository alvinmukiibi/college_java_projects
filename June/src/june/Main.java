
public class Main {

	int x=8;
	Entry entry;
	Main()
	{
		entry = new Entry();
		System.out.println("value = " + entry.x);
		entry.display();
	}
	class Entry
	{
		int x=9;
		void display()
		{
			int h =9;
			System.out.println("value = " + x);
		}
	}
	public static void main(String args[])
	{
		Main j = new Main();
		
				
	}
	
	
	/*
	instance variables
	-inside a class
	-outside any method
	-every method can have a different copy of it
	-declared without static word
	-belong to the instance not the class
	-called using the object obj.age;
	
	class/static 
	-inside a class
	-outside any method
	-every method has the same copy of it
	-declared with static word
	-belongs to the class not object
	-called using className.age
	
	local
	-inside any method
	-they can't be seen from outside
	-
	
	
	
	
	
	*/
}
