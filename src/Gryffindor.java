public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public void printDescription() {
        System.out.println("Гриффиндорец");
        System.out.println("Благородство: " + getNobility());
        System.out.println("Честь: " + getHonor());
        System.out.println("Храбрость: " + getBravery());
        System.out.println("Сила магии: " + getMagicPower());
        System.out.println("Расстояние трансгрессии " + getTransgressionDistance());
    }

    public void studentComparison(Gryffindor student1, Gryffindor student2) {
        int total1 = student1.getNobility() + student1.getHonor() + student1.getBravery();
        int total2 = student2.getNobility() + student2.getHonor() + student2.getBravery();
        if (total1 > total2) {
            System.out.println("Первый ученик лучший Гриффиндорец, чем второй");
        } else if (total1 < total2) {
            System.out.println("Второй ученик лучший Гриффиндорец, чем второй");
        } else {
            System.out.println("Оба ученика одинаковы по показателям");
        }
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

}
