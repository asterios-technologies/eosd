#include "producer_consumer.h"

Integer consumedData;
Integer producedData;

void produceInit(void){
	producedData = 0;
}

void consumeInit(void){
	consumedData = 0;
}

void produce(void){
	producedData++;
	printf("Produced data:%i\n",producedData);
}

void consume(void){
	printf("Consumed data:%i\n",consumedData);
}
