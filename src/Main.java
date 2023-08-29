public class Main {
    public static void main(String[] args) {
        //
        //задача 1
        System.out.println("\nЗадача 1");
        int age1 = 10;
        if (age1 >= 18) {
            System.out.println("Если возраст человека равен " + age1 + " лет, то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age1 + " лет, то он не достиг совершеннолетия");
        }
        //
        //задача 2
        System.out.println("\nЗадача 2");
        int temperature = 2;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        //
        //задача 3
        System.out.println("\nЗадача 3");
        int speed = 100;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        //
        //задача 4
        System.out.println("\nЗадача 4");
        int age2 = 20;
        if (age2 < 2 || age2 > 6) {
            if (age2 < 7 || age2 >= 18) {
                if (age2 < 18 || age2 >= 24) {
                    if (age2 >= 24) {
                        System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить на работу");
                    }
                } else {
                    System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в университет");
                }
            } else {
                System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в школу");
            }
        } else {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в детский сад");
        }
        //
        //задача 5
        System.out.println("\nЗадача 5");
        int age3 = 14;
        if (age3 < 5 || age3 >= 14) {
            if (age3 >= 14) {
                System.out.println("Если возраст ребенка равен " + age3 + " то он может кататься без сопровождения взрослого");
            } else {
                System.out.println("Если возраст ребенка равен " + age3 + " то он не может кататься на аттракционах");
            }
        } else {
            System.out.println("Если возраст ребенка равен " + age3 + " то он может кататься только в сопровождении взрослого");
        }
        //
        //задача 6
        System.out.println("\nЗадача 6");
        int wagonCapacity = 102;//вместимость вагона
        int seatsQty = 60;//количество сидячих мест
        int passingers = 30;//количество пассажиров
        if (passingers > wagonCapacity) {
            System.out.println("В вагоне нет мест");
        } else {
            if (passingers > 60) {
                System.out.println("В вагоне осталось " + (wagonCapacity - passingers) + " стоячих мест");
            } else {
                System.out.println("В вагоне осталось " + (seatsQty - passingers) + " сидячих мест");
            }
        }
        //
        //задача 7
        System.out.println("\nЗадача 7");
        int one = 25;
        int two = 400;
        int three = 618;
        if (one > two && one >three) {
            System.out.println("Из чисел " + one + ", " + two + " и " + three + ", самое большое: " + one);
        } else {
            if (two > one && two > three) {
                System.out.println("Из чисел " + one + ", " + two + " и " + three + ", самое большое: " + two);
            } else {
                System.out.println("Из чисел " + one + ", " + two + " и " + three + ", самое большое: " + three);
            }
        }

    }


}

