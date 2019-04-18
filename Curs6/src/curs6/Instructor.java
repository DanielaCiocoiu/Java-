package curs6;

public class Instructor  extends Persoana{

    public Instructor(String nume) {
        super(nume);
    }


    public void preda() {
        System.out.println("Instructorul " + nume + " sustine o lectie" );
    }
}
