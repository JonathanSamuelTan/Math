//Menampilkan deret fibonaci
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("Program Deret Fibonaci ");
        Scanner Input = new Scanner(System.in);
        System.out.print("Berapa Banyak Angka Yang Ingin Ditampilkan (max 100)?  => ");
        int n = Input.nextInt();
        int[] numbers = new int[n];
        numbers[0]= 0 ;
        numbers[1]= 1 ;
        int index  = 2; //index selanjutnya pada array numbers
        
        
        //0,1,1,2,3,5,8,13,21,...
        //patokan mulai pada u3(1)
        //Rumus dasar : n = (n-1)+(n-2);
        /*
        loop #1 (u3):     loop #2 (u4) :      Loop #3 (u5):
        n  = 1             n   = 2             n   = 3
        n-1 = 1            n-1 = 1             n-1 = 2
        n-2 = 0            n-2 = 1             n-2 = 1
        */ 
        
        int f_n   = 1;
        int f_n_1 = 1 ;
        int f_n_2 = 0 ;
        n = n-2 ; // n-2 karena didalam array sudah ada terlebih dahulu u1 dan u2 sehingga jika user minta tampilkan 5 angka , loop cukup menghasilkan 3 angka saja karena sudah ada 2 angka di array terlebih dahulu.
        for(int i=0 ; i<n ; i++){
            f_n = f_n_1 + f_n_2 ;
            numbers[index]= f_n ; //memasukan hasil looping ke array
            index++;
            f_n_2 = f_n_1;
            f_n_1 = f_n;
        }
        //mencetak isi array
        for( int number : numbers){
            System.out.print(number + " , ");
        }
    } 
}
