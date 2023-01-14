public class Main {
        public static void main(String[] args) {

            int mese = 10;
            int giorno = 4;

             if((mese==3 && giorno>20 && giorno<32) || (mese==4 && giorno>0 && giorno<21)){
                 System.out.println("Sei Ariete");
             } else if ((mese==4 && giorno>20 && giorno<31) || (mese==5 && giorno>0 && giorno<21)) {
                 System.out.println("Sei Toro");
             } else if ((mese==5 && giorno>20 && giorno<32) || (mese==6 && giorno>0 && giorno<21)) {
                 System.out.println("Sei Gemelli");
             } else if ((mese==6 && giorno>21 && giorno<31) || (mese==7 && giorno>0 && giorno<23)) {
                 System.out.println("Sei Cancro");
             } else if ((mese==7 && giorno>22 && giorno<32) || (mese==8 && giorno>0 && giorno<24)) {
                 System.out.println("Sei Leone");
             } else if ((mese==8 && giorno>23 && giorno<32) || (mese==9 && giorno>0 && giorno<23)) {
                 System.out.println("Sei Vergine");
             } else if ((mese==9 && giorno>22 && giorno<31) || (mese==10 && giorno>0 && giorno<23)) {
                 System.out.println("Sei Bilancia");
             } else if ((mese==10 && giorno>22 && giorno<32) || (mese==11 && giorno>0 && giorno<23)) {
                 System.out.println("Sei Scorpione");
             } else if ((mese==11 && giorno>22 && giorno<31) || (mese==12 && giorno>0 && giorno<22)) {
                 System.out.println("Sei Sagittario");
             } else if ((mese==12 && giorno>21 && giorno<32) || (mese==1 && giorno>0 && giorno<21)) {
                 System.out.println("Sei Capricorno");
             } else if ((mese==1 && giorno>20 && giorno<32) || (mese==2 && giorno>0 && giorno<20)) {
                 System.out.println("Sei Aquario");
             } else if ((mese==2 && giorno>19 && giorno<29) || (mese==3 && giorno>0 && giorno<21)) {
                 System.out.println("Sei Pesci");
             }

        }
    }