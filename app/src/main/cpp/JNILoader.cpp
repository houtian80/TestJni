//
// Created by zhanglingwei on 2022/12/11.
//
#include "string"
#include "com_voice_auth_testjni_JNILoader.h"

extern "C" JNIEXPORT jstring JNICALL Java_com_voice_auth_testjni_JNILoader_getNativeString
  (JNIEnv *env, jobject obj){
    std::string labStr = "qwqwqwqwqwqwqwqwqwqwqwqw";
    return env->NewStringUTF(labStr.c_str());
  }