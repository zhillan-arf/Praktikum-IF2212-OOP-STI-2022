public class FuelException extends java.lang.Exception {
	private String fuel;
	public FuelException(String fuel) {
		this.fuel = fuel;
	}
	public String getMessage() {
		return ("Bensin jenis " + this.fuel + " tidak sesuai");
	}
}
