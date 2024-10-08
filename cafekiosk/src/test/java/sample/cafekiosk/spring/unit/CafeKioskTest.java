package sample.cafekiosk.spring.unit;

import org.junit.jupiter.api.Test;
import sample.cafekiosk.spring.unit.beverage.Americano;

import static org.junit.jupiter.api.Assertions.*;

class CafeKioskTest {
    @Test
    void add() {
        CafeKiosk cafeKiosk = new CafeKiosk();
        cafeKiosk.add(new Americano());

        System.out.println(">>> 담긴 음료수: " + cafeKiosk.getBeverages().size());
        System.out.println(">>> 담긴 음료: " + cafeKiosk.getBeverages().get(0).getName());
    }
}