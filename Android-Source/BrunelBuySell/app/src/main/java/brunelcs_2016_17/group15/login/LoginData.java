/* README - LoginData.java is a storage class which holds information about the login form of the user.
 * For modularity purposes, this class should never be used to implement any other function. */

package brunelcs_2016_17.group15.login; // Package this class belongs to.

public final class LoginData {

    private String username;
    private String password;

    /* Class constructor.
     * Takes two string values, username and password. */
    public LoginData(final String username, final String password) {
        this.username = username;
        this.password = password;
    }

    /* This method returns the value of the username attribute. */
    public final String getName() {
        return username;
    }

    /* This method returns the value of the password attribute. */
    public final String getPassword() {
        return password;
    }

    // End of class.
}
