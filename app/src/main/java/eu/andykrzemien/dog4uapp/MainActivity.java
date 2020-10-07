package eu.andykrzemien.dog4uapp;

import com.google.android.material.tabs.TabLayout;

import android.os.Bundle;
import eu.andykrzemien.dog4uapp.ui.PagerAdapt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;


public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.fragment_home_final);
    TabLayout tabLayout = findViewById(R.id.tabLayout);
    final ViewPager viewPager = findViewById(R.id.viewPager);

//    androidx.appcompat.widget.Toolbar toolbar = (androidx.appcompat.widget.Toolbar) findViewById(R.id.toolBar);
//    setSupportActionBar(toolbar);
//
//    if(getSupportActionBar() != null) {
//      getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//      getSupportActionBar().setDisplayShowHomeEnabled(true);
//    }


    PagerAdapt pagerAdapter = new PagerAdapt(getSupportFragmentManager(),tabLayout.getTabCount());
    viewPager.setAdapter(pagerAdapter);

    tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
      @Override
      public void onTabSelected(TabLayout.Tab tab) {
        viewPager.setCurrentItem(tab.getPosition());
      }

      @Override
      public void onTabUnselected(TabLayout.Tab tab) {

      }

      @Override
      public void onTabReselected(TabLayout.Tab tab) {

      }
    });
    viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
  }

}
