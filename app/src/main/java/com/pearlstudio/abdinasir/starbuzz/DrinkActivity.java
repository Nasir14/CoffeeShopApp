package com.pearlstudio.abdinasir.starbuzz;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;


public class DrinkActivity extends ActionBarActivity {

    public static final String EXTRA_DRINKNO = "drinkNo";

    private ImageView photo;
    private TextView name;
    private TextView description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        photo =(ImageView)findViewById(R.id.photo);
        name =(TextView)findViewById(R.id.name);
        description =(TextView)findViewById(R.id.description);

        int drinkNo = (int)getIntent().getExtras().get(EXTRA_DRINKNO);
        // The Array with its indexes and data
        Drink drink = Drink.drinks[drinkNo];

        photo.setImageResource(drink.getImageResourceId());
        photo.setContentDescription(drink.getName());
        name.setText(drink.getName());
        description.setText(drink.getDescription());

    }


}
