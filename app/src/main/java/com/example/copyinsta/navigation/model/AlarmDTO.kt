package com.example.copyinsta.navigation.model

data class AlarmDTO(
    var destinationUid : String? = null,
    var userId : String? = null,
    var uid : String? = null,

    //0 : beğenme alarm
    //1 : yorum alarm
    //2 : takip alarm
    var kind : Int? = null,
    var message : String? = null,
    var timestamp : Long? = null
)