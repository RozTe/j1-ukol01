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

        zofka.move(300);
        zofka.turnLeft(90);
        zofka.move(300);
        zofka.turnRight(90);

        nakresliMnohouhlenik(50, 45);

        zofka.turnRight(90);
        zofka.move(120);
        zofka.turnLeft(90);
        zofka.move(25);

        nakresliMnohouhlenik(22.5, 20);
        //to je jakoby kolecko

        zofka.turnRight(90);
        zofka.move(220);
        zofka.turnLeft(90);

        nakresliSlunicko(30);

    }

    public void nakresliSlunicko(double delkaStrany) {
        //dvanactiuhelnik - uhel mezi stranami 30
        for (int i = 0; i <= 12 - 1; i++) {

            zofka.penDown();
            zofka.move(delkaStrany / 2);
            zofka.turnLeft(75);
            zofka.move(delkaStrany);
            zofka.turnLeft(75);
            zofka.penUp();
            zofka.move(delkaStrany / 2);
            zofka.turnRight(180);

        }
        zofka.penUp();
    }


    public void nakresliMnohouhlenik(double delkaStrany, double uhel) {
        zofka.turnLeft(uhel);
        for (int i = 0; i <= 360 / uhel - 1; i++) {

            zofka.penDown();
            zofka.move(delkaStrany);
            zofka.turnRight(uhel);
        }
        zofka.penUp();
        zofka.turnRight(uhel);
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
