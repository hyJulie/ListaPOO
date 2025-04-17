package Carro.test;

import Carro.Carro;

public class CarroTest {
    public static void main(String[] args) {
         Carro car = new Carro("Sedan", "Onix", 2020, true);

         car.ligar();
         car.statusCarro();
    }
}
