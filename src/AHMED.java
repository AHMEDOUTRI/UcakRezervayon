import java.util.Scanner;

public class AHMED {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UcakRezervasyonSistemi thy = new THYRezervasyonSistemi(10);
        UcakRezervasyonSistemi pegasus = new PegasusRezervasyonSistemi(10);
        int Processing;
        while(true)
        {
            System.out.println("THY Rezervasyon Sistemine Hoş Geldiniz!");
            System.out.println("****************************************");
            System.out.println("THY'dan bilet almak icin 1'e basınız:");
            System.out.println("Pegasus'dan bilet almak icin 2'ye basınız:");
            System.out.println("Çıkış için 3 'e basınız:");
            Processing=scanner.nextInt();

            switch(Processing)
            {

                case 1:
                    thy.RezervasyonAl();

                    break;
                case 2 :
                    pegasus.RezervasyonAl();
                    break;
                case 3:
                    System.out.println("Çıkış yapılıyor. Yine bekleriz :)");
                    scanner.close();
                    break;

            }

        }
    }
}
