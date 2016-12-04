/* README - LoginActivity.java should only be used to implement functionality in the activities it belongs to.
 * This includes but not limited to:
 * - Adding button listeners.
 * - Instantiating layout objects such as TextView, ListView bla bla..
 * - Instantiating/Using classes from other packages to achieve layout functionality. To do this, please import the class in the import section.
 * For modularity purposes, this class should never be used to implement any other function than building the activity's objects and its functionality.
 */

package brunelcs_2016_17.group15.activities; // Package which this class belongs to.

/* Imports go here. */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public final class LoginActivity extends AppCompatActivity {

    /* Attributes */
    private TextView usernameForm; // Represents the username TextView on activity_login.xml
    private TextView passwordForm; // Represents the password TextView on activity_login.xml
    private TextView loginHelp; // Represents the clickable login help TextView on activity_login.xml
    private Button loginButton; // Represents the login button on activity_login.xml

    /* Method initializes TextView components during onCreate().
     * Use this method to initialize TextView components etc.. */
    private void setUpTextView() {
        usernameForm = (TextView) findViewById(R.id.username_form);
        passwordForm = (TextView) findViewById(R.id.password_form);
        loginHelp = (TextView) findViewById(R.id.login_help);

        /* Intent which starts up the login help activity. */
        final Intent loginHelpIntent = new Intent(this, LoginHelpActivity.class);

        /* Set up the click response. */
        loginHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(loginHelpIntent);
            }
        });

        /* Make sure the forms do not hae more than one line. We want people writing usernames, not essays. */
        loginHelp.setSingleLine();
        usernameForm.setSingleLine();
        passwordForm.setSingleLine();
    }

    /* Method initializes Button components during onCreate().
     * Use this method to initialize Button components etc.. */
    private void setUpButtons() {
        loginButton = (Button) findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makeToast("Logged in!");
            }
        });
    }

    /* This method is used to debug buttons. */
    private void makeToast(final String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        /* Set up activity components. */
        setUpTextView();
        setUpButtons();
    }

    // End of class.
}
