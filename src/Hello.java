public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World. Welcome to Java");


        System.out.println();
        determinenumbers();
        System.out.println();
        existtriangle();
        System.out.println();
        determinePositiveorNegative();
        System.out.println();
        determinePositivenumbers();
        System.out.println();
        determinePositiveandNegativenumbers();
        System.out.println();
        displayThelargest();
        System.out.println();
        countProgrammers();
    }


        static void determinenumbers () {

        /* В переменную записываем число, надо вывести на экран сколько в этом числе цифр и положительное оно или
        отрицательное. Достаточно будет определить, является ли число однозначным, двузначным, трехзначным и более.*/

        int x = -145;
        if (x >= 0 && x < 10) {
            System.out.println("Это однозначное положительное число");
        } else if (x > 0 && (x / 10) < 10) {
            System.out.println("Это двузначное положительное число");
        } else if (x > 0 && (x / 100) < 10) {
            System.out.println("Это трехзначное положительное число");
        } else if (x < 0 && (x / 10) > -1) {
            System.out.println("Это однозначное отрицательное число");
        } else if (x < 0 && (x / 10) > -10) {
            System.out.println("Это двузначное отрицательное число");
        } else if (x < 0 && (x / 100) > -10) {
            System.out.println("Это трехзначное отрицательное число");
        }
    }

        static void existtriangle () {
        /*Дано: a,b,c - стороны предполагаемого треугольника. Требуется сравнить длину каждого отрезка-стороны с суммой
                двух других. Если хотя бы в одном случае отрезок окажется больше суммы двух других, то треугольника с
                такими стороами не существует */

        int a = 2;
        int b = 4;
        int c = 7;

        if ((a + b) < c || (a + c) < b || (b + c) < a) {
            System.out.println("Такого треугольника не существует");
        } else {
            System.out.println("Такой треугольник существует");
        }
    }

        static void determinePositiveorNegative () {
        /*Дано целое число. Если оно является положительным, то прибавить к нему. Если отрицательное, то вычесть из него
         * 2. Если нулевым, то заменить его на 10. Вывести полученное число */

        int x = 0;

        {
            if (x > 0) {
                System.out.println(++x);
            } else if (x < 0) {
                System.out.println(x - 2);
            } else if (x == 0) {
                System.out.println("10");
            }
        }

    }

        static void determinePositivenumbers () {
        /*Даны 3 целых числа. Найти количество положительных чисел в исходном наборе */

        int x = -10;
        int y = -90;
        int z = 5;
        int positive = 0;

        if (x >= 0) {
            ++positive;
        } else if (y >= 0) {
            ++positive;
        } else if (z >= 0) {
            ++positive;
        }

        System.out.println("Количество положительных чисел: " + positive);

    }

        static void determinePositiveandNegativenumbers () {
        /*Даны 3 целых числа. Найти количество положительных и отрицательных чисел в исходном наборе */

        int x = -40;
        int y = -20;
        int z = 10;
        int positive = 0;
        int negative = 0;

        if (x >= 0) {
            ++positive;
        } else {
            ++negative;
        }
        if (y >= 0) {
            ++positive;
        } else {
            ++negative;
        }
        if (z >= 0) {
            ++positive;
        } else {
            ++negative;
        }

        System.out.println("Количество положительных чисел: " + positive);
        System.out.println("Количество отрицательных чисел: " + negative);
    }

        static void displayThelargest () {
        /* Даны 2 числа. Вывести большее из них */

        int num1 = 12;
        int num2 = 12;

        if (num1 > num2) {
            System.out.println("Наибольшее из чисел:" + num1);
        } else if (num1 == num2) {
            System.out.println("Числа равны.");
        } else {
            System.out.println("Наибольшее число:" + num2);
        }

    }

        static void countProgrammers () {
        /* В переменную записываеье количество программистов. В зависимости от количества программистов необходимо
         * вывести правильное окончание */

        int prog = 21;

        if (prog == 1) {
            System.out.println(prog + " программист");
        } else if (prog > 1 && prog < 5) {
            System.out.println(prog + " программиста");
        } else if (prog > 5 && prog < 21) {
            System.out.println(prog + " программистов");
        } else if (prog == 21) {
            System.out.println(prog + " программист");
        } else if (prog > 21 && prog < 25) {
            System.out.println(prog + " программиста");
        } else if (prog > 25 && prog < 31) {
            System.out.println(prog + " программистов");
        }

    }
    }


    