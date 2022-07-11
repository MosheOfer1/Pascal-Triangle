public class modulo {
    //an object with the modulo plus operation
    private int MODULO;
    private int number;

    public modulo(int modulo, int number) {
        this.MODULO = modulo;
        this.number = number;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number%this.MODULO;
    }

    public modulo plus(modulo m) {
        return new modulo(this.MODULO,(this.number+m.number)%this.MODULO);
    }
}
