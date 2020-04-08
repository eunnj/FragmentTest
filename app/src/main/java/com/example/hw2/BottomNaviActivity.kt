package com.example.hw2

import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_bottom_navi.*

class BottomNaviActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navi)

        configureBottomNavigation()

    }

    private fun configureBottomNavigation(){
        vp_bottom_navi_act_frag_pager.adapter=MyFragmentStatePagerAdapter(supportFragmentManager,3)

        //viewpager와 tablayout 연결
        tl_bottom_navi_act_bottom_menu.setupWithViewPager(vp_bottom_navi_act_frag_pager)

        val bottomNaviLayout : View = this.layoutInflater.inflate(R.layout.bottom_navgation_tab,null,false)

        tl_bottom_navi_act_bottom_menu.getTabAt(0)!!.customView=bottomNaviLayout.findViewById(R.id.btn_bottom_navi_main_tab) as LinearLayout
        tl_bottom_navi_act_bottom_menu.getTabAt(1)!!.customView=bottomNaviLayout.findViewById(R.id.btn_bottom_navi_call_tab) as LinearLayout
        tl_bottom_navi_act_bottom_menu.getTabAt(2)!!.customView=bottomNaviLayout.findViewById(R.id.btn_bottom_navi_my_tab) as LinearLayout

    }
}