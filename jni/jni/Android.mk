LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := jniDemo
LOCAL_SRC_FILES := jniDemo.cpp

include $(BUILD_SHARED_LIBRARY)
