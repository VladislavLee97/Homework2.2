public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public void printDescription() {
        System.out.println("Слизерин");
        System.out.println("Хитрость: " + getCunning());
        System.out.println("Решительность: " + getDetermination());
        System.out.println("Амбициозность: " + getAmbition());
        System.out.println("Находчивость: " + getResourcefulness());
        System.out.println("Жажда власти: " + getThirstForPower());
        System.out.println("Сила магии: " + getMagicPower());
        System.out.println("Расстояниe трансгрессии: " + getTransgressionDistance());
    }

    public void studentComparison(Slytherin student1, Slytherin student2) {
        int total1 = student1.getCunning() + student1.getDetermination() + student1.getAmbition()
                + student1.getResourcefulness() + student1.getThirstForPower();
        int total2 = student2.getCunning() + student2.getDetermination() + student2.getAmbition()
                + student2.getResourcefulness() + student2.getThirstForPower();

        if (total1 > total2) {
            System.out.println("Первый ученик лучший Слизерин, чем второй");
        } else if (total1 < total2) {
            System.out.println("Второй ученик лучший Слизерин, чем первый");
        } else {
            System.out.println("Оба ученика одинаковы по показателям");
        }

    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

}
