Multithreading: È l'azione che compie il processore nell'eseguire più thread comtemporaneamente. In pratica, il programma termina l'elaborazione dati in minore tempo. 
Prima parte: (Classe Hi e Hello). Abbiamo creato due classi che estendevano due thread ciascuno e dopo aver creato il metodo run (uno per ogni classe), abbiamo istanziato due oggetti, uno di tipo Hi e l'altro di tipo Hello. Fatto ciò abbiamo utilizzato lo start() per ognuno dei due oggetti in modo tale da avviare i due thread. Infine abbiamo riscontrato che i due thread mandavano in output dei messaggi in modo "non logico", questo perchè entrambi gli oggetti avviavano il metodo run() in contemporanea e quindi si visualizzava un insieme di messaggi non in ordine. Questo perchè è stato utilizzato solo lo start()..

Il programma da il seguente risultato:

run:
Oggetto Hello istanziato
Hi
Hello
Hi
Hello
Hello
Hi
Hi
Hello
Hi
Hello
Hi
Hello
Hi
Hello
Hi
Hello
Hi
Hello
Hi
Hello
BUILD SUCCESSFUL (total time: 10 seconds)
