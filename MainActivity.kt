package com.example.latihanlks

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.FlowRowScopeInstance.align
//import androidx.compose.foundation.layout.FlowRowScopeInstance.align
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.windowInsetsBottomHeight
import androidx.compose.foundation.selection.toggleable
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.latihanlks.ui.theme.LatihanLKSTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column() {
                val checkBoxState = remember {
                    mutableStateOf(false)
                }
                CustomCheckBox(title = "Check Box", checkboxState = checkBoxState.value) {
                    checkBoxState.value = !checkBoxState.value
                }
            }

//            Column() {
//                CustomButton(text = "Hello!", Color.Green)
//                CustomButton(text = "Click for More", Color.Blue)
//            }
        }
    }
}

@Composable
fun CustomButton(text: String, color: Color) {
    Button(
        onClick = {},
        modifier = Modifier
            .padding(17.dp)
            .clip(RoundedCornerShape(16.dp)),
        colors = ButtonDefaults.buttonColors(containerColor = color)
    ) {
        Text(text = text)
    }
}
@Composable
fun CustomCheckBox(
    title: String,
    checkboxState:Boolean,
    onCheckboxPressed: ((Boolean) -> Unit)?
){
    Row (
        modifier = Modifier.padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ){
        val checkBoxState = remember { mutableStateOf(false) }
        Checkbox(
            checked = checkBoxState.value,
            onCheckedChange = onCheckboxPressed
        )
        Spacer(modifier = Modifier.padding(4.dp))
        Text(text = title)

    }
}





