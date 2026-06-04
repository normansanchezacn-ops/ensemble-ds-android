package com.accenture.ensemble_designsytem.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

val LightColorScheme = lightColorScheme(
    primary = EnsembleColor.BlueFamily.ColorBlue600,
    onPrimary = EnsembleColor.Text.ColorTextInverted,
    primaryContainer = EnsembleColor.BlueFamily.ColorBlue100,
    onPrimaryContainer = EnsembleColor.BlueFamily.ColorBlue900,

    secondary = EnsembleColor.PurpleFamily.ColorPurple600,
    onSecondary = EnsembleColor.Text.ColorTextInverted,
    secondaryContainer = EnsembleColor.PurpleFamily.ColorPurple100,
    onSecondaryContainer = EnsembleColor.PurpleFamily.ColorPurple900,

    tertiary = EnsembleColor.OrangeFamily.ColorOrange500,
    onTertiary = EnsembleColor.Text.ColorTextPrimary,
    tertiaryContainer = EnsembleColor.OrangeFamily.ColorOrange100,
    onTertiaryContainer = EnsembleColor.OrangeFamily.ColorOrange900,

    error = EnsembleColor.Alerts.ColorHigh,
    onError = EnsembleColor.Text.ColorTextInverted,
    errorContainer = EnsembleColor.RedFamily.ColorRed100,
    onErrorContainer = EnsembleColor.RedFamily.ColorRed900,

    background = EnsembleColor.Surfaces.ColorSurfacesPrimary,
    onBackground = EnsembleColor.Text.ColorTextPrimary,

    surface = EnsembleColor.Surfaces.ColorSurfacesPrimary,
    onSurface = EnsembleColor.Text.ColorTextPrimary,

    surfaceVariant = EnsembleColor.Surfaces.ColorSurfacesSecondary,
    onSurfaceVariant = EnsembleColor.Text.ColorTextSecondary,

    outline = EnsembleColor.Borders.ColorBordersSecondary,
    outlineVariant = EnsembleColor.GrayFamily.ColorGray2,

    inverseSurface = EnsembleColor.GrayFamily.ColorGray9,
    inverseOnSurface = EnsembleColor.Text.ColorTextInverted,
    inversePrimary = EnsembleColor.BlueFamily.ColorBlue300,

    surfaceTint = EnsembleColor.BlueFamily.ColorBlue600,
    scrim = Color.Black
)

val DarkColorScheme = darkColorScheme(
    primary = EnsembleColor.BlueFamily.ColorBlue300,
    onPrimary = EnsembleColor.BlueFamily.ColorBlue900,
    primaryContainer = EnsembleColor.BlueFamily.ColorBlue800,
    onPrimaryContainer = EnsembleColor.BlueFamily.ColorBlue50,

    secondary = EnsembleColor.PurpleFamily.ColorPurple300,
    onSecondary = EnsembleColor.PurpleFamily.ColorPurple900,
    secondaryContainer = EnsembleColor.PurpleFamily.ColorPurple800,
    onSecondaryContainer = EnsembleColor.PurpleFamily.ColorPurple50,

    tertiary = EnsembleColor.OrangeFamily.ColorOrange300,
    onTertiary = EnsembleColor.OrangeFamily.ColorOrange900,
    tertiaryContainer = EnsembleColor.OrangeFamily.ColorOrange800,
    onTertiaryContainer = EnsembleColor.OrangeFamily.ColorOrange50,

    error = EnsembleColor.RedFamily.ColorRed400,
    onError = EnsembleColor.RedFamily.ColorRed900,
    errorContainer = EnsembleColor.RedFamily.ColorRed800,
    onErrorContainer = EnsembleColor.RedFamily.ColorRed50,

    background = EnsembleColor.GrayFamily.ColorGray9,
    onBackground = EnsembleColor.Text.ColorTextInverted,

    surface = EnsembleColor.GrayFamily.ColorGray9,
    onSurface = EnsembleColor.Text.ColorTextInverted,

    surfaceVariant = EnsembleColor.GrayFamily.ColorGray8,
    onSurfaceVariant = EnsembleColor.GrayFamily.ColorGray3,

    outline = EnsembleColor.GrayFamily.ColorGray5,
    outlineVariant = EnsembleColor.GrayFamily.ColorGray7,

    inverseSurface = EnsembleColor.Surfaces.ColorSurfacesPrimary,
    inverseOnSurface = EnsembleColor.Text.ColorTextPrimary,
    inversePrimary = EnsembleColor.BlueFamily.ColorBlue600,

    surfaceTint = EnsembleColor.BlueFamily.ColorBlue300,
    scrim = Color.Black
)


object EnsembleColor {

    object Alerts {
        val ColorHigh = Color(0xFFEE4343)
        val ColorInformative = Color(0xFF3479EB)
        val ColorMedium = Color(0xFFE7B008)
        val ColorNeutral = Color(0xFF6B7280)
        val ColorSuccess = Color(0xFF16A249)
    }

    object BaseColors {
        val ColorBaseColor0 = Color(0x00FFFFFF)
        val ColorBaseColor50 = Color(0x0D1A1A1A)
        val ColorBaseColor100 = Color(0x1A1A1A1A)
        val ColorBaseColor200 = Color(0x331A1A1A)
        val ColorBaseColor300 = Color(0x4D1A1A1A)
        val ColorBaseColor400 = Color(0x661A1A1A)
        val ColorBaseColor500 = Color(0x801A1A1A)
        val ColorBaseColor600 = Color(0x991A1A1A)
        val ColorBaseColor700 = Color(0xB31A1A1A)
        val ColorBaseColor800 = Color(0xCC1A1A1A)
        val ColorBaseColor900 = Color(0xE61A1A1A)
    }

    object BlueFamily {
        val ColorBlue50 = Color(0xFFF2F7FF)
        val ColorBlue100 = Color(0xFFDCEBFE)
        val ColorBlue200 = Color(0xFFBDDAFE)
        val ColorBlue300 = Color(0xFF91C3FC)
        val ColorBlue400 = Color(0xFF60A5FA)
        val ColorBlue500 = Color(0xFF3479EB)
        val ColorBlue600 = Color(0xFF2362EA)
        val ColorBlue700 = Color(0xFF1D4FD7)
        val ColorBlue800 = Color(0xFF1D3FAE)
        val ColorBlue900 = Color(0xFF1E3B8A)
    }

    object Borders {
        val ColorBordersPrimary = Color(0xFF52525B)
        val ColorBordersSecondary = Color(0xFFD4D4D8)
    }

    object FucsiaFamily {
        val ColorFucsia50 = Color(0xFFFDF5FF)
        val ColorFucsia100 = Color(0xFFF9E5FF)
        val ColorFucsia200 = Color(0xFFF5D2FE)
        val ColorFucsia300 = Color(0xFFF0ABFC)
        val ColorFucsia400 = Color(0xFFE87BF9)
        val ColorFucsia500 = Color(0xFFD848EF)
        val ColorFucsia600 = Color(0xFFBF26D3)
        val ColorFucsia700 = Color(0xFFA31DAF)
        val ColorFucsia800 = Color(0xFF85198F)
        val ColorFucsia900 = Color(0xFF701975)
    }

    object GrayFamily {
        val ColorGray0_5 = Color(0xFFFCFCFC)
        val ColorGray1 = Color(0xFFF4F4F5)
        val ColorGray2 = Color(0xFFE4E4E7)
        val ColorGray3 = Color(0xFFD4D4D8)
        val ColorGray4 = Color(0xFFA1A1AA)
        val ColorGray5 = Color(0xFF71717A)
        val ColorGray6 = Color(0xFF52525B)
        val ColorGray7 = Color(0xFF3F3F46)
        val ColorGray8 = Color(0xFF27272A)
        val ColorGray9 = Color(0xFF202024)
    }

    object GreenFamily {
        val ColorGreen50 = Color(0xFFF2FDF5)
        val ColorGreen100 = Color(0xFFDEFCE9)
        val ColorGreen200 = Color(0xFFBBF7D0)
        val ColorGreen300 = Color(0xFF85EFAC)
        val ColorGreen400 = Color(0xFF4ADE80)
        val ColorGreen500 = Color(0xFF1AC057)
        val ColorGreen600 = Color(0xFF16A249)
        val ColorGreen700 = Color(0xFF157F3C)
        val ColorGreen800 = Color(0xFF1C713C)
        val ColorGreen900 = Color(0xFF114C28)
    }

    object Highlight {
        val ColorHighlightPrimary = Color(0xFF91C3FC)
        val ColorHighlightSecondary = Color(0x1A2362EA)
    }

    object Icons {
        val ColorIconsInverted = Color(0xFFFFFFFF)
        val ColorIconsPrimary = Color(0xFF000000)
        val ColorIconsSecondary = Color(0xFF52525B)
    }

    object OrangeFamily {
        val ColorOrange50 = Color(0xFFFFF5EA)
        val ColorOrange100 = Color(0xFFFFEDD6)
        val ColorOrange200 = Color(0xFFFED6A9)
        val ColorOrange300 = Color(0xFFFCB972)
        val ColorOrange400 = Color(0xFFFB923C)
        val ColorOrange500 = Color(0xFFF67416)
        val ColorOrange600 = Color(0xFFE8590C)
        val ColorOrange700 = Color(0xFFBF3F0C)
        val ColorOrange800 = Color(0xFF9B3B12)
        val ColorOrange900 = Color(0xFF7C2C11)
    }

    object PurpleFamily {
        val ColorPurple50 = Color(0xFFFAF5FF)
        val ColorPurple100 = Color(0xFFF2E5FF)
        val ColorPurple200 = Color(0xFFE9D6FF)
        val ColorPurple300 = Color(0xFFD8B4FE)
        val ColorPurple400 = Color(0xFFBF82FB)
        val ColorPurple500 = Color(0xFFA855F7)
        val ColorPurple600 = Color(0xFF9133E9)
        val ColorPurple700 = Color(0xFF7E22CE)
        val ColorPurple800 = Color(0xFF6A20A6)
        val ColorPurple900 = Color(0xFF591C87)
    }

    object RedFamily {
        val ColorRed50 = Color(0xFFFEF1F1)
        val ColorRed100 = Color(0xFFFEE1E1)
        val ColorRed200 = Color(0xFFFDC8C8)
        val ColorRed300 = Color(0xFFFCA6A6)
        val ColorRed400 = Color(0xFFFC6A6A)
        val ColorRed500 = Color(0xFFEE4343)
        val ColorRed600 = Color(0xFFDC2828)
        val ColorRed700 = Color(0xFFBA1B1B)
        val ColorRed800 = Color(0xFF971A1A)
        val ColorRed900 = Color(0xFF811D1D)
    }

    object States {
        val ColorStatesActive = Color(0xFF202024)
        val ColorStatesInactive = Color(0xFF71717A)
        val ColorStatesTappable = Color(0xFF2362EA)
    }

    object Surfaces {
        val ColorSurfacesPrimary = Color(0xFFFFFFFF)
        val ColorSurfacesSecondary = Color(0xFFF4F4F5)
    }

    object TealFamily {
        val ColorTeal50 = Color(0xFFF2FDFA)
        val ColorTeal100 = Color(0xFFCBFBF0)
        val ColorTeal200 = Color(0xFF97F6E3)
        val ColorTeal300 = Color(0xFF5CE9D4)
        val ColorTeal400 = Color(0xFF2BD3BD)
        val ColorTeal500 = Color(0xFF14B7A4)
        val ColorTeal600 = Color(0xFF0D968A)
        val ColorTeal700 = Color(0xFF0F756C)
        val ColorTeal800 = Color(0xFF115F5A)
        val ColorTeal900 = Color(0xFF134E4A)
    }

    object Text {
        val ColorTextInverted = Color(0xFFFFFFFF)
        val ColorTextLinked = Color(0xFF2362EA)
        val ColorTextPrimary = Color(0xFF000000)
        val ColorTextSecondary = Color(0xFF52525B)
    }

    object YellowFamily {
        val ColorYellow50 = Color(0xFFFDFCE6)
        val ColorYellow100 = Color(0xFFFEF9C3)
        val ColorYellow200 = Color(0xFFFDF08A)
        val ColorYellow300 = Color(0xFFFDDF49)
        val ColorYellow400 = Color(0xFFFACC14)
        val ColorYellow500 = Color(0xFFE7B008)
        val ColorYellow600 = Color(0xFFC78904)
        val ColorYellow700 = Color(0xFFA26107)
        val ColorYellow800 = Color(0xFF864E0E)
        val ColorYellow900 = Color(0xFF723F11)
    }
}