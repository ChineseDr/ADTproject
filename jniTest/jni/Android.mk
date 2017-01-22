LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := jniTest
LOCAL_SRC_FILES := com_raymond_jniexample_Testjni.cpp
LOCAL_SRC_FILES += CAdd.cpp

include $(BUILD_SHARED_LIBRARY)
LOCAL_PATH := $(call my-dir)