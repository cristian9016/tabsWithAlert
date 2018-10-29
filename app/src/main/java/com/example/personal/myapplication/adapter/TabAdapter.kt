package com.example.personal.myapplication.adapter

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import android.view.ViewGroup
import com.example.personal.myapplication.TemplateShowTracingInfoFragment

class TabAdapter(val context: Context, val fragmentManager:FragmentManager):FragmentStatePagerAdapter(fragmentManager) {

    val totalTabs = 2

    override fun getItem(position: Int): Fragment =
            when(position){
                0 -> TemplateShowTracingInfoFragment.newInstance(1)
                else -> TemplateShowTracingInfoFragment.newInstance(2)
            }

    override fun getCount(): Int = totalTabs

    override fun getPageTitle(position: Int): CharSequence? =
            when(position){
                0 -> "INFO. PERSONA"
                else -> "INFO. CARACTERIZACION"
            }



}