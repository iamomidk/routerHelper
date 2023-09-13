package com.polygon.routerhelper.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Scaffold
import androidx.navigation.compose.rememberNavController
import com.polygon.router.NavigationComponent
import com.polygon.routerhelper.ui.dashboard.DashboardRoute
import com.polygon.routerhelper.ui.login.LoginRoute
import com.polygon.routerhelper.ui.theme.DocRecordTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			val navController = rememberNavController()
			DocRecordTheme {
				Scaffold {
					NavigationComponent(navController, startDestination = LoginRoute.route, it) {
						// add other screens here
						LoginRoute.composable(this, navController)
						DashboardRoute.composable(this, navController)
					}
				}
			}
		}
	}
}