package com.accenture.ensemble_designsytem.atoms.text.model

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle

public data class EnsembleTextAttributes(
    val textType: EnsembleTextType,
    val color: Color? = null,
    val style: TextStyle? = null,
    val maxLines: Int? = null,
    val minLines: Int? = null,
    val isBold: Boolean = false,
    val isItalic: Boolean = false
)