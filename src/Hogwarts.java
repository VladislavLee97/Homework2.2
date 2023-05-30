public class Hogwarts {
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(int magicPower, int transgressionDistance) {
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public static void studentComparison(Hogwarts student1, Hogwarts student2) {
        int total1 = student1.getMagicPower() + student1.getTransgressionDistance();
        int total2 = student2.getMagicPower() + student2.getTransgressionDistance();

        if (total1 > total2) {
            System.out.println("Первый ученик сильнее и может пройти большее расстояние трансгрессии");
        } else if (total1 < total2) {
            System.out.println("Второй ученик сильнее и может пройти большее расстояние трансгрессии");
        } else {
            System.out.println("Одинаковы по силе и расстоянии трансгрессии");
        }
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }
}
