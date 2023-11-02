package com.example.dotainstall

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Rating() {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                modifier = Modifier.padding(start = 20.dp, top = 0.dp, end = 20.dp, bottom = 0.dp),
                text = stringResource(id = R.string.reviews_and_rating),
                color = Color(0xFFA9ADB7),
                fontFamily = FontFamily(Font(R.font.skmodernistbold)),
                fontSize = 16.sp
            )

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    modifier = Modifier.padding(start = 20.dp, top = 0.dp, end = 20.dp, bottom = 0.dp),
                    text = stringResource(id = R.string.rating),
                    color = Color(0xFFA9ADB7),
                    fontFamily = FontFamily(Font(R.font.skmodernistbold)),
                    fontSize = 48.sp
                )

                Spacer(modifier = Modifier.width(8.dp))
                Column() {
                    Row() {
                        repeat(5) {
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = null,
                                tint = Color.Yellow,
                                modifier = Modifier.size(13.dp)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = stringResource(id = R.string.reviews),
                        color = Color(0xFFA8ADB7),
                        fontFamily = FontFamily(Font(R.font.skmodernistbold)),
                        fontSize = 13.sp
                    )
                }

            }


        }
    }
}

@Preview
@Composable
fun RatingPreview() {
    Rating()
}