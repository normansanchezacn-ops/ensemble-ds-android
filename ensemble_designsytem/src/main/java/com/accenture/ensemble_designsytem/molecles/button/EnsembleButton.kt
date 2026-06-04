package com.accenture.ensemble_designsytem.molecles.button

import android.content.res.Configuration
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.accenture.ensemble_designsytem.R
import com.accenture.ensemble_designsytem.atoms.background.EnsembleBackground
import com.accenture.ensemble_designsytem.atoms.text.EnsembleText
import com.accenture.ensemble_designsytem.molecles.button.model.EnsembleButtonAttributes
import com.accenture.ensemble_designsytem.molecles.button.model.EnsembleButtonType
import com.accenture.ensemble_designsytem.theme.EnsembleTheme

@Composable
fun EnsembleButton(
    modifier: Modifier = Modifier,
    buttonAttributes: EnsembleButtonAttributes, onClick: () -> Unit
) {
    val content = ensembleButtonContent(buttonAttributes)
    with(buttonAttributes) {
        Button(
            onClick = onClick,
            modifier = modifier,
            enabled = isEnabled,
            elevation = resolveButtonElevation(),
            shape = resolveShapeButton(buttonType),
            content = content
        )
    }
}

@Composable
fun resolveShapeButton(buttonType: EnsembleButtonType): androidx.compose.ui.graphics.Shape = when (buttonType) {
    EnsembleButtonType.FILLED -> ButtonDefaults.filledTonalShape
    EnsembleButtonType.OUTLINED -> ButtonDefaults.outlinedShape
    else -> ButtonDefaults.textShape
}

@Composable
private fun resolveButtonElevation() = ButtonDefaults.buttonElevation(
    defaultElevation = 2.dp,
    hoveredElevation = 4.dp,
    pressedElevation = 8.dp,
    focusedElevation = 4.dp
)

@Composable
private fun ensembleButtonContent(buttonAttributes: EnsembleButtonAttributes): @Composable RowScope.() -> Unit {
    return {
        buttonAttributes.leadingIcon?.let { icon ->
            Icon(imageVector = icon, contentDescription = null)
        }
        EnsembleText(
            text = buttonAttributes.text,
            modifier = buttonAttributes.buttonTextModifier,
            attributes = buttonAttributes.buttonTextAttributes
        )
        buttonAttributes.trailingIcon?.let { icon ->
            Icon(imageVector = icon, contentDescription = null)
        }
    }
}

@Composable
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
fun EnsembleButtonPreview() {
    EnsembleTheme {
        EnsembleBackground {
            val buttonFilled = EnsembleButtonAttributes(
                isEnabled = true,
                text = "Button",
                buttonType = EnsembleButtonType.FILLED,
            )
            val buttonOutline = EnsembleButtonAttributes(
                isEnabled = true,
                text = "Button",
                buttonType = EnsembleButtonType.OUTLINED
            )
            val buttonText = EnsembleButtonAttributes(
                isEnabled = true,
                text = "Button",
                buttonType = EnsembleButtonType.TEXT
            )
            val buttons = listOf(buttonFilled, buttonOutline, buttonText)

            LazyColumn {
                items(buttons.size) { button ->
                    EnsembleButton(
                        modifier = Modifier.fillMaxWidth().padding(16.dp),
                        buttonAttributes = buttons[button],
                        onClick = { /*TODO*/ }
                    )
                }
            }
        }
    }
}