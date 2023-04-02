class Practice
{

	public int sum(int a, int b)
	{
		System.out.println("1st method called");
		return a + b;
	}
	public int sum(int c, int d,int e)
	{
		System.out.println("2nd method called");
		return c + d +e;
	}
	public static void main(String[] args)
	{
		Practice p = new Practice();
		System.out.println(p.sum(20,30));
	}

}