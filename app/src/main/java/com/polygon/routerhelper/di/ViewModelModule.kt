package com.polygon.routerhelper.di

import com.polygon.router.MyRouteNavigator
import com.polygon.router.RouteNavigator
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
class ViewModelModule {
	@Provides
	@ViewModelScoped
	fun bindRouteNavigator(): RouteNavigator = MyRouteNavigator()
}