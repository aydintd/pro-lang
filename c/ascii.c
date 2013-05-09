#include <stdio.h>
#include <stdlib.h>

int main(void)
{
	char p;

	for ( ; ; ) {

	    p = getchar();

	    if ( p > 'a' ) {
		p = p + 'A'  - 'a';
		putchar(p);
	    }

	}
	return 0;
}
