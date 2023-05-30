public class Puffenduy extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Puffenduy(int magicPower, int transgressionDistance, int diligence, int loyalty, int honesty) {
        super(magicPower, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public void printDescription() {
        System.out.println("Пуффендуец");
        System.out.println("Трудолюбивый: " + getDiligence());
        System.out.println("Верный: " + getLoyalty());
        System.out.println("Честность: " + getHonesty());
        System.out.println("Сила магии: " + getMagicPower());
        System.out.println("Расстояниe трансгрессии: " + getTransgressionDistance());
    }

    public void studentComparison(Puffenduy student1, Puffenduy student2) {
        int total1 = student1.getDiligence() + student1.getLoyalty() + student1.getHonesty();
        int total2 = student2.getDiligence() + student2.getLoyalty() + student2.getHonesty();

        if (total1 > total2) {
            System.out.println("Первый ученик лучший Пуффендуец, чем второй");
        } else if (total1 < total2) {
            System.out.println("Второй ученик лучший Пуффендуец, чем первый");
        } else {
            System.out.println("Оба ученика одинаковы по показателям");
        }

    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }
}
