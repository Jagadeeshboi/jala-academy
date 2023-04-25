package basic;
 class ParentClass {
    private int number;
    private String text;

    public ParentClass(int number, String text) {
        this.number = number;
        this.text = text;
    }

    public void printFields() {
        System.out.println("Parent class fields:");
        System.out.println("number: " + this.number);
        System.out.println("text: " + this.text);
    }
}

 class Chi extends ParentClass {
    private boolean flag;

    public Chi(int number, String text, boolean flag) {
        super(number, text);
        this.flag = flag;
    }

    public void printFields() {
        super.printFields(); // calling parent class method using super keyword
        System.out.println("Child class fields:");
        System.out.println("flag: " + this.flag);
    }

public class super_c {
	
	public static void main(String[] args) {
        Chi obj = new Chi(42, "Hello World!", true);
        obj.printFields();
	}
		
	}


}
