package com.konfigthis.client;

import com.konfigthis.client.api.ApplicationApi;
import com.konfigthis.client.api.ApplicationFormApi;
import com.konfigthis.client.api.DocumentApi;
import com.konfigthis.client.api.ReportingApi;
import com.konfigthis.client.api.TransactionApi;

public class Payfactory {
    private ApiClient apiClient;
    public final ApplicationApi application;
    public final ApplicationFormApi applicationForm;
    public final DocumentApi document;
    public final ReportingApi reporting;
    public final TransactionApi transaction;

    public Payfactory() {
        this(null);
    }

    public Payfactory(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.application = new ApplicationApi(this.apiClient);
        this.applicationForm = new ApplicationFormApi(this.apiClient);
        this.document = new DocumentApi(this.apiClient);
        this.reporting = new ReportingApi(this.apiClient);
        this.transaction = new TransactionApi(this.apiClient);
    }

}
