package com.accenture.ensemble_designsytem.molecles.button.model

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import com.accenture.ensemble_designsytem.atoms.text.model.EnsembleTextAttributes
import com.accenture.ensemble_designsytem.atoms.text.model.EnsembleTextType

data class EnsembleButtonAttributes(
    val isEnabled: Boolean = true,
    val buttonType: EnsembleButtonType = EnsembleButtonType.FILLED,
    val buttonSize: EnsembleButtonSize = EnsembleButtonSize.MEDIUM,
    val text: String = "",
    val buttonTextModifier: Modifier = Modifier,
    val buttonTextAttributes: EnsembleTextAttributes = EnsembleTextAttributes(textType = EnsembleTextType.BODY),
    val leadingIcon: ImageVector? = null,
    val trailingIcon: ImageVector? = null
)

