cmake_minimum_required(VERSION 3.18.1-g262b901)
add_library(JNILoader SHARED src/main/cpp/JNILoader.cpp)
find_library(log-lib log)
target_link_libraries(JNILoader ${log-lib})