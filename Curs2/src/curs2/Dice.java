package curs2;

public class Dice {

    public static void main(String[] args) {
        
        int zar2 = (int) (Math.random() * 6) + 1;
        int zar1 = (int) (Math.random() * 6) + 1;
        Zar1.afisareZar(zar2);

        if (zar1 == zar2) {
            System.out.println("doubla");
        } else if (zar1 - zar2 == 2 || zar1 - zar2 == -2) {
            System.out.println("Poarta in casa");

        }

        int[][] ar = new int[2][];
        ar[0] = new int[20];
        ar[1] = new int[20];

        for (int i = 0; i < ar.length; i++) {
            ar[0] = ar[i];

        }

    }
}
//public class A{
//	public void f(){}
//}
//class B{
//	void g(){
//		int x=3;
//		A a1 = new A(){
//			public void f(){
//				System.out.println(x);
//			}
//		};
//	}
//}
//


class A{
	private int x;
	class B{
		public void f(){
			x++;
                        System.out.println(x);
		}
	}
}