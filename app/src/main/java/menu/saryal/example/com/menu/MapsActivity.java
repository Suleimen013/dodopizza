package menu.saryal.example.com.menu;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;

public class MapsActivity extends ActionBarActivity/*extends FragmentActivity implements OnMapReadyCallback*/ {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
    }
}