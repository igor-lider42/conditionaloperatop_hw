public class Main {
    public static void main(String[] args) {
        // Домашнее задание 1
       // Задача 1

      int age =14;
      if (age >= 18) {
          System.out.println("Поздравляем вас с совершеннолетием!");
      }
      if (age < 18){
          System.out.println("Ваш возраст совершеннолетия ещё не наступил, и нужно немного подождать.");
      }

      // Задача 2

        if (age >= 6) {
            System.out.println("Вы можете ходить в школу.");
        }
        if (age >= 18) {
            System.out.println("Вы можете поступать в университет.");
        }
        if (age >= 24) {
            System.out.println("Вам пора искать первую работу.");
        }

        // Задача 3

        int carriagePassengers = 59;

        if (carriagePassengers < 60) {
            System.out.println("В вагоне есть сидячие места");
        }
        if (carriagePassengers<102) {
            System.out.println("В вагоне есть стоячие места");
        }
        if (carriagePassengers == 102) {
            System.out.println("Вагон полность забит");
        }

        // Домашнее задание 2
        // Задача 1


        if (age >= 18) {
            System.out.println("Поздравляем вас с совершеннолетием!");
        }
        else{
            System.out.println("Ваш возраст совершеннолетия ещё не наступил, " +
                "и нужно немного подождать.");
        }

        // Задача 2

        if (age < 7);
        else {
            System.out.println("Вы можете ходить в школу.");
        }
        if (age < 18);
        else {
            System.out.println("человек уже закончил школу и может отправляться в университет, " +
                    "если его возраст 18 и больше;.");
        }
        if (age < 24);
        else {
            System.out.println("человек окончил университет и ему пора искать первую работу," +
                    " если ему 24 и больше лет.");
        }

         // Задача 3


        if (carriagePassengers >= 60);
        else {
            System.out.println("В вагоне есть сидячие места");
        }
        if (carriagePassengers ==102);
        else {
            System.out.println("В вагоне есть стоячие места");
        }
        if (carriagePassengers < 102);
        else {
            System.out.println("Вагон полность забит");
        }


        // Домашнее задание 3

        // Задание 1

        if (age >=2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в детский сад.");
        }
         if (age >=7 && age <= 18) {
             System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в школу.");
         }
         if (age > 18 && age <= 24) {
             System.out.println( "Если возраст человека равен " + age + " лет, то его место в университете.");
         }
         if (age > 24) {
             System.out.println( "Если возраст человека равен " + age + " лет, то ему пора ходить на работу.");
         }

         // Вариант 2 решения первого задания

        else if (age >=2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в детский сад.");
        }
        else if (age >=7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в школу.");
        }
        else if (age > 18 && age <= 24) {
            System.out.println( "Если возраст человека равен " + age + " лет, то его место в университете.");
        }
        else {
            System.out.println( "Если возраст человека равен " + age + " лет, то ему пора ходить на работу.");
        }

        // Задание 2

        if (age < 5) {
            System.out.println("Если возраст ребёнка " + age + " года, то ему ему нельзя кататься на атракционе.");
        }

        else if(age>=5 && age < 14) {
            System.out.println("Если возраст ребёнка " + age + " лет, то то он может кататься" +
                    " на атракционе, только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        else {
            System.out.println("Возраст ребёнка " + age + " лет, и он может кататься на атракционе один.");
        }

        // Задание 3

        int one = 1;
        int two = 2;
        int free = 3;
        if (two < one && two < free) {

        }
        else {
            System.out.println("Значит " + free + " большее число.");
        }



















    }
}