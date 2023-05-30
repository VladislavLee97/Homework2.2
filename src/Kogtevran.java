public class Kogtevran extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Kogtevran(int magicPower, int transgressionDistance, int intelligence, int wisdom, int wit, int creativity) {
        super(magicPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public void printDescription() {
        System.out.println("Когтевранец");
        System.out.println("Интелект: " + getIntelligence());
        System.out.println("Мудрость: " + getWisdom());
        System.out.println("Остроумие: " + getWit());
        System.out.println("Креативность: " + getCreativity());
        System.out.println("Сила магии: " + getMagicPower());
        System.out.println("Расстояние трансгрессии: " + getTransgressionDistance());
    }

    public void studentComparison(Kogtevran student1, Kogtevran student2) {
        int total1 = student1.getIntelligence() + student1.getWisdom()
                + student1.getWit() + student1.getCreativity();
        int total2 = student2.getIntelligence() + student2.getWisdom()
                + student2.getWit() + student2.getCreativity();

        if (total1 > total2) {
            System.out.println("Первый ученик лучший Когтевранец, чем второй");
        } else if (total1 < total2) {
            System.out.println("Второй ученик лучший Когтевранец, чем первый");
        } else {
            System.out.println("Оба ученика одинаковы по показателям");
        }
    }


    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

}
