package com.genesis.furharmony;

/*import android.app.AlertDialog;*/
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
/*import android.view.Gravity;*/
import android.view.Menu;
import android.view.MenuItem;
/*import android.widget.EditText;*/
/*import android.widget.TextView;*/


public class SignupPage extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_page);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_signup_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    /*public void checkPasswords (){
    EditText password1 = (EditText)findViewById(R.id.passwordText1);
    EditText password2 = (EditText)findViewById(R.id.passwordText2);

    if (password1.equals(password2)){
            AlertDialog.Builder popupBuilder = new AlertDialog.Builder(this);
            TextView alertMsg = new TextView(this);
            alertMsg.setText("Your passwords match");
            alertMsg.setGravity(Gravity.CENTER_HORIZONTAL);
            popupBuilder.setView(alertMsg);
        }
    }*/
}
