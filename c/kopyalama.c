#include <stdio.h>

int main(void)
{
    int c;
    c = getchar();
    
    while ( c != EOF) {
	
	if (isupper(c)) {
	    c = tolower(c); 
	}
	
	putchar(c);
	c = getchar();		    
    }

    return 0;

}
