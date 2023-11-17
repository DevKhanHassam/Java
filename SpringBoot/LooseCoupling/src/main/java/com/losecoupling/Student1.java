package losecoupling;

public class Student1 {
//    student1 want math cheating method
        private Cheat cheat;

    public void setCheat(Cheat cheat) {
        this.cheat = cheat;
    }


    public void Cheating()
    {
        cheat.cheat();
    }
}
