package basic;
abstract class abclass{
 public abstract void abstractMethod();
}

//ChildClass.java
class ChildClass extends abclass{
 public void abstractMethod() {
     System.out.println("This is the implementation of abstractMethod() in ChildClass.");
 }

 public void callAbstractMethod() {
     // Create anonymous inner class that extends ChildClass and implements abstractMethod()
     abclass anonymous = new ChildClass() {
         public void abstractMethod() {
             System.out.println("This is the implementation of abstractMethod() in the anonymous inner class.");
         }
     };
     anonymous.abstractMethod();
 }
}

public class call_abt_inst {

	public static void main(String[] args) {
        ChildClass example = new ChildClass();
        example.callAbstractMethod(); 
		
	}

}
