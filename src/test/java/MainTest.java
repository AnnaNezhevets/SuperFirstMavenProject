public class MainTest {

    public static boolean testAbbr(){
        if (!"S...".equals(Main.abbr("Sergey", 4))) {
            return  false;
        }

        if (!"Hello...".equals(Main.abbr("Hello world", 8))) {
            return false;
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(testAbbr());

    }
}
