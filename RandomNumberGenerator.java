import java.util.Random;



public class RandomNumberGenerator{



  public static void main(String[] args)
  {

      String[] a = {"1" , "2" , "3" , "4" , "5" , "6", "7", "8",
                      "9", "0"};

      Random r = new Random();
      String w = "";
      int l = array.length;
      int p = 12;
      long c = 0;
      String s = "";
        int n;

        //Number of digits in the lottery number 12
        for(int c = 0; c < 12; c++)
        {
          n = r.nextInt(l);
          w = w + a[n];
        }

        for( ; ; )
        {
          for(int z = 0; z < p; z++)
          {
            n = r.nextInt(l);
            s = s + a[n];
          }
          c++;
          System.out.println(w + "  " + s + "  " + c + " combinations");

            if(s.equals(w))
            {
                System.out.println("The password has been found:" + s);
                //End program if found
                System.exit(0);
            }
            s = "";
        }
}
}