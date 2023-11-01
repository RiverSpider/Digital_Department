package com.example.dotainstall

import android.os.Bundle
import android.text.style.BackgroundColorSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import com.example.dotainstall.ui.theme.BackGround
import com.example.dotainstall.ui.theme.DotaInstallTheme
import com.example.dotainstall.ui.theme.FontFamily

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFF050B18))
            ) {
                DotaHeader()
                DotaDescription()
                val imageList = listOf(
                    R.drawable.preview1,
                    R.drawable.preview2,
                    R.drawable.preview3
                )

                DotaImages(images = imageList,
                    modifier = Modifier.padding(start = 20.dp, top = 0.dp, end = 20.dp, bottom = 0.dp),
                    imageSize = 200.dp
                )
                InstallButton()
                DotaLogo(
                    imageResId = R.drawable.logo,
                    size = 80.dp,
                    primaryBorderSize = 1.dp,
                    primaryBorderColor = androidx.compose.ui.graphics.Color.DarkGray,
                    cornerRadiusprimary = 8.dp,
                    secondaryBorderSize = 10.dp,
                    secondaryBorderColor = androidx.compose.ui.graphics.Color.Black,
                    cornerRadiussecondary = 17.dp,
                    x = 17.dp,
                    y = 275.dp
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF050B18))
    ) {
        DotaHeader()
        DotaDescription()
        val imageList = listOf(
            R.drawable.preview1,
            R.drawable.preview2,
            R.drawable.preview3
        )

        DotaImages(images = imageList,
            modifier = Modifier.padding(start = 20.dp, top = 0.dp, end = 20.dp, bottom = 0.dp),
            imageSize = 200.dp
        )
        InstallButton()
        DotaLogo(
            imageResId = R.drawable.logo,
            size = 80.dp,
            primaryBorderSize = 1.dp,
            primaryBorderColor = androidx.compose.ui.graphics.Color.DarkGray,
            cornerRadiusprimary = 8.dp,
            secondaryBorderSize = 10.dp,
            secondaryBorderColor = androidx.compose.ui.graphics.Color.Black,
            cornerRadiussecondary = 17.dp,
            x = 17.dp,
            y = 275.dp
        )
    }
}