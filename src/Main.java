public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor(2, 3, 3, 3, 100);
        Gryffindor ronWisly = new Gryffindor(0, 2, 1, 1, 75);
        Kogtevran marcusBelby = new Kogtevran(3, 33, 44, 11, 11, 22);
        Puffenduy zahariaSmith = new Puffenduy(10, 22, 1, 1, 2);
        Slytherin gregoryGhoil = new Slytherin(43, 0, 2, 1, 30, 30,
                30);
        harryPotter.printDescription();
        System.out.println();
        ronWisly.printDescription();
        System.out.println();
        harryPotter.studentComparison(harryPotter, ronWisly); //Сравнение учеников внутри факультета
        System.out.println();
        Hogwarts.studentComparison(marcusBelby, zahariaSmith); //Сравнение учеников из разных факультетов
        System.out.println();
    }
}