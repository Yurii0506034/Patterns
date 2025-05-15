package behavioral.Observer;

interface Subject {
    void addObserver(Observer observer); // Залишаємо тільки цей метод addObserver
    void removeObserver(Observer observer); // Залишаємо тільки цей метод removeObserver
    void notifyObservers();
}