package AbstractClasses;

public abstract class GameCalculator {

	public abstract void hesapla();
	
	//final methodu ezemiyeceği anlamına geliyor.
	public final void gameOver() {
		System.out.println("Oyun Bitti.");
	}
	
}
