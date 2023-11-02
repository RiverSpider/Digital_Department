package com.example.dotainstall

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch

@Composable
fun InstallButton() {
    val scaffoldState = rememberScaffoldState()
    var buttonText by remember { mutableStateOf("Install") } // stringResource(id = R.string.install) Composable calls are not allowed inside the calculation parameter of inline fun <T> remember(calculation: () -> TypeVariable(T)): TypeVariable(T)

    val coroutineScope = rememberCoroutineScope()

    val showSnackbar: () -> Unit = {
        buttonText = ":^("
        coroutineScope.launch {
            scaffoldState.snackbarHostState.showSnackbar(":^(")
        }
    }
    Column(modifier = Modifier.padding(start = 20.dp, top = 0.dp, end = 20.dp, bottom = 60.dp)) {
        Button(
            onClick = { showSnackbar() },
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color(0xFFF4D144),
                contentColor = Color(0xFF050B18)
            ),
            shape = RoundedCornerShape(8.dp)
        ) {
            Text(
                text = buttonText,
                fontFamily = FontFamily(Font(R.font.skmodernistbold)),
                fontSize = 16.sp
            )
        }
    }
}

@Preview
@Composable
fun InstallButtonPreview() {
    InstallButton()
}