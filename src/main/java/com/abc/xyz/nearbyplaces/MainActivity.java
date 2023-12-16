package com.abc.xyz.nearbyplaces;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView Cafe;
    private ImageView bank;
    private ImageView Library;
    private ImageView Bus_Stand;
    private ImageView Bakery;
    private ImageView Park;
    private ImageView Dentist;
    private ImageView FireStation;
    private ImageView Restaurant;
    private ImageView PoliceStation;
    private ImageView Gym;
    private ImageView Hospital;
    private ImageView Hotel;
    private ImageView Mosque;
    private ImageView Zoo;
    private ImageView Petrol;
    private ImageView PetShop;
    private ImageView ShoeShop;
    private ImageView Shopping;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cafe = (ImageView) findViewById(R.id.bakry);
        bank = (ImageView) findViewById(R.id.bank);
        Library = (ImageView) findViewById(R.id.book);
        Bus_Stand = (ImageView) findViewById(R.id.bus_stop);
        Bakery = (ImageView) findViewById(R.id.cake);
        Park = (ImageView) findViewById(R.id.church);
        Dentist = (ImageView) findViewById(R.id.drug);
        FireStation = (ImageView) findViewById(R.id.firemen);
        Restaurant = (ImageView) findViewById(R.id.ic_food);
        PoliceStation = (ImageView) findViewById(R.id.Guard);
        Gym = (ImageView) findViewById(R.id.Gym);
        Hospital = (ImageView) findViewById(R.id.Hospital);
        Hotel = (ImageView) findViewById(R.id.Hotel);
        Mosque = (ImageView) findViewById(R.id.Mosque);
        Zoo = (ImageView) findViewById(R.id.Zoo);
        Petrol = (ImageView) findViewById(R.id.Fuel);
        PetShop = (ImageView) findViewById(R.id.PetShop);
        ShoeShop = (ImageView) findViewById(R.id.ShoeShop);
        Shopping = (ImageView) findViewById(R.id.Shopping);

        Cafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=" + "Cafe"));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        bank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=" + "Bank"));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        Library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=" + "Library"));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        Bus_Stand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=" + "bus_stop"));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        Bakery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=" + "cake"));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        Park.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=" + "park"));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        Dentist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=" + "Dentist"));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        FireStation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=" + "FireStation"));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        Restaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=" + "Restaurant"));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        PoliceStation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=" + "PoliceStation"));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        Gym.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=" + "Gym"));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        Hospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=" + "Hospital"));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        Hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=" + "Hotel"));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        Mosque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=" + "Mosque"));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        Zoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=" + "Zoo"));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        Petrol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=" + "Fuel"));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        PetShop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=" + "PetShop"));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        ShoeShop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=" + "Shoeshop"));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        Shopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=" + "Shopping"));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
    }
    private static long back_pressed;
    @Override
    public void onBackPressed(){
        if (back_pressed + 2000 > System.currentTimeMillis()){
            super.onBackPressed();
        }
        else{
            Toast.makeText(getBaseContext(), "Press once again to exit",
                    Toast.LENGTH_SHORT).show();
            back_pressed = System.currentTimeMillis();
        }
    }
}