#include <stdio.h>
#include <math.h>

int main(void)
{

	printf("n\t\t 2^n\n");
	printf("------------------------\n\n");

	double n;
	double sonuc;

	for (n = 0.0; n <= 16.0; n++)
	{
		sonuc = pow(2, n);	
		printf("%f\t%2f\n", n, sonuc);

	}

	return 0;

}
