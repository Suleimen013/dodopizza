package menu.saryal.example.com.menu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;


public class MainActivity extends ActionBarActivity {

    public  static int currentCount = 0;
    RelativeLayout rl;

    menuDescription item1 = new menuDescription("Биг Пикник",
            "Steamed dumplings of minced chicken seasoned with nepalese spices and herbs | served with himalayan tomato-cashew sauce",
            1700,
            "big1");
    menuDescription item2 = new menuDescription("Вегетаринская",
            "Home-made cottage cheese sautéed with diced bell peppers, onions and tomatoes in chef’s special blend of indian spices",
            2000,
            "big2");
    menuDescription item3 = new menuDescription("Гавайская",
            "Spice-marinated mahi mahi filets grilled in tandoor | sautéed with diced bell pepper, onion and tomatoes and simmered in rich creamy tomato sauce",
            1800,
            "big3");
    menuDescription item4 = new menuDescription("додо",
            "Home-made cottage cheese sautéed with diced bell peppers, onions and tomatoes in chef’s special blend of indian spices",
            1900,
            "big4");
    menuDescription item5 = new menuDescription("Итальянская",
            "Paratha stuffed with seasoned mashed potatoes, green peas and indian spices",
            2000,
            "big5");
    menuDescription item6 = new menuDescription("Маргарита",
            "Delectable duo of crisp cones filled with spice-seasoned potatoes and peas in a mild fragrant spice blend",
            2100,
            "big6");
    menuDescription item7 = new menuDescription("Мексиканская",
            "A simple mixture of boiled chickpeas, chopped onions, plain yogurt, chaat masala, tamarind-mint chutney over the deconstructed samosa or potatoes | garnished with cilantro, namkeen",
            1800,
            "big7");
    menuDescription item8 = new menuDescription("Мясная",
            "Boneless dark chicken delectably cooked in indian spices and curry sauce",
            1500,
            "big8");
    menuDescription item9 = new menuDescription("Новая додо",
            "Boneless lamb cooked in a savory and exotic coconut-flavored creamy curry sauce with delicious indian spices and curry leaves served with basmati rice",
            1900,
            "big9");
    menuDescription item10 = new menuDescription("Огонь",
            "A refreshing mango-yogurt drink",
            1850,
            "big10");
    menuDescription item11 = new menuDescription("Пепперони",
            "A refreshing mango-yogurt drink",
            1750,
            "big11");
    menuDescription item12 = new menuDescription("Пицца пирог",
            "A refreshing mango-yogurt drink",
            1850,
            "big12");
    menuDescription item13 = new menuDescription("Сырная",
            "A refreshing mango-yogurt drink",
            1800,
            "big13");
    menuDescription item14 = new menuDescription("Цыплята малибу",
            "A refreshing mango-yogurt drink",
            1750,
            "big14");
    menuDescription item15 = new menuDescription("Четыре сезона",
            "A refreshing mango-yogurt drink",
            2000,
            "big15");
    menuDescription item17 = new menuDescription("Кукуруза",
            "Home-made cottage cheese sautéed with diced bell peppers, onions and tomatoes in chef’s special blend of indian spices",
            600,
            "a1");
    menuDescription item18 = new menuDescription("Додстеры",
            "Spice-marinated mahi mahi filets grilled in tandoor | sautéed with diced bell pepper, onion and tomatoes and simmered in rich creamy tomato sauce",
            500,
            "a2");
    menuDescription item19 = new menuDescription("Маффин шоколадный",
            "Home-made cottage cheese sautéed with diced bell peppers, onions and tomatoes in chef’s special blend of indian spices",
            650,
            "a3");
    menuDescription item20 = new menuDescription("Маффин ванильный",
            "Paratha stuffed with seasoned mashed potatoes, green peas and indian spices",
            450,
            "a4");
    menuDescription item21 = new menuDescription("Сытные палочки с креветками",
            "Delectable duo of crisp cones filled with spice-seasoned potatoes and peas in a mild fragrant spice blend",
            550,
            "a5");
    menuDescription item22 = new menuDescription("Сытные палочки с чесноком",
            "A simple mixture of boiled chickpeas, chopped onions, plain yogurt, chaat masala, tamarind-mint chutney over the deconstructed samosa or potatoes | garnished with cilantro, namkeen",
            600,
            "a6");
    menuDescription item23 = new menuDescription("Салат-ролл Цезарь",
            "Boneless dark chicken delectably cooked in indian spices and curry sauce",
            550,
            "a7");
    menuDescription item24 = new menuDescription("Чизкейк Нью-Йорк",
            "Boneless lamb cooked in a savory and exotic coconut-flavored creamy curry sauce with delicious indian spices and curry leaves served with basmati rice",
            800,
            "a8");
    menuDescription item25 = new menuDescription("Наггетсы",
            "A refreshing mango-yogurt drink",
            400,
            "a9");


    menuDescription item26 = new menuDescription("Да-да томат",
            "A refreshing mango-yogurt drink",
            200,
            "products2");
    menuDescription item27 = new menuDescription("Да-да апельсин",
            "A refreshing mango-yogurt drink",
            300,
            "products3");

    menuDescription item28 = new menuDescription("Pepsi",
            "A refreshing mango-yogurt drink",
            200,
            "products4");

    menuDescription item29 = new menuDescription("7up",
            "A refreshing mango-yogurt drink",
            150,
            "products5");

    menuDescription item30 = new menuDescription("Миринда",
            "A refreshing mango-yogurt drink",
            200,
            "products6");
    menuDescription item31 = new menuDescription("Да-да яблочный",
            "A refreshing mango-yogurt drink",
            200,
            "products1");




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rl = (RelativeLayout)findViewById(R.id.imgmain);
        Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.alpha);
        rl.startAnimation(animation);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });
        thread.start();

        MenuDbHelper method = new MenuDbHelper(this);
        method.clearDatabase();
        method.addDataToALLMenu(item1);
        method.addDataToALLMenu(item2);
        method.addDataToALLMenu(item3);
        method.addDataToALLMenu(item4);
        method.addDataToALLMenu(item5);
        method.addDataToALLMenu(item6);
        method.addDataToALLMenu(item7);
        method.addDataToALLMenu(item8);
        method.addDataToALLMenu(item9);
        method.addDataToALLMenu(item10);
        method.addDataToALLMenu(item11);
        method.addDataToALLMenu(item12);
        method.addDataToALLMenu(item13);
        method.addDataToALLMenu(item14);
        method.addDataToALLMenu(item15);

        method.close();


        MenuDbHelper method2 = new MenuDbHelper(this);
        method2.addDataToALLMenu(item17);
        method2.addDataToALLMenu(item18);
        method2.addDataToALLMenu(item19);
        method2.addDataToALLMenu(item20);
        method2.addDataToALLMenu(item21);
        method2.addDataToALLMenu(item22);
        method2.addDataToALLMenu(item23);
        method2.addDataToALLMenu(item24);
        method2.addDataToALLMenu(item25);

        method2.close();

        MenuDbHelper method3 = new MenuDbHelper(this);
        method3.addDataToALLMenu(item26);
        method3.addDataToALLMenu(item27);
        method3.addDataToALLMenu(item28);
        method3.addDataToALLMenu(item29);
        method3.addDataToALLMenu(item30);
        method3.addDataToALLMenu(item31);

        method3.close();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

}
