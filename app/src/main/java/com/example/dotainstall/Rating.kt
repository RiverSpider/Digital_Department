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
import com.example.dotainstall.ui.theme.*

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
                color = TextColor,
                fontFamily = FontFamily(Font(R.font.skmodernistbold)),
                fontSize = TextLarge
            )

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    modifier = Modifier.padding(start = 20.dp, top = 0.dp, end = 20.dp, bottom = 0.dp),
                    text = stringResource(id = R.string.rating),
                    color = TextColor,
                    fontFamily = FontFamily(Font(R.font.skmodernistbold)),
                    fontSize = TextMassive
                )

                Spacer(modifier = Modifier.width(8.dp))
                Column() {
                    Row() {
                        repeat(5) {
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = null,
                                tint = Color.Yellow,
                                modifier = Modifier.size(StarSize)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = stringResource(id = R.string.reviews),
                        color = TextColor,
                        fontFamily = FontFamily(Font(R.font.skmodernistbold)),
                        fontSize = TextMedium
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