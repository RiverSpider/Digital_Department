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
import com.example.dotainstall.ui.theme.*

@Composable
fun Review() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.padding(start = SpacerSize, end = SpacerSize).fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.ellipse9),
                contentDescription = null,
                modifier = Modifier
                    .size(ReviewerAvatar)
                    .clip(CircleShape)
            )

            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 16.dp)
            ) {
                Text(
                    text = stringResource(id = R.string.reviewername_1),
                    color = TextColor,
                    fontFamily = FontFamily(Font(R.font.skmodernistbold)),
                    fontSize = TextLarge
                )
                Text(
                    text = stringResource(id = R.string.review_date),
                    color = TextColor,
                    fontFamily = FontFamily(Font(R.font.skmodernistbold)),
                    fontSize = TextMedium
                )
            }
        }
        Text(
            text = stringResource(id = R.string.review),
            color = TextColor,
            fontFamily = FontFamily(Font(R.font.skmodernistbold)),
            modifier = Modifier.padding(start = SpacerSize, top = 10.dp, end = SpacerSize)
        )

        Canvas(modifier = Modifier.padding(start = 40.dp, top = SpacerSize, end = 40.dp, bottom = SpacerSize).fillMaxWidth()) {
            drawRect(
                color = LineColor,
                size = Size(size.width, 1.dp.toPx())
            )
        }

        Row(
            modifier = Modifier.padding(start = SpacerSize, end = 20.dp).fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.ellipse10),
                contentDescription = null,
                modifier = Modifier
                    .size(ReviewerAvatar)
                    .clip(CircleShape)
            )

            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 16.dp)
            ) {
                Text(
                    text = stringResource(id = R.string.reviewername_2),
                    color = TextColor,
                    fontFamily = FontFamily(Font(R.font.skmodernistbold)),
                    fontSize = TextLarge
                )
                Text(
                    text = stringResource(id = R.string.review_date),
                    color = TextColor,
                    fontFamily = FontFamily(Font(R.font.skmodernistbold)),
                    fontSize = TextMedium
                )
            }
        }
        Text(
            text = stringResource(id = R.string.review),
            color = TextColor,
            fontFamily = FontFamily(Font(R.font.skmodernistbold)),
            modifier = Modifier.padding(start = SpacerSize, top = 10.dp, end = SpacerSize)
        )
        }
    }


@Preview
@Composable
fun ReviewPreview() {
    Review()
}
