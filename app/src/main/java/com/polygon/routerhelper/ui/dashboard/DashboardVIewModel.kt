package com.polygon.routerhelper.ui.login

import androidx.lifecycle.ViewModel
import com.polygon.router.RouteNavigator
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DashboardViewModel @Inject constructor(
	private val routeNavigator: RouteNavigator,
) : ViewModel(), RouteNavigator by routeNavigator