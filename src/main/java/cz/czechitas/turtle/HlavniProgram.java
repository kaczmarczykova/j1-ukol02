package cz.czechitas.turtle;

import dev.czechitas.java1.turtle.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void namalujTrojuhelnik(double strana){
        for (int i = 0; i < 3; i++) {
            zofka.move(strana);
            zofka.turnLeft(120);
        }
    }

    public void namalujCtverec(double strana){
        for (int i = 0; i < 4; i++) {
            zofka.move(strana);
            zofka.turnLeft(90);
        }
    }

    public void namalujObdelnik(double stranaA, double stranaB) {
        for (int i = 0; i < 2; i++) {
            zofka.move(stranaA);
            zofka.turnLeft(90);
            zofka.move(stranaB);
            zofka.turnLeft(90);
        }
    }

    public void namalujKolecko(double delka, double uhel) {
        for (int i = 0; i < (360/uhel); i++) {
            zofka.move(delka);
            zofka.turnLeft(uhel);
        }
    }
    public void namalujZmrzlinu(double delka, double uhel, double strana){
        zofka.turnLeft(90);
        namalujTrojuhelnik(strana);
        zofka.turnRight(130);
        namalujKolecko(delka,uhel);
        zofka.turnLeft(40);
    }

    public void namalujSnehulaka(double delkaVelke, double delkaStredni, double delkaMale, double delkaRuce, double uhel, double prumerStredni, double prumerMale){
        zofka.turnLeft(90);
        namalujKolecko(delkaVelke, uhel);
        zofka.penUp();
        zofka.turnRight(85);
        zofka.move(prumerStredni);
        zofka.penDown();
        zofka.turnLeft(90);
        namalujKolecko(delkaStredni, uhel);
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(prumerMale);
        zofka.penDown();
        zofka.turnLeft(90);
        namalujKolecko(delkaMale, uhel);
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(prumerMale + (prumerStredni/2));
        zofka.turnLeft(90);
        zofka.move(prumerStredni/2);
        zofka.penDown();
        zofka.turnRight(90);
        namalujKolecko(delkaRuce, uhel);
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(prumerStredni);
        zofka.turnRight(90);
        zofka.penDown();
        namalujKolecko(delkaRuce, uhel);
        }

    public void namalujMasinku(double stranaA, double stranaB, double vetsiKolo, double uhel, double mensiKolo, double delka){
        zofka.turnRight(90);
        namalujObdelnik(stranaA, stranaB);
        zofka.move(stranaA);
        namalujObdelnik(stranaB, stranaA);
        zofka.move(stranaB);
        zofka.turnLeft(90);
        namalujKolecko(vetsiKolo,uhel);
        zofka.turnLeft(90);
        zofka.move(stranaB + delka);
        namalujKolecko(mensiKolo, uhel);
        zofka.move(stranaB);
        namalujKolecko(mensiKolo, uhel);
        zofka.move(stranaA-stranaB-delka);
        zofka.turnLeft(90);
        zofka.move(stranaB/4);
        zofka.turnRight(90);
        zofka.move(stranaB);
        zofka.turnRight(135);
        zofka.move(Math.sqrt(2 * Math.pow(stranaB, 2)));
        zofka.turnLeft(45);
    }

    public void start() {

        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(200);
        zofka.turnRight(90);
        zofka.penDown();

        namalujZmrzlinu(25, 20,100);

        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(200);

        zofka.turnRight(90);
        zofka.move(70);
        zofka.turnLeft(180);
        zofka.penDown();

        namalujSnehulaka(25, 20, 15, 5, 20, 115, 83);

        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(300);
        zofka.turnRight(90);
        zofka.move(120);
        zofka.turnRight(185);
        zofka.penDown();

        namalujMasinku(230, 115, 20, 20, 10,  40);
    }

}
