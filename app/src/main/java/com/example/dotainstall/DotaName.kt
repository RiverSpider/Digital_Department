package com.example.dotainstall

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Shapes
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
fun DotaName() {
    val shapes = Shapes()
        Column(
            horizontalAlignment = Alignment.Start,
            modifier = Modifier.padding(start = SpacerSize, end = SpacerSize)
                .background(BackGroundColor, shapes.medium)
                .padding(10.dp)
        ) {
            Text(
                text = stringResource(id = R.string.dota_name),
                color = TextColor,
                fontFamily = FontFamily(Font(R.font.skmodernistbold)),
                fontSize = TextHuge,
            )
            Spacer(modifier = Modifier.height(5.dp))
            Row() {
                repeat(5) {
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = null,
                        tint = Color.Yellow,
                        modifier = Modifier.size(StarSize)
                    )
                }
                Spacer(modifier = Modifier.width(3.dp))
                Text(
                    text = stringResource(id = R.string.mil),
                    color = Color.DarkGray,
                    fontFamily = FontFamily(Font(R.font.skmodernistbold)),
                    fontSize = TextMedium
                )
            }

        }
    }

@Preview
@Composable
fun DotaNamePreview() {
    DotaName()
}