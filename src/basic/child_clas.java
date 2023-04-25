package basic;
//import inheritance_pro.parent_cla;

public class child_clas extends example {

	public static void main(String[] args) {
		child_clas example = new child_clas();
        example.protectedField = 10;
        example.protectedString = "Hello";
        System.out.println("Protected Field: " + example.protectedField);
        System.out.println("Protected String: " + example.protectedString);
        example.protectedMethod();

	}

}
