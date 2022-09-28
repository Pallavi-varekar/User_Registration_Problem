public class UserRegistrationRegex {
    public static void main(String[] args) {
        System.out.println(firstName("Saptarshi"));
        System.out.println(lastName("Biswas"));
        System.out.println(email("saptarshibiswas123@gmail.com"));
        System.out.println(mobile("91 9382994532"));
        System.out.println(password("#Mypassword1234"));
    }
    /*
     validate first name with 1st letter capital and at least 3 words
     */
    public static boolean firstName(String firstName) {
        return firstName.matches("[A-Z][a-z]{3,}");
    }
    /*
 validate last name with 1st letter capital and at least 3 words
 */
    public static boolean lastName(String lastName) {
        return lastName.matches("[A-Z][a-z]{3,}");
    }
    /*
      validate the email address
      */
    public static boolean email(String email) {
        return email.matches("[a-zA-Z0-9]+[@][a-zA-Z]{3,15}[.][a-zA-Z]{2,5}");
    }
    /*
    validate the mobile number
    */
    public static boolean mobile(String mobile) {
        return mobile.matches("91{1}" + "\\s" + "[0-9]{10}");
    }
    /*
       validate the password of minimum one special character
       */
    public static boolean password(String password) {
        return password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$");

    }
}
