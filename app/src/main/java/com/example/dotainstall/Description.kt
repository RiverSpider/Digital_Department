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
import com.example.dotainstall.ui.theme.SpacerSize
import com.example.dotainstall.ui.theme.TextColor
import com.example.dotainstall.ui.theme.TextMedium

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
        color = TextColor,
        fontFamily = FontFamily(Font(R.font.skmodernistbold)),
        fontSize = TextMedium,
        modifier = Modifier.padding(SpacerSize)
    )
}

@Preview
@Composable
fun DescriptionPreview() {
    DotaDescription()
}