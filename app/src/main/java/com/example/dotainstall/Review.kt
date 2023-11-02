package com.example.dotainstall

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Review() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.padding(start = 20.dp, top = 0.dp, end = 20.dp, bottom = 0.dp).fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.ellipse9),
                contentDescription = null,
                modifier = Modifier
                    .size(32.dp)
                    .clip(CircleShape)
            )

            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 16.dp)
            ) {
                Text(
                    text = stringResource(id = R.string.reviewername_1),
                    color = Color(0xFFA9ADB7),
                    fontFamily = FontFamily(Font(R.font.skmodernistbold)),
                    fontSize = 16.sp
                )
                Text(
                    text = stringResource(id = R.string.review_date),
                    color = Color(0xFFA8ADB7),
                    fontFamily = FontFamily(Font(R.font.skmodernistbold)),
                    fontSize = 12.sp
                )
            }
        }
        Text(
            text = stringResource(id = R.string.review),
            color = Color(0xFFA9ADB7),
            fontFamily = FontFamily(Font(R.font.skmodernistbold)),
            modifier = Modifier.padding(start = 20.dp, top = 10.dp, end = 20.dp, bottom = 0.dp)
        )

        // Горизонтальная полоска после второго блока
        Canvas(modifier = Modifier.padding(start = 40.dp, top = 20.dp, end = 40.dp, bottom = 20.dp).fillMaxWidth()) {
            drawRect(
                color = Color(0xFF1A1F29),
                size = Size(size.width, 1.dp.toPx())
            )
        }

        Row(
            modifier = Modifier.padding(start = 20.dp, top = 0.dp, end = 20.dp, bottom = 0.dp).fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.ellipse10),
                contentDescription = null,
                modifier = Modifier
                    .size(32.dp)
                    .clip(CircleShape)
            )

            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 16.dp)
            ) {
                Text(
                    text = stringResource(id = R.string.reviewername_2),
                    color = Color(0xFFA9ADB7),
                    fontFamily = FontFamily(Font(R.font.skmodernistbold)),
                    fontSize = 16.sp
                )
                Text(
                    text = stringResource(id = R.string.review_date),
                    color = Color(0xFFA8ADB7),
                    fontFamily = FontFamily(Font(R.font.skmodernistbold)),
                    fontSize = 12.sp
                )
            }
        }
        Text(
            text = stringResource(id = R.string.review),
            color = Color(0xFFA9ADB7),
            fontFamily = FontFamily(Font(R.font.skmodernistbold)),
            modifier = Modifier.padding(start = 20.dp, top = 10.dp, end = 20.dp, bottom = 0.dp)
        )
        }
    }


@Preview
@Composable
fun ReviewPreview() {
    Review()
}
