package selfPractise_APIPojos.complexBodies;

public class MainRequest {
	private Entity entity;
	private String conjunction;
	private Conditions[] condition;

	public MainRequest(Entity entity, String conjunction, Conditions[] condition) {
		super();
		this.entity = entity;
		this.conjunction = conjunction;
		this.condition = condition;
	}



	public Entity getEntity() {
		return entity;
	}

	public void setEntity(Entity entity) {
		this.entity = entity;
	}

	public String getConjunction() {
		return conjunction;
	}

	public void setConjunction(String conjunction) {
		this.conjunction = conjunction;
	}

	public Conditions[] getCondition() {
		return condition;
	}

	public void setCondition(Conditions[] condition) {
		this.condition = condition;
	}
	

}
