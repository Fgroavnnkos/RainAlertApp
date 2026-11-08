package com.example.test

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import com.example.test.components.AppBottomBar
import com.example.test.screens.Counter
import com.example.test.screens.ProfileScreen
import com.example.test.ui.theme.CustomColors
import kotlinx.coroutines.launch

@Composable
fun App() {
    val pagerState = rememberPagerState(
        pageCount = { 2 }
    )

    val scope = rememberCoroutineScope()

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = CustomColors.customDarkBackground,
        bottomBar = {
            AppBottomBar(
                selectedPage = pagerState.currentPage,
                onPageSelected = { page ->
                    scope.launch {
                        pagerState.animateScrollToPage(page)
                    }
                }
            )
        }
    ) { innerPadding ->
        HorizontalPager(
            state = pagerState,
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()) { page ->
            when (page) {
                0 -> Counter()
                1 -> ProfileScreen()
            }
        }
    }
}