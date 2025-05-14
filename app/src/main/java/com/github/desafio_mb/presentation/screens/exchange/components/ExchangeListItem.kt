package com.github.desafio_mb.presentation.screens.exchange.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.desafio_mb.domain.model.ExchangeList
import com.github.desafio_mb.presentation.screens.components.BaseScaffold

@OptIn(ExperimentalMaterial3Api::class)
@Preview(name = "Exchange", group = "Exchange")
@Composable
fun ExchangeListItem(
    exchangeList: ExchangeList = ExchangeList(
        exchangeId = "binance",
        name = "Binance",
        volumeUsd = "14500000000.25"
    ),
    onItemClick: (ExchangeList) -> Unit = {}
) {
    BaseScaffold {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    color = Color.DarkGray
                )
                .padding(16.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onItemClick(exchangeList) }
                    .padding(15.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Text(
                        text = exchangeList.name,
                        style = MaterialTheme.typography.bodySmall,
                        overflow = TextOverflow.Ellipsis,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(5.dp)
                    )

                    Text(
                        text = exchangeList.volumeUsd,
                        style = MaterialTheme.typography.bodySmall,
                        overflow = TextOverflow.Ellipsis,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(5.dp)
                    )
                }
            }
        }
    }
}