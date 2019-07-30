#include "producer.h"
#include <stdio.h>

extern Integer producedData;

void produceInit(void){
	producedData = 0;
}

void produce(void){
	producedData++;
	printf("Produced data:%i\n",producedData);
}