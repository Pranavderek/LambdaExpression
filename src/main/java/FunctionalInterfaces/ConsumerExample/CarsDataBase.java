package FunctionalInterfaces.ConsumerExample;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarsDataBase
{
    List<Cars> car = new ArrayList<>();

    // High-end cars

    Cars car1 = new Cars(12,"Audi600","89L","Germany");
    Cars car2 = new Cars(13,"Benz","1.2C","Italy");

    // Mid-Range cars

    Cars car3 = new Cars(14,"Toyota","55L","Dubai");
    Cars car4 = new Cars(15,"Skoda","49L","Brazil");

    // Normal cars

    Cars car5 = new Cars(19,"Maruthi","21","India");
    Cars car6 = new Cars(17,"Tata","17","India");

    public List<Cars> GetAllCars()
    {
        List<Cars> cars = Arrays.asList(car1,car2,car3,car4,car5,car6);
        return cars;
    }

}
