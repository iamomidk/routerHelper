package com.polygon.routerhelper.ui.login

import androidx.lifecycle.ViewModel
import com.polygon.router.RouteNavigator
import com.polygon.routerhelper.ui.dashboard.DashboardRoute
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
	private val routeNavigator: RouteNavigator,
) : ViewModel(), RouteNavigator by routeNavigator {
	fun navigateToDashboard() {
		routeNavigator.navigateToRoute(DashboardRoute.route)
	}
}