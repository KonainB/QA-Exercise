package enum_org;

public class EnumExample {
	public enum Season{WINTER,SPRING,SUMMER,AUTUMN}
	public enum ProdColour{RED,BLUE,GREEN,YELLOW,ORANGE};
	public String name;
	public static void main(String[] args) {
		for(Season s:Season.values())
		{
			System.out.println(s);
		}
		for (ProdColour p:ProdColour.values())
		{
			System.out.println(p);
		}
		System.out.println("The value of Winter is "+Season.valueOf("WINTER").ordinal());
		System.out.println("The value of Summer is "+Season.valueOf("SUMMER").ordinal());
	}
	
	
}
