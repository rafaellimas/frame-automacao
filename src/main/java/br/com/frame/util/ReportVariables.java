package br.com.frame.util;

public class ReportVariables {

    static String nome_cT;
    static String valor_request;
    static String valor_esperado = "";
    static String valor_recebido;
    static String status;
    static String objetivo;
    static String label_resultado_esperado;
    static String ambiente;
    static String ciclo;
    static String sprint;
    static String executor;
    static String diff = "";
    static String logCarga;

    public static String getLogCarga() {
        return logCarga;
    }

    public static void setLogCarga(String logCarga) {
        ReportVariables.logCarga = logCarga;
    }

    public static String getDiff() {
        return diff;
    }

    public static void setDiff(String diff) {
        ReportVariables.diff = diff;
    }

    public static String getExecutor() {
        return executor;
    }

    public static void setExecutor(String executor) {
        ReportVariables.executor = executor;
    }

    public static String getObjetivo() {
        return objetivo;
    }

    public static void setObjetivo(String objetivo) {
        ReportVariables.objetivo = objetivo;
    }

    public static String getLabel_resultado_esperado() {
        return label_resultado_esperado;
    }

    public static void setLabel_resultado_esperado(String label_resultado_esperado) {
        ReportVariables.label_resultado_esperado = label_resultado_esperado;
    }

    public static String getAmbiente() {
        return ambiente;
    }

    public static void setAmbiente(String ambiente) {
        ReportVariables.ambiente = ambiente;
    }

    public static String getCiclo() {
        return ciclo;
    }

    public static void setCiclo(String ciclo) {
        ReportVariables.ciclo = ciclo;
    }

    public static String getSprint() {
        return sprint;
    }

    public static void setSprint(String sprint) {
        ReportVariables.sprint = sprint;
    }


    public static String getNome_cT() {
        return nome_cT;
    }

    public static void setNome_cT(String nome_cT) {
        ReportVariables.nome_cT = nome_cT;
    }


    public static String getStatus() {
        return status;
    }

    public static void setStatus(String status) {
        ReportVariables.status = status;
    }

    public static String getValor_esperado() {
        return valor_esperado;
    }

    public static void setValor_esperado(String valor_esperado) {
        ReportVariables.valor_esperado = valor_esperado;
    }

    public static String getValor_recebido() {
        return valor_recebido;
    }

    public static void setValor_recebido(String valor_recebido) {
        ReportVariables.valor_recebido = valor_recebido;
    }


    public static String getValor_request() {
        return valor_request;
    }

    public static void setValor_request(String valor_request) {
        ReportVariables.valor_request = valor_request;
    }

    public static void setCommunValues() {
        setLabel_resultado_esperado("Validar a carga de Dados ");
        setExecutor("Teste Automatizado");
        setObjetivo("Garantir a integridade dos valores recebidos e enviados para o SalesForce");
        setAmbiente("QA");
        setSprint("NA");
        setCiclo("NA");
    }


    public void cleanAllVariables() {
        setValor_recebido("");
        setDiff("");
        setValor_esperado("");
        setValor_request("");
        setStatus("");
        setLabel_resultado_esperado("");
        setNome_cT("");
    }
}


