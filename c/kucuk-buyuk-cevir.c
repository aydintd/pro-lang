#include <stdio.h>
#include <ctype.h>

int main(void)
{
   
    int c;
    
    for ( ; ; ) {
	
	c = getchar();
	putchar(c);
	
	if (islower(c)) 
	   
	     printf("%4c Büyütüldü.\n", toupper(c));
	
	else if(isupper(c))
	
	     printf("%4c Küçültüldü.\n" , tolower(c));

    }
    
    return 0;

}
