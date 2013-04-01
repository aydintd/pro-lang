#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/wait.h>
#include <sys/types.h>
#include <unistd.h>
#include <signal.h>


#define MAX_ARGS 10
#define MAX_LEN  100


typedef void (*sighandler_t)(int);
char c = '\0';

void handle_signal(int signo)
{
	printf("\n>$ ");
	exit(EXIT_SUCCESS);
}


void child(int argc, char *argv[MAX_ARGS]);

int main(void)
{
	int argc = 0;
	int status;
	char input[MAX_LEN], *argv[MAX_ARGS], *cp;
	const char *delim = " \t\n"; 
	
	signal(SIGINT, SIG_IGN);
	signal(SIGINT, handle_signal);

	while (1) {

		printf(">$ "); 

				
		if (fgets(input, sizeof(input), stdin) == NULL) {
			exit(EXIT_SUCCESS);
		
		}

				          /* Girilen komutlari bosluk ve tabla
					   * ayir  */
		cp = input;
		
		for (argc = 0; argc < MAX_ARGS; argc++) {
			if ((argv[argc] = strtok(cp,delim)) == NULL)
				break;
			cp = NULL;
		}
					          /* klavyeden "exit" girilirse
						   * cik */
		if(strcmp(argv[0], "exit") == 0) {
			exit(EXIT_SUCCESS);
		}
						      
		pid_t pid = fork();
		if(pid == -1) {
			perror("fork");
			exit(EXIT_FAILURE);
		}
		
		else if(pid == 0) {
			child(argc, argv);
		}
		
		else {
													     
			wait(&status);
		}
	}
}

void child(int argc, char *argv[MAX_ARGS]) {
	  execvp(argv[0], argv);
}
