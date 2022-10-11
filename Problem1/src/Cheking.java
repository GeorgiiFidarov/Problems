
public class Cheking {

    public final String CarModel;
    public final int Price;
    public final int Year;

    public Cheking(String CarModel, int Price, int Year){
        this.CarModel = CarModel;
        this.Price = Price;
        this.Year = Year;
    }
    public String GetCarModel(){
        return CarModel;
    }
    public int getPrice(){
        return Price;
    }
    public int getYear(){
        return Year;
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null||getClass()!= o.getClass()) return false;
        Cheking sameModel = (Cheking) o;
        if (Price != sameModel.Price) return false;
        if (Year  != sameModel.Year) return false;
        return CarModel.equals(sameModel.CarModel);
    }
    @Override

    public int hashCode(){
        int value = CarModel == null ? 0: CarModel.hashCode();//суммарный хэщкод элементов
        value = value + Price * 31;
        value = value + Year * 31;
        return value;
        //return Objects.hash(Year,Price);
    }
}
