package utility;

public class CapitalString {
    public String startCase(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
