package numeros.en.japones;

import java.util.Scanner;

public class NumerosEnJapones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op, n, m=51, inicio, fin;
        char r;
        String nums[] = new String[m];

        nums[0] = "〇";
        nums[1] = "一";
        nums[2] = "二";
        nums[3] = "三";
        nums[4] = "四";
        nums[5] = "五";
        nums[6] = "六";
        nums[7] = "七";
        nums[8] = "八";
        nums[9] = "九";
        nums[10] = "十";
        nums[11] = "十一";
        nums[12] = "十二";
        nums[13] = "十三";
        nums[14] = "十四";
        nums[15] = "十五";
        nums[16] = "十六";
        nums[17] = "十七";
        nums[18] = "十八";
        nums[19] = "十九";
        nums[20] = "二十";
        nums[21] = "二十一";
        nums[22] = "二十二";
        nums[23] = "二十三";
        nums[24] = "二十四";
        nums[25] = "二十五";
        nums[26] = "二十六";
        nums[27] = "二十七";
        nums[28] = "二十八";
        nums[29] = "二十九";
        nums[30] = "三十";
        nums[31] = "三十一";
        nums[32] = "三十二";
        nums[33] = "三十三";
        nums[34] = "三十四";
        nums[35] = "三十五";
        nums[36] = "三十六";
        nums[37] = "三十七";
        nums[38] = "三十八";
        nums[39] = "三十九";
        nums[40] = "四十";
        nums[41] = "四十一";
        nums[42] = "四十二";
        nums[43] = "四十三";
        nums[44] = "四十四";
        nums[45] = "四十五";
        nums[46] = "四十六";
        nums[47] = "四十七";
        nums[48] = "四十八";
        nums[49] = "四十九";
        nums[50] = "五十";
      
        do{
        System.out.println("¿Qué desea realizar? \n1. Ver solo UN número en japonés \n2. Ver números del 0 al 50 \n3. Ver un rango de números en japones");
        op = sc.nextInt();

        switch (op) {
            case 1:
                System.out.println("Ingrese número: ");
                n = sc.nextInt();
                System.out.println(n+ "en japonés es: " +nums[n]);
                break;
            case 2:
                for(int i=0;i<=50;i++){
                    System.out.println(i+ " = " +nums[i]);
                }
                break;
            case 3:
                System.out.println("-----Rango solo del 0 al 50-----");
                System.out.print("Ingrese inicio: \t");
                inicio = sc.nextInt();
                System.out.print("\nIngrese fin: \t");
                fin = sc.nextInt();
                
                for(int i=inicio;i<=fin;i++){
                    System.out.println(i+ " = " +nums[i]);
                }
                break;
        }
        
        System.out.println("¿Desea realizar proceso de nuevo? (s/n)");
        r = sc.next().charAt(0);
        }while(r=='s' || r=='S');
    }

}
