public class Main {
    public static void main(String[] args) {

                coche micoche=new coche();
                micoche.numeropuertas();
                System.out.println("el coche tiene " +micoche.puertas + " puertas");




            }
             public static class coche{
                public int puertas=2;
                public void numeropuertas(){
                    this.puertas++;
                }
            }
        }

