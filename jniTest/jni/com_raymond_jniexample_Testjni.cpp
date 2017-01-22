/*
 * com_raymond_jniexample_Testjni.cpp
 *
 *  Created on: 2016-7-1
 *      Author: wangxingyong
 */

#include <stdio.h>
#include <stdlib.h>
#include "com_raymond_jniexample_Testjni.h"
#include "CAdd.h"

CAdd *pCAdd=new CAdd;

//��ʼ������
JNIEXPORT jboolean JNICALL Java_com_raymond_jniexample_Testjni_init(JNIEnv *evn,
		jobject obj){
	if(NULL==pCAdd){
		pCAdd=new CAdd;
	}

	return pCAdd!=NULL;
}

//����2������ӵı���ʵ�֣�
JNIEXPORT jint JNICALL Java_com_raymond_jniexample_Testjni_add(JNIEnv *evn,
		jobject obj, jint x, jint y){
	jint res=-1;
	if(pCAdd!=NULL){
		res=pCAdd->add(x,y);
	}

	return res;
}


//���ٶ���
JNIEXPORT void JNICALL Java_com_raymond_jniexample_Testjni_destroy(JNIEnv *evn,
		jobject obj){
	if(NULL!=pCAdd){
		delete pCAdd;
		pCAdd=NULL;
	}
}

