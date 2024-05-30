package selfPractise_APIPojos.AbhishekComplexBody;

public class Lotto {
	int loottoId;
	int [] winningNo;
	Winners [] winners;
	public Lotto(int loottoId, int[] winningNo, Winners[] winners) {
		super();
		this.loottoId = loottoId;
		this.winningNo = winningNo;
		this.winners = winners;
	}
	public int getLoottoId() {
		return loottoId;
	}
	public void setLoottoId(int loottoId) {
		this.loottoId = loottoId;
	}
	public int[] getWinningNo() {
		return winningNo;
	}
	public void setWinningNo(int[] winningNo) {
		this.winningNo = winningNo;
	}
	public Winners[] getWinners() {
		return winners;
	}
	public void setWinners(Winners[] winners) {
		this.winners = winners;
	}
	
	

}
