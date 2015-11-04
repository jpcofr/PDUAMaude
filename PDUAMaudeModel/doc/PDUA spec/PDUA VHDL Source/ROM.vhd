-- ***********************************************
-- **  PROYECTO PDUA                            **
-- **  Modulo: 	ROM                           **
-- **  Creacion:	Julio 07								**
-- **  Revisión:	Marzo 08								**
-- **  Por:		   MGH-CMUA-UNIANDES 				**
-- ***********************************************
-- Descripcion:
-- ROM (Solo lectura)
--                      cs  
--                  _____|_
--           rd -->|       |
--          dir -->|       |--> data
--                 |_______|   
--        
-- ***********************************************

library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use IEEE.STD_LOGIC_ARITH.ALL;
use IEEE.STD_LOGIC_UNSIGNED.ALL;

entity ROM is
    Port ( cs,rd	: in std_logic;
           dir 	: in std_logic_vector(4 downto 0);
           data 	: out std_logic_vector(7 downto 0));
end ROM;

architecture Behavioral of ROM is

begin
process(cs,rd,dir)
begin
if cs = '1' and rd = '0' then
       case dir is
	    when "00000" => data <= "00011000";  -- JMP MAIN
	    when "00001" => data <= "00000011";  -- 
	    when "00010" => data <= "00000000";  -- VI
	    when "00011" => data <= "00011000";  -- MAIN:MOV ACC,CTE
		 when "00100" => data <= "00000000";  -- 
	    when "00101" => data <= "00010000";  -- MOV A,ACC			;A=Cont
	    when "00110" => data <= "00011000";  -- CICLO:MOV ACC,CTE	;INIRAM
	    when "00111" => data <= "11111000";  -- 
	    when "01000" => data <= "01001000";  -- ADD ACC,A  		;INIRAM+Cont
		 when "01001" => data <= "00101000";  -- MOV DPTR,ACC	 
		 when "01010" => data <= "00001000";  -- MOV ACC,A 
		 when "01011" => data <= "00110000";  -- MOV [DPTR],ACC 	; [INIRAM+Cont]=Cont
		 when "01100" => data <= "00011000";  -- MOV ACC,CTE1
		 when "01101" => data <= "00000001";  --
	    when "01110" => data <= "01001000";  -- ADD ACC,A			;Cont+1
		 when "01111" => data <= "01101000";  -- JC  FIN			;Cont+1 > 0FFH
		 
	    when "10000" => data <= "00010100";  --
	    when "10001" => data <= "00010000";  -- MOV A,ACC  		;Cont=Cont+1
	    when "10010" => data <= "01010000";  -- JMP CICLO 
	    when "10011" => data <= "00000110";  -- 
		 when "10100" => data <= "01010000";  -- FIN:JMP FIN 
	    when "10101" => data <= "00010100";  -- 
	    when "10110" => data <= "00000000";  -- 
	    when "10111" => data <= "00000000";  -- 
	    when "11000" => data <= "00000000";  -- 
		 when "11001" => data <= "00000000";  -- 	 
		 when "11010" => data <= "00000000";  -- 
		 when "11011" => data <= "00000000";  -- 
		 when "11100" => data <= "00000000";  -- 
		 when "11101" => data <= "00000000";  -- 
	    when "11110" => data <= "00000000";  -- 
		 when "11111" => data <= "00000000";  --	 
		 
		 when others => data <= (others => 'X'); 
       end case;
else data <= (others => 'Z');
end if;  
end process;
end;