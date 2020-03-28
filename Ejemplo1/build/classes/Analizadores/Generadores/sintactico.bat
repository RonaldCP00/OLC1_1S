SET JAVA_HOME="C:\Program Files\Java\jdk1.8.0_111\bin"
SET PATH=%JAVA_HOME%;%PATH%
SET CLASSPATH=%JAVA_HOME%;
cd C:\Users\hp\Documents\github\OLC1\OLC1_Ejemplos\Ejemplo1\src\Analizadores
java -jar C:\Users\hp\Documents\github\OLC1\OLC1_Ejemplos\Ejemplo1\lib\java-cup-11b.jar -parser Sintactico -symbols Simbolos Sintactico.cup
pause
