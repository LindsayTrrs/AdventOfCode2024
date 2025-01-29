TITLE

; Name: 
; Date: 
; ID: 
; Description: 

INCLUDE Irvine32.inc
INCLUDELIB Irvine32.lib

; these two lines are only necessary if you're not using Visual Studio
INCLUDELIB kernel32.lib
INCLUDELIB user32.lib

.data    
var1 DWORD 10000 h
var2 DWORD 20000 h
	; data declarations go here

.code
main PROC
	Mov eax, var1
	ADD eax, var2
	; code goes here
	call DumpRegs ; displays registers in console

	exit

main ENDP
END main
