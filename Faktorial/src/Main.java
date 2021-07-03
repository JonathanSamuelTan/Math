import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Angka Yang Ingin Difaktorialkan => ");
        int angka = input.nextInt();
        double hasil = angka;
        for(int i = 1 ; i < angka ; i++){
             hasil = hasil*(angka-i);
        }
        System.out.println("Hasil dari "+angka+ "! = "+hasil);
    }
}
