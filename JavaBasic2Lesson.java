class JavaBasic2Lesson {
    public static void main (String[] args) {
        int t = -1;
        /*if (t < 0) {
            System.out.println("It`s frost");
        } else {
            System.out.println("It`s No frost");
        }
        boolean booleanExpression = t < 0;
        if (booleanExpression) {
            System.out.println("It`s frost");
        } else {
            System.out.println("It`s  No frost");
        }*/
        System.out.println(t < 0? "It`s frost" : "It`s No frost"); 
        int m = 1;
        if (m == 12 || m == 1 || m == 2) {
            System.out.println("It`s winter");
        } else if (m == 3 || m == 4 || m == 5){
            System.out.println("It`s spring");
        } else if (m == 6 || m == 7 || m == 8){
            System.out.println("It`s summer");
        } else if (m == 9 || m == 10 || m == 11){
            System.out.println("It`s fall");
        } else {
            System.out.println("Error Month Number!");
        }
        boolean isWeekend = !false;
        boolean isIAmFree = true;
        if (isWeekend && isIAmFree) {
            System.out.println("I can walk");
        } else {
            System.out.println("I cannot walk");
        }
    }
}
class JavaBasic2Lesson {
    public static void main (String[] args) {
        printHello();
    }

    static void printHello() {
        System.out.println("Hello");
    }
}