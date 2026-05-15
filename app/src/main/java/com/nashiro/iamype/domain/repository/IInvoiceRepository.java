package com.nashiro.iamype.domain.repository;

import com.nashiro.iamype.domain.model.Invoice;
import java.util.List;

public interface IInvoiceRepository {
    // Procesa en Document AI y devuelve los datos extraídos
    void processInvoiceImage(byte[] imageBytes, RepositoryCallback<Invoice> callback);

    // Valida el RUC en una api externa a SUNAT
    void validateSupplierStatus(String ruc, RepositoryCallback<Boolean> callback);

    // Guarda datos en BigQuery
    void saveInvoiceToCloud(Invoice invoice, RepositoryCallback<Boolean> callback);

    // Interfaz para manejar las respuestas asíncronas
    interface RepositoryCallback<T> {
        void onSuccess(T result);
        void onError(String message);
    }
}