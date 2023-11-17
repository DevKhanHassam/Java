package Mypack;

public class Sim {

    private String name;
    private String number;
    private Boolean prepaid;

    public Sim(String name, String number, Boolean prepaid) {
        this.name = name;
        this.number = number;
        this.prepaid = prepaid;
    }

    public void show()
    {
        System.out.println("Sim name is "+name+" your number is:"+number+" is Prepaid="+prepaid);
    }
}
