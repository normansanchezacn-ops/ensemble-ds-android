package com.accenture.ensemble_designsytem.atoms.imagevector

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import com.accenture.ensemble_designsytem.atoms.imagevector.model.EnsembleImageVectorAttributes


@Composable
fun ensembleImageVector(imageAttributes: EnsembleImageVectorAttributes): ImageVector {
    with(imageAttributes) {
        return ImageVector.vectorResource(imageResource)
    }
}