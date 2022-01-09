package programy;

class Trojkat {
    private float bokA;
    private float bokB;
    private float bokC;
    private float wysokosc;

    public Trojkat(float bokA, float bokB, float bokC, float wysokosc) {
        this.bokA = bokA;
        this.bokB = bokB;
        this.bokC = bokC;
        this.wysokosc = wysokosc;
    }

    public Trojkat(float bokA, float wysokosc) {
        this.setBokA(bokA);
        this.setWysokosc(wysokosc);
    }

    public void setBokA(float bokA) {
        if (bokA >0) {
            this.bokA = bokA;
        } else if (bokA <= 0){
            System.out.println("Trojakt nie moze miec boku  o wartosci 0 lub mniejszym");
        }else {
            this.bokA = -bokA;
        }
    }

    public void setWysokosc(float wysokosc) {
        if (wysokosc >0) {
            this.wysokosc = wysokosc;
        }else if (wysokosc <= 0){
            System.out.println("Trojakt nie moze miec podstawy  o wartosci 0 lub mniejszym");
        }
    }

    public float getBokA() {
        return this.bokA;
    }

    public float getBokB() {
        return bokB;
    }

    public float getBokC() {
        return bokC;
    }

    public float getWysokosc() {
        return this.wysokosc;
    }

    public float obliczObwod() {
        if (this.bokA <= 0 || this.wysokosc <= 0){
         throw new   IllegalArgumentException("Nie można zbudować takiego trojkat.");
        }return (this.bokA*this.wysokosc)/2;

    }
}

public class Figura4 {

    public static void main(String[] args) {

        try {
            Trojkat trojkat1 = new Trojkat(3, 6);
            System.out.println("Pole trojkąta1 o długosci bokow " + trojkat1.getBokA() + " i " + trojkat1.getWysokosc() + " wynosi " + trojkat1.obliczObwod());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Trojkat trojkat2 = new Trojkat(-2, 6);
            System.out.println("Pole trojkąta2 o długosci bokow " + trojkat2.getBokA() + " i " + trojkat2.getWysokosc() + " wynosi " + trojkat2.obliczObwod());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Trojkat trojkat3 = new Trojkat(3, 0);
            System.out.println("Pole trojkąta2 o długosci bokow " + trojkat3.getBokA() + " i " + trojkat3.getWysokosc() + " wynosi " + trojkat3.obliczObwod());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
