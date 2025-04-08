package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {
        zofka = new Turtle();

        nakresliPrasatko();

    }

    public void nakresliPrasatko() {
        nakresliObdelnik(200, 150);
        nakresliVecko(150);
        nakresliNozicky();
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(200);
        zofka.turnLeft(90);
        zofka.penDown();
        nakresliNozicky();
    }

    public void nakresliObdelnik(int vzdalenost1, int vzdalenost2) {
        for (int i = 0; i < 2; i++) {
            zofka.penDown();
            zofka.turnRight(90);
            zofka.move(vzdalenost1);
            zofka.turnRight(90);
            zofka.move(vzdalenost2);
            zofka.penUp();
        }
    }

    public void nakresliNozicky() {

        zofka.penDown();
        zofka.turnRight(157.5);
        zofka.move(50);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(50);
        zofka.penDown();
        zofka.turnLeft(127.5);
        zofka.move(50);
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(50);
        zofka.turnLeft(30);
        zofka.penUp();
    }

    public void nakresliVecko(int vzdalenost) {
        zofka.penDown();
        zofka.turnLeft(120);
        zofka.move(vzdalenost);
        zofka.turnLeft(120);
        zofka.move(vzdalenost);
        zofka.turnLeft(120);
        zofka.penUp();
        // pri pouziti na nozicky to moc nefunguje - spatne se hleda startovaci bod
    }

}
