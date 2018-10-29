package com.example.personal.myapplication


import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.personal.myapplication.databinding.TemplateShowTracingInfoBinding
import kotlinx.android.synthetic.main.template_show_tracing_info.*

class TemplateShowTracingInfoFragment : Fragment() {

    lateinit var binding : TemplateShowTracingInfoBinding
    val value : Int by lazy { arguments!!.getInt("value") }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.template_show_tracing_info,null,false)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        infoPhone.text = value.toString()
    }

    companion object {
        @JvmStatic
        fun newInstance(value:Int):TemplateShowTracingInfoFragment {
            val fragment = TemplateShowTracingInfoFragment()
            val bundle = Bundle()
            bundle.putInt("value",value)
            fragment.arguments = bundle
            return fragment
        }
    }
}
