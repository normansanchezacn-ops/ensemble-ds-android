package com.accenture.ensemble_designsytem.atoms.text.model

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight

@Composable
fun EnsembleTextAttributes.resolveTextStyle(): FontStyle =
    if (isItalic) FontStyle.Italic else FontStyle.Normal

@Composable
fun resolveWeight(isBold: Boolean, textType: EnsembleTextType): FontWeight {
    return if (isBold) {
        when (textType) {
            EnsembleTextType.DISPLAY -> FontWeight.Bold
            EnsembleTextType.TITLE -> FontWeight.Bold
            EnsembleTextType.TITLE_MEDIUM -> FontWeight.Bold
            EnsembleTextType.TITLE_SMALL -> FontWeight.Bold
            EnsembleTextType.BODY -> FontWeight.Bold
            EnsembleTextType.BODY_MEDIUM -> FontWeight.Bold
            EnsembleTextType.BODY_SMALL -> FontWeight.Bold
            EnsembleTextType.LABEL -> FontWeight.Bold
            EnsembleTextType.LABEL_MEDIUM -> FontWeight.Bold
            EnsembleTextType.LABEL_SMALL -> FontWeight.Bold
            EnsembleTextType.CAPTION -> FontWeight.Bold
        }
    } else {
        FontWeight.Normal
    }
}

@Composable
fun resolveTextStyle(textType: EnsembleTextType): TextStyle {
    val style = when (textType) {
        EnsembleTextType.DISPLAY -> MaterialTheme.typography.displayMedium
        EnsembleTextType.TITLE -> MaterialTheme.typography.titleLarge
        EnsembleTextType.TITLE_MEDIUM -> MaterialTheme.typography.titleMedium
        EnsembleTextType.TITLE_SMALL -> MaterialTheme.typography.titleSmall
        EnsembleTextType.BODY -> MaterialTheme.typography.bodyLarge
        EnsembleTextType.BODY_MEDIUM -> MaterialTheme.typography.bodyMedium
        EnsembleTextType.BODY_SMALL -> MaterialTheme.typography.bodySmall
        EnsembleTextType.LABEL -> MaterialTheme.typography.labelLarge
        EnsembleTextType.LABEL_MEDIUM -> MaterialTheme.typography.labelMedium
        EnsembleTextType.LABEL_SMALL -> MaterialTheme.typography.labelSmall
        EnsembleTextType.CAPTION -> MaterialTheme.typography.labelSmall
    }
    return style
}

@Composable
fun resolveTextColor(textType: EnsembleTextType): Color {
    val color = when (textType) {
        EnsembleTextType.DISPLAY, EnsembleTextType.TITLE, EnsembleTextType.TITLE_MEDIUM, EnsembleTextType.TITLE_SMALL -> MaterialTheme.colorScheme.onBackground
        EnsembleTextType.BODY, EnsembleTextType.BODY_MEDIUM, EnsembleTextType.BODY_SMALL -> MaterialTheme.colorScheme.onBackground
        EnsembleTextType.LABEL, EnsembleTextType.LABEL_MEDIUM, EnsembleTextType.LABEL_SMALL -> MaterialTheme.colorScheme.onBackground
        EnsembleTextType.CAPTION -> MaterialTheme.colorScheme.onBackground
    }
    return color
}