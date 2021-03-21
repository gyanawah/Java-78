interface Nums{
	public int addNum(int x, int y);
}

class NumsImpl
{
	public static void main(String[] args) 
	{
		Nums obj = new Nums(){
			public int addNum(int x, int y){
				return x+y;
			}
		};

		System.out.println("Sum = "+obj.addNum(10,20));

		Nums obj1 = new Nums(){
			public int addNum(int x, int y){
				return x+y;
			}
		};
	}
}
