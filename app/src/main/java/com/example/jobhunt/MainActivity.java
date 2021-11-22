package com.example.jobhunt;

import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;
import com.example.jobhunt.Fragment.ChangeNameEmailFragment;
import com.example.jobhunt.Fragment.ChangePasswordFragment;
import com.example.jobhunt.Fragment.CompanyProfileFragment;
import com.example.jobhunt.Fragment.ContactSeaJobsNowFragment;
import com.example.jobhunt.Fragment.HomeFragment;
import com.example.jobhunt.Fragment.InvoiceFragment;
import com.example.jobhunt.Fragment.JobPostFragment;
import com.example.jobhunt.Fragment.MemberShipDetailsFragment;
import com.example.jobhunt.Fragment.MoreUsefulLinksFragment;
import com.example.jobhunt.Fragment.RegisteredIPFragment;
import com.example.jobhunt.Fragment.RequestGreetingsFragment;
import com.example.jobhunt.Fragment.ResumeAsPerCandidateFragment;
import com.example.jobhunt.Fragment.SearchCandidateFragment;
import com.example.jobhunt.Fragment.StatisticsDetailsFragment;
import com.google.android.material.navigation.NavigationView;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import org.jetbrains.annotations.NotNull;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    private AppBarConfiguration mAppBarConfiguration;
    Toolbar toolbar;
    Fragment fragment;
    FragmentTransaction transaction;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("SeaJobsNow");
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        //toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.blue));
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        loadragment();

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN | WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
        getWindow().setStatusBarColor(Color.BLACK);

    }
    private void loadragment(){
        fragment = new HomeFragment();
        transaction= getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.nav_host_fragment_content_main, fragment);
        transaction.commit();
    }
    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration) || super.onSupportNavigateUp();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.nav_home) {
            toolbar.setTitle(getResources().getString(R.string.menu_seajobnow));
            fragment = new HomeFragment();
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
                    .replace(R.id.nav_host_fragment_content_main, fragment)
                    .commit();
        }

        else if (id == R.id.nav_post_job) {
             fragment = new JobPostFragment();
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
                    .replace(R.id.nav_host_fragment_content_main, fragment)
                    .commit();
        }

        else if (id == R.id.nav_search_for_candidate) {
            fragment = new SearchCandidateFragment();
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
                    .replace(R.id.nav_host_fragment_content_main, fragment)
                    .commit();
        }
        else if (id == R.id.nav_access_resume) {
            fragment = new ResumeAsPerCandidateFragment();
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
                    .replace(R.id.nav_host_fragment_content_main, fragment)
                    .commit();
        }

        else if (id == R.id.nav_membership_details) {
            fragment = new MemberShipDetailsFragment();
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
                    .replace(R.id.nav_host_fragment_content_main, fragment)
                    .commit();
        }
        else if (id == R.id.nav_statistics_details) {
             fragment = new StatisticsDetailsFragment();
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
                    .replace(R.id.nav_host_fragment_content_main, fragment)
                    .commit();
        }
        else if (id == R.id.nav_invoices) {
             fragment = new InvoiceFragment();
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
                    .replace(R.id.nav_host_fragment_content_main, fragment)
                    .commit();
        }
        else if (id == R.id.nav_registerip) {
            fragment = new RegisteredIPFragment();
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
                    .replace(R.id.nav_host_fragment_content_main, fragment)
                    .commit();
        }
        else if (id == R.id.nav_view_edit_company_profile) {
            fragment = new CompanyProfileFragment();
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
                    .replace(R.id.nav_host_fragment_content_main, fragment)
                    .commit();
        }
        else if (id == R.id.nav_change_name_email) {
             fragment = new ChangeNameEmailFragment();
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
                    .replace(R.id.nav_host_fragment_content_main, fragment)
                    .commit();
        }
        else if (id == R.id.nav_request_greetings) {
            fragment = new RequestGreetingsFragment();
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
                    .replace(R.id.nav_host_fragment_content_main, fragment)
                    .commit();
        }
        else if (id == R.id.nav_change_password) {
            fragment = new ChangePasswordFragment();
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
                    .replace(R.id.nav_host_fragment_content_main, fragment)
                    .commit();
        }
        else if (id == R.id.nav_contact_seajobsnow) {
             fragment = new ContactSeaJobsNowFragment();
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
                    .replace(R.id.nav_host_fragment_content_main, fragment)
                    .commit();
        }
        else if (id == R.id.nav_more_useful_links) {
            fragment = new MoreUsefulLinksFragment();
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
                    .replace(R.id.nav_host_fragment_content_main, fragment)
                    .commit();
        }
        else if (id == R.id.nav_logout) {

        }
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    public void setToolbarTitle(String title)
    {
        toolbar.setTitle(title);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            //  System.out.println("landscape");
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            //  System.out.println("portrait");
        }
    }
}