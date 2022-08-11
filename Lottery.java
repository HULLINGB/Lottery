import java.util.*;

// this program interacts with a user
public class Lottery{

  public static void main(String[] args)
  {
      String[] array = {"1" , "2" , "3" , "4" , "5" , "6", "7", "8",
                      "9", "10", "11", "12", "13", "14", "15", "16", "17",
					"18", "19", "20", "21", "22", "23", "24", "25", "26",
					 "27", "28", "29", "30", "31", "32", "33", "34", "35",
					"36", "37", "38", "39", "40", "41", "42", "43", "44",
					 "45", "46", "47", "48", "49", "50", "51", "52", "53",
					"54", "55", "56", "57", "58", "59", "60", "61", "62",
					 "63", "64", "65", "66", "67", "68", "69", "70",
					"71", "72", "73", "74", "75", "76", "77", "78", "79",
					 "80", "81", "82", "83", "84", "85", "86", "87",
					"88", "89", "90", "91", "92", "93", "94", "95", "96",
					 "97", "98", "99", "0"};
					
					
      Random rand = new Random();

      int length = array.length;
	//start with length of 6 digits
      int lengthOfTicket = 6;
      long count = 0;
	  long totalTicketsPrintedAllTime = 0;
      String number1 = "";
	  String number2 = "";
	  int prize = 0;
      int n = 0;
      int pos0 = 0;

      for(int c = 0; c < lengthOfTicket; c++)
      {
          n = rand.nextInt(length);
          number1 = number1 + array[n];
		  number1 = number1 + " ";
      }

      for( ; ; )
      {
        
        System.out.println("Please enter the number of tickets you want to buy");
        Scanner myObj = new Scanner(System.in);
        int numOfTickets = myObj.nextInt();
        System.out.println("Printing " + numOfTickets + " tickets...");
        for(int m = 0; m < numOfTickets; m++)
        {
            for(int z = 0; z < lengthOfTicket; z++)
			{
				n = rand.nextInt(length);
				number2 = number2 + array[n];
				number2 = number2 + " ";
			}
			count++;
			totalTicketsPrintedAllTime++;
			System.out.println("Winning number: " + number1 + "  " + number2 + "  " + count);
			//Save value to centralized database and do a query statement here. Assign result to a totalTicketsPrintedAllTime
			//System.out.println("Total number of tickets have been sold  " + totalTicketsPrintedAllTime);
			//Total prize can be 90% of total ticket sales or something. 10% house fee, or pull a saved value from the database.
			// double houseFee = .10;
			//int prize = totalTicketsPrintedAllTime * (1 - houseFee);
			//System.out.println("Total prize is:  " + prize);
			if(number1 == number2)
			{
				System.out.println("The password has been found:" + number1);
			}
			number2 = "";
		}
		//reset the count for each sale
		count = 0;
		}
	}
}