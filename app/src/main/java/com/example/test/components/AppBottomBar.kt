package com.example.test.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.test.Triodion
import com.example.test.ui.theme.CustomColors
import com.example.test.ui.theme.navTypography
import kotlinx.coroutines.launch

@Composable
fun AppBottomBar(
    selectedPage: Int,
    onPageSelected: (Int) -> Unit
) {
    MaterialTheme(
        typography = navTypography
    ) {
        NavigationBar(
            modifier = Modifier.height(108.dp),
            containerColor = CustomColors.customDarkBackground

        ) {
            NavigationBarItem(
                modifier = Modifier.weight(2f)
                    .padding(5.dp)
                    .border(
                        width = if (selectedPage == 0) 2.dp else 0.dp,
                        color = CustomColors.customWhiteText,
                        shape = RoundedCornerShape(10.dp)
                    ),
                selected = selectedPage == 0,
                onClick = {
                    onPageSelected(0)
                },
                icon = {
                    Icon(
                        Icons.Default.Home,
                        contentDescription = "Счётчик",
                        modifier = Modifier.offset(y = (6).dp),
                        tint = CustomColors.customRed
                    )
                },
                label = {
                    Text(
                        text = "Счётчик",
                        modifier = Modifier.offset(y = (-6).dp)
                    )
                },
                colors = NavigationBarItemDefaults.colors(
                    indicatorColor = Color.Transparent
                ),
            )

            NavigationBarItem(

                modifier = Modifier.weight(1f)
                    .padding(5.dp)
                    .border(
                        width = if (selectedPage == 1) 2.dp else 0.dp,
                        color = CustomColors.customWhiteText,
                        shape = RoundedCornerShape(10.dp)
                    ),
                selected = selectedPage == 1,
                onClick = {
                    onPageSelected(1)
                },
                icon = {
                    Icon(
                        Icons.Default.Person,
                        contentDescription = "Профиль",
                        modifier = Modifier.offset(y = (6).dp),
                        tint = CustomColors.customRed
                    )
                },
                label = {
                    Text(
                        text = "Профиль",
                        modifier = Modifier.offset(y = (-6).dp)
                    )
                },
                colors = NavigationBarItemDefaults.colors(
                    indicatorColor = Color.Transparent
                ),
            )
        }
    }
}