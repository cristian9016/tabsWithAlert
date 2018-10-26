package com.example.personal.myapplication


import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.personal.myapplication.databinding.TemplateShowTracingInfoBinding
import kotlinx.android.synthetic.main.template_show_tracing_info.*

class TemplateShowTracingInfoFragment : Fragment() {

    var value = 0
    lateinit var binding : TemplateShowTracingInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            value = it.getInt("value")
//            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.template_show_tracing_info,container,false)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        infoPhone.text = value.toString()
    }


    companion object {
        @JvmStatic
        fun newInstance(value:Int) =
                TemplateShowTracingInfoFragment().apply {
                    arguments = Bundle().apply {
                        putInt("value", value)
//                        putString(ARG_PARAM2, param2)
                    }
                }
    }
}
