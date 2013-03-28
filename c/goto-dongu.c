#include <stdio.h>
#include <stdlib.h>
int main(int argc, char *argv[])
{
	
	int alt_sinir, ust_sinir, toplam, i;
	alt_sinir = atoi(argv[1]);
	ust_sinir = atoi(argv[2]);
	printf("%d ile %d arasindaki sayilarin toplami : ", alt_sinir, ust_sinir);
	toplam = 0;
	i = alt_sinir;
	
	goto etiket2;
	etiket1:
	toplam = toplam + i + alt_sinir;
	etiket2:
	if (i < ust_sinir) {
		i++;
		goto etiket1;
	}
	
	printf("%d\n", toplam);
	return 0;
}
