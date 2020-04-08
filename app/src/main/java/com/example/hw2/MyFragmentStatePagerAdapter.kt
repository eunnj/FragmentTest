package com.example.hw2

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class MyFragmentStatePagerAdapter(fm:FragmentManager,val fragmentConut :Int) :FragmentStatePagerAdapter(fm){

    override fun getItem(position: Int): Fragment {
        when(position){
            0-> return MainFragment()
            1-> return secondFragment()
            2-> return MypageFragment()
            else-> return MainFragment()
        }
    }

    override fun getCount(): Int = fragmentConut
}