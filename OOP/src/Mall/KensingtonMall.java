package Mall;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class KensingtonMall extends Mall implements Section{
    private int yearIncome;
    private List<String> personal = new ArrayList<>();
    private int number;
    protected KensingtonMall(Builder builder) {
        super(builder);
        number = getCount();
    }
    protected static class Builder2 extends Mall.Builder{

        public Builder2(String address, String mallName, String workingTime) {
            super(address, mallName, workingTime);
        }

        @Override
        public Mall build() {
            return new Mall(this);
        }
    }
    //-----------------getters/incomes----------------//
    public int getYearIncome() {
        return yearIncome;
    }
    public List<String> getPersonal() {
        return personal;
    }
    public void setYearIncome(int yearIncome) {
        this.yearIncome = yearIncome;
    }
    @Override
    public void addPersonal(Collection<String> employee) {
        personal.addAll(employee);
    }

    @Override
    public int payTax(int Percent) {
        return getYearIncome()-(getYearIncome()*Percent/100);
    }

    @Override
    public String toString() {
        return getClass()+"{" +
                "Прибыль в год = " + getYearIncome() +"\n"+
                "Персонал = " + getPersonal() +"\n"+
                "Адресс расположения = " + getAddress() + '\n' +
                "Имя ТЦ = " + getMallName()+ '\n' +
                "Время работы = " + getWorkingTime() + '\n' +
                "Количество этажей = " + getAmountOfFloors() + '}'+
                "№ - "+ number;
    }
}
