package NewIDEAS;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserProfile {
    // 1. DATA HIDING: The variable is private.
    // No other class can access 'email' directly.
    private String email;

    // Compiled Regex for efficiency
    private static final String EMAIL_REGEX =
            "^[a-zA-Z0-9._%+-]+@gmail\\.com$";
    private static final Pattern PATTERN = Pattern.compile(EMAIL_REGEX);

    // Constructor
    public UserProfile(String email) {
        // We call the setter here to ensure validation happens even on object creation
        setEmail(email);
    }

    // 2. CONTROLLED ACCESS (Getter):
    // Allows others to READ the email, but not modify it directly.
    public String getEmail() {
        return email;
    }

    // 3. THE GATEKEEPER (Setter):
    // This method controls HOW the data is set.
    // It validates the input before assigning it to the private field.
    public void setEmail(String email) {
        if (isValid(email)) {
            this.email = email;
            System.out.println("Success: Email updated to " + email);
        } else {
            // Depending on your design, you might throw an exception or print an error
            throw new IllegalArgumentException("Invalid email format: " + email);
        }
    }

    // Internal helper method for validation
    private boolean isValid(String email) {
        if (email == null) return false;
        Matcher matcher = PATTERN.matcher(email);
        return matcher.matches();
    }

    // --- Main Method to Run the Test ---
    public static void main(String[] args) {
        try {
            // Scenario 1: Creating a user with a VALID email
            System.out.println("--- Test 1: Valid Email ---");
            UserProfile user = new UserProfile("john.doe+24@gmail.com");
            System.out.println(user.getEmail());

            // Scenario 2: Trying to set an INVALID email
            // This will trigger the validation logic inside the setter
            System.out.println("\n--- Test 2: Invalid Email ---");
            user.setEmail("john.doe@da.com"); // Missing '@' symbol

        } catch (IllegalArgumentException e) {
            System.out.println("Error caught: " + e.getMessage());
        }



    }
}