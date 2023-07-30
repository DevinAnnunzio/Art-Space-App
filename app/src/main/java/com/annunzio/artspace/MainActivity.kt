package com.annunzio.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.annunzio.artspace.ui.theme.ArtSpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceTheme {
                // A surface container using the 'background' color from the theme

                    var imageNum by remember {
                        mutableStateOf(0)
                    }
                    //Code here
                val modifier = Modifier
                Column(modifier = modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center){

                    Image(painter = painterResource(id = when(imageNum){
                        0 -> R.drawable.lemon_drink
                        1 -> R.drawable.lemon_tree
                        2 -> R.drawable.lemon_squeeze
                        else -> {R.drawable.ic_launcher_foreground}
                    }),
                        contentDescription = "Main picture",
                        modifier = modifier
                            .border(BorderStroke(3.dp, Color.LightGray))
                            .wrapContentHeight()
                            .wrapContentWidth()
                            .background(color = MaterialTheme.colorScheme.background))


                    Spacer(modifier = modifier.padding(top = 80.dp))


                    Column(modifier = modifier.border(BorderStroke(1.dp, Color.LightGray))) {
                        Text(textAlign = TextAlign.Center,fontStyle = FontStyle.Italic, fontSize = 22.sp,text = when(imageNum){
                            0 -> "Artwork Title: Drink of lemon"
                            1 -> "Artwork Title: Lemon tree"
                            2 -> "Artwork Title: Squeezie"
                            else -> {"N/A"}
                        })

                        Text(textAlign = TextAlign.Center,fontStyle = FontStyle.Italic,fontSize = 18.sp,text = when(imageNum){
                            0 -> "By: Sir drink 1820-1870"
                            1 -> "By: Sir tree 1888-1911"
                            2 -> "By: Sir Squuzie 1868-1888"
                            else -> {"N/A"}
                        })

                    }

                    Spacer(modifier = modifier.padding(top = 300.dp))


                    Row(modifier = Modifier) {
                        Button(onClick = {
                            println(imageNum)
                            println("Minus clicked")
                            if(imageNum - 1 > -1){
                                imageNum -= 1
                            }
                            println(imageNum)
                        }) {
                            Text(text = "Previous")
                        }
                        Spacer(modifier = modifier.padding(10.dp))

                        Button(onClick = {
                            println(imageNum)
                            println("Plus clicked")
                            if(imageNum + 1 < 3){
                                imageNum += 1
                            }
                            println(imageNum)
                        }) {
                            Text(text = "Next")
                        }

                    }

                }



            }
        }
    }
}

//@Composable
//fun MainScreenLayout(modifier: Modifier = Modifier, imageNum: Int) {
//    Column(modifier = modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally,
//    verticalArrangement = Arrangement.Center){
////        MainPicture(modifier = modifier)
////        Spacer(modifier = modifier.padding(10.dp))
////        ArtistInfoBlock(modifier = modifier)
////        Spacer(modifier = modifier.padding(10.dp))
////        BottomButtonLayout(modifier = modifier, imageNum)
//    }
//
//}

//@Composable
//fun MainPicture(modifier: Modifier){
//    Image(painter = painterResource(id = R.drawable.ic_launcher_background),
//        contentDescription = "Main picture",
//    modifier = modifier
//        .wrapContentHeight()
//        .wrapContentWidth()
//        .background(color = MaterialTheme.colorScheme.background))
//}
//@Composable
//fun ArtistInfoBlock(modifier: Modifier){
//
//        Column(modifier = modifier) {
//            Text(text = "Artwork Title")
//            Text(text = "Artwork Artist Year")
//        }
//}

//@Composable
//fun BottomButtonLayout(modifier: Modifier, imageNum: Int) {


//    Row {
//     Button(onClick = {
//         println(imageNum)
//         println("Minus clicked")
//         imageNum.dec()
//         println(imageNum)
//     }) {
//         Text(text = "Previous")
//     }
//        Spacer(modifier = modifier.padding(10.dp))
//
//        Button(onClick = {
//            println(imageNum)
//            println("Plus clicked")
//            imageNum.inc()
//            println(imageNum)
//        }) {
//            Text(text = "Next")
//        }
//
//    }
//}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArtSpaceTheme {
    }
}