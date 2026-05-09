package com.example.androidbasicsclass.ui.secondpartialpdm1.homeSecondPartialPDM1.view

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.androidbasicsclass.ui.secondpartialpdm1.homeSecondPartialPDM1.viewmodel.HomeSecondPartialPDM1ViewModel
import androidx.compose.material3.Text



@Composable
fun HomeSecondPartialPDM1View(
    homeViewModel: HomeSecondPartialPDM1ViewModel = viewModel()
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Second Partial PDM1")
    }
}