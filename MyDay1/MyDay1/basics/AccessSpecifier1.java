package basics;

public class AccessSpecifier1 {
	
	public int i=10;
	protected int j=20;
	int k=30;
	private int m=40;

	public static void main(String[] args) {
		
		AccessSpecifier1 as=new AccessSpecifier1();
		System.out.println("m= "+as.m);

	}

}
