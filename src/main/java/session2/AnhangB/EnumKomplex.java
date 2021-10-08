package session2.AnhangB;

public class EnumKomplex {

    enum Namen {
        JERRY("Lead-Gitarre") {
            public String singt() {
                return "klagend";
            }
        },
        BOBBY("Rhythmus-Gitarre") {
            public String singt() {
                return "heiser";
            }
        },
        PHIL("Base");
        private String instrument;

        Namen(String instrument) {
            this.instrument = instrument;
        }
        public String getInstrument(){
            return this.instrument;
        }
        public String singt(){
            return "gelegentlich";
        }
    }




    public static void main(String[] args) {
        for (Namen n : Namen.values()) {
            System.out.println(n);
            System.out.println(", Instrument: " + n.getInstrument());
            System.out.println(", singt: " + n.singt());
        }

        System.out.println("===================================================================");
        Level myVariable = Level.MEDIUM;
        System.out.println("myLevel is: " + myVariable);

        System.out.println("=========================================>> Enum in a Switch Statement: =========");
        switch (myVariable) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }

        System.out.println("=====>> Loop Through an Enum: ");
        for (Level myVar : Level.values()) {
            System.out.println(myVar);
        }

        System.out.println("===================================================================");

        EnumDayClass firstDay = new EnumDayClass(Day.MONDAY);
        firstDay.tellItLikeItIs();
        EnumDayClass thirdDay = new EnumDayClass(Day.WEDNESDAY);
        thirdDay.tellItLikeItIs();
        EnumDayClass fifthDay = new EnumDayClass(Day.FRIDAY);
        fifthDay.tellItLikeItIs();
        EnumDayClass sixthDay = new EnumDayClass(Day.SATURDAY);
        sixthDay.tellItLikeItIs();
        EnumDayClass seventhDay = new EnumDayClass(Day.SUNDAY);
        seventhDay.tellItLikeItIs();

        System.out.println("===================================================================");



    }


    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }


    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
        THURSDAY, FRIDAY, SATURDAY
    }







}
