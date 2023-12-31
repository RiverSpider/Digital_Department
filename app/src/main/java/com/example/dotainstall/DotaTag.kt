package com.example.dotainstall

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Shapes
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dotainstall.ui.theme.*

@Composable
fun DotaTags() {
    val text = stringResource(id = R.string.tags)
    val shapes = Shapes()

    LazyRow(
        modifier = Modifier.padding(start = SpacerSize, end = SpacerSize)
    ) {
        item {
            Row {
                text.split(" ").forEach { word ->
                    Box(
                        modifier = Modifier.padding(5.dp)
                    ) {
                        Text(
                            text = word,
                            color = TagTextColor,
                            fontFamily = FontFamily(Font(R.font.montserrat)),
                            fontSize = TextMedium,
                            modifier = Modifier
                                .background(TagBackGround, shape = shapes.medium)
                                .padding(start = 10.dp, top = 5.dp, end = 10.dp, bottom = 5.dp)
                        )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun DotaTagsPreview() {
    DotaTags()
}