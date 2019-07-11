public class Cat {
    public void miau() {
        System.out.println("Miauuuuu");
    }

    public int add(int a, int b) {
        return a + b + 12;

    }

//    public int add(int b, int a) {
//        return b - a + 1;

//    }

    public int add(int a) {
        return a++;

    }

    public int add(String a) {
        return Integer.valueOf(a) + 2;

    }

    public float addFloat(float a, float b) {
        return a + b + 5;
    }

    public float add() {
        return -1;
    }

}