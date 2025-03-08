public class Main {
    public static void main(String[] args) {
        //задание 1
        var dog = 8.5;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
            //задание 2
        var dog1 = dog + 4;
        var cat1 = cat + 4;
        var paper1 = paper + 4;
        System.out.println(dog1);
        System.out.println(cat1);
        System.out.println(paper1);
            // задание 3
        var dog2 = dog1 - 3.5;
        var cat2 = cat1 - 1.6;
        var paper2 = paper1 - 7639;
        System.out.println(dog2);
        System.out.println(cat2);
        System.out.println(paper2);
            //задача 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
            //задание 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
            //задание 6
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalMass = boxer1 + boxer2;
        System.out.println(totalMass);
        var massDifference = boxer2 - boxer1;
        System.out.println(massDifference);
            //задание 7
        var remainderMasses = boxer2 % boxer1;
        System.out.println(remainderMasses);
            //задание 8
        var totalHours = 640;
        var timePerEmployee = 8;
        var totalEmployees = totalHours / timePerEmployee;
        System.out.println("Всего работников в компании — " + totalEmployees +" человек");
        var moreEmployees = totalEmployees + 94;
        var timeLargeEmployees = moreEmployees * timePerEmployee;
        System.out.println("Если в компании работает " + moreEmployees + " человек, то всего " + timeLargeEmployees + " часов работы может быть поделено между сотрудниками." );
    }
}