import java.util.*;
import java.lang.Math;






public class bruteforcestringbuilder5{


  public static void main(String[] args)
  {

      String[] array = {"a" , "b" , "c" , "d" , "e" , "f", "g", "h",
                      "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
      //int numbers = new int[9];

      Random rand = new Random();
      Random number = new Random();
      //String firstName;
      String lastName = "";
      //String emailName;
      int length = array.length;
      double length2 = 1.0 * length;
      //int counter = 1;
      //boolean add =true;
      double power = 6;
      double numberOfLoops = Math.pow(length, power);
      String password = "";
      //int p = 9;




        int n = rand.nextInt(length);
        int pos0 = n;

        n = rand.nextInt(length);
        int pos1 = n;

        n = rand.nextInt(length);
        int pos2 = n;
        n = rand.nextInt(length);
        int pos3 = n;
        n = rand.nextInt(length);
        int pos4 = n;
        n = rand.nextInt(length);
        int pos5 = n;
        n = rand.nextInt(length);
        int pos6 = n;
        n = rand.nextInt(length);
        int pos7 = n;
        n = rand.nextInt(length);
        int pos8 = n;
        n = rand.nextInt(length);
        int pos9 = n;
        n = rand.nextInt(length);
        int pos10 = n;
        n = rand.nextInt(length);
        int pos11 = n;
        n = rand.nextInt(length);
        int pos12 = n;
        n = rand.nextInt(length);
        int pos13 = n;
        n = rand.nextInt(length);
        int pos14 = n;
        n = rand.nextInt(length);
        int pos15 = n;
        n = rand.nextInt(length);
        int pos16 = n;
        n = rand.nextInt(length);
        int pos17 = n;
        n = rand.nextInt(length);
        int pos18 = n;
        n = rand.nextInt(length);
        int pos19 = n;
        n = rand.nextInt(length);
        int pos20 = n;
        n = rand.nextInt(length);
        int pos21 = n;
        n = rand.nextInt(length);
        int pos22 = n;
        n = rand.nextInt(length);
        int pos23 = n;
        n = rand.nextInt(length);
        int pos24 = n;
        n = rand.nextInt(length);
        int pos25 = n;
        n = rand.nextInt(length);
        int pos26 = n;
        n = rand.nextInt(length);
        int pos27 = n;
        n = rand.nextInt(length);



        int a = number.nextInt(22);
        a = a + 5;
/**
        if(a == 1)
        {
          password = array[pos0];

        }
        if(a == 2)
        {
          password = array[pos0] + array[pos1];
        }
        if(a == 3)
        {
          password = array[pos0] + array[pos1] + array[pos2];
        }
        if(a == 4)
        {
          password = array[pos0] + array[pos1] + array[pos2] + array[pos3];
        }
        if(a == 5)
        {
          password = array[pos0] + array[pos1] + array[pos2] + array[pos3] + array[pos4];
        }
        **/
        if(a == 6)
        {
          password = array[pos0] + array[pos1] + array[pos2] + array[pos3] + array[pos4] + array[pos5];
        }
        if(a == 7)
        {
          password = array[pos0] + array[pos1] + array[pos2] + array[pos3] + array[pos4] + array[pos5] + array[pos6];
        }
        if(a == 8)
        {
          password = array[pos0] + array[pos1] + array[pos2] + array[pos3] + array[pos4] + array[pos5] + array[pos6] + array[pos7];
        }
        if(a == 9)
        {
          password = array[pos0] + array[pos1] + array[pos2] + array[pos3] + array[pos4] + array[pos5] + array[pos6] + array[pos7] + array[pos8];
        }
        if(a == 10)
        {
          password = array[pos0] + array[pos1] + array[pos2] + array[pos3] + array[pos4] + array[pos5] + array[pos6] + array[pos7] + array[pos8] + array[pos9];
        }
        if(a == 11)
        {
          password = array[pos0] + array[pos1] + array[pos2] + array[pos3] + array[pos4] + array[pos5] + array[pos6] + array[pos7] + array[pos8] + array[pos9] + array[pos10];
        }
        if(a == 12)
        {
          password = array[pos0] + array[pos1] + array[pos2] + array[pos3] + array[pos4] + array[pos5] + array[pos6] + array[pos7] + array[pos8] + array[pos9] + array[pos10] + array[pos11];
        }
        if(a == 13)
        {
          password = array[pos0] + array[pos1] + array[pos2] + array[pos3] + array[pos4] + array[pos5] + array[pos6] + array[pos7] + array[pos8] + array[pos9] + array[pos10] + array[pos11] + array[pos12];
        }
        if(a == 14)
        {
          password = array[pos0] + array[pos1] + array[pos2] + array[pos3] + array[pos4] + array[pos5] + array[pos6] + array[pos7] + array[pos8] + array[pos9] + array[pos10] + array[pos11] + array[pos12] + array[pos13];
        }
        if(a == 15)
        {
          password = array[pos0] + array[pos1] + array[pos2] + array[pos3] + array[pos4] + array[pos5] + array[pos6] + array[pos7] + array[pos8] + array[pos9] + array[pos10] + array[pos11] + array[pos12] + array[pos13] + array[pos14];
        }
        if(a == 16)
        {
          password = array[pos0] + array[pos1] + array[pos2] + array[pos3] + array[pos4] + array[pos5] + array[pos6] + array[pos7] + array[pos8] + array[pos9] + array[pos10] + array[pos11] + array[pos12] + array[pos13] + array[pos14] + array[pos15];
        }
        if(a == 17)
        {
          password = array[pos0] + array[pos1] + array[pos2] + array[pos3] + array[pos4] + array[pos5] + array[pos6] + array[pos7] + array[pos8] + array[pos9] + array[pos10] + array[pos11] + array[pos12] + array[pos13] + array[pos14] + array[pos15] + array[pos16];
        }
        if(a == 18)
        {
          password = array[pos0] + array[pos1] + array[pos2] + array[pos3] + array[pos4] + array[pos5] + array[pos6] + array[pos7] + array[pos8] + array[pos9] + array[pos10] + array[pos11] + array[pos12] + array[pos13] + array[pos14] + array[pos15] + array[pos16]  + array[pos17];
        }
        if(a == 19)
        {
          password = array[pos0] + array[pos1] + array[pos2] + array[pos3] + array[pos4] + array[pos5] + array[pos6] + array[pos7] + array[pos8] + array[pos9] + array[pos10] + array[pos11] + array[pos12] + array[pos13] + array[pos14] + array[pos15] + array[pos16]  + array[pos17] + array[pos18];
        }
        if(a == 20)
        {
          password = array[pos0] + array[pos1] + array[pos2] + array[pos3] + array[pos4] + array[pos5] + array[pos6] + array[pos7] + array[pos8] + array[pos9] + array[pos10] + array[pos11] + array[pos12] + array[pos13] + array[pos14] + array[pos15] + array[pos16]  + array[pos17] + array[pos18] + array[pos19];
        }
        if(a == 21)
        {
          password = array[pos0] + array[pos1] + array[pos2] + array[pos3] + array[pos4] + array[pos5] + array[pos6] + array[pos7] + array[pos8] + array[pos9] + array[pos10] + array[pos11] + array[pos12] + array[pos13] + array[pos14] + array[pos15] + array[pos16]  + array[pos17] + array[pos18] + array[pos19] + array[pos20];
        }
        if(a == 22)
        {
          password = array[pos0] + array[pos1] + array[pos2] + array[pos3] + array[pos4] + array[pos5] + array[pos6] + array[pos7] + array[pos8] + array[pos9] + array[pos10] + array[pos11] + array[pos12] + array[pos13] + array[pos14] + array[pos15] + array[pos16]  + array[pos17] + array[pos18] + array[pos19] + array[pos20] + array[pos21];
        }
        if(a == 23)
        {
          password = array[pos0] + array[pos1] + array[pos2] + array[pos3] + array[pos4] + array[pos5] + array[pos6] + array[pos7] + array[pos8] + array[pos9] + array[pos10] + array[pos11] + array[pos12] + array[pos13] + array[pos14] + array[pos15] + array[pos16]  + array[pos17] + array[pos18] + array[pos19] + array[pos20] + array[pos21] + array[pos22];
        }
        if(a == 24)
        {
          password = array[pos0] + array[pos1] + array[pos2] + array[pos3] + array[pos4] + array[pos5] + array[pos6] + array[pos7] + array[pos8] + array[pos9] + array[pos10] + array[pos11] + array[pos12] + array[pos13] + array[pos14] + array[pos15] + array[pos16]  + array[pos17] + array[pos18] + array[pos19] + array[pos20] + array[pos21] + array[pos22] + array[pos23];
        }
        if(a == 25)
        {
          password = array[pos0] + array[pos1] + array[pos2] + array[pos3] + array[pos4] + array[pos5] + array[pos6] + array[pos7] + array[pos8] + array[pos9] + array[pos10] + array[pos11] + array[pos12] + array[pos13] + array[pos14] + array[pos15] + array[pos16]  + array[pos17] + array[pos18] + array[pos19] + array[pos20] + array[pos21] + array[pos22] + array[pos23] + array[pos24];
        }
        if(a == 26)
        {
          password = array[pos0] + array[pos1] + array[pos2] + array[pos3] + array[pos4] + array[pos5] + array[pos6] + array[pos7] + array[pos8] + array[pos9] + array[pos10] + array[pos11] + array[pos12] + array[pos13] + array[pos14] + array[pos15] + array[pos16]  + array[pos17] + array[pos18] + array[pos19] + array[pos20] + array[pos21] + array[pos22] + array[pos23] + array[pos24] + array[pos25];
        }
        if(a == 27)
        {
          password = array[pos0] + array[pos1] + array[pos2] + array[pos3] + array[pos4] + array[pos5] + array[pos6] + array[pos7] + array[pos8] + array[pos9] + array[pos10] + array[pos11] + array[pos12] + array[pos13] + array[pos14] + array[pos15] + array[pos16]  + array[pos17] + array[pos18] + array[pos19] + array[pos20] + array[pos21] + array[pos22] + array[pos23] + array[pos24] + array[pos25] + array[pos26];
        }
        if(a == 28)
        {
          password = array[pos0] + array[pos1] + array[pos2] + array[pos3] + array[pos4] + array[pos5] + array[pos6] + array[pos7] + array[pos8] + array[pos9] + array[pos10] + array[pos11] + array[pos12] + array[pos13] + array[pos14] + array[pos15] + array[pos16]  + array[pos17] + array[pos18] + array[pos19] + array[pos20] + array[pos21] + array[pos22] + array[pos23] + array[pos24] + array[pos25] + array[pos26] + array[pos27];
        }

        //password = array[numbers[0]] + array[numbers[1]] + array[numbers[2]] + array[numbers[3]] + array[numbers[4]] + array[numbers[5]] + array[numbers[6]] + array[numbers[7]] + array[numbers[8]] + array[numbers[9]];




      for( ; ; )
      {

        for(int c = 0; c < numberOfLoops; c++)
        {

          n = rand.nextInt(length);
          pos0 = n;

          n = rand.nextInt(length);
          pos1 = n;

          n = rand.nextInt(length);
          pos2 = n;
          n = rand.nextInt(length);
          pos3 = n;
          n = rand.nextInt(length);
          pos4 = n;
          n = rand.nextInt(length);
          pos5 = n;
          n = rand.nextInt(length);
          pos6 = n;
          n = rand.nextInt(length);
          pos7 = n;
          n = rand.nextInt(length);
          pos8 = n;
          n = rand.nextInt(length);
          pos9 = n;
          n = rand.nextInt(length);
          pos10 = n;
          n = rand.nextInt(length);
          pos11 = n;
          n = rand.nextInt(length);
          pos12 = n;
          n = rand.nextInt(length);
          pos13 = n;
          n = rand.nextInt(length);
          pos14 = n;
          n = rand.nextInt(length);
          pos15 = n;
          n = rand.nextInt(length);
          pos16 = n;
          n = rand.nextInt(length);
          pos17 = n;
          n = rand.nextInt(length);
          pos18 = n;
          n = rand.nextInt(length);
          pos19 = n;
          n = rand.nextInt(length);
          pos20 = n;
          n = rand.nextInt(length);
          pos21 = n;
          n = rand.nextInt(length);
          pos22 = n;
          n = rand.nextInt(length);
          pos23 = n;
          n = rand.nextInt(length);
          pos24 = n;
          n = rand.nextInt(length);
          pos25 = n;
          n = rand.nextInt(length);
          pos26 = n;
          n = rand.nextInt(length);
          pos27 = n;







/**
          if(power == 1)
          {
            lastName = array[pos0];

          }
          if(power == 2)
          {
            lastName = array[pos0] + array[pos1];
          }
          if(power == 3)
          {
            lastName = array[pos0] + array[pos1] + array[pos2];

          }
          if(power == 4)
          {
            lastName = array[pos0] + array[pos1] + array[pos2] + array[pos3];

          }
          if(power == 5)
          {
            lastName = array[pos0] + array[pos1] + array[pos2] + array[pos3] + array[pos4];

          }
          **/
          if(power == 6)
          {
            lastName = array[pos0] + array[pos1] + array[pos2] + array[pos3] + array[pos4] + array[pos5];

          }
          if(power == 7)
          {
            lastName = array[pos0] + array[pos1] + array[pos2] + array[pos3] + array[pos4] + array[pos5] + array[pos6];

          }
          if(power == 8)
          {
            lastName = array[pos0] + array[pos1] + array[pos2] + array[pos3] + array[pos4] + array[pos5] + array[pos6] + array[pos7];
          }
          if(power == 9)
          {
            lastName = array[pos0] + array[pos1] + array[pos2] + array[pos3] + array[pos4] + array[pos5] + array[pos6] + array[pos7] + array[pos8];
          }
          if(power == 10)
          {
            lastName = array[pos0] + array[pos1] + array[pos2] + array[pos3] + array[pos4] + array[pos5] + array[pos6] + array[pos7] + array[pos8] + array[pos9];

          }
          if(power == 11)
          {
            lastName = array[pos0] + array[pos1] + array[pos2] + array[pos3] + array[pos4] + array[pos5] + array[pos6] + array[pos7] + array[pos8] + array[pos9] + array[pos10];

          }
          if(power == 12)
          {
            lastName = array[pos0] + array[pos1] + array[pos2] + array[pos3] + array[pos4] + array[pos5] + array[pos6] + array[pos7] + array[pos8] + array[pos9] + array[pos10] + array[pos11];

          }
          if(power == 13)
          {
            lastName = array[pos0] + array[pos1] + array[pos2] + array[pos3] + array[pos4] + array[pos5] + array[pos6] + array[pos7] + array[pos8] + array[pos9] + array[pos10] + array[pos11] + array[pos12];

          }
          if(power == 14)
          {
            lastName = array[pos0] + array[pos1] + array[pos2] + array[pos3] + array[pos4] + array[pos5] + array[pos6] + array[pos7] + array[pos8] + array[pos9] + array[pos10] + array[pos11] + array[pos12] + array[pos13];

          }
          if(power == 15)
          {
            lastName = array[pos0] + array[pos1] + array[pos2] + array[pos3] + array[pos4] + array[pos5] + array[pos6] + array[pos7] + array[pos8] + array[pos9] + array[pos10] + array[pos11] + array[pos12] + array[pos13] + array[pos14];

          }
          if(power == 16)
          {
            lastName = array[pos0] + array[pos1] + array[pos2] + array[pos3] + array[pos4] + array[pos5] + array[pos6] + array[pos7] + array[pos8] + array[pos9] + array[pos10] + array[pos11] + array[pos12] + array[pos13] + array[pos14] + array[pos15];

          }
          if(power == 17)
          {
            lastName = array[pos0] + array[pos1] + array[pos2] + array[pos3] + array[pos4] + array[pos5] + array[pos6] + array[pos7] + array[pos8] + array[pos9] + array[pos10] + array[pos11] + array[pos12] + array[pos13] + array[pos14] + array[pos15] + array[pos16];

          }
          if(power == 18)
          {
            lastName = array[pos0] + array[pos1] + array[pos2] + array[pos3] + array[pos4] + array[pos5] + array[pos6] + array[pos7] + array[pos8] + array[pos9] + array[pos10] + array[pos11] + array[pos12] + array[pos13] + array[pos14] + array[pos15] + array[pos16] + array[pos17];

          }
          if(power == 19)
          {
            lastName = array[pos0] + array[pos1] + array[pos2] + array[pos3] + array[pos4] + array[pos5] + array[pos6] + array[pos7] + array[pos8] + array[pos9] + array[pos10] + array[pos11] + array[pos12] + array[pos13] + array[pos14] + array[pos15] + array[pos16] + array[pos17] + array[pos18];

          }
          if(power == 20)
          {
            lastName = array[pos0] + array[pos1] + array[pos2] + array[pos3] + array[pos4] + array[pos5] + array[pos6] + array[pos7] + array[pos8] + array[pos9] + array[pos10] + array[pos11] + array[pos12] + array[pos13] + array[pos14] + array[pos15] + array[pos16] + array[pos17] + array[pos18] + array[pos19];

          }
          if(power == 21)
          {
            lastName = array[pos0] + array[pos1] + array[pos2] + array[pos3] + array[pos4] + array[pos5] + array[pos6] + array[pos7] + array[pos8] + array[pos9] + array[pos10] + array[pos11] + array[pos12] + array[pos13] + array[pos14] + array[pos15] + array[pos16] + array[pos17] + array[pos18] + array[pos19] + array[pos20];

          }
          if(power == 22)
          {
            lastName = array[pos0] + array[pos1] + array[pos2] + array[pos3] + array[pos4] + array[pos5] + array[pos6] + array[pos7] + array[pos8] + array[pos9] + array[pos10] + array[pos11] + array[pos12] + array[pos13] + array[pos14] + array[pos15] + array[pos16] + array[pos17] + array[pos18] + array[pos19] + array[pos20] + array[pos21];

          }
          if(power == 23)
          {
            lastName = array[pos0] + array[pos1] + array[pos2] + array[pos3] + array[pos4] + array[pos5] + array[pos6] + array[pos7] + array[pos8] + array[pos9] + array[pos10] + array[pos11] + array[pos12] + array[pos13] + array[pos14] + array[pos15] + array[pos16] + array[pos17] + array[pos18] + array[pos19] + array[pos20] + array[pos21] + array[pos22];

          }
          if(power == 24)
          {
            lastName = array[pos0] + array[pos1] + array[pos2] + array[pos3] + array[pos4] + array[pos5] + array[pos6] + array[pos7] + array[pos8] + array[pos9] + array[pos10] + array[pos11] + array[pos12] + array[pos13] + array[pos14] + array[pos15] + array[pos16] + array[pos17] + array[pos18] + array[pos19] + array[pos20] + array[pos21] + array[pos22] + array[pos23];

          }
          if(power == 25)
          {
            lastName = array[pos0] + array[pos1] + array[pos2] + array[pos3] + array[pos4] + array[pos5] + array[pos6] + array[pos7] + array[pos8] + array[pos9] + array[pos10] + array[pos11] + array[pos12] + array[pos13] + array[pos14] + array[pos15] + array[pos16]  + array[pos17] + array[pos18] + array[pos19] + array[pos20] + array[pos21] + array[pos22] + array[pos23] + array[pos24];

          }
          if(power == 26)
          {
            lastName = array[pos0] + array[pos1] + array[pos2] + array[pos3] + array[pos4] + array[pos5] + array[pos6] + array[pos7] + array[pos8] + array[pos9] + array[pos10] + array[pos11] + array[pos12] + array[pos13] + array[pos14] + array[pos15] + array[pos16]  + array[pos17] + array[pos18] + array[pos19] + array[pos20] + array[pos21] + array[pos22] + array[pos23] + array[pos24] + array[pos25];

          }
          if(power == 27)
          {
            lastName = array[pos0] + array[pos1] + array[pos2] + array[pos3] + array[pos4] + array[pos5] + array[pos6] + array[pos7] + array[pos8] + array[pos9] + array[pos10] + array[pos11] + array[pos12] + array[pos13] + array[pos14] + array[pos15] + array[pos16]  + array[pos17] + array[pos18] + array[pos19] + array[pos20] + array[pos21] + array[pos22] + array[pos23] + array[pos24] + array[pos25] + array[pos26];

          }
          if(power == 28)
          {
            lastName = array[pos0] + array[pos1] + array[pos2] + array[pos3] + array[pos4] + array[pos5] + array[pos6] + array[pos7] + array[pos8] + array[pos9] + array[pos10] + array[pos11] + array[pos12] + array[pos13] + array[pos14] + array[pos15] + array[pos16]  + array[pos17] + array[pos18] + array[pos19] + array[pos20] + array[pos21] + array[pos22] + array[pos23] + array[pos24] + array[pos25] + array[pos26] + array[pos27];

          }


          System.out.println("Password = " + lastName);


            if(password == lastName)
            {
              System.out.println("The password has been found");
              break;
            }


          }
          power++;
          numberOfLoops = Math.pow(numberOfLoops, power);


          if(password == lastName)
          {
            System.out.println("The password has been found");
            break;
          }


      }


}



}
