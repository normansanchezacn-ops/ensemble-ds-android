package com.accenture.ensemble_designsytem.atoms.text

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.accenture.ensemble_designsytem.theme.EnsembleTheme
import com.accenture.ensemble_designsytem.atoms.text.model.EnsembleTextAttributes
import com.accenture.ensemble_designsytem.atoms.text.model.EnsembleTextType
import com.accenture.ensemble_designsytem.atoms.text.model.resolveTextColor
import com.accenture.ensemble_designsytem.atoms.text.model.resolveTextStyle
import com.accenture.ensemble_designsytem.atoms.text.model.resolveWeight
import com.accenture.ensemble_designsytem.atoms.background.EnsembleBackground


/**
 * [EnsembleText] is a composable component that displays text with various styles and attributes based on the provided [EnsembleTextAttributes].
 * It allows for customization of text appearance, including font style, weight, color, and line limits, making it a versatile component for displaying text in different contexts within the Ensemble design system.
 *
 * @param modifier The [Modifier] to be applied to the text component, allowing for layout and styling adjustments.
 * @param text The string content to be displayed by the text component.
 * @param attributes An instance of [EnsembleTextAttributes] that defines the styling and appearance of the text, including text type, boldness, italics, and line limits.
 *
 * Example usage:
 * ```
 * EnsembleText(
 *     text = "Hello, World!",
 *     modifier = Modifier.padding(16.dp),
 *     attributes = EnsembleTextAttributes(
 *         textType = EnsembleTextType.BODY,
 *         isBold = true,
 *         isItalic = false,
 *         maxLines = 2,
 *         minLines = 1
 *     )
 * )
 * ```
 *
 * @see EnsembleTextAttributes
 * @see EnsembleTextType
 * @see resolveTextStyle
 * @see resolveTextColor
 * @see resolveWeight
 *
 * @author Accenture
 * @since 1.0.0
 */
@Composable
fun EnsembleText(
    modifier: Modifier,
    text: String,
    attributes: EnsembleTextAttributes
) {
    with(attributes) {
        val style = resolveTextStyle(textType)
        val color = resolveTextColor(textType)
        Text(
            text = text,
            color = color,
            style = style,
            fontWeight = resolveWeight(isBold, textType),
            fontStyle = resolveTextStyle(),
            maxLines = maxLines ?: Int.MAX_VALUE,
            minLines = minLines ?: 1,
            modifier = modifier
        )
    }
}

/**
 * Preview function for [EnsembleText] showcasing different text types and styles in a dark theme. It demonstrates the usage of [EnsembleText] with various [EnsembleTextType] values, allowing developers to visualize how the text will appear in different contexts within the Ensemble design system.
 * The preview is wrapped in an [EnsembleTheme] and uses an EnsembleBackground to provide a consistent background for the text display.
 * This function is intended for development and testing purposes, enabling developers to see the effects of different text attributes and styles in a preview environment.
 *
 * @see EnsembleText
 * @see EnsembleTextType
 * @see EnsembleTextAttributes
 * @see EnsembleTheme
 *
 * @author Accenture
 */
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun EnsembleTextPreview() {
    EnsembleTheme {
        EnsembleBackground {
            val textTypes = EnsembleTextType.entries
            Column {
                EnsembleText(
                    text = "Ensemble text show case",
                    modifier = Modifier.padding(16.dp),
                    attributes = EnsembleTextAttributes(
                        textType = EnsembleTextType.DISPLAY,
                        isBold = true
                    )
                )
                LazyColumn(modifier = Modifier.fillMaxSize().padding(16.dp)) {
                    items(textTypes) { type ->
                        EnsembleText(
                            text = "Text Type: ${textTypes[type.ordinal]}",
                            modifier = Modifier.padding(8.dp),
                            attributes = EnsembleTextAttributes(textType = type)
                        )
                    }
                }
            }
        }
    }
}