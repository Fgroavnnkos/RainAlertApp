package com.example.test.ui.theme.profilescreen

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.test.Triodion
import com.example.test.ui.theme.CustomColors

@Composable
fun ThemeProfile(
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

            displayLarge = typography.displayLarge.copy(
                fontFamily = Triodion,
                color = CustomColors.customWhiteText,
                fontWeight = FontWeight.Bold
            ),

            displayMedium = typography.displayMedium.copy(
                fontFamily = Triodion,
                color = CustomColors.customWhiteText,
                fontWeight = FontWeight.Bold
            ),

            displaySmall = typography.displaySmall.copy(
                fontFamily = Triodion,
                color = CustomColors.customWhiteText,
                fontWeight = FontWeight.Bold
            ),

            headlineLarge = typography.headlineLarge.copy(
                fontFamily = Triodion,
                color = CustomColors.customWhiteText,
            ),

            headlineMedium = typography.headlineMedium.copy(
                fontFamily = Triodion,
                color = CustomColors.customWhiteText,
            ),

            headlineSmall = typography.headlineSmall.copy(
                fontFamily = Triodion,
                color = CustomColors.customWhiteText,
            ),

            titleLarge = typography.titleLarge.copy(
                fontFamily = Triodion,
                color = CustomColors.customWhiteText,
            ),

            titleMedium = typography.titleMedium.copy(
                fontFamily = Triodion,
                color = CustomColors.customWhiteText,
            ),

            titleSmall = typography.titleSmall.copy(
                fontFamily = Triodion,
                color = CustomColors.customWhiteText,
            ),

            bodyLarge = typography.bodyLarge.copy(
                fontFamily = Triodion,
                color = CustomColors.customWhiteText,
            ),

            bodyMedium = typography.bodyMedium.copy(
                fontFamily = Triodion,
                color = CustomColors.customWhiteText,
            ),

            bodySmall = typography.bodySmall.copy(
                fontFamily = Triodion,
                color = CustomColors.customWhiteText,
            ),

            labelLarge = typography.labelLarge.copy(
                fontFamily = Triodion,
                color = CustomColors.customWhiteText,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
            ),

            labelMedium = typography.labelMedium.copy(
                fontFamily = Triodion,
                color = CustomColors.customWhiteText,
                fontWeight = FontWeight.Bold,
                letterSpacing = 0.sp
            ),

            labelSmall = typography.labelSmall.copy(
                fontFamily = Triodion,
                color = CustomColors.customWhiteText,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
            )


        ),

        shapes = shapes.copy(
            medium = RoundedCornerShape(16.dp),
            large = RoundedCornerShape(24.dp)
        ),

        content = content
    )
}