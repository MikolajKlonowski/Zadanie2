public class Laptopy {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("lenovo", "ideapad520", "Nvidia Grforce", 940, "mx", "intel i5", 2.50);
//        laptop1.model = "ideapad520";
//        laptop1.marka = "Lenovo";
//        laptop1.procesorModel = "intel i5";
//        laptop1.taktowanie = 2.50;
//        laptop1.kartaGraficzna = "Nvidia Geforce";
//        laptop1.modelKartyGraficznej = "mx";
//        laptop1.numerKartyGraficznej = 940;

        Laptop laptop2 = new Laptop("Asus", "U24E", "Intel", 3000, "HD Graphics", "intel i3", 2.20);
//        laptop2.model = "U24E";
//        laptop2.marka = "Asus";
//        laptop2.procesorModel = "intel i3";
//        laptop2.taktowanie = 2.20;
//        laptop2.kartaGraficzna = "Intel";
//        laptop2.modelKartyGraficznej = "HD Graphics";
//        laptop2.numerKartyGraficznej = 3000;

        System.out.println("Laptop1: \n"+"Marka: "+laptop1.marka+"\nModel: "+laptop1.model+
                "\nProsesor: "+ laptop1.procesorModel+", taktowanie: "+laptop1.taktowanie+
                "\nKarta graficzna: "+ laptop1.kartaGraficzna+", model: "+ laptop1.modelKartyGraficznej+", numer: "+laptop1.numerKartyGraficznej+"\n");
        System.out.println("Laptop2: \n"+"Marka: "+laptop2.marka+"\nModel: "+laptop2.model+
                "\nProsesor: "+ laptop2.procesorModel+", taktowanie: "+laptop2.taktowanie+
                "\nKarta graficzna: "+ laptop2.kartaGraficzna+", model: "+ laptop2.modelKartyGraficznej+", numer: "+laptop2.numerKartyGraficznej);





    }
}
