/* README - LoginActivity.java should only be used to implement functionality in the activities it belongs to.
 * This includes but not limited to:
 * - Adding button listeners.
 * - Instantiating layout objects such as TextView, ListView bla bla..
 * - Instantiating/Using classes from other packages to achieve layout functionality. To do this, please import the class in the import section.
 * For modularity purposes, this class should never be used to implement any other function than building the activity's objects and its functionality.
 */

package brunelcs_2016_17.group15.activities; // Package which this class belongs to.

/* Imports go here. */
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public final class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    // End of class.s
}
