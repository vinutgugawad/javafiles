class Temple{

public static void main(String []args){

int noofDays=8;
String dayName;

   switch (noofDays){
	case 1:
	dayName = "monday";
	break;
	case 2:
	dayName = "tuesday";
	break;
	case 3:
	dayName = "wensday";
	break;
	case 4:
	dayName = "thursday";
	break;
	case 5:
	dayName = "fri";
	break;
	case 6:
	dayName = "sat";
	break;
	case 7:
	dayName = "sun";
    break;

    default:
    dayName="invalid";
	
	

{
	System.out.println("this is the day ==="+dayName);
}
}
}
}
