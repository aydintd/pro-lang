#include <stdlib.h>
#include <stdio.h>
#include <pthread.h>

#define BOYUT 3 /* Matris boyutları */
int thread_no; /* matris numaraları */

int A[BOYUT][BOYUT], B[BOYUT][BOYUT], C[BOYUT][BOYUT];

/* matris gerçeklemesi */
void init_matrix(int m[BOYUT][BOYUT])
{
 int i, j, deg = 0;

 for (i = 0; i < BOYUT; i++)
   for (j = 0; j < BOYUT; j++)
     m[i][j] = deg++;
}
/* matris gosterimi */
void print_matrix(int m[BOYUT][BOYUT])
{
 int i, j;
 for (i = 0; i < BOYUT; i++) {
   printf("\n\t| ");
   for (j = 0; j < BOYUT; j++)
     printf("%2d ", m[i][j]);
   printf("|");
  }
}

/* 3 boyutlu matrislerin çarpılırken satır ve sütunları
 * örneğin 1. satırdan 1. sütuna çarpım bir thread, 2.satır ve 2. sütun çarpımı
 * bir başka thread olarak kabul edilmiştir */

void* multiply(void* dilim)
{
  int s = (int)dilim;
  int from = (s * BOYUT)/thread_no;
  int to = ((s+1) * BOYUT)/thread_no;
  int i,j,k;

  printf("dilimlerin hesaplaması %d (%d satırından %d sütununa)\n", s, from, to-1);
  for (i = from; i < to; i++)
  {
    for (j = 0; j < BOYUT; j++)
    {
      C[i][j] = 0;

      for ( k = 0; k < BOYUT; k++) {
        C[i][j] += A[i][k]*B[k][j];
      }
    }
  }

  printf("hesaplanan dilim %d\n", s);
  return 0;
}

/* argüman girerken 3 giriniz, 3 boyutlu matrislerin çarpımı olacak */

int main(int argc, char* argv[])
{
  pthread_t* thread;
  int i;

  if (argc!=2)
  {
    printf("Kullanim: %s thread_sayisi\n",argv[0]);
    exit(-1);
  }

  thread_no = atoi(argv[1]);
  init_matrix(A);
  init_matrix(B);
  thread = (pthread_t*) malloc(thread_no*sizeof(pthread_t));

  for (i = 1; i < thread_no; i++)
  {
    if (pthread_create (&thread[i], NULL, multiply, (void*)i) != 0 )
    {
      perror("Thread oluşturulamadı");
      free(thread);
      exit(-1);
     }
  }

  multiply(0);

  for (i = 1; i < thread_no; i++)
  {
    pthread_join (thread[i], NULL);
  }

  printf("\n\n");
  print_matrix(A);
  printf("\n\n\t       * \n");
  print_matrix(B);
  printf("\n\n\t       = \n");
  print_matrix(C);
  printf("\n\n");

  free(thread);

  return 0;

}

/* Derleme işlemi :
 * cc main.c -o main -lpthread */
