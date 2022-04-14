package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;


        zofka = new Turtle();




        zofka.setLocation(50,180);

        zofka.penDown();
        double x = 50;
        double y = 180;








        for (int i = 0; i < 4; i++) {
            {

                zofka.move(50);

                zofka.turnRight(45);
                zofka.move(50);
                zofka.turnRight(90);
                zofka.move(50);
                zofka.turnRight(45);
                zofka.move(50);
                zofka.turnRight(90);
                zofka.move(70);
                zofka.turnRight(90);
                zofka.move(50);
                zofka.turnRight(90);
                zofka.move(70);
                zofka.turnRight(90);
                zofka.move(50);
                zofka.turnRight(90);


                zofka.penUp();
                x = x + 160;
                y = 180;

                zofka.penDown();
                zofka.setLocation(x, y);
                zofka.turnRight(90);


            }
        }

        double f = 0;
        for (int c = 0; c < 3; c++) {
                {

                    zofka.move(50);

                    zofka.turnRight(45);
                    zofka.move(50);
                    zofka.turnRight(90);
                    zofka.move(50);
                    zofka.turnRight(45);
                    zofka.move(50);
                    zofka.turnRight(90);
                    zofka.move(70);
                    zofka.turnRight(90);
                    zofka.move(50);
                    zofka.turnRight(90);
                    zofka.move(70);
                    zofka.turnRight(90);
                    zofka.move(50);
                    zofka.turnRight(90);


                    zofka.penUp();

                    x = 50 + f;
                    y = 300;

                    zofka.penDown();
                    zofka.setLocation(x, y);
                    zofka.turnRight(90);
                     f = 640;


                }



        }
        zofka.setLocation(50,50);

        for (int i = 0; i < 100; i++)
        {
            zofka.turnRight(5);
            zofka.move(2);


            if (i == 10)
            {
                zofka.turnLeft(90);
                zofka.move(15);
                zofka.turnLeft(180);zofka.move(15);
                zofka.turnLeft(90);
                zofka.turnRight(5);
                zofka.move(2);
            }
            if (i == 20)
            {
                zofka.turnLeft(90);
                zofka.move(15);
                zofka.turnLeft(180);zofka.move(15);
                zofka.turnLeft(90);
                zofka.turnRight(5);
                zofka.move(2);
            }
            if (i == 30)
            {
                zofka.turnLeft(90);
                zofka.move(15);
                zofka.turnLeft(180);zofka.move(15);
                zofka.turnLeft(90);
                zofka.turnRight(5);
                zofka.move(2);
            }
            if (i == 40)
            {
                zofka.turnLeft(90);
                zofka.move(15);
                zofka.turnLeft(180);zofka.move(15);
                zofka.turnLeft(90);
                zofka.turnRight(5);
                zofka.move(2);
            }
            if (i == 50)
            {
                zofka.turnLeft(90);
                zofka.move(15);
                zofka.turnLeft(180);zofka.move(15);
                zofka.turnLeft(90);
                zofka.turnRight(5);
                zofka.move(2);
            }
            if (i == 60)
            {
                zofka.turnLeft(90);
                zofka.move(15);
                zofka.turnLeft(180);zofka.move(15);
                zofka.turnLeft(90);
                zofka.turnRight(5);
                zofka.move(2);
            }
            if (i == 67)
            {
                zofka.turnLeft(90);
                zofka.move(15);
                zofka.turnLeft(180);zofka.move(15);
                zofka.turnLeft(90);
                zofka.turnRight(5);
                zofka.move(2);
            }




        }
        zofka.penUp();
        zofka.setLocation(320,260);
        zofka.penDown();
        zofka.turnLeft(45);
        zofka.move(50);
        zofka.turnRight(90);
        zofka.move(50);
        // druhá noha
        zofka.turnRight(180);
        zofka.move(50);
        zofka.turnRight(90);
        zofka.move(50);
        zofka.turnRight(180);
        zofka.move(50);
        // začátek bříška
        zofka.turnRight(140);
        zofka.move(70);
        // začátek druhé nožky
        zofka.turnRight(60);
        zofka.move(50);
        zofka.turnRight(180);
        zofka.move(50);
        //konec nožky
        zofka.turnLeft(90);
        zofka.move(50);
        zofka.turnLeft(180);
        zofka.move(50);
        zofka.turnLeft(60);
        zofka.move(80); // konec zadku
        zofka.turnLeft(90);
        zofka.move(70); // krk
        zofka.turnLeft(90);
        zofka.move(70);
        zofka.turnLeft(180);
        zofka.move(70);
        zofka.turnLeft(140);
        zofka.move(60);







        zofka.penUp();
        x = x + 160;
        y = 180;

        zofka.penDown();
        zofka.setLocation(x, y);
        zofka.turnRight(90);





    }

}
