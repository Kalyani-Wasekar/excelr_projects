package All_Java_Projects;

public class month_in_year {
//
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
		String month = "april";
		int year = 2024;
		switch (month) {
		case "jan":
		case "march":
		case "may":
		case "july":
		case "Aug":
		case "Oct":
		case "dec":
			System.out.println("31 Days");
			break;
			case "feb" :
			if (year%4==0 && year%100!=0 || year%400==0) {
				System.out.println("29 days");
			}
			else {
				System.out.println("28 days");
				
			}
			break;
		case "april":
		case "june":
		case "sep":
		case "nov":
			System.out.println("30 Days");
			break;
//			
//			
		}
//		
//
	}

}


