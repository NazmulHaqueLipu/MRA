package datatypes;


public class TimeData {
	private String day;
	private String month;
	private String year;

	public TimeData(String year, String month, String day) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public String getDay() {
		return day;
	}

	public String getMonth() {
		return month;
	}
	
	public String getYear()  {
		return year;
	}
	@Override
	public String toString() {
		return "TimeData [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
}
