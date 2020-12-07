package eu.andykrzemien.dog4uapp.ui;

import eu.andykrzemien.dog4uapp.ui.home.AttitudeOnChildren;
import eu.andykrzemien.dog4uapp.ui.home.HomeFragment;
import eu.andykrzemien.dog4uapp.ui.home.DogSize;
import eu.andykrzemien.dog4uapp.ui.home.DogActivity;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapt extends FragmentPagerAdapter{

  private int numOfTabs;

  public PagerAdapt(FragmentManager fm, int numOfTabs) {
    super(fm);
  this.numOfTabs = numOfTabs;
  }

  @NonNull
  @Override
  public Fragment getItem(int position) {
    switch (position) {
      case 0:
        return new HomeFragment();
      case 1:
        return new DogSize();
      case 2:
        return new DogActivity();
      case 3:
        return new AttitudeOnChildren();
      default:
        return null;
    }
  }

  @Override
  public int getCount() {
    return numOfTabs;
  }

}
