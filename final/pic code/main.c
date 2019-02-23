#define _XTAL_FREQ 10000000
#include <xc.h>
#include <pic16f877a.h>
#include "uart.h"
#include <stdio.h>
#include <stdlib.h>
#include <stdint.h>
#include <xc.h>
#include <string.h>

// BEGIN CONFIG
#pragma config FOSC = HS // Oscillator Selection bits (HS oscillator)
#pragma config WDTE = ON // Watchdog Timer Enable bit (WDT enabled)
#pragma config PWRTE = OFF // Power-up Timer Enable bit (PWRT disabled)
#pragma config BOREN = ON // Brown-out Reset Enable bit (BOR enabled)
#pragma config LVP = OFF // Low-Voltage (Single-Supply) In-Circuit Serial Programming Enable bit (RB3 is digital I/O, HV on MCLR must be used for programming)
#pragma config CPD = OFF // Data EEPROM Memory Code Protection bit (Data EEPROM code protection off)
#pragma config WRT = OFF // Flash Program Memory Write Enable bits (Write protection off; all program memory may be written to by EECON control)
#pragma config CP = OFF // Flash Program Memory Code Protection bit (Code protection off)
//END CONFIG

void ADC_Init()
{
  ADCON0 = 0x41; //ADC Module Turned ON and Clock is selected
  ADCON1 = 0xC0; //All pins as Analog Input
                 //With reference voltages VDD and VSS
}
//copy from internet
unsigned int ADC_Read(unsigned char channel)
{
  if(channel > 7) //If Invalid channel selected 
    return 0;     //Return 0/

  ADCON0 &= 0xC5; //Clearing the Channel Selection Bits
  ADCON0 |= channel<<3; //Setting the required Bits
  __delay_ms(2); //Acquisition time to charge hold capacitor
  GO_nDONE = 1; //Initializes A/D Conversion
  while(GO_nDONE); //Wait for A/D Conversion to complete
  return ((ADRESH<<8)+ADRESL); //Returns Result 10bit (0-1024))
}
void channalRead(int channel){
    char a ;
    
    a = ADC_Read(channel); //Reading Analog Channel of given number
    UART_Write(channel); 
    UART_Write(a & 0b11111111); //write only MSB 8bit  
    
}


void main()
{ 
  UART_Init(9600);
  TRISB = 0x00; //PORTB as output

  TRISA = 0xFF; //PORTA as input
  ADC_Init(); //Initializes ADC Module

  do
  {  
      // loop for read 8 chennels 
      for(int i=0;i<8;i++){
          
          PORTB = UART_Read(); //write input form pc to output port B
          channalRead(i); //read chennal i
          
          
          
      }
      
     
  }while(1); //Infinite Loop
}