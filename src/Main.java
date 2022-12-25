public class Main {
    public static void main(String[] args) throws InterruptedException{
        TaxiCompany Uber = new TaxiCompany();
        CarTaxi u_car1 = new CarTaxi("Renault Logan");
        CarTaxi u_car2 = new CarTaxi("Volkswagen Polo");
        CarTaxi u_car3 = new CarTaxi("mercedes benz");
        Uber.addTaxi(u_car1);
        Uber.addTaxi(u_car2);
        Uber.addTaxi(u_car3);
        TaxiCompany Yandex = new TaxiCompany();
        CarTaxi y_car1 = new CarTaxi("hyundai solaris");
        CarTaxi y_car2 = new CarTaxi("Nissan almera");
        CarTaxi y_car3 = new CarTaxi("genesis gv80");
        Yandex.addTaxi(y_car1);
        Yandex.addTaxi(y_car2);
        Yandex.addTaxi(y_car3);
        while (true){
            Uber.getTaxiInfo();
            Yandex.getTaxiInfo();
        }

    }
}