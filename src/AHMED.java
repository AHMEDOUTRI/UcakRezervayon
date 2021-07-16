import com.company.FlightTicketReservation.THERevervasyonSistemi;
import com.company.FlightTicketReservation.pegasusRezevasyonSistemi;

import java.util.Scanner;

public class AHMED {

    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to flight ticket reservation system");

        rezervayon thy = new rezervayon(15) {
            @Override
            public int UcakRezervayon() {
                return 6;
            }
        };
        rezervayon pegasus= new rezervayon(10) {
            @Override
            public int UcakRezervayon() {
                return 0;
            }
        };

        String userInput="1";

        while(userInput.equals("1")){
            System.out.println("THY rezarvasyon için 1'e basınız, Pegasus rezasvanyon için 2'ye, çıkış için herhangi bir tuşa basınız");
            String selectAction= scanner.next();

            switch (selectAction){
                case "1":
                    thy.reservation(selectAction);
                    break;
                case "2":
                    pegasus.reservation(selectAction);
                    break;
                default:
                    System.out.println("Çıkış yapılıyor lütfen bekleyiniz");
                    userInput="0";
                    break;
            }
        }

    }
}
