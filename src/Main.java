public class Main
{
    public static void main(String[] args)
    {
        Caterpillar harry = new Caterpillar("Harry");
        Cool jeff = new Cool("solo");

      /* A. uncomment code below first
            then study my code and see how colors work! */

//        harry.introduce();
        jeff.testing();
        jeff.emoji();

                try {jeff.move();

        } catch (Exception e) { }


      /* B. uncomment code below second
            then study the code to see how emojis work! */
//
//        harry.printFavoriteFoods();


       /*C. uncomment code below third
            then study my code and see how 'console animation' is made!
            for more info on try-catch syntax (not required for this course),
            check out https://docs.oracle.com/javase/tutorial/essential/exceptions/index.html */

//        try {
//          harry.animate();
//        } catch (Exception e) { }
    }
}