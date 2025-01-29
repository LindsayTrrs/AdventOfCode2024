; Name: Lindsay
; Date: 01/28/2025
; ID: 110130322
; Description:



INCLUDE Irvine32.inc
INCLUDELIB Irvine32.lib
INCLUDELIB kernel32.lib
INCLUDELIB user32.lib

.data
var1 DWORD 10000h
var2 DWORD 20000h

.code
main PROC
	mov eax, var1
	add eax, var2
	call DumpRegs
	exit
main ENDP
END
