module provider {
    requires contract;
    exports mycompany.provider;
    provides mycompany.api.Contract with mycompany.provider.Implementation;
}