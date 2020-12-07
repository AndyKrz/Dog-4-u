package eu.andykrzemien.dog4uapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.fragment_result);

    SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);

    String size = sharedPref.getString("size", "");
    String activity = sharedPref.getString("activity", "");
    String children = sharedPref.getString("children", "");
    String dog = sharedPref.getString("dog", "");
    TextView dogName = findViewById(R.id.dogName);
    TextView dogName2 = findViewById(R.id.dogName2);

    dogName.setText(dog);
    dogName2.setText(dog);

    ImageSwitcher switchImageView = findViewById(R.id.imageSwitcher);

    ImageView imageView2 = findViewById(R.id.imageView2);
    imageView2.setImageDrawable(null);

    switchImageView.setFactory(() -> {
      ImageView imageView = new ImageView(getApplicationContext());

      if (size.equalsIgnoreCase("small") &&
          activity.equalsIgnoreCase("lazy") &&
          children.equalsIgnoreCase("like")) {
        imageView.setImageResource(R.drawable.bulldog);
        dogName.setText("Bulldog");
      }
      if (size.equalsIgnoreCase("miniature") &&
          activity.equalsIgnoreCase("light active") &&
          children.equalsIgnoreCase("like")
      ) {
        imageView.setImageResource(R.drawable.chihuahua);
        dogName.setText("Chihuahua");
        imageView2.setImageResource(R.drawable.york);
        dogName2.setText("York");
      }
      if (size.equalsIgnoreCase("miniature") &&
          activity.equalsIgnoreCase("light active") &&
          children.equalsIgnoreCase("no matter")
      ) {
        imageView.setImageResource(R.drawable.york);
        dogName.setText("York");
      }
      if (
          size.equalsIgnoreCase("miniature") &&
              activity.equalsIgnoreCase("lazy") &&
              children.equalsIgnoreCase("like")
      ) {
        imageView.setImageResource(R.drawable.bichon);
        dogName.setText("Bichon Frise");
        imageView2.setImageResource(R.drawable.chihuahua);
        dogName2.setText("Chihuahua");
      }
      if (
          size.equalsIgnoreCase("miniature") &&
              activity.equalsIgnoreCase("lazy") &&
              children.equalsIgnoreCase("no matter")
      ) {
        imageView.setImageResource(R.drawable.toy);
        dogName.setText("Russian Toy");
      }
      if (
          size.equalsIgnoreCase("miniature") &&
              activity.equalsIgnoreCase("very active") &&
              children.equalsIgnoreCase("no matter")
      ) {
        imageView.setImageResource(R.drawable.shih_tzu);
        dogName.setText("Shih Tzu");
      }
      if (
          size.equalsIgnoreCase("miniature") &&
              activity.equalsIgnoreCase("very active") &&
              children.equalsIgnoreCase("like")
      ) {
        imageView.setImageResource(R.drawable.szpic_miniaturowy);
        dogName.setText("Pomeranian");
      }
      if (
          size.equalsIgnoreCase("small") &&
              activity.equalsIgnoreCase("light active") &&
              children.equalsIgnoreCase("like")
      ) {
        imageView.setImageResource(R.drawable.spaniel);
        dogName.setText("English Spaniel");
      }
      if (
          size.equalsIgnoreCase("small") &&
              activity.equalsIgnoreCase("lazy") &&
              children.equalsIgnoreCase("no matter")
      ) {
        imageView.setImageResource(R.drawable.fox_terrier);
        dogName.setText("Fox Terrier");
      }
      if (
          size.equalsIgnoreCase("small") &&
              activity.equalsIgnoreCase("light active") &&
              children.equalsIgnoreCase("no matter")
      ) {
        imageView.setImageResource(R.drawable.jamnik);
        dogName.setText("Dachshund");
      }
      if (
          size.equalsIgnoreCase("small") &&
              activity.equalsIgnoreCase("very active") &&
              children.equalsIgnoreCase("like")
      ) {
        imageView.setImageResource(R.drawable.jack_russell);
        dogName.setText("Jack Russell Terrier");
      }
      if (
          size.equalsIgnoreCase("small") &&
              activity.equalsIgnoreCase("very active") &&
              children.equalsIgnoreCase("no matter")
      ) {
        imageView.setImageResource(R.drawable.charcik_wloski);
        dogName.setText("Italian Greyhound");
      }
      if (size.equalsIgnoreCase("medium")
          && activity.equalsIgnoreCase("light active")
          && children.equalsIgnoreCase("no matter")) {
        imageView.setImageResource(R.drawable.chow);
        dogName.setText("Chow Chow");
      }
      if (size.equalsIgnoreCase("medium")
          && activity.equalsIgnoreCase("lazy")
          && children.equalsIgnoreCase("like")) {
        imageView.setImageResource(R.drawable.bulterier_min);
        dogName.setText("Miniature Bull Terrier");
      }
      if (size.equalsIgnoreCase("medium")
          && activity.equalsIgnoreCase("lazy")
          && children.equalsIgnoreCase("no matter")) {
        imageView.setImageResource(R.drawable.beagle);
        dogName.setText("Beagle");
      }
      if (size.equalsIgnoreCase("medium")
          && activity.equalsIgnoreCase("light active")
          && children.equalsIgnoreCase("like")) {
        imageView.setImageResource(R.drawable.rough_collie);
        dogName.setText("Rough Collie");
      }
      if (size.equalsIgnoreCase("medium")
          && activity.equalsIgnoreCase("very active")
          && children.equalsIgnoreCase("like")) {
        imageView.setImageResource(R.drawable.thai);
        dogName.setText("Thai Ridgeback");
      }
      if (size.equalsIgnoreCase("medium")
          && activity.equalsIgnoreCase("very active")
          && children.equalsIgnoreCase("no matter")) {
        imageView.setImageResource(R.drawable.thai);
        dogName.setText("Thai Ridgeback");
      }
      if (size.equalsIgnoreCase("large")
          && activity.equalsIgnoreCase("very active")
          && children.equalsIgnoreCase("like")) {
        imageView.setImageResource(R.drawable.wyzel);
        dogName.setText("Weimaraner");
      }
      if (size.equalsIgnoreCase("large")
          && activity.equalsIgnoreCase("light active")
          && children.equalsIgnoreCase("like")) {
        imageView.setImageResource(R.drawable.labrador);
        dogName.setText("Labrador");
      }
      if (size.equalsIgnoreCase("large")
          && activity.equalsIgnoreCase("very active")
          && children.equalsIgnoreCase("no matter")) {
        imageView.setImageResource(R.drawable.owczarek);
        dogName.setText("German Shepherd");
      }
      if (size.equalsIgnoreCase("large")
          && activity.equalsIgnoreCase("lazy")
          && children.equalsIgnoreCase("no matter")) {
        imageView.setImageResource(R.drawable.bokser);
        dogName.setText("Boxer");
      }
      if (size.equalsIgnoreCase("large")
          && activity.equalsIgnoreCase("lazy")
          && children.equalsIgnoreCase("like")) {
        imageView.setImageResource(R.drawable.akita);
        dogName.setText("Akita Inu");

      }
      if (size.equalsIgnoreCase("large")
          && activity.equalsIgnoreCase("light active")
          && children.equalsIgnoreCase("no matter")) {
        imageView.setImageResource(R.drawable.hovavart);
        dogName.setText("Hovawart");

      }
      if (size.equalsIgnoreCase("giant")
          && activity.equalsIgnoreCase("very active")
          && children.equalsIgnoreCase("like")) {
        imageView.setImageResource(R.drawable.irlandzki);
        dogName.setText("Irish Wolfhound");
      }
      if (size.equalsIgnoreCase("giant")
          && activity.equalsIgnoreCase("lazy")
          && children.equalsIgnoreCase("like")) {
        imageView.setImageResource(R.drawable.niemiecki);
        dogName.setText("Great Dane");
      }
      if (size.equalsIgnoreCase("giant")
          && activity.equalsIgnoreCase("lazy")
          && children.equalsIgnoreCase("no matter")) {
        imageView.setImageResource(R.drawable.owczarek_kaukas);
        dogName.setText("Caucasian Shepherd Dog");
      }
      if (size.equalsIgnoreCase("giant")
          && activity.equalsIgnoreCase("light active")
          && children.equalsIgnoreCase("like")) {
        imageView.setImageResource(R.drawable.nowofundland);
        dogName.setText("Newfoundland");
      }

      if (size.equalsIgnoreCase("giant")
          && activity.equalsIgnoreCase("light active")
          && children.equalsIgnoreCase("no matter")) {
        imageView.setImageResource(R.drawable.akita_amerykanska);
        dogName.setText("American Akita");
      }
      if (size.equalsIgnoreCase("giant")
          && activity.equalsIgnoreCase("very active")
          && children.equalsIgnoreCase("no matter")) {
        imageView.setImageResource(R.drawable.rottweiler);
        dogName.setText("Rottweiler");
      }
      return imageView;
    });

    Button goToHome = findViewById(R.id.goToHome);
    goToHome.setOnClickListener(v -> {
      Intent i = new Intent(ResultActivity.this, MainActivity.class);
      startActivity(i);
    });

    Button reload = findViewById(R.id.Return);
    reload.setOnClickListener(v -> {
      Intent i = new Intent(ResultActivity.this, MainActivity.class);
      startActivity(i);
    });

    Button exit = findViewById(R.id.Exit);
    exit.setOnClickListener(v -> {
      System.exit(0);
    });

  }

}