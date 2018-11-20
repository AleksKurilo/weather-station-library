package enums;

public enum UserRole {
    SUPER_ADMIN("super_admin"),
    ADMIN("admin"),
    USER("user");

    private String text;

    UserRole(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public static UserRole fromString(String text) {
        for (UserRole role : UserRole.values()) {
            if (role.text.equalsIgnoreCase(text)) {
                return role;
            }
        }
        return null;
    }
}
