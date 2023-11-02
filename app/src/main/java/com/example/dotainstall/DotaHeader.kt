package com.example.dotainstall

import androidx.annotation.Dimension
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun DotaHeader() {
    Surface() {
        Column {
            StatusBarBackground(imageResId = R.drawable.header)
        }
    }
}

@Composable
fun StatusBarBackground(imageResId: Int) {
    Image(
        painter = painterResource(imageResId),
        contentDescription = null,
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp)
            .padding(top = 0.dp),
        contentScale = ContentScale.Crop,
    )
    Spacer(modifier = Modifier.sizeIn(5.dp))
}

@Preview
@Composable
fun DotaHeaderPreview() {
    DotaHeader()
}


