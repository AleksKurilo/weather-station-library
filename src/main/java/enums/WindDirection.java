package enums;

public enum WindDirection {
    NORTH("north"),
    WEST("west"),
    EAST("east"),
    SOUTH("south");

    private String text;

    WindDirection(String text) {
        this.text = text;
    }

    public String getText(){
        return this.text;
    }

    public static WindDirection fromString(String text){
        for(WindDirection wd : WindDirection.values()){
            if(wd.text.equalsIgnoreCase(text)){
                return wd;
            }
        }
        throw new IllegalArgumentException("No constant with text " + text + " found");
    }
}
