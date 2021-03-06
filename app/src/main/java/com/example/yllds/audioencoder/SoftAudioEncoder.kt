package com.example.yllds.audioencoder

/*
* Created by TY on 2018/6/20.
*      
*/class SoftAudioEncoder {
    external fun encode(pcmPath: String, audioChannels: Int, bitRate: Int, sampleRate: Int,
                        aacPath: String)
    companion object {
        init {
            System.loadLibrary("native-lib")
        }
    }
}