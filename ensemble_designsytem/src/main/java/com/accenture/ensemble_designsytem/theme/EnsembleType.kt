package com.accenture.ensemble_designsytem.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

val EnsembleMaterialTypography = Typography(
    displayLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = EnsembleTypography.Android.DisplayLarge,
        fontSize = 57.sp,
        lineHeight = 64.sp,
        letterSpacing = (-0.25).sp
    ),
    displayMedium = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = EnsembleTypography.Android.DisplayMedium,
        fontSize = 45.sp,
        lineHeight = 52.sp,
        letterSpacing = 0.sp
    ),
    displaySmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = EnsembleTypography.Android.DisplaySmall,
        fontSize = 36.sp,
        lineHeight = 44.sp,
        letterSpacing = 0.sp
    ),

    headlineLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = EnsembleTypography.Android.HeadlineLarge,
        fontSize = 32.sp,
        lineHeight = 40.sp,
        letterSpacing = 0.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = EnsembleTypography.Android.HeadlineMedium,
        fontSize = 28.sp,
        lineHeight = 36.sp,
        letterSpacing = 0.sp
    ),
    headlineSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = EnsembleTypography.Android.HeadlineSmall,
        fontSize = 24.sp,
        lineHeight = 32.sp,
        letterSpacing = 0.sp
    ),

    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = EnsembleTypography.Android.TitleLarge,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    titleMedium = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = EnsembleTypography.Android.TitleMedium,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.15.sp
    ),
    titleSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = EnsembleTypography.Android.TitleSmall,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.1.sp
    ),

    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = EnsembleTypography.Android.BodyLarge,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = EnsembleTypography.Android.BodyMedium,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.25.sp
    ),
    bodySmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = EnsembleTypography.Android.BodySmall,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.4.sp
    ),

    labelLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = EnsembleTypography.Android.LabelLarge,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.1.sp
    ),
    labelMedium = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = EnsembleTypography.Android.LabelMedium,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = EnsembleTypography.Android.LabelSmall,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
)

object EnsembleTypography {
    object Android {
        val BodyLarge = FontWeight.Normal
        val BodyMedium = FontWeight.Normal
        val BodySmall = FontWeight.Normal

        val DisplayLarge = FontWeight.Normal
        val DisplayMedium = FontWeight.Normal
        val DisplaySmall = FontWeight.Normal

        val HeadlineLarge = FontWeight.Normal
        val HeadlineMedium = FontWeight.Normal
        val HeadlineSmall = FontWeight.Normal

        val LabelLarge = FontWeight.Medium
        val LabelMedium = FontWeight.Medium
        val LabelSmall = FontWeight.Normal

        val TitleLarge = FontWeight.Normal
        val TitleMedium = FontWeight.Medium
        val TitleSmall = FontWeight.Medium
    }
}