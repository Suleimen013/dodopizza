package menu.saryal.example.com.menu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;


public class PaymentScreen extends ActionBarActivity {

    TextView sub_total_view;
    TextView tax_view;
    TextView total_view;
    double subTotal;
    double tax;
    double total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_screen);
        Intent intent = getIntent();
        String subTotal_string = intent.getStringArrayExtra(MenuPage.EXTRA_MESSAGE)[0];
        subTotal = Double.parseDouble(subTotal_string);
        String tax_string = intent.getStringArrayExtra(MenuPage.EXTRA_MESSAGE)[1];
        tax = Double.parseDouble(tax_string);
        String total_string = intent.getStringArrayExtra(MenuPage.EXTRA_MESSAGE)[2];
        total = Double.parseDouble(total_string);
        displayBill();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_payment_screen, menu);
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

    public void displayBill() {
        sub_total_view = (TextView) findViewById(R.id.sub_total_text_view);
        sub_total_view.setText("Sub Total: " + new DecimalFormat("#.##").format(subTotal)+ "тг");

        tax_view = (TextView) findViewById(R.id.tax_text_view);
        tax_view.setText("Tax: " + new DecimalFormat("#.##").format(tax)+"тг");

        total_view = (TextView) findViewById(R.id.total_text_view);
        total_view.setText("Total: " + new DecimalFormat("#.##").format(total)+"тг");
    }

    public void makePayment(View view) {
        EditText customer_name_view = (EditText) findViewById(R.id.customer_name);
        String customer_name = customer_name_view.getText().toString().trim();
        EditText customer_address_view = (EditText) findViewById(R.id.customer_address);
        String customer_address = customer_address_view.getText().toString().trim();
        EditText phone_view = (EditText) findViewById(R.id.editText);
        String phone = phone_view.getText().toString().trim();
        if (!customer_name.isEmpty() && !customer_address.isEmpty() && phone.length()==10) {
            Intent email = new Intent(Intent.ACTION_SEND);
            email.putExtra(Intent.EXTRA_EMAIL, new String[]{"feedback@dodopizza.com"});
            email.putExtra(Intent.EXTRA_SUBJECT, "Новый заказ!");
            email.putExtra(Intent.EXTRA_TEXT, "Customer name: " + customer_name + "\nCustomer address: " + customer_address + "\nPhone number: 8" + phone);
            email.setType("message/rfc822");
            startActivity(Intent.createChooser(email, "Choose an Email client :"));

        }
        else{
            Toast.makeText(getApplicationContext(), "Fill the blank !", Toast.LENGTH_SHORT).show();
        }
    }
}
