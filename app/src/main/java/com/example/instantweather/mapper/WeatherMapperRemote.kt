package com.example.instantweather.mapper

import com.example.instantweather.data.model.NetworkWeather
import com.example.instantweather.data.model.Weather

/**
 * Created by Mayokun Adeniyi on 10/03/2020.
 */

class WeatherMapperRemote : BaseMapper<NetworkWeather,Weather>{
    override fun transformToDomain(type: NetworkWeather): Weather = Weather(
        uId = type.uId,
        cityId = type.cityId,
        name = type.name,
        networkWeatherDescription = type.networkWeatherDescriptions,
        networkWeatherCondition = type.networkWeatherCondition
    )

    override fun transformToDto(type: Weather): NetworkWeather = NetworkWeather(
        uId = type.uId,
        cityId = type.cityId,
        name = type.name,
        networkWeatherDescriptions = type.networkWeatherDescription,
        networkWeatherCondition = type.networkWeatherCondition
    )

}