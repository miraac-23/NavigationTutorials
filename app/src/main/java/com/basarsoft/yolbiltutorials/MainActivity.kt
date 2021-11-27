package com.basarsoft.yolbiltutorials

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.basarsoft.yolbil.datasources.HTTPTileDataSource
import com.basarsoft.yolbil.datasources.TileDataSource
import com.basarsoft.yolbil.datasources.components.TileData
import com.basarsoft.yolbil.layers.VectorTileLayer
import com.basarsoft.yolbil.layers.VectorTileLayerModuleJNI
import com.basarsoft.yolbil.styles.VectorTileCSSStyleSet
import com.basarsoft.yolbil.ui.BaseMapView
import com.basarsoft.yolbil.ui.MapView
import com.basarsoft.yolbil.vectortiles.MBVectorTileDecoder
import com.basarsoft.yolbil.vectortiles.VectorTileDecoder


class MainActivity : AppCompatActivity() {



    val LICENSE = "YOUR_LICENSE_KEY"

    var mapView: MapView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // MapView.registerLicense("",this)

        mapView = findViewById(R.id.mapView) as MapView



        val layer = VectorTileLayer(
            HTTPTileDataSource(18, 18, "https://mt0.google.com/vt/lyrs=m&hl=tr&scale=4&apistyle=s.t%3A2%7Cs.e%3Al%7Cp.v%3Aoff&x=%7Bx%7D&y=%7By%7D&z=%7Bzoom%7D"),
            MBVectorTileDecoder(VectorTileCSSStyleSet(""))
            )

        mapView?.layers?.add(layer)


    }
}