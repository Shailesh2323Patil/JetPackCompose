package com.example.jetpackcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose.ui.theme.AppTheme

@Composable
fun screenSize() {
    Box(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize()
    ) {
        val screenWidth = LocalContext.current.resources.displayMetrics.widthPixels.dp /
                LocalDensity.current.density

        val screenHeight = LocalContext.current.resources.displayMetrics.heightPixels.dp /
                LocalDensity.current.density

        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {
            Spacer(
                modifier = Modifier
                    .height(AppTheme.dimens.testScreenSpacerTop)
                    .fillMaxWidth()
            )

            Image(
                painter = painterResource(
                    id = R.drawable.icon_homeopathy_slider
                ),
                contentDescription = null,
                modifier = Modifier
                    .height(AppTheme.dimens.imageHeight)
                    .fillMaxWidth()
            )

            Spacer(
                modifier = Modifier
                    .height(AppTheme.dimens.testScreenSpaceBelowImage)
                    .fillMaxWidth()
            )

            Text(
                text = "Width : $screenWidth Height : $screenHeight",
                fontSize = AppTheme.dimens.textSmall,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(start = 10.dp, end = 10.dp)
            )

            Text(
                text = "Bringing Homeopathy to You",
                fontSize = AppTheme.dimens.textMedium,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(start = 10.dp, end = 10.dp)
            )

            Spacer(
                modifier = Modifier
                    .height(5.dp)
                    .fillMaxWidth()
            )

            Text(
                text = "In publishing and graphic design, Lorem ipsum is a placeholder text commonly used to demonstrate the visual form of a document or a typeface without relying on meaningful content. Lorem ipsum may be used as a placeholder before the final copy is available.",
                fontSize = AppTheme.dimens.textSmall,
                color = Color.Black,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(start = 10.dp, end = 10.dp)
            )
        }

        Box(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .height(AppTheme.dimens.testScreenBottomImage)
        ) {
            Image(
                painter = painterResource(id = R.drawable.icon_bottom),
                contentDescription = "Bottom",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.BottomCenter)
            )
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                        .align(Alignment.BottomCenter)
        ) {
            Button(onClick = {  }) {
                Text(text = "Continue")
            }
            Spacer(
                modifier = Modifier
                            .height(AppTheme.dimens.testScreenButtonBottom)
                            .fillMaxWidth()
            )
        }
    }
}














