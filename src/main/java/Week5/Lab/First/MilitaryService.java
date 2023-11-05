package Week5.Lab.First;

public class MilitaryService implements NationalService{
    private int daysLeft;
    public MilitaryService(int daysLeft){
        this.daysLeft=daysLeft;
    }

    @Override
    public int getDaysLeft() {
        return daysLeft;
    }
    public void work(){
        if(this.daysLeft>0){
            this.daysLeft--;
        }
    }
}
