package com.cowlsly.securityspark

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cowlsly.securityspark.audio.AudioManager
import com.cowlsly.securityspark.ui.theme.SecuritySparkTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AudioManager.init(this)

        setContent {
            SecuritySparkTheme {
                SecuritySparkApp()
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        AudioManager.release()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SecuritySparkApp() {
    var currentTip by remember { mutableStateOf(TipsRepository.getRandomTip()) }
    val clipboardManager = LocalClipboardManager.current

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Security Spark", fontWeight = FontWeight.Bold) },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFF0F0F1A),
                    titleContentColor = Color.White
                )
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            Text(
                text = "Tap for a quick security, privacy or scam-avoidance tip.",
                style = MaterialTheme.typography.bodyLarge,
                color = Color(0xFFB0B0C0),
                modifier = Modifier.padding(bottom = 8.dp)
            )

            Button(
                onClick = {
                    AudioManager.playButtonSound()
                    currentTip = TipsRepository.getRandomTip()
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(64.dp),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF472B6))
            ) {
                Text(
                    text = "Surprise Me",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Black
                )
            }

            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = Color(0xFF1A1A2E)),
                shape = RoundedCornerShape(20.dp)
            ) {
                Column(
                    modifier = Modifier.padding(20.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    Text(
                        text = currentTip.category.uppercase(),
                        style = MaterialTheme.typography.labelSmall,
                        color = Color(0xFFF472B6),
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = currentTip.text,
                        style = MaterialTheme.typography.bodyLarge,
                        color = Color.White,
                        lineHeight = 24.sp
                    )
                }
            }

            OutlinedButton(
                onClick = {
                    AudioManager.playButtonSound()
                    clipboardManager.setText(AnnotatedString(currentTip.text))
                },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(12.dp)
            ) {
                Text("Copy Tip", color = Color.White)
            }

            Spacer(Modifier.weight(1f))

            Text(
                text = "Offline • No permissions • No tracking • Pure local tips",
                style = MaterialTheme.typography.labelSmall,
                color = Color(0xFF666677)
            )
        }
    }
}