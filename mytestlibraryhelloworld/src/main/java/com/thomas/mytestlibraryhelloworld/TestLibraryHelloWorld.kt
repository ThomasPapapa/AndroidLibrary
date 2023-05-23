package com.thomas.mytestlibraryhelloworld

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.Text

class TestLibraryHelloWorld {

    fun getHelloWorldText() : String {
        return "Hello World from Library!"
    }

    @Composable
    fun Greeting(text: String, modifier: Modifier = Modifier) {
        Text(
            text = text,
            modifier = modifier
        )
    }
}