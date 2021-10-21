package com.silverstudio.portfolio_x

import android.content.Intent
import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Shader
import android.net.Uri
import android.os.Bundle
import android.text.TextPaint
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var facebook: ImageView;
    private lateinit var youtube: ImageView;
    private lateinit var instagram: ImageView;
    private lateinit var linkedin: ImageView;
    private lateinit var discord: ImageView;

    private lateinit var facebook2: ImageView;
    private lateinit var youtube2: ImageView;
    private lateinit var instagram2: ImageView;
    private lateinit var linkedin2: ImageView;
    private lateinit var discord2: ImageView;

    private lateinit var versionText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initComponent()
    }


     private fun initComponent(){

         facebook = findViewById(R.id.facebook)
         youtube = findViewById(R.id.youtube)
         instagram = findViewById(R.id.instagram)
         linkedin = findViewById(R.id.linkedin)
         discord = findViewById(R.id.discord)

         facebook2 = findViewById(R.id.facebook2)
         youtube2 = findViewById(R.id.youtube2)
         instagram2 = findViewById(R.id.instagram2)
         linkedin2 = findViewById(R.id.linkedin2)
         discord2 = findViewById(R.id.discord2)

         versionText = findViewById(R.id.version21)


         val paint: TextPaint = versionText.getPaint()
         val width = paint.measureText("Tianjin, China")

         val shader = LinearGradient(0f, 0f, width, versionText.textSize, intArrayOf(
                 Color.parseColor("#C8CBD0"),
                 Color.parseColor("#FFFFFF"),
                 Color.parseColor("#C8CBD0"),
                 Color.parseColor("#ACADAF"),
                 Color.parseColor("#9D9D9D")
         ), null, Shader.TileMode.REPEAT)
         versionText.paint.shader = shader

//         val textShader: Shader = LinearGradient(
//             0, 0, width, versionText.textSize, intArrayOf(
//                 Color.parseColor("#F97C3C"),
//                 Color.parseColor("#FDB54E"),
//                 Color.parseColor("#64B678"),
//                 Color.parseColor("#478AEA"),
//                 Color.parseColor("#8446CC")
//             ), null, Shader.TileMode.CLAMP
//         )
//         versionText.getPaint().setShader(textShader)


         facebook.setOnClickListener {
             val url = "https://www.facebook.com/versionmeet"
             val i = Intent(Intent.ACTION_VIEW)
             i.data = Uri.parse(url)
             startActivity(i)
         }

         youtube.setOnClickListener {
             val url = "https://www.youtube.com/c/VersionNITTrichy"
             val i = Intent(Intent.ACTION_VIEW)
             i.data = Uri.parse(url)
             startActivity(i)
         }

         instagram.setOnClickListener {
             val url = "https://www.instagram.com/version_nit_trichy/"
             val i = Intent(Intent.ACTION_VIEW)
             i.data = Uri.parse(url)
             startActivity(i)
         }


         linkedin.setOnClickListener {
             val url = "https://www.linkedin.com/company/version-mca-nit-trichy"
             val i = Intent(Intent.ACTION_VIEW)
             i.data = Uri.parse(url)
             startActivity(i)
         }

         discord.setOnClickListener {
             val url = "https://discord.com/invite/dcKbGm8m"
             val i = Intent(Intent.ACTION_VIEW)
             i.data = Uri.parse(url)
             startActivity(i)
         }


         facebook2.setOnClickListener {
             val url = "https://www.facebook.com/versionmeet"
             val i = Intent(Intent.ACTION_VIEW)
             i.data = Uri.parse(url)
             startActivity(i)
         }

         youtube2.setOnClickListener {
             val url = "https://www.youtube.com/c/VersionNITTrichy"
             val i = Intent(Intent.ACTION_VIEW)
             i.data = Uri.parse(url)
             startActivity(i)
         }

         instagram2.setOnClickListener {
             val url = "https://www.instagram.com/version_nit_trichy/"
             val i = Intent(Intent.ACTION_VIEW)
             i.data = Uri.parse(url)
             startActivity(i)
         }


         linkedin2.setOnClickListener {
             val url = "https://www.linkedin.com/company/version-mca-nit-trichy"
             val i = Intent(Intent.ACTION_VIEW)
             i.data = Uri.parse(url)
             startActivity(i)
         }

         discord2.setOnClickListener {
             val url = "https://discord.com/invite/dcKbGm8m"
             val i = Intent(Intent.ACTION_VIEW)
             i.data = Uri.parse(url)
             startActivity(i)
         }



     }
}