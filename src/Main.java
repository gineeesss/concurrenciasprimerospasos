public class Main {
    public static void main(String[] args) {
        String[] archivos = {"documento1.pdf","cancion2.mp3","bbdd3.dia","video4.mp4","lanzador5.exe"};
        int[] duracion = {123,1523,52,2522,12};
        DownloadThread[] hilos = new DownloadThread[5];
        long inicio = System.currentTimeMillis();
        try{
            for (int i= 0;i<5;i++){
                hilos[i] = new DownloadThread(archivos[i],duracion[i]);
                hilos[i].start();
            }
            for (DownloadThread hilo : hilos){
                hilo.join();
            }
        }catch (InterruptedException ex){

        }
        long fin = System.currentTimeMillis();
        long tiempoTotal = fin-inicio;
        System.out.println("Ha tardao: " +tiempoTotal/1000.0);
    }
}