import java.io.File;

public class Programa2 {
    public static void main(String[] args) {
        System.out.println("Programa para cambiar el nombre de los directorios Imagenes y Documentos ademas de quitar la extansion a los archivos de las carpetas");
        File oldDoc = new File("C:\\Users\\borpelmon\\provafile\\Documentos");
        File newDoc = new File(oldDoc.getParent(),"DOCS");
        oldDoc.renameTo(newDoc);
        System.out.println("Nombre de Documentos cambiado!");
        File oldImg = new File("C:\\Users\\borpelmon\\provafile\\Imagenes");
        File newImg = new File(oldImg.getParent(),"IMGS");
        oldImg.renameTo(newImg);
        System.out.println("Nombre de Imagenes cambiado!");
        String []llistaStringDoc;
        for (File llist : newDoc.listFiles()) {
            llistaStringDoc = llist.getName().split("\\.");
            File split = new File(llist.getParent() + "/" + llistaStringDoc[0]);
            llist.renameTo(split);
        }
        System.out.println("\nExtensiones de la carpeta Documentos quitadas");
        for (File llista : newDoc.listFiles()) {
            System.out.println(llista);
        }

        String []llistaStringImg;
        for (File lliste : newImg.listFiles()) {
            llistaStringImg = lliste.getName().split("\\.");
            File splits = new File(lliste.getParent() + "/" + llistaStringImg[0]);
            lliste.renameTo(splits);
        }
        System.out.println("\nExtensiones de la carpeta Imagenes quitadas");
        for (File llistes : newImg.listFiles()) {
            System.out.println(llistes);
        }

    }
}
