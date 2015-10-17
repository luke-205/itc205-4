public class BugTestOne {
	public static void main(String[] args) {
		 Player player = new Player("Bubblegum", 100);
		 player.setLimit(0);
		 Game game = new Game(new Dice(), new Dice(), new Dice());
		 DiceValue pick = DiceValue.CLUB;
		 System.out.println("pick: " + pick);
		 System.out.println("player.getBalance() before: " + player.getBalance());
		 int winnings = game.playRound(player, pick, 5);
		 System.out.print("Rolls: ");
		 for(DiceValue dv : game.getDiceValues())
		 	System.out.print(dv + " ");
		 System.out.println();
		 System.out.println("player.getBalance() after: " + player.getBalance());
		 System.out.println("winnings: " + winnings);
	}
}