cmake_minimum_required(VERSION 3.4.1)

# Your library
add_library( native-lib
             SHARED
             src/main/cpp/native-lib.cpp )

# OpenCV
add_library( lib_opencv SHARED IMPORTED )
include_directories(${pathToProject}/app/src/main/jniLibs/include)
set_target_properties(lib_opencv PROPERTIES IMPORTED_LOCATION ${pathToProject}/app/src/main/jniLibs/${ANDROID_ABI}/libopencv_java3.so)

target_link_libraries( native-lib
                       lib_opencv )