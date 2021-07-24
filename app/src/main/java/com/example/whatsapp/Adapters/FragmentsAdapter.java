package com.example.whatsapp.Adapters;

import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.whatsapp.Fragments.CallsFragments;
import com.example.whatsapp.Fragments.ChatFragments;
import com.example.whatsapp.Fragments.StatusFragments;

public class FragmentsAdapter extends FragmentPagerAdapter {
    public FragmentsAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }



    @NonNull
   // @org.jetbrains.annotations.NotNull
    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0: return new ChatFragments();
            case 1: return new StatusFragments();
            case 2: return new CallsFragments();
            default:return new ChatFragments();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable

    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if(position==0){
            title = "CHATS";
        }
        if(position==1){
            title = "STATUS";
        }
        if(position==2){
            title = "CALLS";
        }
        return title;
    }
}
