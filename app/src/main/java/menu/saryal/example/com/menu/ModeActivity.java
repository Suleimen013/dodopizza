package menu.saryal.example.com.menu;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Calendar;

/**
 * Created by Bakytgali on 1-Apr-16.
 */
public class ModeActivity extends ActionBarActivity {
    TextView hours_on;
    TextView hours_off,openorclosed;
    ImageView open,close;
    int  day_of_week,hour;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mode);
        hours_on=(TextView)findViewById(R.id.hour);
        hours_off=(TextView)findViewById(R.id.hours);
        openorclosed=(TextView)findViewById(R.id.openorclosed);
        open=(ImageView)findViewById(R.id.open);

        final Calendar cal=Calendar.getInstance();
        day_of_week=cal.get(Calendar.DAY_OF_WEEK);
        hour=cal.get(Calendar.HOUR_OF_DAY);
        if(day_of_week==1 || day_of_week==2 || day_of_week==3 || day_of_week==4 || day_of_week==5 || day_of_week==6 || day_of_week==7 ){
            hours_on.setText("08");
            hours_off.setText("22");
        }
        if(hour>=8 && hour<22){
            openorclosed.setText("Сейчас открыто.");
        }
        else {
            openorclosed.setText("Сейчас закрыто.");
        }
    }
}