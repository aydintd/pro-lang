#include <stdio.h>
int main(void)
{
	printf("C'de programlama yaparken ");
	goto etiket1;
	printf("goto deyiminden yararlanmak ");
	printf("her ne kadar kolay olsa da, ");
	etiket1:
	printf("goto deyimini kullanmak ");
	goto etiket2;
	printf("yerine while, for dongulerini kullanmak, ");
	printf("profesyonelce programlama yapmak adina ");
	etiket2:
	printf("akillica bir secimdir.");
	return 0;

}
