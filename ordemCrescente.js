function ordemCrescente(){
    let auxiliar = inicio;
    while(auxiliar !== null){
        if(auxiliar.dado > auxiliar.prox.dado){
            return false;
        }
        auxiliar = auxiliar.prox;
    }
    return true;
}