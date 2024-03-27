package com.appmonix.taskapp.ui;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.appmonix.taskapp.R;
import com.appmonix.taskapp.databinding.ActivityFirstHomeBinding;
import com.appmonix.taskapp.fragments.HomeFragment;
import com.appmonix.taskapp.fragments.ProfileFragment;
import com.appmonix.taskapp.fragments.SaveFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class FirstHomeActivity extends AppCompatActivity {
    private String TAG="FirstHomeActivity";
private ActivityFirstHomeBinding binding;
private Fragment homeFragment = new HomeFragment();
private Fragment saveFragment = new SaveFragment();
private Fragment profileFragment = new ProfileFragment();
private Fragment activeFrag=homeFragment;
private FragmentManager fragmentManager = getSupportFragmentManager();
    private long backPressed;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        getWindow().setStatusBarColor(getResources().getColor(R.color.white));
        super.onCreate(savedInstanceState);
        binding=ActivityFirstHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        fragmentManager.beginTransaction().add(R.id.container_layout_home, homeFragment, "homeFrag").commit();
        activeFrag=homeFragment;
        fragmentManager.beginTransaction().add(R.id.container_layout_home, saveFragment, "saveFrag").hide(saveFragment).commit();
        fragmentManager.beginTransaction().add(R.id.container_layout_home, profileFragment, "ProfileFrag").hide(profileFragment).commit();


        binding.btmNav.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.home:
                    fragmentManager.beginTransaction().hide(activeFrag).show(homeFragment).commit();
                    activeFrag=homeFragment;
                    break;
                case R.id.save:
                    fragmentManager.beginTransaction().hide(activeFrag).show(saveFragment).commit();
                    activeFrag=saveFragment;
                    break;
                case R.id.profile:
                    fragmentManager.beginTransaction().hide(activeFrag).show(profileFragment).commit();
                    activeFrag=profileFragment;
                    break;
            }
            return true; // Return true to indicate the event was handled
        });
    }

    @Override
    public void onBackPressed() {
       /* if (!(activeFrag instanceof HomeFragment)) {
            fragmentManager.beginTransaction().hide(activeFrag).show(homeFragment).commit();
            activeFrag = homeFragment;
        } else {*/
            if (backPressed + 2000 > System.currentTimeMillis()) {
                super.onBackPressed();
            } else {
                backPressed = System.currentTimeMillis();
                Toast.makeText(this, "PRESS ONCE AGAIN TO EXIT", Toast.LENGTH_SHORT).show();
            }
     //   }
    }
}