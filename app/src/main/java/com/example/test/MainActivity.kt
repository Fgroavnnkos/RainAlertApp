package com.example.test

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.test.ui.theme.TestTheme

//#1E1E24  #92140C  #FFF8F0   #8F8B8A

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.dark(
                scrim = android.graphics.Color.rgb(30, 30, 36)
            ),
            navigationBarStyle = SystemBarStyle.dark(
                scrim = android.graphics.Color.rgb(30, 30, 36)
            )
        )

        setContent {
            TestTheme {
                App()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CounterPreview() {
    TestTheme {
        App()
    }
}