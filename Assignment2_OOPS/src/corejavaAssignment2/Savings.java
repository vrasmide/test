
package corejavaAssignment2; 

class Bank {
	public int cash() {
		return 0;
	}}
	class Saving extends Bank {
		public int cash() {
			return 50000;
		}
	}
	class Current extends Bank {
		public int cash() {
			return 30000;
		}
	}
	
	
	public class Savings{
		public static void main(String[] args) {
			
			Current c= new Current();
			Saving s= new Saving();
			System.out.println("Total balance in bank :"+(c.cash()+s.cash())); 
			}
		}

