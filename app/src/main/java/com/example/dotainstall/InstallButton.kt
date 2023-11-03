package com.example.dotainstall

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dotainstall.ui.theme.*
import kotlinx.coroutines.launch

@Composable
fun InstallButton() {
    val shapes = Shapes()

    val scaffoldState = rememberScaffoldState()
    val installtext = stringResource(id = R.string.install)
    val reinstalltext = stringResource(id = R.string.sad)
    var buttonText by remember { mutableStateOf(installtext) }

    val coroutineScope = rememberCoroutineScope()

    val showSnackbar: () -> Unit = {
        buttonText = reinstalltext
        coroutineScope.launch {
            scaffoldState.snackbarHostState.showSnackbar(reinstalltext)
        }
    }
    Column(modifier = Modifier.padding(SpacerSize)) {
        Button(
            onClick = { showSnackbar() },
            modifier = Modifier
                .fillMaxWidth()
                .height(ButtonHeight),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = ButtonColor,
                contentColor = ButtonTextColor
            ),
            shape = shapes.small
        ) {
            Text(
                text = buttonText,
                fontFamily = FontFamily(Font(R.font.skmodernistbold)),
                fontSize = TextLarge
            )
        }
    }
}

@Preview
@Composable
fun InstallButtonPreview() {
    InstallButton()
}