package org.example;

import java.io.IOException;

public interface Service {
    void addSouvenir(Souvenir souvenir) throws IOException;
    Boolean addProducer(Producer producer);
    void editProducersName(final String oldName, final String newName); // TODO: 17.02.2023
    void editProducersCountry(final String name, final String newCountry); // TODO: 17.02.2023
    void editSouvenirsPrice(final String souvenirsName, final String producerName, final Double newPrice); // TODO: 17.02.2023
    void showAllProducers();
    void showAllSouvenirs();
    void showSouvenirByProducersName(final String producerName);
    void showSouvenirsByPriceLess(final Double price);
    void showAllProducersAndTheirSouvenirs();
    void showProducerBySouvenirsYear(final Integer year);
    void showAllSouvenirsByYear(final Integer year);

    void showAllSouvenirsByCountry(final String country);

    // TODO: 17.02.2023 //void showAllSouvenirsByCountry(final Integer year);
    // TODO: додати метод щоб можна було редактувати сувеніри і виробника
    void deleteProducer(final String name);
}
