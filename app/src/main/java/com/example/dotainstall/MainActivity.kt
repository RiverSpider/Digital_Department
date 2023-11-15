package com.example.dotainstall

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import com.example.dotainstall.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            ScrollableScreen()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ScrollableScreen()
}


@Composable
fun ScrollableScreen() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(color = BackGroundColor)
    ) {
        items(1) {
            Column {

                DotaHeader()

                Row {

                    DotaLogo(
                        imageResId = R.drawable.logo,
                        size = LogoSize,
                        primaryBorderSize = 1.dp,
                        primaryBorderColor = androidx.compose.ui.graphics.Color.DarkGray,
                        cornerRadiusprimary = 8.dp,
                        secondaryBorderSize = 10.dp,
                        secondaryBorderColor = androidx.compose.ui.graphics.Color.Black,
                        cornerRadiussecondary = 17.dp,
                        x = SpacerSize,
                        y = (-30).dp
                    )

                    DotaName()

                }

                DotaTags()

                DotaDescription()
                val imageList = listOf(
                    R.drawable.preview1,
                    R.drawable.preview2,
                    R.drawable.preview3
                )

                DotaImages(
                    images = imageList,
                    modifier = Modifier.padding(SpacerSize),
                )

                Rating()
                Spacer(modifier = Modifier.height(SpacerSize))
                Review()

                InstallButton()
                Spacer(modifier = Modifier.height(40.dp))
            }
        }
    }
}
