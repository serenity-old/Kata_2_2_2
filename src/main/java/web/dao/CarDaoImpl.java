package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("ВАЗ 2101", "чёрный", 1972, 5000));
        carList.add(new Car("ВАЗ 2106", "белый", 1995, 15000));
        carList.add(new Car("ВАЗ 2107", "красный", 2001, 25000));
        carList.add(new Car("ВАЗ 2110", "зеленый", 2003, 50000));
        carList.add(new Car("ВАЗ 2114", "серебристый", 2005, 55000));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return carList;
        }

        return carList.stream().limit(count).collect(Collectors.toList());
    }
}