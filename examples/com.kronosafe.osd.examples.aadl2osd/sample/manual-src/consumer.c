#include "consumer.h"
#include <stdio.h>

extern Integer consumedData;

void consumeInit(void){
	consumedData = 0;
}

void consume(void){
	printf("Consumed data:%i\n",consumedData);
}