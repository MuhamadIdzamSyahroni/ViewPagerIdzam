package com.example.datateman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.res.ResourcesCompat
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val menuTeks = arrayOf("Teman", "GitHub", "Profil")
    val menuIcon = arrayOf(R.drawable.ic_home_icon_icons_com_73532, R.drawable.ic__491254405_plusaddmoredetail_82972, R.drawable.ic_police_man_icon_icons_com_55039)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ViewPagerAdapter(this)
        view_pager.setAdapter(adapter);
        TabLayoutMediator(tab_layout, view_pager,
        TabLayoutMediator.TabConfigurationStrategy{ tab, position ->
            tab.text=menuTeks[position]
            tab.icon=ResourcesCompat.getDrawable(resources, menuIcon[position], null)
        }).attach()
    }
}