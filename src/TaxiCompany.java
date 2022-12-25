import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
public class TaxiCompany {
    private ArrayList<CarTaxi> Cars;

    public TaxiCompany(){
        Cars = new ArrayList<>();
    }
    public void addTaxi(CarTaxi tax){
        Cars.add(tax);
    }
    public void getTaxiInfo() throws InterruptedException{
        for (int numbers_curs = 0; numbers_curs < Cars.size(); numbers_curs++){
            String info = Cars.get(numbers_curs).getInfoAboutCar();
            System.out.printf(info);
        }
        TimeUnit.SECONDS.sleep(10);
    }
}
