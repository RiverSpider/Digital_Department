package com.example.dotainstall

import androidx.compose.foundation.layout.*
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
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.content.res.TypedArrayUtils.getString

@Composable
fun DotaDescription() {
    Column {
        CustomTextWithSkModernistBold(stringResource(id = R.string.description))
    }
}

@Composable
fun CustomTextWithSkModernistBold(text: String) {
    Text(
        text = text,
        color = Color(0xFFA9ADB7),
        fontFamily = FontFamily(Font(R.font.skmodernistbold)),
        fontSize = 13.sp,
        modifier = Modifier.padding(20.dp)
    )
}

@Preview
@Composable
fun DescriptionPreview() {
    DotaDescription()
}