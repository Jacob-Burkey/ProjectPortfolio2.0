#include <stdio.h>
#include <stdlib.h> 	// for exit function
#include <unistd.h>	
#include <pthread.h> 	// multi-threading 


int X = 0;					
pthread_mutex_t LockForX = PTHREAD_MUTEX_INITIALIZER;		

void *thread1()		// code for thread 1
{
	printf("thread1: starting... \n");
	for (int i=0; i<1000000; i++)
	{	
		// where shared data is accessed and read 
		// pthread_mutex_lock(&LockForX);
		++X;
		// pthread_mutex_unlock(&LockForX);
	}	

	return 0;
}
		

void *thread2()		// code for thread 2
{
	printf("thread2: starting... \n");
	for (int i=0; i<1000000; i++)
	{	
		// where shared data is accessed and read 
		// pthread_mutex_lock(&LockForX);
		++X;
		// pthread_mutex_unlock(&LockForX);
	}

	return 0;
}

void *thread3()		// code for thread 3
{
	printf("thread3: starting... \n");
	for (int i=0; i<1000000; i++)
	{	
		// where shared data is accessed and read 
		// pthread_mutex_lock(&LockForX);
		++X;
		// pthread_mutex_unlock(&LockForX);
	}	

	return 0;
}

int main()
{
	pthread_t thr1, thr2, thr3;	// thread control block

// create threads thr1 and associate code with thread 1
	if (pthread_create(&thr1,NULL,&thread1,NULL) != 0)
	{
		fprintf(stderr,"pthread_create() failed for thread1\n");
		exit(1);
	}

// create thr2 and associate with thread2 code

	if (pthread_create(&thr2,NULL,&thread2,NULL) != 0)
	
	{
		fprintf(stderr,"pthread_create() failed for thread2\n");
		exit(1);
	}

// create thr3 and associate with thread3 code

	if (pthread_create(&thr3,NULL,&thread3,NULL) != 0)
	
	{
		fprintf(stderr,"pthread_create() failed for thread3\n");
		exit(1);
	}

// coordinate the threads and processes
// must complete before proceeding

pthread_join(thr1,NULL);	// wait for thr1 to be done
pthread_join(thr2,NULL);	// wait for thr2 to be done
pthread_join(thr3,NULL);	// wait for thr3 to be done

// thr1, thr2, thr3 are complete, we can safely report result

printf("main: X is %i\n", X);
return 0;

}
	

