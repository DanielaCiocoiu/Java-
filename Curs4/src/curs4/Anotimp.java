package curs4;

public enum Anotimp {
    PRIMAVARA, VARA, TOAMNA, IARNA, NEDEFINIT;

      public static void activitate(Anotimp a) {
        if (a == Anotimp.NEDEFINIT) {
            return;
        }
        switch (a) {
            case VARA:
                System.out.println("Mergem la mare");
                break;
            case IARNA:
                System.out.println("Mergem la ski");
                break;
            default:
                System.out.println("Neinteresant, prea multe ploi");
                break;
        }
System.out.println("*********** finish Anotimp");
    }
 
};
