package selfPractise_APIPojos.AbhishekComplexBody;

public class Winners {
	int winnerId;
	int [] numbers;
	public Winners(int winnerId, int[] numbers) {
		super();
		this.winnerId = winnerId;
		this.numbers = numbers;
	}
	public int getWinnerId() {
		return winnerId;
	}
	public void setWinnerId(int winnerId) {
		this.winnerId = winnerId;
	}
	public int[] getNumbers() {
		return numbers;
	}
	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}
	
	

}
