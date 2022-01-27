package kg.geektech.kotlinless4hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kg.geektech.kotlinless4hw.adapters.ViewPagerAdapter
import kg.geektech.kotlinless4hw.databinding.ActivityMainBinding
import kg.geektech.kotlinless4hw.fragments.FirstFragment
import kg.geektech.kotlinless4hw.fragments.SecondFragment
import kg.geektech.kotlinless4hw.fragments.ThirdFragment

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: ViewPagerAdapter
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViewPager()
    }

    private fun initViewPager() {
        adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.add(FirstFragment(),"Доступные операции")
        adapter.add(SecondFragment(),"Количесво нажатий")
        adapter.add(ThirdFragment(),"История операций ")

        binding.viewpager.adapter = adapter

        binding.tabLayout.setupWithViewPager(binding.viewpager)


    }


}