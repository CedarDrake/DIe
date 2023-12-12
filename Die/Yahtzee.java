
public class Yahtzee
{
    private Die6[] dice5 = {
        new Die6(),
        new Die6(),
        new Die6(),
        new Die6(),
        new Die6(),
    };
    private String summerize;
    private String toString;
    
    public void roll() {
        for (int i = 0; i < dice5.length; i++) {
            dice5[i].roll();
        }
    }
    
    public void roll(int dieNumber) {
        if (dieNumber > 0 && dieNumber <= dice5.length) {
            dice5[dieNumber-1].roll();
        }
    }
    
    public String summerize() {
        int [] count = {0, 0, 0, 0, 0, 0};
        String value = "";
        for (int i = 0; i < dice5.length; i++) {
            count[dice5[i].getValue()-1] += 1;
        }
        for (int i = 0; i <= dice5.length; i++) {
            value += (i + 1) + "-" + count[i];
            if (i <= count.length) {
                value += "; ";
            }
        }
        return value;
    }
    
    public String toString() {
        String value = "Dice values:";
        for (int i = 0; i < dice5.length; i++) {
            value += " " + dice5[i].getValue();
        }
        return value;
    }
}
