package domain;

public class Book {
	//fields/attributes
	public int bId;
	public String title;
	public float price;
	public String author;
	//method/behaviour
	public void show()
	{
		System.out.println(bId+"--"+title+"=="+price+"--"+author);
	}

}
