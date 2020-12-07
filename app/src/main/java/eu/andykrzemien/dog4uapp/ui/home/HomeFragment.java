package eu.andykrzemien.dog4uapp.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import eu.andykrzemien.dog4uapp.R;

import java.util.Objects;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

public class HomeFragment extends Fragment{

  ViewPager viewPager;

  public View onCreateView(@NonNull LayoutInflater inflater,
                           ViewGroup container, Bundle savedInstanceState) {
    View rootView = inflater.inflate(R.layout.fragment_start, container, false);

    Button button_home = rootView.findViewById(R.id.button_home);
    button_home.setOnClickListener(v -> {
      viewPager = Objects.requireNonNull(getActivity()).findViewById(R.id.viewPager);
      viewPager.setCurrentItem(1);
    });
    return rootView;
  }
}
