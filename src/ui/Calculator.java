import java.util.Scanner;
public class Calculator {
  public static void main(String[] args) {
    Scanner lectorint = new Scanner(System.in);
    Scanner lectorstr = new Scanner(System.in);
    int ciclo=0;
    int i=0;
    int m=0;
    String exp1;
    String op;
    String yn;
    double result=0;
    String resultStr="";
    double[] results = new double[10];
    double r1=0, r2=0, r3=0, r4=0, r5=0, r6=0, r7=0, r8=0, r9=0, r10=0;
    System.out.println("Some especifications before usage:\n- Type r to see a list of the last ten results and the assigned variables for their usage.\n- Type sqrt(n) to know te square root of a number, where n is the number of which you want to know the square root or just type sqrt for the square root of the last result, same for sine, cosine and tangent (using sin, cos and tan).\n- Type XpowerY to know the power of a number, where x is the base and y the exponent or just type power and then the exponent for the power of the last result.\n- For convertions write just after the number, with no space, or after the result, the first letter of the type of number to convert and then the first letter of the resultant type of number separated by an underscore, for example d_b would be for decimal to binary convertion.\n- Type # to exit mode 2 of the calculator.\n- Enjoy the calculator!\n");
    System.out.println("Choose the mode in which you want to use the calculator:\n1.One operation at the time.\n2.Continuous operations.");
    int modo = lectorint.nextInt();
    switch(modo)
    {
      case 1: //Mode 1 of the calculator
        System.out.println("type the operation you want to realize");
        while (ciclo==0)
        {
          exp1 = lectorstr.nextLine();
          if (exp1.equals("#"))
          {
            ciclo=1;
          }
          else
          {
            if (m>9) //Moves the values of the array one position back.
            {
              for(int n=0; n<results.length-1; n++)
              {
                results[n]=results[n+1];
              }
            }
            op = expresion(exp1, lectorstr);
            if (op.equals("+")||op.equals("op+"))
            {
             results[i]=sum(lectorstr, exp1, result, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10);
             System.out.println("= "+results[i]);
            }
            else if (op.equals("-")||op.equals("op-"))
            {
             results[i]=sus(lectorstr, exp1, result, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10);
             System.out.println("= "+results[i]);
            }
            else if (op.equals("*")||op.equals("op*"))
            {
             results[i]=prod(lectorstr, exp1, result, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10);
             System.out.println("= "+results[i]);
            }
            else if (op.equals("/")||op.equals("op/"))
            {
             results[i]=div(lectorstr, exp1, result, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10);
             System.out.println("= "+results[i]);
            }
            else if (op.equals("%")||op.equals("op%"))
            {
             results[i]=mod(lectorstr, exp1, result, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10);
             System.out.println("= "+results[i]);
            }
            else if (op.equals("sqrt")||op.equals("opsqrt"))
            {
             results[i]=sqrt(lectorstr, exp1, result);
             System.out.println("= "+results[i]);
            }
            else if (op.equals("power")||op.equals("oppow"))
            {
             results[i]=pow(lectorint, exp1, result);
             System.out.println("= "+results[i]);
            }
            else if (op.equals("!")||op.equals("op!"))
            {
             results[i]=fac(exp1, result);
             System.out.println("= "+results[i]);
            }
            else if (op.equals("d_b")||op.equals("opd_b"))
            {
             results[i]=d_b(exp1, result);
             System.out.println("= "+results[i]);
            }
            else if (op.equals("b_d")||op.equals("opb_d"))
            {
             results[i]=b_d(exp1, result);
             System.out.println("= "+results[i]);
            }
            else if (op.equals("d_h")||op.equals("opd_h"))
            {
             resultStr=d_h(exp1, result);
             System.out.println("= "+resultStr);
            }
            else if (op.equals("h_d")||op.equals("oph_d"))
            {
             results[i]=h_d(exp1, resultStr);
             System.out.println("= "+results[i]);
            }
            else if (op.equals("b_h")||op.equals("opb_h"))
            {
             resultStr=b_h(exp1, result);
             System.out.println("= "+resultStr);
            }
            else if (op.equals("h_b")||op.equals("oph_b"))
            {
             results[i]=h_b(exp1, resultStr);
             System.out.println("= "+results[i]);
            }
            else if (op.equals("g_r")||op.equals("opg_r"))
            {
             results[i]=g_r(exp1, result);
             System.out.println("= "+results[i]);
            }
            else if (op.equals("r_g")||op.equals("opr_g"))
            {
             results[i]=r_g(exp1, result);
             System.out.println("= "+results[i]);
            }
            else if (op.equals("sin")||op.equals("opsin"))
            {
             results[i]=sin(exp1, result);
             System.out.println("= "+results[i]);
            }
            else if (op.equals("cos")||op.equals("opcos"))
            {
             results[i]=cos(exp1, result);
             System.out.println("= "+results[i]);
            }
            else if (op.equals("tan")||op.equals("optan"))
            {
             results[i]=tan(exp1, result);
             System.out.println("= "+results[i]);
            }
            else if (op.equals("log")||op.equals("log10")||op.equals("oplog"))
            {
             results[i]=log(exp1, result);
             System.out.println("= "+results[i]);
            }
            else if (op.equals("oproot"))
            {
             results[i]=n_root(exp1, result);
             System.out.println("= "+results[i]);
            }
            else if (op.equals("opr"))
             memory_r(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10);
            result=results[i];
            r1=results[0]; r2=results[1]; r3=results[2]; r4=results[3]; r5=results[4]; r6=results[5]; r7=results[6]; r8=results[7]; r9=results[8]; r10=results[9];
            if(exp1.equals("r"))
            {
              i=i;
              m=m;
            }
            else if(i<9)
            {
              i++;
              m++;
            }
            else
            {
              m++;
            }
          }
          System.out.println("Do you want to continue with another math operation? (y/n)");
          yn=lectorstr.nextLine();
          if(yn.equals("y"))
            ciclo=0;
          else if(yn.equals("n"))
            ciclo=1;
        }
        break;
      case 2: //Mode 2 of the calculator
        System.out.println("type the operation you want to realize");
        while (ciclo==0)
        {
          exp1 = lectorstr.nextLine();
          if (exp1.equals("#"))
          {
            ciclo=1;
          }
          else
          {
            if (m>9)
            {
              for(int n=0; n<results.length-1; n++)
              {
                results[n]=results[n+1];
              }
            }
            op = expresion(exp1, lectorstr);
            if (op.equals("+")||op.equals("op+"))
            {
             results[i]=sum(lectorstr, exp1, result, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10);
             System.out.println("= "+results[i]);
            }
            else if (op.equals("-")||op.equals("op-"))
            {
             results[i]=sus(lectorstr, exp1, result, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10);
             System.out.println("= "+results[i]);
            }
            else if (op.equals("*")||op.equals("op*"))
            {
             results[i]=prod(lectorstr, exp1, result, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10);
             System.out.println("= "+results[i]);
            }
            else if (op.equals("/")||op.equals("op/"))
            {
             results[i]=div(lectorstr, exp1, result, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10);
             System.out.println("= "+results[i]);
            }
            else if (op.equals("%")||op.equals("op%"))
            {
             results[i]=mod(lectorstr, exp1, result, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10);
             System.out.println("= "+results[i]);
            }
            else if (op.equals("sqrt")||op.equals("opsqrt"))
            {
             results[i]=sqrt(lectorstr, exp1, result);
             System.out.println("= "+results[i]);
            }
            else if (op.equals("power")||op.equals("oppow"))
            {
             results[i]=pow(lectorint, exp1, result);
             System.out.println("= "+results[i]);
            }
            else if (op.equals("!")||op.equals("op!"))
            {
             results[i]=fac(exp1, result);
             System.out.println("= "+results[i]);
            }
            else if (op.equals("d_b")||op.equals("opd_b"))
            {
             results[i]=d_b(exp1, result);
             System.out.println("= "+results[i]);
            }
            else if (op.equals("b_d")||op.equals("opb_d"))
            {
             results[i]=b_d(exp1, result);
             System.out.println("= "+results[i]);
            }
            else if (op.equals("d_h")||op.equals("opd_h"))
            {
             resultStr=d_h(exp1, result);
             System.out.println("= "+resultStr);
            }
            else if (op.equals("h_d")||op.equals("oph_d"))
            {
             results[i]=h_d(exp1, resultStr);
             System.out.println("= "+results[i]);
            }
            else if (op.equals("b_h")||op.equals("opb_h"))
            {
             resultStr=b_h(exp1, result);
             System.out.println("= "+resultStr);
            }
            else if (op.equals("h_b")||op.equals("oph_b"))
            {
             results[i]=h_b(exp1, resultStr);
             System.out.println("= "+results[i]);
            }
            else if (op.equals("g_r")||op.equals("opg_r"))
            {
             results[i]=g_r(exp1, result);
             System.out.println("= "+results[i]);
            }
            else if (op.equals("r_g")||op.equals("opr_g"))
            {
             results[i]=r_g(exp1, result);
             System.out.println("= "+results[i]);
            }
            else if (op.equals("sin")||op.equals("opsin"))
            {
             results[i]=sin(exp1, result);
             System.out.println("= "+results[i]);
            }
            else if (op.equals("cos")||op.equals("opcos"))
            {
             results[i]=cos(exp1, result);
             System.out.println("= "+results[i]);
            }
            else if (op.equals("tan")||op.equals("optan"))
            {
             results[i]=tan(exp1, result);
             System.out.println("= "+results[i]);
            }
            else if (op.equals("log")||op.equals("log10")||op.equals("oplog"))
            {
             results[i]=log(exp1, result);
             System.out.println("= "+results[i]);
            }
            else if (op.equals("oproot"))
            {
             results[i]=n_root(exp1, result);
             System.out.println("= "+results[i]);
            }
            else if (op.equals("opr"))
             memory_r(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10);
            result=results[i];
            r1=results[0]; r2=results[1]; r3=results[2]; r4=results[3]; r5=results[4]; r6=results[5]; r7=results[6]; r8=results[7]; r9=results[8]; r10=results[9];
            if(exp1.equals("r"))
            {
              i=i;
              m=m;
            }
            else if(i<9)
            {
              i++;
              m++;
            }
            else
            {
              m++;
            }
          }
        }
        break;
    }
  }
  /**
   * This method realizes the sum between two values.
   * <b>pre:</b> The user already knows how the calculator works and how to operate with the last ten results.
   * <b>post:</b> The math operation has been realized.
   * @param lectorstr is the Scanner that reads the user's input and has already been created.
   * @param exp1 is what the user typed first and it is a valid value.
   * @param result stores the value of the last math operation.
   * @param r's are the variables that store the value of the last ten results.
   * @return sum.
   */
  public static double sum (Scanner lectorstr, String exp1, double result, double r1, double r2, double r3, double r4, double r5, double r6, double r7, double r8, double r9, double r10)
  {
    double sum=0;
    String num = lectorstr.nextLine();
    if (exp1.equals("+"))
    {
      if (num.equals("r1"))
       sum = r1+result;
      else if (num.equals("r2"))
       sum = r2+result;
      else if (num.equals("r3"))
       sum = r3+result;
      else if (num.equals("r4"))
       sum = r4+result;
      else if (num.equals("r5"))
       sum = r5+result;
      else if (num.equals("r6"))
       sum = r6+result;
      else if (num.equals("r7"))
       sum = r7+result;
      else if (num.equals("r8"))
       sum = r8+result;
      else if (num.equals("r9"))
       sum = r9+result;
      else if (num.equals("r10"))
       sum = r10+result;
      else
       sum = Integer.valueOf(num)+result;
    }
    else
    {
      if (num.equals("r1"))
       sum = r1+Integer.valueOf(exp1);
      else if (num.equals("r2"))
       sum = r2+Integer.valueOf(exp1);
      else if (num.equals("r3"))
       sum = r3+Integer.valueOf(exp1);
      else if (num.equals("r4"))
       sum = r4+Integer.valueOf(exp1);
      else if (num.equals("r5"))
       sum = r5+Integer.valueOf(exp1);
      else if (num.equals("r6"))
       sum = r6+Integer.valueOf(exp1);
      else if (num.equals("r7"))
       sum = r7+Integer.valueOf(exp1);
      else if (num.equals("r8"))
       sum = r8+Integer.valueOf(exp1);
      else if (num.equals("r9"))
       sum = r9+Integer.valueOf(exp1);
      else if (num.equals("r10"))
       sum = r10+Integer.valueOf(exp1);
      else
       sum = Integer.valueOf(num)+Integer.valueOf(exp1);
    }
    return sum;
  }
  /**
   * This method realizes the subtraction between two values.
   * <b>pre:</b> The user already knows how the calculator works and how to operate with the last ten results.
   * <b>post:</b> The math operation has been realized.
   * @param lectorstr is the Scanner that reads the user's input and has already been created.
   * @param exp1 is what the user typed first and it is a valid value.
   * @param result stores the value of the last math operation.
   * @param r's are the variables that store the value of the last ten results.
   * @return subtraction.
   */
  public static double sus (Scanner lectorstr, String exp1, double result, double r1, double r2, double r3, double r4, double r5, double r6, double r7, double r8, double r9, double r10)
  {
    double sus=0;
    String num = lectorstr.nextLine();
    if (exp1.equals("-"))
    {
      if (num.equals("r1"))
       sus = result-r1;
      else if (num.equals("r2"))
       sus = result-r2;
      else if (num.equals("r3"))
       sus = result-r3;
      else if (num.equals("r4"))
       sus = result-r4;
      else if (num.equals("r5"))
       sus = result-r5;
      else if (num.equals("r6"))
       sus = result-r6;
      else if (num.equals("r7"))
       sus = result-r7;
      else if (num.equals("r8"))
       sus = result-r8;
      else if (num.equals("r9"))
       sus = result-r9;
      else if (num.equals("r10"))
       sus = result-r10;
      else
       sus = result-Integer.valueOf(num);
    }
    else
    {
      if (num.equals("r1"))
       sus = Integer.valueOf(exp1)-r1;
      else if (num.equals("r2"))
       sus = Integer.valueOf(exp1)-r2;
      else if (num.equals("r3"))
       sus = Integer.valueOf(exp1)-r3;
      else if (num.equals("r4"))
       sus = Integer.valueOf(exp1)-r4;
      else if (num.equals("r5"))
       sus = Integer.valueOf(exp1)-r5;
      else if (num.equals("r6"))
       sus = Integer.valueOf(exp1)-r6;
      else if (num.equals("r7"))
       sus = Integer.valueOf(exp1)-r7;
      else if (num.equals("r8"))
       sus = Integer.valueOf(exp1)-r8;
      else if (num.equals("r9"))
       sus = Integer.valueOf(exp1)-r9;
      else if (num.equals("r10"))
       sus = Integer.valueOf(exp1)-r10;
      else
       sus = Integer.valueOf(exp1)-Integer.valueOf(num);
    }
    return sus;
  }
  /**
   * This method realizes the multiplication between two values.
   * <b>pre:</b> The user already knows how the calculator works and how to operate with the last ten results.
   * <b>post:</b> The math operation has been realized.
   * @param lectorstr is the Scanner that reads the user's input and has already been created.
   * @param exp1 is what the user typed first and it is a valid value.
   * @param result stores the value of the last math operation.
   * @param r's are the variables that store the value of the last ten results.
   * @return product.
   */
  public static double prod (Scanner lectorstr, String exp1, double result, double r1, double r2, double r3, double r4, double r5, double r6, double r7, double r8, double r9, double r10)
  {
    double prod=0;
    String num = lectorstr.nextLine();
    if (exp1.equals("*"))
    {
      if (num.equals("r1"))
       prod = result*r1;
      else if (num.equals("r2"))
       prod = result*r2;
      else if (num.equals("r3"))
       prod = result*r3;
      else if (num.equals("r4"))
       prod = result*r4;
      else if (num.equals("r5"))
       prod = result*r5;
      else if (num.equals("r6"))
       prod = result*r6;
      else if (num.equals("r7"))
       prod = result*r7;
      else if (num.equals("r8"))
       prod = result*r8;
      else if (num.equals("r9"))
       prod = result*r9;
      else if (num.equals("r10"))
       prod = result*r10;
      else
       prod = result*Integer.valueOf(num);
    }
    else
    {
      if (num.equals("r1"))
       prod = Integer.valueOf(exp1)*r1;
      else if (num.equals("r2"))
       prod = Integer.valueOf(exp1)*r2;
      else if (num.equals("r3"))
       prod = Integer.valueOf(exp1)*r3;
      else if (num.equals("r4"))
       prod = Integer.valueOf(exp1)*r4;
      else if (num.equals("r5"))
       prod = Integer.valueOf(exp1)*r5;
      else if (num.equals("r6"))
       prod = Integer.valueOf(exp1)*r6;
      else if (num.equals("r7"))
       prod = Integer.valueOf(exp1)*r7;
      else if (num.equals("r8"))
       prod = Integer.valueOf(exp1)*r8;
      else if (num.equals("r9"))
       prod = Integer.valueOf(exp1)*r9;
      else if (num.equals("r10"))
       prod = Integer.valueOf(exp1)*r10;
      else
       prod = Integer.valueOf(exp1)*Integer.valueOf(num);
    }
    return prod;
  }
  /**
   * This method realizes the division between two values.
   * <b>pre:</b> The user already knows how the calculator works and how to operate with the last ten results.
   * <b>post:</b> The math operation has been realized.
   * @param lectorstr is the Scanner that reads the user's input and has already been created.
   * @param exp1 is what the user typed first and it is a valid value.
   * @param result stores the value of the last math operation.
   * @param r's are the variables that store the value of the last ten results.
   * @return division.
   */
  public static double div (Scanner lectorstr, String exp1, double result, double r1, double r2, double r3, double r4, double r5, double r6, double r7, double r8, double r9, double r10)
  {
    double div=0;
    String num = lectorstr.nextLine();
    if (exp1.equals("/"))
    {
      if (num.equals("r1"))
       div = result/r1;
      else if (num.equals("r2"))
       div = result/r2;
      else if (num.equals("r3"))
       div = result/r3;
      else if (num.equals("r4"))
       div = result/r4;
      else if (num.equals("r5"))
       div = result/r5;
      else if (num.equals("r6"))
       div = result/r6;
      else if (num.equals("r7"))
       div = result/r7;
      else if (num.equals("r8"))
       div = result/r8;
      else if (num.equals("r9"))
       div = result/r9;
      else if (num.equals("r10"))
       div = result/r10;
      else
       div = result/Integer.valueOf(num);
    }
    else
    {
      if (num.equals("r1"))
       div = Integer.valueOf(exp1)/r1;
      else if (num.equals("r2"))
       div = Integer.valueOf(exp1)/r2;
      else if (num.equals("r3"))
       div = Integer.valueOf(exp1)/r3;
      else if (num.equals("r4"))
       div = Integer.valueOf(exp1)/r4;
      else if (num.equals("r5"))
       div = Integer.valueOf(exp1)/r5;
      else if (num.equals("r6"))
       div = Integer.valueOf(exp1)/r6;
      else if (num.equals("r7"))
       div = Integer.valueOf(exp1)/r7;
      else if (num.equals("r8"))
       div = Integer.valueOf(exp1)/r8;
      else if (num.equals("r9"))
       div = Integer.valueOf(exp1)/r9;
      else if (num.equals("r10"))
       div = Integer.valueOf(exp1)/r10;
      else
       div = Integer.valueOf(exp1)/Integer.valueOf(num);
    }
    return div;
  }
  /**
   * This method realizes the modulo between two values.
   * <b>pre:</b> The user already knows how the calculator works and how to operate with the last ten results.
   * <b>post:</b> The math operation has been realized.
   * @param lectorstr is the Scanner that reads the user's input and has already been created.
   * @param exp1 is what the user typed first and it is a valid value.
   * @param result stores the value of the last math operation.
   * @param r's are the variables that store the value of the last ten results.
   * @return modulo.
   */
  public static double mod (Scanner lectorstr, String exp1, double result, double r1, double r2, double r3, double r4, double r5, double r6, double r7, double r8, double r9, double r10)
  {
    double mod=0;
    String num = lectorstr.nextLine();
    if (exp1.equals("%"))
    {
      if (num.equals("r1"))
       mod = result%r1;
      else if (num.equals("r2"))
       mod = result%r2;
      else if (num.equals("r3"))
       mod = result%r3;
      else if (num.equals("r4"))
       mod = result%r4;
      else if (num.equals("r5"))
       mod = result%r5;
      else if (num.equals("r6"))
       mod = result%r6;
      else if (num.equals("r7"))
       mod = result%r7;
      else if (num.equals("r8"))
       mod = result%r8;
      else if (num.equals("r9"))
       mod = result%r9;
      else if (num.equals("r10"))
       mod = result%r10;
      else
       mod = result%Integer.valueOf(num);
    }
    else
    {
      if (num.equals("r1"))
       mod = Integer.valueOf(exp1)%r1;
      else if (num.equals("r2"))
       mod = Integer.valueOf(exp1)%r2;
      else if (num.equals("r3"))
       mod = Integer.valueOf(exp1)%r3;
      else if (num.equals("r4"))
       mod = Integer.valueOf(exp1)%r4;
      else if (num.equals("r5"))
       mod = Integer.valueOf(exp1)%r5;
      else if (num.equals("r6"))
       mod = Integer.valueOf(exp1)%r6;
      else if (num.equals("r7"))
       mod = Integer.valueOf(exp1)%r7;
      else if (num.equals("r8"))
       mod = Integer.valueOf(exp1)%r8;
      else if (num.equals("r9"))
       mod = Integer.valueOf(exp1)%r9;
      else if (num.equals("r10"))
       mod = Integer.valueOf(exp1)%r10;
      else
       mod = Integer.valueOf(exp1)%Integer.valueOf(num);
    }
    return mod;
  }
  /**
   * This method calculates the square root of a number.
   * <b>pre:</b> The user already knows how the calculator works.
   * <b>post:</b> The math operation has been realized.
   * @param lectorstr is the Scanner that reads the user's input and has already been created.
   * @param exp1 is what the user typed first and it is a valid value.
   * @param result stores the value of the last math operation.
   * @return square root.
   */
  public static double sqrt (Scanner lectorstr, String exp1, double result)
  {
    double sqrt=0;
    String inside="";
    if (exp1.equals("sqrt"))
      sqrt = Math.sqrt(result);
    else
    {
      inside = exp1.substring(exp1.indexOf("(")+1, exp1.indexOf(")"));; //Takes the value inside of/between the parenthesis
      sqrt = Math.sqrt(Integer.valueOf(inside));
    }
    return sqrt;
  }
  /**
   * This method works as a function that calculates the power of a number.
   * <b>pre:</b> The user already knows how the calculator works.
   * <b>post:</b> The function works and calculates powers.
   * @param x is the base, x is not a decimal value.
   * @param y is the exponent, y is not a decimal value.
   */
  public static double power (double x, double y)
  {
    double power = 1;
    for (int i = 1; i <= y; i++)
      power = power * x;
    return power;
  }
  /**
   * This method uses the power method to calculate the power of a number.
   * <b>pre:</b> The user already knows how the calculator works.
   * <b>post:</b> The math operation has been realized.
   * @param lectorint is the Scanner that reads the user's numeric input and has already been created.
   * @param exp1 is what the user typed first and it is a valid value.
   * @param result stores the value of the last math operation.
   * @return power.
   */
  public static double pow (Scanner lectorint, String exp1, double result)
  {
    double pow=0;
    String[] parts;
    if (exp1.equals("power"))
    {
      double expo = lectorint.nextDouble();
      pow = power(result, expo);
    }
    else
    {
      parts = exp1.split("power");
      pow = power(Integer.valueOf(parts[0]), Integer.valueOf(parts[1]));
    }
    return pow;
  }
  /**
   * This method works as a function that calculates the factorial of a number.
   * <b>pre:</b> The user already knows how the calculator works.
   * <b>post:</b> The function works and calculates factorials.
   * @param x is the number which factorial is going to be calculated.
   */
  public static double factorial(int x)
  {
    double fact = 1;
    for(int i=1; i<=x; i++)
      fact *= i;
    return fact;
  }
  /**
   * This method uses the factorial method to calculate the factorial of a number.
   * <b>pre:</b> The user already knows how the calculator works.
   * <b>post:</b> The math operation has been realized.
   * @param exp1 is what the user typed first and it is a valid value.
   * @param result stores the value of the last math operation.
   * @return factorial.
   */
  public static double fac (String exp1, double result)
  {
    double fac=0;
    String[] parts;
    if (exp1.equals("!"))
      fac = factorial((int)result);
    else
    {
      parts = exp1.split("!");
      fac = factorial(Integer.valueOf(parts[0]));
    }
    return fac;
  }
  /**
   * This method coverts a decimal number into a binary number.
   * <b>pre:</b> The user already knows how the calculator works.
   * <b>post:</b> The convertion has been realized.
   * @param exp1 is what the user typed first and it is a valid value.
   * @param result stores the value of the last math operation.
   * @return converted number.
   */
  public static int d_b (String exp1, double result)
  {
    String binary = "";
    String[] parts;
    int num=0;
    if (exp1.equals("d_b"))
    {
      if (result > 0)
      {
        while (result > 0)
        {
          if (result % 2 == 0)
            binary = "0" + binary;
          else
            binary = "1" + binary;
          result = (int) result / 2;
        }
      }
      else if (result == 0)
        binary = "0";
      else
        binary = "Couldn't convert number, please enter only positive values.";
    }
    else
    {
      parts = exp1.split("d_b");
      num = Integer.valueOf(parts[0]);
      if (num > 0)
      {
        while (num > 0)
        {
          if (num % 2 == 0)
            binary = "0" + binary;
          else
            binary = "1" + binary;
          num = (int) num / 2;
        }
      }
      else if (num == 0)
        binary = "0";
      else
        binary = "Couldn't convert number, please enter only positive values.";
    }
    int nbinary = Integer.valueOf(binary);
    return nbinary;
  }
  /**
   * This method coverts a binary number into a decimal number.
   * <b>pre:</b> The user already knows how the calculator works.
   * <b>post:</b> The convertion has been realized.
   * @param exp1 is what the user typed first and it is a valid value.
   * @param result stores the value of the last math operation.
   * @return converted number.
   */
  public static double b_d (String exp1, double result)
  {
    boolean isBinary;
    double aux, digit;
    int num;
    double dec=0;
    String binary1, binary2;
    String[] parts;
    if(exp1.equals("b_d"))
    {
      isBinary = true;
      aux = result;
      if (aux != 0)
      {
        digit = aux % 10;
        if (digit != 0 && digit != 1)
        {
           isBinary = false;
        }
        aux = aux / 10;
      }
      if(isBinary==false)
      {
        System.out.println("Couldn't convert value, because it is not a binary number.");
        dec=result;
      }
      else
      {
        binary1 = String.valueOf(result);
        binary2 = binary1.substring(0, binary1.indexOf("."));
        dec=(double)Integer.parseInt(binary2,2);
      }
    }
    else
    {
      parts = exp1.split("b_d");
      num = Integer.valueOf(parts[0]);
      binary2 = String.valueOf(num);
      dec=(double)Integer.parseInt(binary2,2);
    }
    return dec;
  }
  /**
   * This method coverts a decimal number into a hexadecimal number.
   * <b>pre:</b> The user already knows how the calculator works.
   * <b>post:</b> The convertion has been realized.
   * @param exp1 is what the user typed first and it is a valid value.
   * @param result stores the value of the last math operation.
   * @return converted number.
   */
  public static String d_h (String exp1, double result)
  {
    String hexa="";
    String[] parts;
    int num;
    if(exp1.equals("d_h"))
      hexa=Integer.toHexString((int)result);
    else
    {
      parts=exp1.split("d_h");
      num=Integer.valueOf(parts[0]);
      hexa=Integer.toHexString(num);
    }
    return hexa;
  }
  /**
   * This method coverts a hexadecimal number into a decimal number.
   * <b>pre:</b> The user already knows how the calculator works.
   * <b>post:</b> The convertion has been realized.
   * @param exp1 is what the user typed first and it is a valid value.
   * @param result stores the value of the last math operation.
   * @return converted number.
   */
  public static int h_d (String exp1, String resultStr)
  {
    Integer dec=0;
    String[] parts;
    String num;
    if(exp1.equals("h_d"))
      dec=Integer.valueOf(resultStr, 16);
    else
    {
      parts=exp1.split("h_d");
      num=parts[0];
      dec=Integer.valueOf(num, 16);
    }
    return dec.intValue();
  }
  /**
   * This method coverts a binary number into a hexadecimal number.
   * <b>pre:</b> The user already knows how the calculator works.
   * <b>post:</b> The convertion has been realized.
   * @param exp1 is what the user typed first and it is a valid value.
   * @param result stores the value of the last math operation.
   * @return converted number.
   */
  public static String b_h (String exp1, double result)
  {
    boolean isBinary;
    double aux, digit;
    String hexa="";
    String[] parts;
    String binary1, binary2;
    int dec;
    if(exp1.equals("b_h"))
    {
      isBinary = true;
      aux = result;
      if (aux != 0)
      {
        digit = aux % 10;
        if (digit != 0 && digit != 1)
        {
           isBinary = false;
        }
        aux = aux / 10;
      }
      if(isBinary==false)
      {
        System.out.println("Couldn't convert value, because it is not a binary number.");
      }
      else
      {
        binary1 = String.valueOf(result);
        binary2 = binary1.substring(0, binary1.indexOf("."));
        dec=Integer.valueOf(binary2, 2);
        hexa=Integer.toHexString(dec);
      }
    }
    else
    {
      parts=exp1.split("b_h");
      binary2=String.valueOf(parts[0]);
      dec=Integer.valueOf(binary2, 2);
      hexa=Integer.toHexString(dec);
    }
    return hexa;
  }
  /**
   * This method coverts a hexadecimal number into a binary number.
   * <b>pre:</b> The user already knows how the calculator works.
   * <b>post:</b> The convertion has been realized.
   * @param exp1 is what the user typed first and it is a valid value.
   * @param result stores the value of the last math operation.
   * @return converted number.
   */
  public static int h_b (String exp1, String resultStr)
  {
    Integer bin=0;
    String[] parts;
    String num;
    if(exp1.equals("h_b"))
      bin=Integer.valueOf(resultStr, 16);
    else
    {
      parts=exp1.split("h_b");
      num=parts[0];
      bin=Integer.valueOf(num, 16);
    }
    int binNum=Integer.valueOf(Integer.toBinaryString(bin.intValue()));
    return binNum;
  }
  /**
   * This method coverts a number in grades to radians.
   * <b>pre:</b> The user already knows how the calculator works.
   * <b>post:</b> The convertion has been realized.
   * @param exp1 is what the user typed first and it is a valid value.
   * @param result stores the value of the last math operation.
   * @return converted number.
   */
  public static double g_r (String exp1, double result)
  {
    String[] parts;
    double rad=0;
    double num=0;
    if (exp1.equals("g_r"))
      rad = result*(3.1416/180);
    else
    {
      parts = exp1.split("g_r");
      num = Integer.valueOf(parts[0]);
      rad = num*(3.1416/180);
    }
    return rad;
  }
  /**
   * This method coverts a number in radians to grades.
   * <b>pre:</b> The user already knows how the calculator works.
   * <b>post:</b> The convertion has been realized.
   * @param exp1 is what the user typed first and it is a valid value.
   * @param result stores the value of the last math operation.
   * @return converted number.
   */
  public static double r_g (String exp1, double result)
  {
    String[] parts;
    double gra=0;
    double num=0;
    if (exp1.equals("r_g"))
      gra = result*(180/3.1416);
    else
    {
      parts = exp1.split("r_g");
      num = Integer.valueOf(parts[0]);
      gra = num*(180/3.1416);
    }
    return gra;
  }
  /**
   * This method calculates the sine of a number using the Taylor series.
   * <b>pre:</b> The user already knows how the calculator works.
   * <b>post:</b> The math operation has been realized.
   * @param exp1 is what the user typed first and it is a valid value.
   * @param result stores the value of the last math operation.
   * @return sine.
   */
  public static double sin (String exp1, double result)
  {
    double b=result;
    double sin=0;
    String inside="";
    b = b*(3.1416/180);
    double x=0;
    int signo = 1;
    if (exp1.equals("sin") || exp1.equals("tan"))
      for(int i=1; i<10; i+=2)
      {
        sin += signo*power(b, i) / factorial(i);
        signo *= -1;
      }
    else
    {
      inside = exp1.substring(exp1.indexOf("(")+1, exp1.indexOf(")"));
      x=Integer.valueOf(inside);
      x = x*(3.1416/180);
      for(int i=1; i<10; i+=2)
      {
        sin += signo*power(x, i) / factorial(i);
        signo *= -1;
      }
    }
    return sin;
  }
  /**
   * This method calculates the cosine of a number using the Taylor series.
   * <b>pre:</b> The user already knows how the calculator works.
   * <b>post:</b> The math operation has been realized.
   * @param exp1 is what the user typed first and it is a valid value.
   * @param result stores the value of the last math operation.
   * @return cosine.
   */
  public static double cos (String exp1, double result)
  {
    double b=result;
    double cos=0;
    String inside="";
    b = b*(3.1416/180);
    double x=0;
    int signo = 1;
    if (exp1.equals("cos") || exp1.equals("tan"))
      for(int i=0; i<10; i+=2)
      {
        cos += signo*power(b, i) / factorial(i);
        signo *= -1;
      }
    else
    {
      inside = exp1.substring(exp1.indexOf("(")+1, exp1.indexOf(")"));
      x=Integer.valueOf(inside);
      x = x*(3.1416/180);
      for(int i=0; i<10; i+=2)
      {
        cos += signo*power(x, i) / factorial(i);
        signo *= -1;
      }
    }
    return cos;
  }
  /**
   * This method calculates the tangent of a number using the sine and cosine methods created before.
   * <b>pre:</b> The user already knows how the calculator works.
   * <b>post:</b> The math operation has been realized.
   * @param exp1 is what the user typed first and it is a valid value.
   * @param result stores the value of the last math operation.
   * @return tangent.
   */
  public static double tan (String exp1, double result)
  {
    double sin=sin(exp1, result);
    double cos=cos(exp1, result);
    double tan=sin/cos;
    return tan;
  }
  /**
   * This method calculates the log10 and log base n of a number.
   * <b>pre:</b> The user already knows how the calculator works.
   * <b>post:</b> The math operation has been realized.
   * @param exp1 is what the user typed first and it is a valid value.
   * @param result stores the value of the last math operation.
   * @return logarithm.
   */
  public static double log (String exp1, double result)
  {
    double log=0;
    String inside="";
    String base="";
    if (exp1.equals("log10"))
      log = Math.log10(result);
    else
    {
      base = exp1.substring(3, exp1.indexOf("("));
      inside = exp1.substring(exp1.indexOf("(")+1, exp1.indexOf(")"));
      log = Math.log10(Integer.valueOf(inside))/Math.log10(Integer.valueOf(base));
    }
    return log;
  }
  /**
   * This method calculates the n root of a number.
   * <b>pre:</b> The user already knows how the calculator works.
   * <b>post:</b> The math operation has been realized.
   * @param exp1 is what the user typed first and it is a valid value.
   * @param result stores the value of the last math operation.
   * @return n root.
   */
  public static double n_root (String exp1, double result)
  {
    float n_root=0;
    String inside="";
    String[] parts=exp1.split("_root");
    if (exp1.contains("("))
    {
      inside = exp1.substring(exp1.indexOf("(")+1, exp1.indexOf(")"));
      n_root=(float)Math.pow(Double.valueOf(inside),(1.0/Double.valueOf(parts[0])));
    }
    else
    {
      n_root=(float)Math.pow(result,(1.0/Double.valueOf(parts[0])));
    }
    return n_root;
  }
  /**
   * This method prints the list of the last ten results and the variables in which they are stored.
   * <b>pre:</b> The user already knows how the calculator works.
   * <b>post:</b> The math operation has been realized.
   * @param r's are the variables that store the value of the last ten results.
   */
  public static void memory_r (double r1, double r2, double r3, double r4, double r5, double r6, double r7, double r8, double r9, double r10)
  {
    System.out.println("Memory of the last ten results:\nr1="+r1+"\nr2="+r2+"\nr3="+r3+"\nr4="+r4+"\nr5="+r5+"\nr6="+r6+"\nr7="+r7+"\nr8="+r8+"\nr9="+r9+"\nr10="+r10);
  }
  /**
   * This method evaluates the first expresion entered by the user to then define which method to call into the main class or to ask another input.
   * <b>pre:</b> The user already knows how the calculator works.
   * <b>post:</b> The math operation has been realized.
   * @param exp1 is what the user typed first and it is a valid value.
   * @param lectorstr is the Scanner that reads the user's input and has already been created.
   * @return type of operation to execute.
   */
  public static String expresion (String exp1, Scanner lectorstr)
  {
    String opp;
    if (exp1.equals("+"))
     opp = "op+";
    else if (exp1.equals("-"))
     opp = "op-";
    else if (exp1.equals("*"))
     opp = "op*";
    else if (exp1.equals("/"))
     opp = "op/";
    else if (exp1.equals("%"))
     opp = "op%";
    else if (exp1.contains("sqrt"))
     opp = "opsqrt";
    else if (exp1.contains("power"))
     opp = "oppow";
    else if (exp1.contains("!"))
     opp = "op!";
    else if (exp1.contains("d_b"))
     opp = "opd_b";
    else if (exp1.contains("b_d"))
     opp = "opb_d";
    else if (exp1.contains("d_h"))
     opp = "opd_h";
    else if (exp1.contains("h_d"))
     opp = "oph_d";
    else if (exp1.contains("b_h"))
     opp = "opb_h";
    else if (exp1.contains("h_b"))
     opp = "oph_b";
    else if (exp1.contains("g_r"))
     opp = "opg_r";
    else if (exp1.contains("r_g"))
     opp = "opr_g";
    else if (exp1.contains("sin"))
     opp = "opsin";
    else if (exp1.contains("cos"))
     opp = "opcos";
    else if (exp1.contains("tan"))
     opp = "optan";
    else if (exp1.contains("log"))
     opp = "oplog";
    else if (exp1.contains("root"))
     opp = "oproot";
    else if (exp1.equals("r"))
     opp = "opr";
    else
     opp = lectorstr.nextLine();
    return opp;
  }
}