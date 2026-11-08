package com.example.test.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.test.ui.theme.profilescreen.ThemeCounter
@Preview(showBackground = true)
@Composable
fun Counter () {
    ThemeCounter {
        val count = remember { mutableIntStateOf(0) }
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center,

        ) {
            Column (
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(
                    text = "${count.intValue}",
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
                Button(
                    onClick = {
                        count.intValue++
                    },
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                ) {
                    Text("*push to ++*")
                }
                Button(
                    onClick = {
                        count.intValue += 5
                    },
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                ) {
                    Text("*push to ++5*")
                }
                Button(
                    onClick = {
                        if (count.intValue > 0) count.intValue--
                    },
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                ) {
                    Text("*push to --*")
                }
                Button(
                    onClick = {
                        count.intValue = 0
                    }
                ) {
                    Text("*push to reset*")
                }
                Text(
                    text = when {
                        count.intValue == 0 -> "Zer0"

                        count.intValue > 0 -> "Positive"

                        else -> "Negative"
                    },
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
            }

        }
    }
}