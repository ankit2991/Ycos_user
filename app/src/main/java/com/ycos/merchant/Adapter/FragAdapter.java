package com.ycos.merchant.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class FragAdapter extends FragmentPagerAdapter {

    private final ArrayList<Fragment> fragmentArrayList = new ArrayList<>();
    private final ArrayList<String> fragmentTitle = new ArrayList<>();

    public FragAdapter(@NonNull FragmentManager manager, int behavior) {
        super(manager, behavior);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentArrayList.get(position);
    }

    @Override
    public int getCount() {

        return fragmentArrayList.size();
    }

    public void addFragment(Fragment fragment, String title) {
        fragmentArrayList.add(fragment);
        fragmentTitle.add(title);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentTitle.get(position);
    }
}
