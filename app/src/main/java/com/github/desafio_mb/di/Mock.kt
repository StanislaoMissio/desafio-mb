package com.github.desafio_mb.di

import com.github.desafio_mb.domain.model.ExchangeList
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

object Mock {

    fun mockExchange(): List<ExchangeList> {
        val json = "[\n" +
                "  {\n" +
                "    \"id\": \"binance\",\n" +
                "    \"name\": \"Binance\",\n" +
                "    \"volume_1day_usd\": 14500000000.25\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"coinbase\",\n" +
                "    \"name\": \"Coinbase\",\n" +
                "    \"volume_1day_usd\": 2200000000.75\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"kraken\",\n" +
                "    \"name\": \"Kraken\",\n" +
                "    \"volume_1day_usd\": 980000000.50\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"bitfinex\",\n" +
                "    \"name\": \"Bitfinex\",\n" +
                "    \"volume_1day_usd\": 430000000.00\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"kucoin\",\n" +
                "    \"name\": \"KuCoin\",\n" +
                "    \"volume_1day_usd\": 670000000.85\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"gemini\",\n" +
                "    \"name\": \"Gemini\",\n" +
                "    \"volume_1day_usd\": 310000000.10\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"bitstamp\",\n" +
                "    \"name\": \"Bitstamp\",\n" +
                "    \"volume_1day_usd\": 275000000.55\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"bithumb\",\n" +
                "    \"name\": \"Bithumb\",\n" +
                "    \"volume_1day_usd\": 320000000.40\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"okx\",\n" +
                "    \"name\": \"OKX\",\n" +
                "    \"volume_1day_usd\": 8700000000.00\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"bybit\",\n" +
                "    \"name\": \"Bybit\",\n" +
                "    \"volume_1day_usd\": 5100000000.75\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"gateio\",\n" +
                "    \"name\": \"Gate.io\",\n" +
                "    \"volume_1day_usd\": 590000000.30\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"bitget\",\n" +
                "    \"name\": \"Bitget\",\n" +
                "    \"volume_1day_usd\": 760000000.20\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"crypto_com\",\n" +
                "    \"name\": \"Crypto.com\",\n" +
                "    \"volume_1day_usd\": 400000000.00\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"mexc\",\n" +
                "    \"name\": \"MEXC\",\n" +
                "    \"volume_1day_usd\": 615000000.15\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"poloniex\",\n" +
                "    \"name\": \"Poloniex\",\n" +
                "    \"volume_1day_usd\": 180000000.00\n" +
                "  }\n" +
                "]"

        val type = object : TypeToken<List<ExchangeList>>() {}.type

        return Gson().fromJson(json, type)
    }

    fun mockExchangeById(): ExchangeList {
        val json = "{\n" +
                "  \"exchange_id\": \"EXCHG123\",\n" +
                "  \"website\": \"https://www.randomexchange.io/\",\n" +
                "  \"name\": \"RandomExchange\",\n" +
                "  \"data_quote_start\": \"2017-01-05T08:30:21.1230000Z\",\n" +
                "  \"data_quote_end\": \"2024-12-31T23:59:59.9990000Z\",\n" +
                "  \"data_orderbook_start\": \"2017-01-05T08:30:21.1230000Z\",\n" +
                "  \"data_orderbook_end\": \"2024-12-31T23:59:59.9990000Z\",\n" +
                "  \"data_trade_start\": \"2016-06-01T12:00:00.0000000Z\",\n" +
                "  \"data_trade_end\": \"2024-12-30T18:45:17.4570000Z\",\n" +
                "  \"data_symbols_count\": 84,\n" +
                "  \"volume_1hrs_usd\": 5240000.45,\n" +
                "  \"volume_1day_usd\": 84500000.77,\n" +
                "  \"volume_1mth_usd\": 2310000000.32,\n" +
                "  \"rank\": 17\n" +
                "}"

        val type = object : TypeToken<List<ExchangeList>>() {}.type

        return Gson().fromJson(json, type)
    }

}