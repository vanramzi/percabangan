import java.util.Scanner;
public class nilaiAkhir {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num;
        char grade;
        System.out.print("Masukkan nilai: ");
        num = sc.nextInt();
        if(num >= 85){
            grade = 'A';
            System.out.println("Grade anda: " + grade);
        }else if(num >= 75){
            grade = 'B';
            System.out.println("Grade anda: " + grade);
        }else if(num >= 65){
            grade = 'C';
            System.out.println("Grade anda: " + grade);
        }else if(num >= 55){
            grade = 'D';
            System.out.println("Grade anda: " + grade);
        }else{
            grade = 'E';
            System.out.println("Grade anda: "+grade);
        }sc.close();
    }
}
