public class DownloadThread extends Thread{
    private String nombreArchivo;
    private long tiempoDescargaMS;

    public DownloadThread(String nombreArchivo, long tiempoDescargaMS) {
        this.tiempoDescargaMS = tiempoDescargaMS;
        this.nombreArchivo = nombreArchivo;
    }
    public void run() {
        try {
            System.out.println("Comenzando descarga de "+this.nombreArchivo+"     tiempo: "+this.tiempoDescargaMS);
            sleep(this.tiempoDescargaMS);
            System.out.println(this.nombreArchivo+ " descargado");
        } catch (InterruptedException e) {
            System.out.println("ERROR");
        }
    }

    public long getTiempoDescargaMS() {
        return tiempoDescargaMS;
    }
}
