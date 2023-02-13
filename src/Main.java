public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задача 1");

        var dog = 8;
        System.out.println(dog);

        var cat = 3.6;
        System.out.println(cat);

        var paper = 763789;
        System.out.println(paper);
    }
    public static void task2() {
        System.out.println("Задача 2");

        var dog = 8;
        dog += 4;
        System.out.println(dog);

        var cat = 3.6;
        cat += 4;
        System.out.println(cat);

        var paper = 763789;
        paper += 4;
        System.out.println(paper);
    }
    public static void task3() {
        System.out.println("Задача 3");

        float dog = 8.0F;
        dog -= 3.5;
        System.out.println(dog);

        var cat = 3.6;
        cat = cat - 1.6;
        System.out.println(cat);

        var paper = 763789;
        paper = paper - 7639;
        System.out.println(paper);
    }
    public static void task4() {
        System.out.println("Задача 4");

        var friend = 19;
        System.out.println(friend);
        friend *= 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);
    }
    public static void task5() {
        System.out.println("Задача 5");

        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);


    }
    public static void task6() {
        System.out.println("Задача 6");
        var theFirstBoxer = 78.2;
        var theSecondBoxer = 82.7;
        var totalWeight = theFirstBoxer + theSecondBoxer;
        System.out.println("Общий вес боксеров " + totalWeight + " кг");
        var weightDifference = theSecondBoxer - theFirstBoxer;
        System.out.println("Разница веса боксеров " + weightDifference + " кг");
    }

    public static void task7() {
        System.out.println("Задача 7");
        var theFirstBoxer1 = 78.2;
        var theSecondBoxer2 = 82.7;
        var weightDifference1 = theSecondBoxer2 - theFirstBoxer1;
        var weightDifference2 = theSecondBoxer2 % theFirstBoxer1;
        System.out.println("Разница веса боксеров " + weightDifference1 + " кг");
        System.out.println("Разница веса боксеров " + weightDifference2 + " кг");
    }
    public static void task8() {
        System.out.println("Задача 8.1");
        var totalHours = 640;
        var employeeChange = 8;
        var totalEmployees = totalHours / employeeChange;
        System.out.println("Всего работников в компании — " + totalEmployees + " человек");
        System.out.println("Задача 8.2");
        var addedPeople = 94;
        var employeeChange2 = 8;
        var totalHours2 = addedPeople * employeeChange2;
        var totalNumberOfHours = totalHours + totalHours2;
        var totalNumberOfPeople = addedPeople + totalEmployees;
        System.out.println("Если в компании работает " + totalNumberOfPeople + " человека, то всего " + totalNumberOfHours + " часов работы может быть поделено между сотрудниками." );



    }




}
