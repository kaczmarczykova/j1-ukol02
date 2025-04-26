package cz.czechitas.turtle;

import dev.czechitas.java1.turtle.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void trojuhelnik(double strana){
        for (int i = 0; i < 3; i++) {
            zofka.move(strana);
            zofka.turnLeft(120);
        }
    }

    public void ctverec(double strana){
        for (int i = 0; i < 4; i++) {
            zofka.move(strana);
            zofka.turnLeft(90);
        }
    }

    public void obdelnik(double stranaA, double stranaB) {
        for (int i = 0; i < 2; i++) {
            zofka.move(stranaA);
            zofka.turnLeft(90);
            zofka.move(stranaB);
            zofka.turnLeft(90);
        }
    }

    public void kolecko(double delka, double uhel) {
        for (int i = 0; i < (360/uhel); i++) {
            zofka.move(delka);
            zofka.turnLeft(uhel);
        }
    }


    public void start() {
        //TODO Tady bude kód pro kreslení želví grafiky.


    }

}
