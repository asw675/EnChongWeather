package com.bignerdranch.android.enchongweather

import android.Manifest
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.WindowManager
import butterknife.ButterKnife
import com.baidu.location.BDAbstractLocationListener
import com.baidu.location.BDLocation
import com.baidu.location.LocationClient
import com.baidu.location.LocationClientOption
import com.bignerdranch.android.enchongweather.Utils.PermissionsUtils


class SplashActivity :AppCompatActivity() {

    private val dis="tianhe"
    private val key="83c2a5c3511fb381137825d1165e5f9e"
    private var City: String? = null
    var mLocationClient: LocationClient? = null
    // 声明一个对于定位的观察者对象
    private val myListener = MyLocationListener()
    var locations = ArrayList<BDLocation>()
    //获得定位时间
    private var locationTime: String? = null
    //获得经度坐标
    private var locationLongitude: Double? = null
    //获得纬度坐标
    private var locationLatitude: Double? = null
    //获得详细地址信息
    private var locationAddrStr: String? = null
    //获取位置语义化信息，没有的话返回NULL
    private var locationDescribe: String? = null
    //回调的百度坐标类，内部封装了如经纬度、半径等属性信息
    private var mBdLocation: BDLocation? = null
    var permissions = arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        ButterKnife.bind(this)
        //        requestWindowFeature(Window.FEATURE_NO_TITLE);
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN)
        PermissionsUtils.getInstance().chekPermissions(this, permissions, permissionsResult)

    }

    var permissionsResult: PermissionsUtils.IPermissionsResult = object : PermissionsUtils.IPermissionsResult {
        override fun passPermissons() {

        }

        override fun forbitPermissons() {

        }
    }

    fun initBaidu() {
        // 定位用声明LocationClient类
        mLocationClient = LocationClient(applicationContext)
        mLocationClient!!.registerLocationListener(myListener)
        initLocation()
        mLocationClient!!.start()
    }

    private fun initLocation() {
        val option = LocationClientOption()
        option.locationMode = LocationClientOption.LocationMode.Hight_Accuracy
        // 可选，默认高精度，设置定位模式，高精度，低功耗，仅设备
        option.setCoorType("bd09ll")
        // 可选，默认gcj02，设置返回的定位结果坐标系
        val span = 1000
        option.setScanSpan(span)
        // 可选，默认0，即仅定位一次，设置发起定位请求的间隔需要大于等于1000ms才是有效的
        option.setIsNeedAddress(true)
        // 可选，设置是否需要地址信息，默认不需要
        option.isOpenGps = true
        // 可选，默认false,设置是否使用gps
        option.isLocationNotify = true
        // 可选，默认false，设置是否当GPS有效时按照1S/1次频率输出GPS结果
        option.setIsNeedLocationDescribe(true)
        // 可选，默认false，设置是否需要位置语义化结果，可以在BDLocation.getLocationDescribe里得到，结果类似于“在北京天安门附近”
        option.setIsNeedLocationPoiList(true)
        // 可选，默认false，设置是否需要POI结果，可以在BDLocation.getPoiList里得到
        option.setIgnoreKillProcess(true)
        // 可选，默认true，定位SDK内部是一个SERVICE，并放到了独立进程，设置是否在stop的时候杀死这个进程，默认不杀死
        option.SetIgnoreCacheException(false)
        // 可选，默认false，设置是否收集CRASH信息，默认收集
        option.setEnableSimulateGps(false)
        // 可选，默认false，设置是否需要过滤GPS仿真结果，默认需要
        mLocationClient!!.locOption = option
    }

    inner class MyLocationListener : BDAbstractLocationListener() {
        //接受到的定位信息,BDLocation中包含定位的一些信息,例如街道名称/城市/经纬度
        override fun onReceiveLocation(bdLocation: BDLocation) {
            //将之前声明的一些参数放到这里,方便控件展示时,直接使用即可
            mBdLocation = bdLocation
            locationTime = bdLocation.time
            locationLongitude = bdLocation.longitude
            locationLatitude = bdLocation.latitude
            locationAddrStr = bdLocation.addrStr
            locationDescribe = bdLocation.locationDescribe
            Log.i("定位信息--------", bdLocation.city)

            City = bdLocation.city
            Log.i("tag:","123")
            mLocationClient!!.stop()

//            Handler().postDelayed(Runnable {
//                val i = Intent(this@SplashActivity, MainActivity::class.java)
//                i.putExtra("city", City)
//                startActivity(i)
//                finish()
//            }, 2000)


        }
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        PermissionsUtils.getInstance().onRequestPermissionsResult(this, requestCode, permissions, grantResults)
    }



}
