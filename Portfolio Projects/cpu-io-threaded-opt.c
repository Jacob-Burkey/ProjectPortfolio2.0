#include <stdio.h>			// Standard Input and Output library
#include <fcntl.h>			// File Control library
#include <unistd.h>			// Universal Standard library for I/O
#include <stdlib.h>			// Standard functions library (has exit() )
#include <sys/types.h>			// for wait()
#include <sys/wait.h>			// for wait()
#include <pthread.h>			// posix thread support
//#include <sys/stat.h>

// This thread is I/O -only intensive (same as filebuffwrite.c)
// It writes a file of N bytes to /tmp/myfile
void *io_work()
{
   // Set N to the value that yields about 30 seconds in filebuffwrite.c with your
   // optimal BUFFSIZE.  Set BUFFSIZE below to the BUFFSIZE value you found optimal
  //  with filebuffwrite.c in the file I/O performance tests.
   const unsigned long N = (unsigned long)1024*1024*1024;	// Amount of data to write
   const int BUFFSIZE = 1;		

   char writebuff[BUFFSIZE];
   int i, fd;

   for (i=0; i<BUFFSIZE; i++)
      writebuff[i] = '\0';

   // Open the file /tmp/myfile to be referenced by the file descriptor value in fd
   // fd is 0+ (positive) if the open was successful, -1 if unsuccessful
   if ((fd = open("/tmp/myfile", O_CREAT|O_TRUNC|O_WRONLY, S_IRUSR|S_IWUSR)) < 0)
   {
      fprintf(stderr,"the open failed\n");
      exit(1);
   }

   for (unsigned long i=0; i<N/BUFFSIZE; i++)
   {
      if (write(fd,writebuff,BUFFSIZE) < 0)
      {
         fprintf(stderr,"write %lu failed\n",i);
         perror("");
      }
   }
   close(fd);

   return 0;
}


// This thread carries out CPU-only intensive work (same as cpu-work.c)
// It will find the number of prime values between 2 and N
void *cpu_work()
{
   const int N = 100000;	// Use the value that yields about 30 seconds in cpu-work.c

   int x,			// current number in range being examined
       xfactor,			// value between 2 and x-1 being tested for
				// even division into x
       isprime,			// a flag to tell whether x is prime so far
				//    0->no or false
				//    1->yes or true
       nprimes = 0;		// the number of primes found so far

   for (x=2; x<=N; x++)		// Search for primes in the range 2..N
   {
      isprime = 1;		// assume x is prime unless we find a factor (evenly divides)

      for (xfactor=2; xfactor<x; xfactor++)	// See whether a factor of x
						//    is in range 2..x-1
         if (x % xfactor == 0)			// Does xfactor evenly divide x?
            isprime = 0;			// Yes, x is not a prime, set
						//    flag to false
      if (isprime == 1)				// If x is still prime, count it
         ++nprimes;
   }

   printf("cpu_work: found %d prime values between 2 and %d\n", nprimes, N);
   return 0;
}


int main()
{
    pthread_t thr1,thr2;

    if (pthread_create(&thr1,NULL,&io_work,NULL) != 0)
    {
        fprintf(stderr,"pthread_create() failed for io_work\n");
        exit(1);
    }
    if (pthread_create(&thr2,NULL,&cpu_work,NULL) != 0)
    {
        fprintf(stderr,"pthread_create() failed for cpu_work\n");
        exit(1);
    }

    pthread_join(thr1,NULL);
    pthread_join(thr2,NULL);

    printf("main: all threads are done!\n");
    return 0;
}
