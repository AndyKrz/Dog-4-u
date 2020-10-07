package eu.andykrzemien.dog4uapp.ui.home;

import android.content.Intent;
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
import eu.andykrzemien.dog4uapp.ResultActivity;

import java.util.Objects;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

public class ChildrenFragment extends Fragment {

  ViewPager viewPager;
  TextView textView4;
  RadioGroup radioGroup;
  RadioButton like, noMatter;

  @Override
  public View onCreateView(
      LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState
  ) {
    View rootView = inflater.inflate(R.layout.fragment_home_fourth, container, false);

    Button pButton2 = rootView.findViewById(R.id.pButton2);
    pButton2.setOnClickListener(v -> {
      viewPager = Objects.requireNonNull(getActivity()).findViewById(R.id.viewPager);
      viewPager.setCurrentItem(2);
    });
    Button button_home_second3 = rootView.findViewById(R.id.button_home_second3);
    button_home_second3.setOnClickListener(v -> {
      Intent i = new Intent(rootView.getContext(), ResultActivity.class);
      startActivity(i);
    });
    return rootView;
  }

  public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);

    radioGroup = view.findViewById(R.id.childrenList);
    textView4 = view.findViewById(R.id.textView4);
    like = view.findViewById(R.id.like);
    noMatter = view.findViewById(R.id.noMatter);

    View.OnClickListener childrenDog = v -> {
      SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(getActivity());
      if(like.isChecked()) {
        textView4.setText("Your kid can cuddle dog whole the time!");
        sharedPref.edit().putString("children", "Like").commit();
      }else if (noMatter.isChecked()) {
        textView4.setText("Ambivalent attitude but it doesn't mean that they don't like them");
        sharedPref.edit().putString("children", "No Matter").commit();
      }
    };
    like.setOnClickListener(childrenDog);
    noMatter.setOnClickListener(childrenDog);
  }
}
