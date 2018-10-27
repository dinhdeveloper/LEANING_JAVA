package khacnguyen;

public class Dog extends Animal {
	
	public Dog() {
		super();
		
	}

	public Dog(String ten, int soChan) {
		super(ten, soChan);
	}

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.nhap();
		dog.xuat();
		
		Dog d1= new Dog("con cho con", 0);
		d1.xuat();
	}
}
