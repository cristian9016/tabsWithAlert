package com.example.personal.myapplication

import android.content.Context
import android.databinding.DataBindingUtil
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.personal.myapplication.adapter.TabAdapter
import com.example.personal.myapplication.databinding.FragmentAlertBinding
import kotlinx.android.synthetic.main.fragment_alert.*
import kotlinx.android.synthetic.main.fragment_alert.view.*

class AlertFragment : Fragment() {

    var number = 0
    val tabAdapter:TabAdapter by lazy { TabAdapter(context!!,childFragmentManager) }
    lateinit var binding:FragmentAlertBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_alert,null,false)
        return binding.tabContainer
    }

    override fun onResume() {
        super.onResume()
        myPager.adapter = tabAdapter
        myTabs.setupWithViewPager(myPager)
    }

    override fun onDestroy() {
        super.onDestroy()
//        binding.root.tabContainer.removeView(view)
    }



}