package com.example.myapplication


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.R
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                LoginView()
            }
        }
    }
}

@Composable
fun LoginView() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.img), // replace with your image
            contentDescription = "App Logo",
            modifier = Modifier.padding(top =80.dp,bottom=60.dp)
        )
        TextField(
            value = "",
            onValueChange = {},
            placeholder = { Text("Email or mobile number") },
            shape = RoundedCornerShape(5.dp),
            modifier = Modifier.fillMaxWidth()

        )

        TextField(
            value = "",
            onValueChange = {},
            placeholder = { Text("Password") },
            shape = RoundedCornerShape(5.dp),
            modifier = Modifier.fillMaxWidth()
        )
        Row(modifier = Modifier.padding(top=10.dp).fillMaxWidth(), verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start){
            Text("Forgot Password?",
            modifier=Modifier.padding(top=20.dp))
        }

        Button(
            onClick = {},colors = ButtonDefaults.buttonColors(
                containerColor = Color.Blue),
                    modifier = Modifier.fillMaxWidth().padding(top=20.dp)

        ) {
            Text("Login")
        }
        Row(modifier = Modifier.padding(all=5.dp), verticalAlignment = Alignment.CenterVertically
        , horizontalArrangement = Arrangement.Center){
            Row(modifier = Modifier.weight(1f).background(Color.Black).
            height(2.dp,).padding(end = 5.dp)) { }
            Text("OR")
            Row(modifier = Modifier.weight(1f).background(Color.Black).
            height(2.dp,).padding(start = 5.dp)) { }

        }
        Button(
            onClick = {},colors = ButtonDefaults.buttonColors(
                containerColor = Color.Blue),
            modifier = Modifier.fillMaxWidth().padding(bottom=15.dp)
            

        ) {
            Text("Create your Amazon account")
        }
        Text("Conditions of Use-Privacy Notice")
    }
}

@Preview(showBackground = true)
@Composable
fun SimpleLoginScreenPreview() {
    MaterialTheme {
        LoginView()
    }
}