
public class Yahtzee
{
    Die6 die1;
    Die6 die2;
    Die6 die3;
    Die6 die4;
    Die6 die5;
    int die1value = 0;
    int count1 = 0;
    int count2 = 0;
    int count3 = 0;
    int count4 = 0;
    int count5 = 0;
    private String summerize;
    private String toString;
    public Yahtzee()
    {
        die1 = new Die6();
        die2 = new Die6();
        die3 = new Die6();
        die4 = new Die6();
        die5 = new Die6();
    }

    public void roll() {
        die1.roll();
        die2.roll();
        die3.roll();
        die4.roll();
        die5.roll();
    }
    
    public String summerize() {
        die1value = die1.getValue();
        for (int i = 0; i <= 6; i++) {
            
        }
        summerize = "Fuck this shit";
        return summerize;
    }
    
    
}
