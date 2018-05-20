public class Cars {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "M5", 2007, 2.6); //marka, model, rocznik, pojemność silnika
        Car car2 = car1;

        System.out.println("Samochód 1:");
        System.out.println("Marka: " + car1.marka + ", model: " + car1.model +", rocznik: " + car1.rocznik+ ", pojemność: " + car1.pojemnosc);
        System.out.println("Samochód 2:");
        car2.marka = "Opel";
        car2.model = "Vectra";
        car2.rocznik = 2004;
        car2.pojemnosc = 1.8;
        System.out.println("Marka: " + car2.marka + ", model: " + car2.model +", rocznik: " + car2.rocznik + ", pojemność: " + car2.pojemnosc);
    }
}
