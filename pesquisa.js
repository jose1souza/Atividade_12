 function pesquisa(minhaFila,dado) {
    let aux = minhaFila;
  while(aux !== null){
    if(aux.dado === dado){
      return 1;
    }
    aux = aux.proximo;
  }
      return 0;
}