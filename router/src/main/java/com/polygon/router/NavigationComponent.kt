package com.polygon.router

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

@Composable
fun NavigationComponent(
	navHostController: NavHostController,
	startDestination: String,
	paddingValues: PaddingValues,
	builder: NavGraphBuilder.() -> Unit
) {
	NavHost(
		navController = navHostController,
		startDestination = startDestination,
		modifier = Modifier.padding(paddingValues),
		builder = builder
	)
}