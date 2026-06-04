package com.accenture.ensemble_designsytem.atoms.background

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

/**
 * [EnsembleBackground] is a composable component that provides a background for the content it wraps.
 * It takes a [color] parameter that defaults to the background color defined in the current Material theme.
 * The [content] parameter is a composable lambda that represents the content to be displayed on top of the background.
 *
 * @param modifier The [Modifier] to be applied to the background, allowing for layout and styling adjustments.
 * @param color The background color to be applied, defaulting to the background color from the Material theme.
 * @param content A composable lambda that represents the content to be displayed on top of the background.
 *
 * Example usage:
 * ```
 * EnsembleBackground {
 *     // Your content here
 * }
 * ```
 *
 * @author Accenture
 * @since 1.0.0
 */
@Composable
fun EnsembleBackground(
    modifier: Modifier = Modifier,
    color: Color = MaterialTheme.colorScheme.background,
    content: @Composable () -> Unit
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color)
    ) {
        content()
    }
}