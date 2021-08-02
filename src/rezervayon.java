import java.util.Random;

class PegasusRezervasyonSistemi extends UcakRezervasyonSistemi{
    int Processing;

    public PegasusRezervasyonSistemi() {

    }

    public PegasusRezervasyonSistemi(int koltukSayisi) {
        super(koltukSayisi);
    }

    @Override
    public void RezervasyonAl() {

        System.out.println("Pegasus tercih ettiğiniz için teşekkür ederiz!"+"\n"+"- Business class uçmak için 0' a basınız , ekonomi class uçmak için 1'e basınız: ");
        Processing = scanner.nextInt();
        EkonomiOrBusiness(Processing);
    }

    private void EkonomiOrBusiness(int islem) {

        if(islem==0) {
            System.out.println("Business class verileri yükleniyor , lütfen bekleyiniz..");
            BusinessClassTicket();
        }
        else if(Processing==1)
        {
            System.out.println("Ekonomi class verileri yükleniyor , lütfen bekleyiniz..");
            EconomiClassTicket();
        }
        else
            System.out.println("Hatalı giriş yaptınız.");
        return;
    }

    private void EconomiClassTicket() {
        Random rnd = new Random();

        if (ekonomiDoluMu()) {
            System.out.println("Ekonomi Class Koltukları Doludur.");
        }
        else {
            int rastgeleKoltuk =  rnd.nextInt(koltuklar.length);
            if(rastgeleKoltuk<6 || rastgeleKoltuk>koltuklar.length || koltuklar[rastgeleKoltuk]==true) {
                rastgeleKoltuk = rnd.nextInt(koltuklar.length+1);
            }
            System.out.println("Koltuk no: "+rastgeleKoltuk+" adınıza rezerve edildi!");
            System.out.println("İyi uçuşlar!");
            koltuklar[rastgeleKoltuk-1]=true;
        }

    }

    private void BusinessClassTicket() {
        // TODO Auto-generated method stub
        if(businessDoluMu()) {
            System.out.println("Business Class Koltukları Doludur.");
        }
        else {
            System.out.println("Aşağıdaki boş koltuklardan birini seçiniz:");
            for (int i = 1; i <6; i++) {
                if(koltuklar[i]== false ) {
                    System.out.print(i+" ");
                }
            }
            System.out.println();
            int Koltuksecim = scanner.nextInt();
            System.out.println("Koltuk no: "+Koltuksecim+" adınıza rezerve edildi!");
            System.out.println("İyi uçuşlar!");
            koltuklar[Koltuksecim]=true;
        }
    }

}