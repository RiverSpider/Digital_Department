package com.example.dotainstall

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
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
fun DotaName() {
        Column(
            horizontalAlignment = Alignment.Start,
            modifier = Modifier.padding(start = 20.dp, top = 0.dp, end = 20.dp, bottom = 0.dp)
                .background(Color(0xFF050B18), shape = RoundedCornerShape(12.dp))
                .padding(10.dp)
        ) {
            Text(
                text = stringResource(id = R.string.dota_name),
                color = Color(0xFFA9ADB7),
                fontFamily = FontFamily(Font(R.font.skmodernistbold)),
                fontSize = 20.sp,
            )
            Spacer(modifier = Modifier.height(5.dp))
            Row() {
                repeat(5) {
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = null,
                        tint = Color.Yellow,
                        modifier = Modifier.size(13.dp)
                    )
                }
                Spacer(modifier = Modifier.width(3.dp))
                Text(
                    text = stringResource(id = R.string.mil),
                    color = Color.DarkGray,
                    fontFamily = FontFamily(Font(R.font.skmodernistbold)),
                    fontSize = 12.sp
                )
            }

        }
    }

@Preview
@Composable
fun DotaNamePreview() {
    DotaName()
}