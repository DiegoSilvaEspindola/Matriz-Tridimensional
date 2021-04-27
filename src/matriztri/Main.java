package matriztri;

public class Main {



    public static void main(String args[]){
    int [][][] matrizTri = new int[3][3][3];


    for (int i=0; i<matrizTri.length; i++){
        for(int j=0; j<matrizTri[i].length; j++){
            for (int k=0 ; k<matrizTri[i][j].length; k++){

                // System.out.print(" i= "+ i + " j= "+j+ " k= "+k);
                // System.out.println();

                matrizTri[i][j][k] = i+j+k;

                System.out.print(matrizTri[i][j][k]);




            }
        }
    }
}
}
