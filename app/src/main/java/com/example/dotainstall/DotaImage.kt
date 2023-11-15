package com.example.dotainstall

import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Shapes
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import com.example.dotainstall.ui.theme.ImageHeight
import com.example.dotainstall.ui.theme.ImageWidth
import com.example.dotainstall.ui.theme.SpacerSize

@Composable
fun DotaImages(
    images: List<Int>,
    modifier: Modifier = Modifier,
) {
    val shapes = Shapes()
    Column {
    LazyRow(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(images) { imageResId ->
            Image(
                painter = painterResource(id = imageResId),
                contentDescription = null,
                modifier = Modifier
                    .width(ImageWidth)
                    .height(ImageHeight)
                    .clip(shapes.large)
                )
            }
        }
    }
}

@Preview
@Composable
fun ImagesRowPreview() {
    val imageList = listOf(
        R.drawable.preview1,
        R.drawable.preview2,
        R.drawable.preview3
    )

    DotaImages(images = imageList,
        modifier = Modifier.padding(SpacerSize),
    )
}

