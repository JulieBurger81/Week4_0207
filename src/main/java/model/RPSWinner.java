/**
 * @author Julie Burger - jaburger
 * CIS175 - Spring 2023
 * Feb 3, 2023
 */
package model;

public class RPSWinner {
	private String firstHand;
	private String secondHand;
	private String winner;
	/**
	 * 
	 */
	public RPSWinner() {
		super();
	}
	/**
	 * @param firstHand
	 * @param secondHand
	 */
	public RPSWinner(String firstHand, String secondHand) {
		super();
		setFirstHand(firstHand);
		setSecondHand(secondHand);
		
		setWinningHand(firstHand, secondHand);
	}
	/**
	 * @return the firstHand
	 */
	public String getFirstHand() {
		return firstHand;
	}
	/**
	 * @param firstHand the firstHand to set
	 */
	public void setFirstHand(String firstHand) {
		this.firstHand = firstHand;
	}
	/**
	 * @return the secondHand
	 */
	public String getSecondHand() {
		return secondHand;
	}
	/**
	 * @param secondHand the secondHand to set
	 */
	public void setSecondHand(String secondHand) {
		this.secondHand = secondHand;
	}
	/**
	 * @return the winner
	 */
	public String getWinner() {
		return winner;
	}
	/**
	 * @param winner the winner to set
	 */
	public void setWinner(String winner) {
		this.winner = winner;
	}
	
	@Override
	public String toString() {
		return "RPSWinner [firstHand=" + firstHand + ", secondHand=" + secondHand + ", winner=" + winner + "]";
	}
	/**
	 * @param firstHand2
	 * @param secondHand2
	 */
	private void setWinningHand(String firstHand, String secondHand) {
		String winner;
		switch (firstHand) {
		case "rock":{
			switch (secondHand) {
				case "rock": winner = "tied"; break;
				case "scissors": winner = "first"; break;
				case "lizard": winner = "first"; break;
				default: winner = "second"; break;
			}
			break;
		}
		case "paper":{
			switch (secondHand) {
				case "paper": winner = "tied"; break;
				case "rock": winner = "first"; break;
				case "spock": winner = "first"; break;
				default: winner = "second"; break;
			}
			break;
		}
		case "scissors":{
			switch (secondHand) {
				case "scissors": winner = "tied"; break;
				case "paper": winner = "first"; break;
				case "lizard": winner = "first"; break;
				default: winner = "second"; break;
			}
			break;
		}
		case "lizard":{
			switch (secondHand) {
				case "lizard": winner = "tied"; break;
				case "paper": winner = "first"; break;
				case "spock": winner = "first"; break;
				default: winner = "second"; break;
			}
			break;
		}
		case "spock":{
			switch (secondHand) {
				case "spock": winner = "tied"; break;
				case "rock": winner = "first"; break;
				case "scissors": winner = "first"; break;
				default: winner = "second"; break;
			}
			break;
		}
		default: winner = "case not accounted for"; break;
		}	

		// set winner description since wording couldn't be consistent between tied and winner
		if (winner == "tied") {
			setWinner("This was a tied game."); 
		} else if (winner == "first") {
			setWinner("The first player won! Way to go!!!");
		} else {
			setWinner("The second player won! Congratulations");
		}

	}
	
}
