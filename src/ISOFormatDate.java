package src;

public class ISOFormatDate {
	private int day;
	private int month;
	private int year;

	public ISOFormatDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	@Override
	public String toString() {
		return String.format("%4d-%02d-%2d", this.year, this.month, this.day);
	}
}
