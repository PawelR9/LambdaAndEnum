public enum Day {
    MONDAY("Monday", false),
    TUESDAY("Tuesday", false),
    WEDNESDAY("Wednesday", false),
    THURSDAY("Thursday", false),
    FRIDAY("Friday", false),
    SATURDAY("Saturday", true),
    SUNDAY("Sunday", true);

    private final String name;
    private final boolean isWeekend;

    Day(String name, boolean isWeekend) {
        this.name = name;
        this.isWeekend = isWeekend;
    }

    public String getName() {
        return name;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public static void printWeekdays() {
        for (Day day : values()) {
            if (!day.isWeekend) {
                System.out.println(day.getName() + " - workday");
            } else {
                System.out.println(day.getName() + " - weekend!");
            }
        }
    }
}