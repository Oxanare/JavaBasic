class JavaBasic3Lesson {
    public static void main(String[] args) {
        int w = 50;
        while (w > 0) {
            int s = (int) (Math.random() * 20);
            w = w - s;
            System.out.printf("%d - %d\n", s, w);
        }
    }
}