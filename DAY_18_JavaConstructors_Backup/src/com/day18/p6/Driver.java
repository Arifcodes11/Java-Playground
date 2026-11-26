package com.day18.p6;

class Book{
	Book(String title){
		super();
		System.out.println("book Constructor");
		System.out.println("Title : "+title);
		
	}
}
class EBook extends Book {
	EBook(){
		super("Java Programming");
		System.out.println("EBook Programming");
	}
}
class PDFBook extends EBook {
	PDFBook()
	{
		System.out.println("PDFBook Copnstructor");
	}
}
public class Driver {

	public static void main(String[] args) {
		PDFBook book = new PDFBook();
		System.out.println();
		System.out.println("Hashcode = "+ book.hashCode());
	}

}
