package programy;

class Trojkat {
    private float bokA;
    private float bokB;
    private float bokC;
    private float wysokosc;
    public String nazwa;

    public Trojkat(float bokA, float bokB, float bokC, String nazwa) {
        this.setBokA(bokA);
        this.setBokB(bokB);
        this.setBokC(bokC);
        this.setNazwa(nazwa);
    }

    public Trojkat(float bokA, float bokB, float bokC) {
        this.setBokA(bokA);
        this.setBokB(bokB);
        this.setBokC(bokC);
    }

    public Trojkat(float bokA, float wysokosc) {
        this.setBokA(bokA);
        this.setWysokosc(wysokosc);
    }

    public String getNazwa() {
        return this.nazwa;
    }

    public void setNazwa(String nazwa) {
        if (nazwa.length() > 20) {
            this.nazwa = nazwa.substring(0, 20);
        } else {
            this.nazwa = nazwa;
        }
    }

    public void setBokA(float bokA) {
        if (bokA > 0) {
            this.bokA = bokA;
        } else if (bokA <= 0) {
            System.out.println("Trojakt nie moze miec boku  o wartosci 0 lub mniejszym");
        }
    }

    public void setBokB(float bokB) {
        if (bokB > 0) {
            this.bokB = bokB;
        } else if (bokB <= 0) {
            System.out.println("Trojakt nie moze miec boku  o wartosci 0 lub mniejszym");
        }
    }

    public void setBokC(float bokC) {
        if (bokC > 0) {
            this.bokC = bokC;
        } else if (bokC <= 0) {
            System.out.println("Trojakt nie moze miec boku  o wartosci 0 lub mniejszym");
        }
    }

    public void setWysokosc(float wysokosc) {
        if (wysokosc > 0) {
            this.wysokosc = wysokosc;
        } else if (wysokosc <= 0) {
            System.out.println("Trojakt nie moze miec podstawy  o wartosci 0 lub mniejszym");
        }
    }

    public float getBokA() {
        return this.bokA;
    }

    public float getBokB() {
        return this.bokB;
    }

    public float getBokC() {
        return this.bokC;
    }

    public float getWysokosc() {
        return this.wysokosc;
    }

    public float obliczPole() {
        if (this.bokA <= 0 || this.wysokosc <= 0) {
            throw new IllegalArgumentException("Nie można zbudować takiego trojkat.");
        }
        return (this.bokA * this.wysokosc) / 2;

    }

    public float obliczObwod() {
        return this.bokA + this.bokB + this.bokC;
    }

    public float obliczPoleZwzoru() {
        if (this.bokA <= 0 || this.bokB <= 0 || this.bokC <= 0) {
            throw new IllegalArgumentException("Nie można zbudować takiego trojkata.");
        }
        float polowa = this.obliczObwod() / 2;
        return (float) Math.sqrt(polowa * (polowa - this.bokA) * (polowa - this.bokB) * (polowa - this.bokC));
    }

    public void wypisz() {
        System.out.print(this.nazwa);

    }

    public void wypisz(String opis) {
        System.out.print(opis + " " + this.nazwa);
    }
}

public class Figura4 {

    public static void main(String[] args) {

        try {
            Trojkat trojkat1 = new Trojkat(3, 6);
            System.out.println("Pole trojkąta1 o długosci bokow " + trojkat1.getBokA() + " i " + trojkat1.getWysokosc() + " wynosi " + trojkat1.obliczPole());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Trojkat trojkat2 = new Trojkat(-2, 6);
            System.out.println("Pole trojkąta2 o długosci bokow " + trojkat2.getBokA() + " i " + trojkat2.getWysokosc() + " wynosi " + trojkat2.obliczPole());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Trojkat trojkat3 = new Trojkat(3, 0);
            System.out.println("Pole trojkąta2 o długosci bokow " + trojkat3.getBokA() + " i " + trojkat3.getWysokosc() + " wynosi " + trojkat3.obliczPole());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Sprawdzamy nową metodę");
        try {
            Trojkat trojkat4 = new Trojkat(3, 5, 7);
            trojkat4.setNazwa("TrojkatNr4");
            System.out.println("Trojkat o nazwie " + trojkat4.nazwa + " i bokach "+ trojkat4.getBokB() + " i " + trojkat4.getBokC() + " ma obwod wynoszący " + trojkat4.obliczObwod() + " i pole wynosące " + trojkat4.obliczPoleZwzoru());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Trojkat trojkat5 = new Trojkat(7, 0, 5, "TrojkatNr5 ");
            System.out.println("Trojkat o nazwie " + trojkat5.nazwa + " i bokach " + trojkat5.getBokA() + " i " + trojkat5.getBokB() + " i " + trojkat5.getBokC() + " ma obwod wynoszący " + trojkat5.obliczObwod() + " i pole wynosące " + trojkat5.obliczPoleZwzoru());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
