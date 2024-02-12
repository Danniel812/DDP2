import java.util.Scanner;

class nilai{
    public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nama mahasiswa: ");
        String name = in.nextLine();
        System.out.print("Masukkan nilai asli: ");
        int nilai_asli = in.nextInt();
        System.out.print("Masukkan durasi: ");
        int durasi = in.nextInt();
        double nilai_akhir;
        if(durasi < 60){
            nilai_akhir = (double) 1.2 * nilai_asli;
        }else if(durasi >= 60 && durasi <= 70){
            nilai_akhir = nilai_asli;
        }else if(durasi > 70 && durasi < 90){
            nilai_akhir = (double) 0.75 * nilai_asli;
        }else if(durasi >= 90 && durasi <= 100){
            nilai_akhir = (double) 0.5 * nilai_asli;
        }else{
            nilai_akhir = (double) 0.2 * nilai_asli;
        }
        System.out.println(name + " mendapatkan nilai akhir " + nilai_akhir);

    }
}