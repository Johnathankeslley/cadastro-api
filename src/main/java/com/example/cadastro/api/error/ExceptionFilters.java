package com.example.cadastro.api.error;

public class ExceptionFilters {

    private String titulo;
    private int status;
    private String detalhes;
    private Long timeStamp;
    private String devMsg;

    public String gettitulo() {
        return titulo;
    }

    public int getstatus() {
        return status;
    }

    public String getdetalhes() {
        return detalhes;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    public String getDevMsg() {
        return devMsg;
    }

    public static final class ExceptionFiltersBuilder {

        private String titulo;
        private int status;
        private String detalhes;
        private Long timeStamp;
        private String devMsg;

        private ExceptionFiltersBuilder() {
        }

        public static ExceptionFiltersBuilder newBuilder() {
            return new ExceptionFiltersBuilder();
        }

        public ExceptionFiltersBuilder titulo(String titulo) {
            this.titulo = titulo;
            return this;
        }

        public ExceptionFiltersBuilder status(int status) {
            this.status = status;
            return this;
        }

        public ExceptionFiltersBuilder detalhes(String detalhes) {
            this.detalhes = detalhes;
            return this;
        }

        public ExceptionFiltersBuilder timeStamp(Long timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }

        public ExceptionFiltersBuilder devMsg(String devMsg) {
            this.devMsg = devMsg;
            return this;
        }

        public ExceptionFilters build() {
            ExceptionFilters exceptionFilters = new ExceptionFilters();
            exceptionFilters.titulo = this.titulo;
            exceptionFilters.status = this.status;
            exceptionFilters.detalhes = this.detalhes;
            exceptionFilters.timeStamp = this.timeStamp;
            exceptionFilters.devMsg = this.devMsg;
            return exceptionFilters;
        }

    }

}
