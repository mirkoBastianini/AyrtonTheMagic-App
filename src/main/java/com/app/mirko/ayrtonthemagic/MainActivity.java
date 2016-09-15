package com.app.mirko.ayrtonthemagic;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.app.mirko.ayrtonthemagic.Fragments.InboxFragment;
import com.app.mirko.ayrtonthemagic.Fragments.StarredFragment;
import com.app.mirko.ayrtonthemagic.Fragments.alfabeto;
import com.app.mirko.ayrtonthemagic.Fragments.amori;
import com.app.mirko.ayrtonthemagic.Fragments.angelo;
import com.app.mirko.ayrtonthemagic.Fragments.brasilef;
import com.app.mirko.ayrtonthemagic.Fragments.brasiliani;
import com.app.mirko.ayrtonthemagic.Fragments.canzone;
import com.app.mirko.ayrtonthemagic.Fragments.comas;
import com.app.mirko.ayrtonthemagic.Fragments.dicono;
import com.app.mirko.ayrtonthemagic.Fragments.dio;
import com.app.mirko.ayrtonthemagic.Fragments.duespeciali;
import com.app.mirko.ayrtonthemagic.Fragments.extreme;
import com.app.mirko.ayrtonthemagic.Fragments.film;
import com.app.mirko.ayrtonthemagic.Fragments.fondazione;
import com.app.mirko.ayrtonthemagic.Fragments.frasidette;
import com.app.mirko.ayrtonthemagic.Fragments.garedaricordare;
import com.app.mirko.ayrtonthemagic.Fragments.google;
import com.app.mirko.ayrtonthemagic.Fragments.ifonly;
import com.app.mirko.ayrtonthemagic.Fragments.imola;
import com.app.mirko.ayrtonthemagic.Fragments.ioeayrton;
import com.app.mirko.ayrtonthemagic.Fragments.leAuto;
import com.app.mirko.ayrtonthemagic.Fragments.massimo;
import com.app.mirko.ayrtonthemagic.Fragments.perfectlap;
import com.app.mirko.ayrtonthemagic.Fragments.remember;
import com.app.mirko.ayrtonthemagic.Fragments.scherzi;
import com.app.mirko.ayrtonthemagic.Fragments.sennavsprost;
import com.app.mirko.ayrtonthemagic.Fragments.twitter;
import com.app.mirko.ayrtonthemagic.Fragments.week;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    ActionBar actionBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        actionBar = getSupportActionBar();
        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu_white_24dp);
        actionBar.setDisplayHomeAsUpEnabled(true);

        drawerLayout = (DrawerLayout) findViewById(R.id.navigation_drawer_layout);

        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view);
        if (navigationView != null) {
            setupNavigationDrawerContent(navigationView);
        }

        setupNavigationDrawerContent(navigationView);

        //First fragment
        setFragment(0);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
            case R.id.action_social:
                Intent setting1 = new Intent(MainActivity.this,Social.class);
                startActivity(setting1);
                return true;
            case R.id.action_settings:
                Intent setting = new Intent(MainActivity.this,SettingsActivity.class);
                startActivity(setting);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle(R.string.exitquestion);
        alertDialogBuilder
                .setMessage(R.string.exitconf)
                .setCancelable(false)
                .setPositiveButton(R.string.exityes,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                moveTaskToBack(true);
                                android.os.Process.killProcess(android.os.Process.myPid());
                                System.exit(1);
                            }
                        })

                .setNegativeButton(R.string.exitno, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        dialog.cancel();
                    }
                });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
    private void setupNavigationDrawerContent(NavigationView navigationView) {
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        switch (menuItem.getItemId()) {
                            case R.id.home:
                                menuItem.setChecked(true);
                                setFragment(0);
                                drawerLayout.closeDrawer(GravityCompat.START);
                                return true;
                            case R.id.biografia:
                                menuItem.setChecked(true);
                                setFragment(1);
                                drawerLayout.closeDrawer(GravityCompat.START);
                                return true;
                            case R.id.leauto:
                                menuItem.setChecked(true);
                                setFragment(2);
                                drawerLayout.closeDrawer(GravityCompat.START);
                                return true;
                            case R.id.sennavsprost:
                                menuItem.setChecked(true);
                                setFragment(3);
                                drawerLayout.closeDrawer(GravityCompat.START);
                                return true;
                            case R.id.gare:
                                menuItem.setChecked(true);
                                setFragment(4);
                                drawerLayout.closeDrawer(GravityCompat.START);
                                return true;
                            case R.id.alfabeto:
                                menuItem.setChecked(true);
                                setFragment(5);
                                drawerLayout.closeDrawer(GravityCompat.START);
                                return true;
                            case R.id.morteAyrton:
                                menuItem.setChecked(true);
                                Intent morte = new Intent(MainActivity.this, morte.class);
                                startActivity(morte);
                                drawerLayout.closeDrawer(GravityCompat.START);
                                return true;

                            case R.id.frasidette:
                                menuItem.setChecked(true);
                                setFragment(8);
                                drawerLayout.closeDrawer(GravityCompat.START);
                                return true;
                            case R.id.diconodilui:
                                menuItem.setChecked(true);
                                setFragment(9);
                                drawerLayout.closeDrawer(GravityCompat.START);
                                return true;
                            case R.id.brasiliani:
                                menuItem.setChecked(true);
                                setFragment(10);
                                drawerLayout.closeDrawer(GravityCompat.START);
                                return true;
                            case R.id.fondazione:
                                menuItem.setChecked(true);
                                setFragment(11);
                                drawerLayout.closeDrawer(GravityCompat.START);
                                return true;
                            case R.id.massimo:
                                menuItem.setChecked(true);
                                setFragment(12);
                                drawerLayout.closeDrawer(GravityCompat.START);
                                return true;
                            case R.id.orsi:
                                menuItem.setChecked(true);
                                setFragment(13);
                                drawerLayout.closeDrawer(GravityCompat.START);
                                return true;
                            case R.id.comas:
                                menuItem.setChecked(true);
                                setFragment(14);
                                drawerLayout.closeDrawer(GravityCompat.START);
                                return true;
                            case R.id.fede:
                                menuItem.setChecked(true);
                                setFragment(15);
                                drawerLayout.closeDrawer(GravityCompat.START);
                                return true;
                            case R.id.scherzi:
                                menuItem.setChecked(true);
                                setFragment(16);
                                drawerLayout.closeDrawer(GravityCompat.START);
                                return true;
                            case R.id.amori:
                                menuItem.setChecked(true);
                                setFragment(17);
                                drawerLayout.closeDrawer(GravityCompat.START);
                                return true;

                            case R.id.film:
                                menuItem.setChecked(true);
                                setFragment(18);
                                drawerLayout.closeDrawer(GravityCompat.START);
                                return true;
                            case R.id.ayrton:
                                menuItem.setChecked(true);
                                setFragment(19);
                                drawerLayout.closeDrawer(GravityCompat.START);
                                return true;
                            case R.id.remember:
                                menuItem.setChecked(true);
                                setFragment(20);
                                drawerLayout.closeDrawer(GravityCompat.START);
                                return true;
                            case R.id.extremespeed:
                                menuItem.setChecked(true);
                                setFragment(21);
                                drawerLayout.closeDrawer(GravityCompat.START);
                                return true;
                            case R.id.twitter:
                                menuItem.setChecked(true);
                                setFragment(22);
                                drawerLayout.closeDrawer(GravityCompat.START);
                                return true;
                            case R.id.google:
                                menuItem.setChecked(true);
                                setFragment(23);
                                drawerLayout.closeDrawer(GravityCompat.START);
                                return true;
                            case R.id.mclare:
                                menuItem.setChecked(true);
                                setFragment(24);
                                drawerLayout.closeDrawer(GravityCompat.START);
                                return true;
                            case R.id.week:
                                menuItem.setChecked(true);
                                setFragment(25);
                                drawerLayout.closeDrawer(GravityCompat.START);
                                return true;
                            case R.id.f1:
                                menuItem.setChecked(true);
                                setFragment(26);
                                drawerLayout.closeDrawer(GravityCompat.START);
                                return true;
                            case R.id.ifonly:
                                menuItem.setChecked(true);
                                setFragment(27);
                                drawerLayout.closeDrawer(GravityCompat.START);
                                return true;
                            case R.id.imola:
                                menuItem.setChecked(true);
                                setFragment(28);
                                drawerLayout.closeDrawer(GravityCompat.START);
                                return true;

                            case R.id.perchesito:
                                menuItem.setChecked(true);
                                setFragment(29);
                                drawerLayout.closeDrawer(GravityCompat.START);
                                return true;

                            case R.id.speciali:
                                menuItem.setChecked(true);
                                setFragment(30);
                                drawerLayout.closeDrawer(GravityCompat.START);
                                return true;
                            case R.id.action_settings:
                                menuItem.setChecked(true);
                                startActivity(new Intent(MainActivity.this, SettingsActivity.class));
                                drawerLayout.closeDrawer(GravityCompat.START);
                                return true;

                        }
                        return true;
                    }
                });
    }

    public void setFragment(int position) {
        FragmentManager fragmentManager;
        FragmentTransaction fragmentTransaction;
        switch (position) {
            case 0:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                InboxFragment inboxFragment = new InboxFragment();
                fragmentTransaction.replace(R.id.fragment, inboxFragment);
                fragmentTransaction.commit();
                break;
            case 1:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                StarredFragment starredFragment = new StarredFragment();
                fragmentTransaction.replace(R.id.fragment, starredFragment);
                fragmentTransaction.commit();
                break;
            case 2:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                leAuto auto = new leAuto();
                fragmentTransaction.replace(R.id.fragment, auto);
                fragmentTransaction.commit();
                break;
            case 3:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                sennavsprost sevspr = new sennavsprost();
                fragmentTransaction.replace(R.id.fragment, sevspr);
                fragmentTransaction.commit();
                break;
            case 4:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                garedaricordare gare = new garedaricordare();
                fragmentTransaction.replace(R.id.fragment, gare);
                fragmentTransaction.commit();
                break;
            case 5:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                alfabeto al = new alfabeto();
                fragmentTransaction.replace(R.id.fragment, al);
                fragmentTransaction.commit();
                break;




            case 8:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                frasidette fd = new frasidette();
                fragmentTransaction.replace(R.id.fragment, fd);
                fragmentTransaction.commit();
                break;
            case 9:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                dicono d = new dicono();
                fragmentTransaction.replace(R.id.fragment, d);
                fragmentTransaction.commit();
                break;
            case 10:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                brasiliani b = new brasiliani();
                fragmentTransaction.replace(R.id.fragment, b);
                fragmentTransaction.commit();
                break;
            case 11:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
               fondazione f = new fondazione();
                fragmentTransaction.replace(R.id.fragment, f);
                fragmentTransaction.commit();
                break;
            case 12:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                massimo m = new massimo();
                fragmentTransaction.replace(R.id.fragment, m);
                fragmentTransaction.commit();
                break;
            case 13:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                angelo a = new angelo();
                fragmentTransaction.replace(R.id.fragment, a);
                fragmentTransaction.commit();
                break;
            case 14:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                comas c = new comas();
                fragmentTransaction.replace(R.id.fragment, c);
                fragmentTransaction.commit();
                break;
            case 15:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                dio di = new dio();
                fragmentTransaction.replace(R.id.fragment, di);
                fragmentTransaction.commit();
                break;
            case 16:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
               scherzi sc = new scherzi();
                fragmentTransaction.replace(R.id.fragment, sc);
                fragmentTransaction.commit();
                break;
            case 17:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                amori am = new amori();
                fragmentTransaction.replace(R.id.fragment, am);
                fragmentTransaction.commit();
                break;


            case 18:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                film fi = new film();
                fragmentTransaction.replace(R.id.fragment, fi);
                fragmentTransaction.commit();
                break;
            case 19:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                canzone ca = new canzone();
                fragmentTransaction.replace(R.id.fragment, ca);
                fragmentTransaction.commit();
                break;
            case 20:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                remember re = new remember();
                fragmentTransaction.replace(R.id.fragment, re);
                fragmentTransaction.commit();
                break;
            case 21:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                extreme ex = new extreme();
                fragmentTransaction.replace(R.id.fragment, ex);
                fragmentTransaction.commit();
                break;
            case 22:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                twitter tw = new twitter();
                fragmentTransaction.replace(R.id.fragment, tw);
                fragmentTransaction.commit();
                break;
            case 23:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                google go = new google();
                fragmentTransaction.replace(R.id.fragment, go);
                fragmentTransaction.commit();
                break;
            case 24:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                perfectlap pl = new perfectlap();
                fragmentTransaction.replace(R.id.fragment, pl);
                fragmentTransaction.commit();
                break;
            case 25:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                week we = new week();
                fragmentTransaction.replace(R.id.fragment, we);
                fragmentTransaction.commit();
                break;
            case 26:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                brasilef bras= new brasilef();
                fragmentTransaction.replace(R.id.fragment, bras);
                fragmentTransaction.commit();
                break;
            case 27:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                ifonly ifo= new ifonly();
                fragmentTransaction.replace(R.id.fragment, ifo);
                fragmentTransaction.commit();
                break;
            case 28:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                imola imo= new imola();
                fragmentTransaction.replace(R.id.fragment, imo);
                fragmentTransaction.commit();
                break;
            case 29:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                ioeayrton ioe= new ioeayrton();
                fragmentTransaction.replace(R.id.fragment, ioe);
                fragmentTransaction.commit();
                break;
            case 30:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                duespeciali du= new duespeciali();
                fragmentTransaction.replace(R.id.fragment, du);
                fragmentTransaction.commit();
                break;
        }
    }
}

