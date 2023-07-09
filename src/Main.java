import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner imp = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int Sayi= imp.nextInt();
        int basNumber=0,tempNumar=Sayi,basValue = 0,totalNumbers=0;

        while (tempNumar!=0) {
            tempNumar/=10;
            basNumber++;
        }
        tempNumar=Sayi;
        while (tempNumar!=0) {
            basValue=tempNumar%10;
            System.out.println("Son Haneleri "+basValue);//Sürekli son Hanesini Alıyor
            tempNumar/=10;
            basNumber++;
            totalNumbers+=basValue;
        }
        System.out.println("Toplam= "+totalNumbers);//Sürekli son Hanesini Alıyor
