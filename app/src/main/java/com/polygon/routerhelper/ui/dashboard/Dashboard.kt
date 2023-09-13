@file:OptIn(ExperimentalMaterial3Api::class)

package com.polygon.routerhelper.ui.dashboard

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.polygon.router.NavRoute
import com.polygon.routerhelper.ui.login.DashboardViewModel

object DashboardRoute : NavRoute<DashboardViewModel> {
	override val route: String
		get() = "dashboard/"

	@Composable
	override fun viewModel(): DashboardViewModel = hiltViewModel()

	@Composable
	override fun Content(viewModel: DashboardViewModel) = DashboardScreen()
}

@Composable
fun DashboardScreen() {
	Scaffold(
		topBar = {
			TopAppBar(
				title = { Text(text = "Dashboard") },
				colors = TopAppBarDefaults.topAppBarColors(containerColor = MaterialTheme.colorScheme.primary),
			)
		},
		content = {
			DashboardContent(it)
		}
	)
}

@Composable
fun DashboardContent(paddingValues: PaddingValues) {
	val dashboardItems = listOf(
		DashboardItem("Item 1", "Description 1"),
		DashboardItem("Item 2", "Description 2")
	)

	LazyColumn(
		modifier = Modifier
			.fillMaxSize()
			.padding(16.dp)
	) {
		items(dashboardItems) { item ->
			DashboardItemCard(item, onClick = {
				// Handle item click here
			})
			Spacer(modifier = Modifier.height(16.dp))
		}
	}
}

@Composable
fun DashboardItemCard(item: DashboardItem, onClick: () -> Unit) {
	Card(
		modifier = Modifier.fillMaxWidth().clickable { onClick.invoke() },
		elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
	) {
		Column(
			modifier = Modifier.padding(16.dp).fillMaxWidth()
		) {
			Text(text = item.title)
			Text(text = item.description, color = Color.Gray)
		}
	}
}

data class DashboardItem(val title: String, val description: String)