
public class MyFinalTest {
	
	public static void main(String args[]) {
		final int nOS=100;
		System.out.println("no of Seat in our collage:"+nOS);
		//nOS=150; // can not change the value of nOS cause it is declared as final above 
		System.out.println("no of Seat in our collage:"+nOS);
		 Cards cs=new AndroidCardGame();
		 cs.Distribute();
		
	}
	
}

final class Cards{
	 void play() {
		 System.out.println("we are playing 29");
	 }
	 final void Distribute() {
		 System.out.println("Romanav want to distribute cards");
	 }
}

class AndroidCardGame extends Cards{ // can't extend a final class
	void ComputerPlay() {
		super.play();
		System.out.println("computer is also playing with us");
	}
	void Distribute() { //method overriding //still not possible to override a method declared as final
		super.Distribute();
		System.out.println("computer is also distributing crads");
	}
}



