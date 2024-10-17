import java.util.Scanner;
public class Kelulusan {
    public static void main(String[] args) {
        int nilai;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai akhir: ");
        nilai = sc.nextInt();
        if(nilai >= 75){
            System.out.println("Anda dinyatakan lulus");
        }else{
            System.out.println("Anda tidak lulus");
        }sc.close();
    }
}