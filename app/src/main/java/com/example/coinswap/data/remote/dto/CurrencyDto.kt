package com.example.coinswap.data.remote.dto

import com.example.coinswap.domain.model.CurrencyRate

data class CurrencyDto(
    val base_code: String,
    val conversion_rates: CurrencyDataDto,
    val documentation: String,
    val result: String,
    val terms_of_use: String,
    val time_last_update_unix: Int,
    val time_last_update_utc: String,
    val time_next_update_unix: Int,
    val time_next_update_utc: String
)

fun CurrencyDto.toCurrencyRates(): List<CurrencyRate> {
    val currencyData = this.conversion_rates
    return listOf(
        CurrencyRate("INR", "Indian Rupee", currencyData.INR),
        CurrencyRate("EUR", "Euro", currencyData.EUR),
        CurrencyRate("USD", "US Dollar", currencyData.USD),
        CurrencyRate("JPY", "Japanese Yen", currencyData.JPY),
        CurrencyRate("BGN", "Bulgarian Lev", currencyData.BGN),
        CurrencyRate("CZK", "Czech Republic Koruna", currencyData.CZK),
        CurrencyRate("DKK", "Danish Krone", currencyData.DKK),
        CurrencyRate("GBP", "British Pound Sterling", currencyData.GBP),
        CurrencyRate("HUF", "Hungarian Forint", currencyData.HUF),
        CurrencyRate("PLN", "Polish Zloty", currencyData.PLN),
        CurrencyRate("RON", "Romanian Leu", currencyData.RON),
        CurrencyRate("SEK", "Swedish Krona", currencyData.SEK),
        CurrencyRate("CHF", "Swiss Franc", currencyData.CHF),
        CurrencyRate("ISK", "Icelandic Króna", currencyData.ISK),
        CurrencyRate("NOK", "Norwegian Krone", currencyData.NOK),
        CurrencyRate("HRK", "Croatian Kuna", currencyData.HRK),
        CurrencyRate("RUB", "Russian Ruble", currencyData.RUB),
        CurrencyRate("TRY", "Turkish Lira", currencyData.TRY),
        CurrencyRate("AUD", "Australian Dollar", currencyData.AUD),
        CurrencyRate("BRL", "Brazilian Real", currencyData.BRL),
        CurrencyRate("CAD", "Canadian Dollar", currencyData.CAD),
        CurrencyRate("CNY", "Chinese Yuan", currencyData.CNY),
        CurrencyRate("HKD", "Hong Kong Dollar", currencyData.HKD),
        CurrencyRate("IDR", "Indonesian Rupiah", currencyData.IDR),
        CurrencyRate("ILS", "Israeli New Sheqel", currencyData.ILS),
        CurrencyRate("KRW", "South Korean Won", currencyData.KRW),
        CurrencyRate("MXN", "Mexican Peso", currencyData.MXN),
        CurrencyRate("MYR", "Malaysian Ringgit", currencyData.MYR),
        CurrencyRate("NZD", "New Zealand Dollar", currencyData.NZD),
        CurrencyRate("PHP", "Philippine Peso", currencyData.PHP),
        CurrencyRate("SGD", "Singapore Dollar", currencyData.SGD),
        CurrencyRate("THB", "Thai Baht", currencyData.THB),
        CurrencyRate("ZAR", "South African Rand", currencyData.ZAR)
    )
}