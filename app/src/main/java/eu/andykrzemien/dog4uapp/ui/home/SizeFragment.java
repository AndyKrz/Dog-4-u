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

import java.util.Objects;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

public class SizeFragment extends Fragment {

  ViewPager viewPager;
  TextView textView;
  RadioButton miniature,small,medium,large,giant;

  @Override
  public View onCreateView(
      LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState
  ) {
    View rootView = inflater.inflate(R.layout.fragment_home_second, container, false);
    Button button_home_second = rootView.findViewById(R.id.button_home_second);
    button_home_second.setOnClickListener(v -> {
      viewPager = Objects.requireNonNull(getActivity()).findViewById(R.id.viewPager);
      viewPager.setCurrentItem(2);
    });
    return rootView;
}
  public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);

    textView = view.findViewById(R.id.textView);
    RadioGroup sizeList = view.findViewById(R.id.sizeList);
    miniature = view.findViewById(R.id.miniature);
    small = view.findViewById(R.id.small);
    medium = view.findViewById(R.id.medium);
    large = view.findViewById(R.id.large);
    giant = view.findViewById(R.id.giant);

    sizeList.setOnCheckedChangeListener((group, checkedId) -> {

      RadioButton thisButton = Objects.requireNonNull(getView()).findViewById(checkedId);
      SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(getActivity());
      sharedPref.edit().putString("size", thisButton.getText().toString()).commit();
         });
    View.OnClickListener optionOnClickListener = v -> {
      textView.setText("Choose activity");
      SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(getActivity());
      if(miniature.isChecked()){
        sharedPref.edit().putString("size", "Miniature").commit();
        textView.setText("Dog weights less than 3kg");
      } else if(small.isChecked()) {
        sharedPref.edit().putString("size", "Small").commit();
        textView.setText("Dog weights less than 10kg.");
      } else if(medium.isChecked()){
        sharedPref.edit().putString("size", "Medium").commit();
        textView.setText("Dog weights between 11 and 25kg.");
      } else if(large.isChecked()){
        sharedPref.edit().putString("size", "Large").commit();
        textView.setText("Dog weights between 26 and 39kg.");
      } else if(giant.isChecked()){
        sharedPref.edit().putString("size", "Giant").commit();
        textView.setText("Dog weights more than 40kg.");
      }
    };
    miniature.setOnClickListener(optionOnClickListener);
    small.setOnClickListener(optionOnClickListener);
    medium.setOnClickListener(optionOnClickListener);
    large.setOnClickListener(optionOnClickListener);
    giant.setOnClickListener(optionOnClickListener);
    };
}
