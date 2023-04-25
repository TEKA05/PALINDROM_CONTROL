package com.universal_yazilim.bid.ysm.oop.palindrom;

import java.util.Scanner;

public class Palindrom {
    public Palindrom() {
    }

    public static void main(String[] args) {
        String inputString= null;

        String inputString2 = null;

        String palidromMu = null;

        Palindrom.palindromMu(palidromMu);

        System.out.println();

        Palindrom.tersiMi(inputString, inputString2);
    }


    public static boolean palindromMu(String palindromMu)
    {   String inputString;
        Scanner in = new Scanner(System.in);

        System.out.print("Stringi giriniz : ");
        inputString = in.nextLine();

        int length  = inputString.length();
        int i, begin, end, middle;

        begin  = 0;
        end    = length - 1;
        middle = (begin + end)/2;

        for (i = begin; i <= middle; i++) {
            if (inputString.charAt(begin) == inputString.charAt(end)) {
                begin++;
                end--;
            }
            else
                break;
        }
        if (i == middle + 1)
            System.out.println("True");
        else
            System.out.println("False");

        return false;
          }

    public static void tersiMi(String str, String str2) {
        String inputString;
        String inputString2;
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);


        System.out.print("Stringi giriniz : ");
        inputString = scan.nextLine();

        System.out.print("String 2 giriniz : ");
        inputString2 =scan2.nextLine();

        String inputString3 = "";

        if (inputString2.length()!=inputString.length())
        {
            System.out.println("Uyarı: Bu 2 kelime birbiriyle aynı uzunlukta olmalıdır.");
        }
        else if (inputString.length()==inputString2.length())
        {
            if (inputString.equals(inputString2) )
            {
                for(int i = (inputString.length()-1); i >= 0; i--)
                {
                    inputString3 += inputString.charAt(i);
                }
                if(inputString3.equals(inputString)) {
                    System.out.println("Bu 2 kelime birbiriyle aynı olmasına rağmen birbirinin tersidir; " +
                            "çünkü bu kelimeler palindromdur.");
                }
                else {
                    System.out.println("Uyarı: Bu 2 kelime birbirinden farklı olmalıdır.");
                }
            }

            else
            {

                int length = inputString2.length();

                for (int i = length - 1 ; i >= 0 ; i--)
                    inputString3 = inputString3 + inputString2.charAt(i);

                if (inputString3.equals(inputString))
                {
                    System.out.println("Bu 2 kelime birbirinin tersidir.");
                }
                else
                {
                    System.out.println("Bu 2 kelime birbirinin tersi değildir.");
                }
            }
        }
    }
}



