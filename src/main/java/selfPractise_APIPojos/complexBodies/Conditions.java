package selfPractise_APIPojos.complexBodies;

public class Conditions {
	private String operation;
	private String datakey;
	private String datatype;
	private String value;
	public Conditions(String operation, String datakey, String datatype, String value) {
		super();
		this.operation = operation;
		this.datakey = datakey;
		this.datatype = datatype;
		this.value = value;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public String getDatakey() {
		return datakey;
	}
	public void setDatakey(String datakey) {
		this.datakey = datakey;
	}
	public String getDatatype() {
		return datatype;
	}
	public void setDatatype(String datatype) {
		this.datatype = datatype;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	

}
