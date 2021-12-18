package Persistence;

import Logic.Picture;

//Ez az interface felel a stratégia minta bevezetésére, itt adom meg a 3 funkcionalítást.
public interface IStrategy {
    public void Add(Picture picture);
    public void Delete(String name);
    public void List();
}
