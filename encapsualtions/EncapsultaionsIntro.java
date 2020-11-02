package encapsualtions;

public class EncapsultaionsIntro {

	public static void main(String[] args) {
		
		
		Laptop l1 = new Laptop();
//		l1.price = 23;
		
		l1.setPrice(31);
		System.out.println(l1.getPrice());
	}
	
//	void doWork()
//	{
//		System.out.println("working working");
//	}
	
} 
	
	class Laptop
	{
		int ram;
		private int price;
		
		public void setPrice(int price)
		{ 
			// is the user admin
			boolean isAdmin = true;
			if(!isAdmin)
			{
				System.out.println(" u cannot set the price");
			}
			else
			this.price  =  price;
		}

		public int getRam() {
			return ram;
		}

		public void setRam(int ram) {
			this.ram = ram;
		}

		public int getPrice() {
			return price;
		}
		
	}

