public class Colectie_pe_vector {

    public static void main(String[] args) {

        //Declarare array
        int[] exempluArray = new int[15];


        System.out.print("Vectorul este: ");

        //Initializare
        for(int i = 0; i < exempluArray.length; i++) {

            exempluArray[i] = i + 2;
            System.out.println("exempluArray[" + i + "] " + exempluArray[i] + " " );
        }

        //Accesare element din Array
        int index = 4;
        System.out.println("Accesam unul din elementele sirului:" + exempluArray[index]);

        //Modificare element din Array
        exempluArray[index] = -761;
        System.out.println("Accesam unul din elementele sirului:" + exempluArray[index]);


        System.out.println("Suntem la String arrays....");
        String[] numePers = new String[5];

        numePers[0] = "Adi";
        numePers[1] = "Ionel";
        numePers[2] = "Sabin";
        numePers[3] = "Mihaela";
        numePers[4] = "Maria";

        for (int i = 0; i < numePers.length; i++) {
            System.out.println(numePers[i]);
        }

        for (String numeTmp : numePers) {
            System.out.println(numeTmp);
        }


    }
}