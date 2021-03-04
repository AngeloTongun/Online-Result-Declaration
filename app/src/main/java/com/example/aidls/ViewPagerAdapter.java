package com.example.aidls;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private  String Student_text;
    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        Fragment fragment=null;
        switch (position){
            case  0: fragment=new result_student_info(); break;
            case  1: fragment=new result_current(); break;
            case  2: fragment=new result_all(); break;
        }
        return fragment;
    }


    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case  0: return "Student";
            case  1:  return "Current";
            case  2:  return "All";
            default:  return " ";
        }

    }
}
