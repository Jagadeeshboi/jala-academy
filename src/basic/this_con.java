package basic;

public class this_con {
    private int number;
    private String text;

    public this_con(int number, String text) {
        this.number = number;
        this.text = text;
    }

    public this_con(int number) {
        this(number, "Default Text");
    }

    public void printFields() {
        System.out.println("number: " + this.number);
        System.out.println("text: " + this.text);
    }
	public static void main(String[] args) {
		this_con j=new this_con(45,"jala");
		j.printFields();

	}

}
