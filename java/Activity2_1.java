package javaActivity2;

//Abstract class
abstract class Book {
	String title;

	//Abstract method
	abstract void setTitle(String s);

	//Concrete method
	public String getTitle() {
		return title;
	}
}

class MyBook extends Book {
	//Define abstract method
	public void setTitle(String s) {
		title = s;
	}
}

public class Activity2_1 {

	public static void main(String []args) {

		Book newNovel = new MyBook();

		String title = "My New Novel";
		newNovel.getTitle();//NULL
		newNovel.setTitle(title);

		System.out.println("Title of BOOK :"+ newNovel.getTitle());
	}
}