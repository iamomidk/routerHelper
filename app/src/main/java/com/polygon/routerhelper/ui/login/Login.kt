package com.polygon.routerhelper.ui.login

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.polygon.router.NavRoute

object LoginRoute : NavRoute<LoginViewModel> {
	override val route: String
		get() = "login/"

	@Composable
	override fun viewModel(): LoginViewModel = hiltViewModel()

	@Composable
	override fun Content(viewModel: LoginViewModel) = LoginScreen(viewModel::navigateToDashboard)
}

@Composable
fun LoginScreen(onClick: () -> Unit) {
	var username by remember { mutableStateOf("") }
	var password by remember { mutableStateOf("") }

	Column(
		modifier = Modifier
			.fillMaxSize()
			.padding(16.dp)
	) {
		Spacer(modifier = Modifier.height(32.dp))
		Text(
			text = "Login",
			style = MaterialTheme.typography.headlineMedium,
			modifier = Modifier.padding(bottom = 16.dp)
		)
		OutlinedTextField(
			value = username,
			onValueChange = { username = it },
			label = { Text("Username") },
			modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp)
		)
		OutlinedTextField(
			value = password,
			onValueChange = { password = it },
			label = { Text("Password") },
			modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp)
		)
		Button(
			onClick = { onClick.invoke() },
			modifier = Modifier.fillMaxWidth()
		) { Text(text = "Login") }
	}
}