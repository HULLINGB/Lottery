import java.util.Random;







public class bruteforcestringbuilder8{


  public static void main(String[] args)
  {

      String[] array = {"a" , "b" , "c" , "d" , "e" , "f", "g", "h",
                      "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};


      Random rand = new Random();

      String password2 = "";

      int length = array.length;
      int length2 = length - 1;

      int power = 6;
      long counter = 0;
      String password = "";
      long numberOfLoops;





        int n;
        int pos0;
        /**
        int a = number.nextInt(22);
        a = a + 7;
**/

        for(int c = 0; c < 6; c++)
        {
          n = rand.nextInt(length);
          pos0 = n;
          password = password + array[pos0];


        }






      for( ; ; )
      {
        numberOfLoops = 1;
        for(int f = 0; f < power; f++)
        {
          numberOfLoops = numberOfLoops * length2;
        }
        for(long i = 0; i < numberOfLoops; i++)
        {

          for(int z = 0; z < power; z++)
          {
            n = rand.nextInt(length);

            password2 = password2 + array[n];

          }
          counter++;
          System.out.println(password + "  " + password2 + "  " + counter + "  " + numberOfLoops);





            if(password == password2)
            {
              for(long y = 0; y < numberOfLoops; y++)
              {
                System.out.println("The password has been found:" + password);
              }
            }

            password2 = "";


          }
          power++;






      }


}



}
