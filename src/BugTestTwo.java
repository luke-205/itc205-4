public class BugTestTwo {
	public static void main(String[] args) {
		Player player = new Player("Bubblegum", 10);
		player.setLimit(0);
		Game game = new Game(new Dice(), new Dice(), new Dice());
		DiceValue pick;
		int bet = 5;
		System.out.println("balance: " + player.getBalance());
		System.out.println("limit: " + player.getLimit());
		while(player.balanceExceedsLimitBy(bet)) {
			pick = DiceValue.getRandom();
			game.playRound(player, pick, bet);
			System.out.println("balance: " + player.getBalance());
		}
		System.out.println("final balance: " + player.getBalance());
		System.out.println("limit: " + player.getLimit());
	}
}