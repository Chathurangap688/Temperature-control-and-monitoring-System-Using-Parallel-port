#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/io.h>
#include <time.h>
#include <ctype.h>
 
#define BASE 0x3F8
#define TRUE 1
void init_serial(){
	printf("DEBUG:1.1\n");
	outb(0x00,BASE + 1);
	printf("DEBUG:1.2\n");
	outb(0x80,BASE + 3);
	outb(0x03,BASE + 0);
	outb(0x00,BASE + 1);
	outb(0x03,BASE + 3);
	outb(0xC7,BASE + 2);
	outb(0x0B,BASE + 4);	
}
 
int serial_recieved(){
	return inb(BASE + 5) & 1;
}
char read_serial(){
	while(serial_recieved() == 0);
	return inb(BASE);
}
 
int is_transmit_empty(){
	return inb(BASE + 5) & 0x20;
}
void write_serial(char a){
	while(is_transmit_empty() == 0);
	outb(a, BASE);
}
 
int main(int argCount,char** argVector){
	int pid=fork();
	if(ioperm(BASE,8,1)){
		fprintf(stderr,"Access denied to %x,\n",BASE);
		exit(1);
	}
	else{
		printf("Access gained\n");
	}
 
 
	
	while(TRUE){
		if(pid==0){
			printf("Rec: %c\n",read_serial());
		}
		if(pid>0){
			write_serial(getchar());
		}		
	}	
	
	return 0;
}
 
