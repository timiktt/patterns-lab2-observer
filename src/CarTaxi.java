public class CarTaxi {
    private String car_model;
    private int x_coordinate = 34;
    private int y_coordinate = 67;

    public CarTaxi(String car_model){
        this.car_model = car_model;
    }

    public String getInfoAboutCar(){
        this.x_coordinate += (int)((Math.random()* 17 )- 7 );
        this.y_coordinate += (int)((Math.random()* 17 )- 7 );
        String info = ("Car: " + this.car_model + " Is located latitude " + this.x_coordinate + " longitude " + this.y_coordinate + "\n");
        return info;
    }

}
