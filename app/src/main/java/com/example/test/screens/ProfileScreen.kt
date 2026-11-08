package com.example.test.screens
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.test.ui.theme.CustomColors
import com.example.test.ui.theme.profilescreen.ThemeProfile


@Composable
fun ProfileCard(
    name: String,
    description: String
) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)

        ) {
            Text(
                text = "Мой Профиль",
                style = MaterialTheme.typography.displaySmall
            )
            Surface(
                modifier = Modifier.size(64.dp),
                shape = CircleShape,
                color = CustomColors.customRed
            ) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text="АО",
                        style = MaterialTheme.typography.headlineLarge
                    )
                }
            }

            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color.Transparent
                ),
                border = BorderStroke(
                    width = 2.dp,
                    color = CustomColors.customGrayCounter
                )
            ) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Text(
                        text = name,
                        style = MaterialTheme.typography.headlineSmall
                    )
                    Text(
                        text = description,
                        style = MaterialTheme.typography.bodyLarge
                    )

                }
            }
        }
    }

@Composable
fun ProfileDescription(
    personalDescription: String,
    city: String,
    language: String
){

    val isFollowing = remember {
        mutableStateOf(false)
    }

    Column(
        modifier = Modifier.padding(start = 16.dp, end = 16.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Text(
            text = "О себе",
            style = MaterialTheme.typography.displaySmall
        )

        Text(
            text = personalDescription,
            style = MaterialTheme.typography.bodyLarge
        )

        Card(
            colors = CardDefaults.cardColors(
                containerColor = Color.Transparent
            )
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("Город:")
                    Text(city)
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("Язык программирования: ")
                    Text(language)
                }
            }
        }

        Button(
            onClick = {
                isFollowing.value = !isFollowing.value
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                if (isFollowing.value)
                    "Отписаться"
                else
                    "Подписаться"
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ProfileScreen () {

    ThemeProfile {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(CustomColors.customDarkBackground),

            verticalArrangement = Arrangement.spacedBy(5.dp)
        ) {
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.TopCenter
                ) {
                    ProfileCard(
                        name = "Тест Юзернейм",
                        description = "Изучаю Kotlin и Android"
                    )
                }

                ProfileDescription(
                    personalDescription = "Изучаю разработку Android-приложений, интересуюсь программированием и современными технологиями.",
                    city = "Берлин",
                    language = "Kotlin"
                )
            }
        }
    }