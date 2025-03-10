package com.asiradnan.muslimapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.asiradnan.muslimapp.fragments.DailyDutiesFragment
import com.asiradnan.muslimapp.fragments.FeedBackFragment
import com.asiradnan.muslimapp.fragments.HistoryFragment
import com.asiradnan.muslimapp.fragments.ProfileFragment

class ViewPagerAdapter (fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    private val fragmentList = listOf(
        DailyDutiesFragment(),
        HistoryFragment(),
        FeedBackFragment(),
        ProfileFragment()
    )

    override fun getItemCount(): Int {
        return fragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragmentList[position]
    }
}