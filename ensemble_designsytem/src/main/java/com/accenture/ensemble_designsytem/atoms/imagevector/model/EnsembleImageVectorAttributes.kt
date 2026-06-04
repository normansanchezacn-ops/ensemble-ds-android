package com.accenture.ensemble_designsytem.atoms.imagevector.model

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color

data class EnsembleImageVectorAttributes(
    @param:DrawableRes val imageResource: Int,
    val color: Color
)