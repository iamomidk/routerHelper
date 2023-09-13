package com.polygon.routerhelper.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color


val LightColorScheme = lightColorScheme(
	primary = LightPrimaryColor,
	secondary = LightSecondaryColor,
	background = LightBackgroundColor,
	surface = LightSurfaceColor,
	onPrimary = Color.White,
	onSecondary = Color.White,
	onBackground = LightOnSurfaceColor,
	onSurface = LightOnSurfaceColor,
	error = LightErrorColor
)

val DarkColorScheme = darkColorScheme(
	primary = DarkPrimaryColor,
	secondary = DarkSecondaryColor,
	background = DarkBackgroundColor,
	surface = DarkSurfaceColor,
	onPrimary = Color.White,
	onSecondary = Color.White,
	onBackground = DarkOnSurfaceColor,
	onSurface = DarkOnSurfaceColor,
	error = DarkErrorColor
)

@Composable
fun DocRecordTheme(
	useDarkTheme: Boolean = isSystemInDarkTheme(),
	content: @Composable () -> Unit
) {
	val colors = if (!useDarkTheme) LightColorScheme else DarkColorScheme

	MaterialTheme(
		colorScheme = colors,
		content = content
	)
}