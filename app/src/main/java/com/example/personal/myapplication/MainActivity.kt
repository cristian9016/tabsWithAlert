package com.example.personal.myapplication

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.personal.myapplication.databinding.TemplateAlertBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_alert.view.*
import kotlinx.android.synthetic.main.template_alert.*
import org.jetbrains.anko.alert
import org.jetbrains.anko.yesButton

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            alert {
                val x = DataBindingUtil.inflate<TemplateAlertBinding>(layoutInflater, R.layout.template_alert, null, false)
                customView = x.root
                yesButton {
                    supportFragmentManager.
                            beginTransaction().
                            remove(myFragment).
                            commit()
                }
            }.show()
        }
    }
}

