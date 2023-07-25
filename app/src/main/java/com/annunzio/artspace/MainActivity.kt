package com.annunzio.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.annunzio.artspace.ui.theme.ArtSpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainPicture(modifier = Modifier)
                }
            }
        }
    }
}

@Composable
fun MainScreenLayout(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center){
        MainPicture(modifier = modifier)
        Spacer(modifier = modifier.padding(10.dp))
        ArtistInfoBlock(modifier = modifier)
        Spacer(modifier = modifier.padding(10.dp))
        BottomButtonLayout(modifier = modifier)
    }


}

@Composable
fun MainPicture(modifier: Modifier){
    Image(painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = "Main picture",
    modifier = modifier
        .wrapContentHeight()
        .wrapContentWidth()
        .background(color = MaterialTheme.colorScheme.background))
}
@Composable
fun ArtistInfoBlock(modifier: Modifier){

        Column() {
            Text(text = "Artwork Title")
            Text(text = "Artork Artist Year")
        }
}

@Composable
fun BottomButtonLayout(modifier: Modifier) {
    Row {
     Button(onClick = { /*TODO*/ }) {
         Text(text = "Previous")
     }
        Spacer(modifier = modifier.padding(10.dp))
        
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Next")
        }
        
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArtSpaceTheme {
        MainScreenLayout()
    }
}