function removePar(){
    let auxiliar = inicio;
    while(auxiliar !== null){
        if(auxiliar.dado % 2 == 0){
            return auxiliar.dado;
        }
        auxiliar = auxiliar.prox;
    }
}