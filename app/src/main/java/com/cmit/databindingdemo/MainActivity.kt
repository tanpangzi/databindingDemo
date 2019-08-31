package com.cmit.datrabindingdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.cmit.datrabindingdemo.ui.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_single_double_databinding.setOnClickListener { jumpActivity(SingleDoubleDataActivity::class.java) }
        btn_base_observable.setOnClickListener { jumpActivity(BaseObserverActivity::class.java) }
        btn_observable_filed.setOnClickListener { jumpActivity(BaseObserverFiledActivity::class.java) }
        btn_observable_collect.setOnClickListener { jumpActivity(BaseCollectActivity::class.java) }
        btn_event_binding.setOnClickListener { jumpActivity(EventBindActivity::class.java) }
    }

    /** 跳转activity */
    private fun jumpActivity(c: Class<*>) {
        startActivity(Intent(this, c))
    }

    override fun onPause() {
        super.onPause()
        //Toast.makeText(this, "onPause",Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        //Toast.makeText(this, "onstop",Toast.LENGTH_SHORT).show()
    }
}
