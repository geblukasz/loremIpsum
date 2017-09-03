package pl.akademiakodu.loremipsum.Model;

public class Form {

    private int number;
    private int option;

    public Form(){}

    public Form(int number, int option) {
        this.number = number;
        this.option = option;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }
}
