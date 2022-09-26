/**
 * Java Basic. Homework Nr.2
 *
 * @author Oxana 
 * @todo 07.09.2022
 * @date 26.09.2022
 */
class JavaBasic_Homework2 {
    public static void main(String[] args) {
        // task 1
        System.out.println(checkWeather(-1));
        System.out.println(checkWeather(1));
        System.out.println(checkWeather(20));
        System.out.println(checkWeather(30));

        // task 2
        System.out.println(canWalk(true, true)? "I can walk" : "I cannot walk");
        System.out.println(canWalk(true, false)? "I can walk" : "I cannot walk");
        System.out.println(canWalk(false, true)? "I can walk" : "I cannot walk");
        System.out.println(canWalk(false, false)? "I can walk" : "I cannot walk");

        // task 3
        int a = 4;
        int b = 3;
        System.out.printf("%d + %d = %d\n", a, b, add(a, b));
        System.out.printf("%d - %d = %d\n", a, b, sub(a, b));
        System.out.printf("%d * %d = %d\n", a, b, mul(a, b));
        System.out.printf("%d / %d = %f\n", a, b, div(a, b));
        }
    

    static String checkWeather(int temperature) {
        if (temperature < 0) {
            return "It`s frost";
        } else if (temperature <= 18) {
            return "It`s cold";
        } else if (temperature <= 28) {
            return "It`s warm";
        }else{
            return "It`s hot";
        }
    }

    static boolean canWalk(boolean isWeekend, boolean isRain) {
        return isWeekend && !isRain;
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    static float div(float a, float b) {
         return a / b;
    }
}