package com.example.dotainstall

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun DotaLogo(
    imageResId: Int,
    size: Dp,
    primaryBorderSize: Dp,
    primaryBorderColor: Color,
    cornerRadiusprimary: Dp,
    secondaryBorderSize: Dp,
    secondaryBorderColor: Color,
    cornerRadiussecondary: Dp,
    x: Dp,
    y: Dp
) {
    Image(
        painter = painterResource(imageResId),
        contentDescription = null,
        modifier = Modifier
            .offset(x = x, y = y)
            .size(size)
            .clip(RoundedCornerShape(cornerRadiusprimary - primaryBorderSize))
            .background(color = primaryBorderColor)
            .padding(primaryBorderSize)
            .clip(RoundedCornerShape(cornerRadiussecondary - secondaryBorderSize))
            .background(color = secondaryBorderColor)
            .padding(secondaryBorderSize)
    )
}


@Preview
@Composable
fun DotaLogoPreview() {
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