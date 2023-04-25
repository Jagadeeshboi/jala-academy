//Create two interfaces with one method each. Implement these two interfaces in one 
//class.
package basic;
interface Interface1 {
    void method1();
}

interface Interface2 {
    void method2();
}

class My implements Interface1, Interface2 {
    public void method1() {
        System.out.println("Method 1 from Interface 1 is called");
    }
    public void method2() {
        System.out.println("Method 2 from Interface 2 is called");
    }
}



public class two_interf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		My myObj = new My();
		myObj.method1(); // prints "Method 1 from Interface 1 is called"
		myObj.method2(); // prints "Method 2 from Interface 2 is called"


	}

}

