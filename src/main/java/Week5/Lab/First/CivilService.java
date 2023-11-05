package Week5.Lab.First;

public class CivilService implements NationalService{

    private int daysLeft;

    public CivilService(){
        this.daysLeft=362;
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

