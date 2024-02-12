import java.util.Scanner;
class pangkat_faktorial{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan bilangan utama (n) : ");
        long n = in.nextInt();
        System.out.println("Masukkan pemangkatan (m) : ");
        long m = in.nextInt();
        long hasil_fact = 1;
        long temp_n = n;
        while(temp_n >= 1){
            hasil_fact *= temp_n;
            temp_n--;
        }
        long hasil_pangkat = 1;
        for(int i = 0; i < m; i++) hasil_pangkat *= n;

        System.out.println("n faktorial = " + hasil_fact);
        System.out.println("n pangkat m = " + hasil_pangkat);
        // Halo ini berubah di branch
    }
}