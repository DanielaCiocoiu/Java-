public class Main {

    public static final String INVALID_VALUE_MESSAGE = "Invalid value";


    public static void main(String[] args) {
//        long miles = SpeedConverter.toMillesPerHour(10.5);
//        System.out.println("Miles = " + miles);
//        SpeedConverter.printConversion(10);
//----------------------------------
// MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
//----------------------------------
//        System.out.println(BarkingDog.shouldWakeUp(true, 1));
//        System.out.println(BarkingDog.shouldWakeUp(false, 2));
//        System.out.println(BarkingDog.shouldWakeUp(true, 8));
//        System.out.println(BarkingDog.shouldWakeUp(true, -1));
//----------------------------------
//        System.out.println(LeapYear.isLeapYear(2017) + " The year is a leap year");
//        System.out.println(LeapYear.isLeapYear(2000) + " The year is not a leap year");
//-----------------------------------
//        System.out.println(Sum.hasEqualSum(1,1,1));
//        System.out.println(Sum.hasEqualSum(1,1,2));
//        System.out.println(Sum.hasEqualSum(1,-1,0));
//// -----------------------------------
//        System.out.println(Duration.getDurationString(65, 45));
//        System.out.println(Duration.getDurationString(3945L));
//        System.out.println(Duration.getDurationString(-45));
//        System.out.println(Duration.getDurationString(65,9));
// -----------------------------------
//        System.out.println(Area.areaCircle(5.0));
//        System.out.println(Area.areaCircle(-1));
//        System.out.println(Area.areaRect(5.0, 4.0));
//        System.out.println(Area.areaRect(-1.0, 4.0));
// -----------------------------------

        Duration.printYearsAndDays(525600);


        Duration.Sum();


        Duration.sumOdd(1, 100);

//            * sumOdd(-1, 100); →  should return -1
//
//            * sumOdd(100, 100); → should return 0
//
//            * sumOdd(13, 13); → should return 13 (This set contains one number, 13, and it is odd)
//
//            * sumOdd(100, -100); → should return -1
//
//            * sumOdd(100, 1000); → should return 247500

        Cat d = new Tomi();
        d.miau();
        Tomi e = new Tomi();
        e.miau();
//Tomi e1 = new Cat();
//e1.miau();

        System.out.println(d.add("5"));
        System.out.println(  d.add(5));
        System.out.println(d.addFloat(11f, 55f));
        System.out.println( d.add(1, 3));



    }
}

