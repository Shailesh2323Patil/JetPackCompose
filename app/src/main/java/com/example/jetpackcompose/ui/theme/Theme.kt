package com.example.jetpackcompose.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.platform.LocalConfiguration

private val LightThemeColors = lightColors()
private val DarkThemeColors = darkColors()

@Composable
fun ProvideDimens(
    dimensions: Dimensions,
    content: @Composable () -> Unit
) {
    val dimensionSet = remember { dimensions }
    CompositionLocalProvider(LocalAppDimens provides dimensionSet, content = content)
}

private val LocalAppDimens = staticCompositionLocalOf {
    smallDimensions
}

@Composable
fun JetPackComposeTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
    val colors = if (darkTheme) DarkThemeColors else LightThemeColors
    val configuration = LocalConfiguration.current
    val dimensions = if (configuration.screenWidthDp < 320)
        smallDimensions
    else if (configuration.screenWidthDp < 360 && configuration.screenWidthDp < 700)
        sw320Dimensions
    else if (configuration.screenWidthDp < 400 && configuration.screenWidthDp < 700)
        sw360Dimensions // 4.7"
    else if (configuration.screenWidthDp < 420 && configuration.screenWidthDp < 700)
        sw400Dimensions // 5" and 5.5"
    else if (configuration.screenWidthDp in 360..399 && configuration.screenWidthDp > 700)
        sw381_399_700Dimensions // 6"
    else if (configuration.screenWidthDp in 400..420 && configuration.screenWidthDp > 700)
        sw400_420_700Dimensions // 6.3"
    else if (configuration.screenWidthDp in 421..439 && configuration.screenWidthDp > 700)
        sw421_439_700Dimensions // 6.65" and above
    else if (configuration.screenWidthDp < 600)
        sw440Dimensions
    else if (configuration.screenWidthDp < 720)
        sw440Dimensions
    else
        sw720Dimensions

    ProvideDimens(dimensions = dimensions) {
        MaterialTheme(
            colors = colors,
            typography = Typography,
            shapes = Shapes,
            content = content
        )
    }
}

object AppTheme {
    val dimens : Dimensions
        @Composable
        get() = LocalAppDimens.current
}

val Dimens : Dimensions
    @Composable
    get() = AppTheme.dimens

















