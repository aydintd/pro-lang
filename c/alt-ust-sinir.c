#include <stdio.h>

int main(void)
{
	int alt_sinir;
	int ust_sinir;
	
	printf("Alt Sinir Degerini Girin:\n");
	scanf("%d", &alt_sinir);
	printf("Ust Sinir Degerini Girin:\n");
	scanf("%d", &ust_sinir);

	for (alt_sinir; alt_sinir<=ust_sinir; alt_sinir++)
	{
		printf("%3d", alt_sinir);

	}

	printf("\nBu Kadar!\n");
	return 0;

}
