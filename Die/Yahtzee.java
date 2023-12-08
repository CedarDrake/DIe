
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
    public Yahtzee()
    {
        
    }

    public void roll() {
        for (int i = 0; i < dice5.length; i++) {
            dice5[i].roll();
        }
    }
    
    public String summerize() {
        int [] count = {0, 0, 0, 0, 0, 0};
        String value = "";
        for (int i = 0; i < dice5.length; i++) {
            count[dice5[i].getValue()-1]++;
        }
        for (int i = 1; i <= dice5.length; i++) {
            summerize += i + "
        }
        return summerize;
    }
    
    
}
