package com.example.test.ui.theme.profilescreen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.test.Triodion
import com.example.test.ui.theme.CustomColors

@Composable
fun ThemeCounter(
    content: @Composable () -> Unit
) {
    val colors = MaterialTheme.colorScheme
    val typography = MaterialTheme.typography
    val shapes = MaterialTheme.shapes

    MaterialTheme(
        colorScheme = colors.copy(
            primary = CustomColors.customRed,
            onPrimary = CustomColors.customWhiteText,
            background = CustomColors.customDarkBackground,
            surface = CustomColors.customDarkBackground,
            onSurface = CustomColors.customWhiteText
        ),

        typography = typography.copy(
            bodyLarge = typography.bodyLarge.copy(
                fontFamily = Triodion,
                color = CustomColors.customWhiteText,
                fontSize = 24.sp,
                lineHeight = 24.sp
            ),

            titleLarge = typography.titleLarge.copy(
                fontFamily = Triodion,
                color = CustomColors.customWhiteText,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            ),

            labelMedium = typography.labelMedium.copy(
                fontFamily = Triodion,
                color = CustomColors.customWhiteText,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                letterSpacing = 0.sp
            ),

            labelLarge = typography.labelLarge.copy(
                fontFamily = Triodion,
                color = CustomColors.customWhiteText,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                letterSpacing = 0.sp
            )
        ),

        shapes = shapes.copy(
            medium = RoundedCornerShape(16.dp),
            large = RoundedCornerShape(24.dp)
        )
    )
    {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background,
            contentColor = MaterialTheme.colorScheme.onSurface
        ) {
            content()
        }
    }
}