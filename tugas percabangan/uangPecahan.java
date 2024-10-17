import java.util.Scanner;
public class uangPecahan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahUang,u100rb,u50rb,u20rb,u10rb,u5rb,u2rb,u1rb,u500,u200,u100;
        System.out.print("Masukkan uang: ");
        jumlahUang = sc.nextInt();

        u100rb = jumlahUang / 100000;
        jumlahUang = jumlahUang % 100000;
        if(u100rb != 0){
            System.out.println(u100rb+ " Lembar 100000");
        }

        u50rb = jumlahUang / 50000;
        jumlahUang = jumlahUang % 50000;
        if(u50rb != 0){
            System.out.println(u50rb+ " Lembar 50000");
        }

        u20rb = jumlahUang / 20000;
        jumlahUang = jumlahUang % 20000;
        if(u20rb != 0){
            System.out.println(u20rb+ " Lembar 20000");
        }

        u10rb = jumlahUang / 10000;
        jumlahUang = jumlahUang % 10000;
        if(u10rb != 0){
            System.out.println(u10rb+ " Lembar 10000");
        }

        u5rb = jumlahUang / 5000;
        jumlahUang = jumlahUang % 5000;
        if(u5rb != 0){
            System.out.println(u5rb+ " Lembar 5000");
        }

        u2rb = jumlahUang / 2000;
        jumlahUang = jumlahUang % 2000;
        if(u2rb != 0){
            System.out.println(u100rb+ " Lembar 2000");
        }

        u1rb = jumlahUang / 1000;
        jumlahUang = jumlahUang % 1000;
        if(u1rb != 0){
            System.out.println(u1rb+ " Lembar 1000");
        }

        u500 = jumlahUang / 500;
        jumlahUang = jumlahUang % 500;
        if(u500 != 0){
            System.out.println(u500+ " Lembar 500");
        }

        u200 = jumlahUang / 200;
        jumlahUang = jumlahUang % 200;
        if(u200 != 0){
            System.out.println(u200+ " Lembar 200");
        }

        u100 = jumlahUang / 100;
        jumlahUang = jumlahUang % 100;
        if(u100 != 0){
            System.out.println(u100+ " Lembar 100");
        }
        sc.close();
        
    }
}

/* Mencari angka 1
 * 1 = 300/200
 * sisa = 300%200
 * 100 ribuan, 50 ribuan, 20 ribuan, 10 ribuan, 5 ribuan, 2 ribuan, 1ribuan, 500, dan 100
 */