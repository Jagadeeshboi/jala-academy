//Create two interfaces with the same method (same signature) in both the interfaces. 
//Implement these two interfaces in one class. Call the method.

package basic;
interface same1{
    void Method();
}

interface same2{
    void Method();
}

class MyClas implements same1, same2{
    public void Method() {
        System.out.println("myMethod() is called");
    }
}
public class two_inter_same_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClas myObj = new MyClas();
		myObj.Method(); // prints "myMethod() is called"


	}

}
