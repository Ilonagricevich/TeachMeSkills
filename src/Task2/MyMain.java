package Task2;

public class MyMain {
    public static void main(String[] args)
    {
        Cars[] cars = { new Hatchback("BMW", "Red", 2003, 200),
                new Minivan("Mercredes", "Black", 2001, 310),
                new Crossover("Opel", "Green", 2021, 190),
                new Crossover("Audi", "Blue", 2022,200 )};

        Cars[] cars2 = { new Crossover("Mazda", "Yellow", 2010, 200),
                new Minivan("Kia", "White", 2018, 310),
                new Crossover("Lada", "Brown", 2000, 190),
                new Crossover("Honda", "Pink", 2020,200 )};

        System.out.println("The oldest car is: "+ defineTheOldestCare(cars, cars2));
        System.out.println("The  car is: "+ defineTheFastestCar(cars, cars2));



     }}


