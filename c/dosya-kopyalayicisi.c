#include <stdio.h>
#include <stdlib.h>

int main(void)
{

    int c;	
    FILE *fp, *fp2;

    fp = fopen("results.txt", "r");
    fp2 = fopen("results2.txt", "w");

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
