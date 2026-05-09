package com.example.androidbasicsclass.ui.thirdpartialpdm1.homeThirdPartialPDM1.view

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.androidbasicsclass.ui.thirdpartialpdm1.homeThirdPartialPDM1.viewmodel.HomeThirdPartialPDM1ViewModel


@Composable
fun HomeTHirdPartialPDM1View(
    homeViewModel: HomeThirdPartialPDM1ViewModel = viewModel()
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text(text = "Third Partial PDM1")
    }
}