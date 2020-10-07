package eu.andykrzemien.dog4uapp.ui.home;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import eu.andykrzemien.dog4uapp.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

public class ActivityFragment extends Fragment {

  ViewPager viewPager;
  TextView textView3,joker;
  RadioGroup radioGroup;
  RadioButton lazy, lightActive, veryActive;
  Button jokeButton;

  @Override
  public View onCreateView(
      LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState
  ) {
    View rootView = inflater.inflate(R.layout.fragment_home_third, container, false);
    Button button_home_second2 = rootView.findViewById(R.id.button_home_second2);
    button_home_second2.setOnClickListener(v -> {
      viewPager = Objects.requireNonNull(getActivity()).findViewById(R.id.viewPager);
      viewPager.setCurrentItem(3);
    });

    Button pButton1 = rootView.findViewById(R.id.pButton1);
    pButton1.setOnClickListener(v -> {
      viewPager = Objects.requireNonNull(getActivity()).findViewById(R.id.viewPager);
      viewPager.setCurrentItem(1);
    });
    return rootView;

  }
  public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);

    textView3 = view.findViewById(R.id.textView3);
    radioGroup = view.findViewById(R.id.activityList);
    lazy = view.findViewById(R.id.lazy);
    lightActive = view.findViewById(R.id.lightActive);
    veryActive = view.findViewById(R.id.veryActive);

    joker = view.findViewById(R.id.Joke);
    jokeButton = view.findViewById(R.id.jokeButton);
    List<String> jokers = new ArrayList<>();
    jokers.add("What's a dog's favorite dessert?\n"
        + "Pupcakes!");
    jokers.add("Why aren't dogs good dancers?\n"
        + "Because they have two left feet!");
    jokers.add("What did the waiter say to the dog when he brought out her food?\n"
        + "Bone appetit!");
    jokers.add("What do you call a great dog detective?\n"
        + "Sherlock Bones!");
    jokers.add("What dog keeps the best time?\n"
        + "A watch dog!");
    jokers.add("What do you get when you cross a dog with a phone?\n"
        + "A golden receiver!");
    jokers.add("What do you call it when a cat wins a dog show?\n"
        + "A CAT-tastrophy!");
    jokers.add("Which dog breed just LOVES bubble baths?\n"
        + "A shampoodle!");
    jokers.add("Which dog breed absolutely LOVES living in the city?\n"
        + "A: A New Yorkie!");
    jokers.add("What kind of dog chases anything red?\n" + "A Bulldog.");
    jokers.add("What do you get if you cross a Beatle and an Australian dog?\n" + "Dingo Starr!");
    jokers.add("What do you get when you cross a dog and a calculator?\n" +  "A friend you can count on.");

    jokeButton.setOnClickListener(v -> {
      Random random = new Random();
      int index = random.nextInt(jokers.size());
      joker.setText(jokers.get(index));
    });

    radioGroup.setOnCheckedChangeListener((group, checkedId) -> {

    });
    View.OnClickListener optionOnClickListener = v -> {
      textView3.setText("Choose activity");
      SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(getActivity());
      if (lazy.isChecked()) {
        sharedPref.edit().putString("activity", "Lazy").commit();
        textView3.setText("Dog don't need a long walks.");
      } else if (lightActive.isChecked()) {
        sharedPref.edit().putString("activity", "Light Active").commit();
        textView3.setText("Dog need to go outside for at least one hour per day.");
      } else if (veryActive.isChecked()) {
        sharedPref.edit().putString("activity", "Very Active").commit();
        textView3.setText("Dog needs a lot of walking, running, at least 2h on the field.");
      }
    };
    lazy.setOnClickListener(optionOnClickListener);
    lightActive.setOnClickListener(optionOnClickListener);
    veryActive.setOnClickListener(optionOnClickListener);

  }

}
