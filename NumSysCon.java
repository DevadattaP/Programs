import java.util.Scanner;
class ConvNum 
{
    public static int decToBin(int decimal)
    {
        
        int b[]=new int[100];
        int i;
        for(i=0;decimal>0;i++)
        {
            b[i]=decimal%2;
            decimal/=2;
        }
        int binary =0;
        for(i=i-1;i>=0;i--)
        {
            binary=10*binary+b[i];
        }
        return binary;
    }
    public static int binToDec(int binary) 
    {
        int decimal=0;
        int weight =1;
        while(binary!=0)
        {
            int temp=binary%10;
            decimal += temp*weight;
            binary/=10;
            weight*=2;
        }
        return decimal;
    }
    public static int decToOct(int decimal)
    {
        int o[]=new int[100];
        int i;
        for(i=0;decimal>0;i++)
        {
            o[i]=decimal%8;
            decimal/=8;
        }
        int octal =0;
        for(i=i-1;i>=0;i--)
        {
            octal=10*octal+o[i];
        }
        return octal;
    }
    public static int octToDec(int octal) 
    {
        int decimal=0;
        int weight =1;       
        while(octal!=0)
        {
            int temp=octal%10;
            decimal += temp*weight;
            octal/=10;
            weight*=8;
        }
        return decimal;
    }
    public static String decToHex(int decimal)
    {
        int h[]=new int[100];
        int i;
        for(i=0;decimal>0;i++)
        {
            h[i]=decimal%16;
            decimal/=16;
        }
        String hexadecimal="";
        for(i=i-1;i>=0;i--)
        {
            if(h[i]>9)
                hexadecimal+=(char)(55+h[i]);
            else
                hexadecimal+=(char)('0'+h[i]);
        }
        return hexadecimal;
    }
    public static int hexToDec(String hex) 
    {
        int decimal=0;
        int weight = 1;
        for(int i=hex.length()-1; i>=0; i--)
        {
            if(hex.charAt(i)>='0' && hex.charAt(i)<='9')
            {
                decimal+=(hex.charAt(i)-48)*weight;
            }
            else if(hex.charAt(i)>='A' && hex.charAt(i)<='F')
            {
                decimal+=(hex.charAt(i)-55)*weight;
            }
            weight*=16;
        }
        return decimal;
    }
}
class NumSysCon
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int option;
        do
        {
            System.out.println("\n~~~~~ Main Menu ~~~~~");
            System.out.println("1.Decimal to Binary");
            System.out.println("2.Binary to Decimal");
            System.out.println("3.Decimal to Octal");
            System.out.println("4.Octal to Decimal");
            System.out.println("5.Decimal to Hexadecimal");
            System.out.println("6.Hexadecimal to Decimal");
            System.out.println("7.Exit");
            System.out.println("\nEnter an option");
            option = scan.nextInt();
            switch (option)
            {
                case 1: System.out.println("\nEnter a decimal number");
                        int decimal = scan.nextInt();
                        System.out.println("Binary equivalent = " + ConvNum.decToBin(decimal));
                        break;
                case 2: System.out.println("\nEnter a binary number");
                        int binary = scan.nextInt();
                        System.out.println("Decimal equivalent = " +ConvNum.binToDec(binary));
                        break;
                case 3: System.out.println("\nEnter a decimal number");
                        decimal = scan.nextInt();
                        System.out.println("Octal equivalent = " +ConvNum.decToOct(decimal));
                        break;
                case 4: System.out.println("\nEnter an octal number");
                        int octal = scan.nextInt();
                        System.out.println("Decimal equivalent = " +ConvNum.octToDec(octal));
                        break;
                case 5: System.out.println("\nEnter a decimal number");
                        decimal = scan.nextInt();
                        System.out.println("Hexadecimal equivalent = "+ConvNum.decToHex(decimal));
                        break;
                case 6: System.out.println("\nEnter a hexadecimal number");
                        String hex = scan.next();
                        System.out.println("Decimal equivalent = " +ConvNum.hexToDec(hex));
                        break;
                case 7: System.out.println("\tExiting...");
                        break;
                default: System.out.println("\nEnter valid option");
                        break;
            }
        }while(option!=7);
        scan.close();
    }
}