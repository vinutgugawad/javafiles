class Lock{

	static String lockName="Passwordlock";
	public static int priceOfTheLock(int price){
	System.out.println(price);
	return price;

	}

	public static void main(String[] args){

		System.out.println("this impicit ref=="+lockName);
    System.out.println("====================");
   priceOfTheLock(100);

	System.out.println("this expicit ref==");
	}
}
 11 changes: 11 additions & 0 deletions11  
Mole.java