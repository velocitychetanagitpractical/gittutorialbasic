
public class Address {


	private String streetNo;
	private String city;
	private String pinCode;
	private String state;
	
	public String getStreetNo() {
		return streetNo;
	}
	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Address(String streetNo, String city, String pinCode, String state) {
		super();
		this.streetNo = streetNo;
		this.city = city;
		this.pinCode = pinCode;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [streetNo=" + streetNo + ", city=" + city + ", pinCode=" + pinCode + ", state=" + state + "]";
	}
	
	
	
	
}
