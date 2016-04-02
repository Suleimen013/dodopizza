package menu.saryal.example.com.menu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by Bakytgali on 1-Apr-16.
 */
public class MainActivity2 extends ActionBarActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.pizza:
                Intent intent = new Intent(getApplicationContext(),MenuPage.class);
                startActivity(intent);
                break;
            case R.id.imageButton5:
                Intent intent1 = new Intent(getApplicationContext(),MenuPage2.class);
                startActivity(intent1);
                break;
            case R.id.imageButton6:
                Intent intent2 = new Intent(getApplicationContext(),MenuPage3.class);
                startActivity(intent2);
                break;
            case R.id.imageButton:
                Intent intent3 = new Intent(getApplicationContext(),CountActivity.class);
                startActivity(intent3);
                break;
            case R.id.imageButton2:
                Intent intent4 = new Intent(getApplicationContext(),MapsActivity.class);
                startActivity(intent4);
                break;
            case R.id.imageButton3:
                Intent intent5 = new Intent(getApplicationContext(),ModeActivity.class);
                startActivity(intent5);
                break;
        }
    }
}