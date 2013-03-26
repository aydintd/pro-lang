#include <stdio.h>
#include <stdlib.h>

int main(void)
{

    int c;	
    FILE *fp, *fp2;

    fp = fopen("origin.txt", "r");
    fp2 = fopen("destination.txt", "w");

    if (fp == NULL) {
       
       printf("Dosya açılamadı\n");
       exit(EXIT_FAILURE);

    }
    while (c != EOF) {

	c = fgetc(fp);
	if (!feof(fp)) {
	
	    fputc(c, fp2);

	}
    }

    fclose(fp);
    fclose(fp2);

    return 0;

}

/* origin.txt dosyasının içeriğini olduğu gibi destination.txt içine 
 * aktarıyor. Daha sonra geliştirilmek üzere TODO olarak bırakıyorum. */


