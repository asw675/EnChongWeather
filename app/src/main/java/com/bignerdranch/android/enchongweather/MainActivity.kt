package com.bignerdranch.android.enchongweather

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v7.app.AppCompatActivity
import android.text.format.Time
import android.view.MenuItem
import android.widget.Toast
import com.bignerdranch.android.enchongweather.Model.Weather
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import rx.Observer
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers





class MainActivity : AppCompatActivity() {

    private val city="tianhe"
    private val key="83c2a5c3511fb381137825d1165e5f9e"
    private val tab= listOf("day","tom","tri","fou","fif")
    private var weather:Weather?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toolbar.setNavigationIcon(R.drawable.ic_menu_black_24dp)
        toolbar.setTitle(null)
        toolbar_title.setText(city)
        initView()
        setWeather()
    }

    private fun initView(){
        for(i in tab.indices)
        {
            tabLayout.addTab(tabLayout.newTab().setText(tab.get(i)))
        }
        val t = Time()
        when(t.hour){
            in 0..6 -> linear.setBackgroundResource(R.mipmap.nig)
            in 18..23 -> linear.setBackgroundResource(R.mipmap.nig)
            in 7..12 -> linear.setBackgroundResource(R.mipmap.sun)
            in 13..18 -> linear.setBackgroundResource(R.mipmap.non)
        }
        tabLayout.setOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                when(tab.text){
                    "day"->initData(weather,0)
                    "tom"->initData(weather,9)
                    "tri"->initData(weather,18)
                    "fou"->initData(weather,27)
                    "fif"->initData(weather,36)
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {

            }

            override fun onTabReselected(tab: TabLayout.Tab) {

            }
        })
    }

    private fun setWeather(){
        val retrofit=Retrofit.Builder()
                .baseUrl("https://api.openweathermap.org/data/2.5/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build()

        val retrofitInterface = retrofit.create(WeatherInterface::class.java)

        retrofitInterface.getWeather(city,key)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object:Observer<Weather>{
                    override fun onCompleted() {
                    }

                    override fun onError(e: Throwable?) {
                            e?.printStackTrace()
                        Toast.makeText(this@MainActivity, e.toString(), Toast.LENGTH_SHORT).show()

                    }

                    override fun onNext(t: Weather?) {
                        Toast.makeText(this@MainActivity, "痛", Toast.LENGTH_SHORT).show()
                        weather=t
                        initData(weather,0)
                    }
                })


    }

    fun initData(t: Weather?,the:Int){
        clouds.setText("${t?.list?.get(the)?.clouds?.all.toString()}%")
        humidity.setText(t?.list?.get(the)?.main?.humidity.toString()+"%")
        wind.setText(t?.list?.get(the)?.wind?.speed.toString()+"%")
        pressure.setText(t?.list?.get(the)?.main?.pressure.toString())
        setWeatherIcon(t?.list?.get(the)?.weather?.get(0)?.description)
        var min=t?.list?.get(the)?.main?.temp_min?.minus(273.15)
        var max=t?.list?.get(the)?.main?.temp_max?.minus(273.15)
        max_min.setText("${min?.toInt()}°~${max?.toInt()}°")
        textView.setText(t?.list?.get(the)?.weather?.get(0)?.main)
        var temp=t?.list?.get(the)?.main?.temp?.minus(273.15)?.toInt()
        du.setText("${temp}°")
    }

    fun setWeatherIcon(weather:String?){
        when(weather){
            "clear sky" -> Glide.with(this).load(R.mipmap.clearsky).asBitmap().into(weather_icon)
            "few clouds" -> Glide.with(this).load(R.mipmap.fewclouds).asBitmap().into(weather_icon)
            "heavy intensity rain"-> Glide.with(this).load(R.mipmap.heavyintensityrain).asBitmap().into(weather_icon)
            "light rain"-> Glide.with(this).load(R.mipmap.lightrain).asBitmap().into(weather_icon)
            "overcast clouds"-> Glide.with(this).load(R.mipmap.overcastclouds).asBitmap().into(weather_icon)
            "snow"-> Glide.with(this).load(R.mipmap.snow).asBitmap().into(weather_icon)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item?.itemId==android.R.id.home)
        {

        }
        return super.onOptionsItemSelected(item)
    }
}
