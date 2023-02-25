package alttab_Sprint_2;

public class Bottles {

	public static void main(String[] args) {

		printSong("slime", 3);

	}

	static void printSong(Object stuff, int n) {
		String plural = (n == 1) ? "" : "s";
		loop: while (true) {
			System.out.println(n + " bottle" + plural + " of " + stuff + " on the wall,");
			System.out.println(n + " bottle" + plural + " of " + stuff + ";");
			System.out.println("You take one down " + "and pass it around:");
			--n;
			plural = (n == 1) ? "" : "s";
			if (n == 0)
				break loop;
			System.out.println(n + " bottle" + plural + " of " + stuff + " on the wall!\n");
		}
		System.out.println("No bottles of" + stuff + " on the wall!");
	}
}
