package mm.com.phyoeMaung.frameStructure.remote.models

import com.google.gson.annotations.SerializedName

abstract class BaseResponseModel(
    @SerializedName("RespCode")
    open var RespCode:String,
    @SerializedName("RespDescription")
    open var RespDescription:String
)