package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.myapplication.fragment.Current2Fragment;
import com.example.myapplication.fragment.CurrentFragment;
import com.example.myapplication.fragment.EndedFragment;
import com.example.myapplication.fragment.InComingFragment;

public class MyViewPagerAdapter extends FragmentStateAdapter {


    public MyViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0: return new Current2Fragment();
            case 1: return new InComingFragment();
            case 2: return new EndedFragment();
            default:return new CurrentFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
