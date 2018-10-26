package com.example.personal.myapplication

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.personal.myapplication.adapter.TabAdapter
import kotlinx.android.synthetic.main.fragment_alert.*

class AlertFragment : Fragment() {

    var number = 0
    val tabAdapter:TabAdapter by lazy { TabAdapter(context!!,fragmentManager!!,number) }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_alert, container, false)
    }

    override fun onResume() {
        super.onResume()
        myPager.adapter = tabAdapter
        myTabs.setupWithViewPager(myPager)
    }

    companion object {
        fun newInstance(number:Int) =
                AlertFragment().apply {
                    arguments = Bundle().apply {
                        putInt("number", number)
                    }
                }
    }
}