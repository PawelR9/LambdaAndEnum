public enum Color {
    RED("Red", "#FF0000"),
    GREEN("Green", "#00FF00"),
    BLUE("Blue", "#0000FF");

    private final String name;
    private final String hexCode;

    Color(String name, String hexCode) {
        this.name = name;
        this.hexCode = hexCode;
    }

    public String getName() {
        return name;
    }

    public String getHexCode() {
        return hexCode;
    }

    public static Color getByName(String name) {
        for (Color color : values()) {
            if (color.getName().equalsIgnoreCase(name)) {
                return color;
            }
        }
        throw new IllegalArgumentException("No color with name " + name);
    }
}